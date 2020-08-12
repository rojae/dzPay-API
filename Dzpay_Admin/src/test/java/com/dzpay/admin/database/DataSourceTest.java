package com.dzpay.admin.database;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/resources/config/spring/context-*.xml"})
public class DataSourceTest {
	@Autowired
	private DataSource dataSource;

	// connection statment
	@Test
	public void testConnection() throws Exception {
		try (Connection conn = dataSource.getConnection()) {
			System.out.println("Test Connection : " + conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	// do some query
	// 테스트계에 담긴 관리자 계정과 비교한다
	// ADMIN_ID = rojae, ADMIN_NM = rojae
	@Test
	public void testQuery() throws Exception {
		String query = "SELECT * FROM TBLOFFICE_ADMIN WHERE ADMIN_ID = 'rojae'";
		try (Connection conn = dataSource.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement(query);
			System.out.println(query);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String rs_nm = rs.getString("ADMIN_NM");
				System.out.println(rs_nm);
				assertEquals(rs_nm, "rojae");
			}
		}
	}
}
