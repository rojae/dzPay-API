package com.dzpay.admin.common.logger;

import java.io.PrintStream;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LoggerCustom {
	public static boolean Allow_Log_Display;
	static final String HOME_ROOT = "/home/wasadm1/dzapi/";
	static final String logfile_path = "/home/wasadm1/dzapi/logs/";

	static {
		LoggerCustom.Allow_Log_Display = true;
	}

	public static String Get_CurrentDate_For_Log() {
		String tmpDate = null;
		int year = 0;
		int month = 0;
		int day = 0;
		final Calendar calendar = new GregorianCalendar();
		year = calendar.get(1);
		month = calendar.get(2) + 1;
		day = calendar.get(5);
		tmpDate = String.valueOf(year);
		if (month < 10) {
			tmpDate = String.valueOf(String.valueOf(tmpDate)) + "0" + String.valueOf(month);
		} else {
			tmpDate = String.valueOf(String.valueOf(tmpDate)) + String.valueOf(month);
		}
		if (day < 10) {
			tmpDate = String.valueOf(String.valueOf(tmpDate)) + "0" + String.valueOf(day);
		} else {
			tmpDate = String.valueOf(String.valueOf(tmpDate)) + String.valueOf(day);
		}
		return tmpDate;
	}

	public static String Get_CurrentTime_For_Log() {
		final Date dt = new Date();
		final SimpleDateFormat h = new SimpleDateFormat("HHmmss");
		final String logs_time = h.format(dt);
		String time = "";
		time = String.valueOf(String.valueOf(logs_time.substring(0, 2))) + ":" + logs_time.substring(2, 4) + ":"
				+ logs_time.substring(4, 6) + ":" + String.valueOf(System.currentTimeMillis()).substring(10, 13);
		return time;
	}

	public static void Display_SystemLog(final String log) {
		if (LoggerCustom.Allow_Log_Display) {
			System.out.println("[" + Get_CurrentTime_For_Log() + "] - " + log);
		}
	}

	public static synchronized void Write_ExceptionMsg_ToFile(final Exception msg) {
		try {
			final String logFileName = "SYS_INFO_";
			String fileName = null;
			fileName = "/home/wasadm1/dzapi/logs/" + logFileName + Get_CurrentDate_For_Log() + ".log";
			FileOutputStream fos = new FileOutputStream(fileName, true);
			msg.printStackTrace(new PrintStream(fos));
			final OutputStreamWriter osw = new OutputStreamWriter(fos);
			final BufferedWriter bw = new BufferedWriter(osw);
			bw.write("---------------------------------[" + Get_CurrentTime_For_Log() + "] End \r\n");
			bw.flush();
			bw.close();
			fos.close();
			fos = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static synchronized void DzAPI_ConsoleLog_AND_FileLog(final String data) {
		// print console log
		if (LoggerCustom.Allow_Log_Display) {
			System.out.println("[" + Get_CurrentTime_For_Log() + "] - " + data);
		}

		String logStr = null;
		String time = null;
		String fileName = null;

		final String logFileName = "DzAPI_";
		fileName = "/home/wasadm1/dzapi/logs/" + logFileName + Get_CurrentDate_For_Log() + ".log";
		try {
			final FileOutputStream fos = new FileOutputStream(fileName, true);
			final OutputStreamWriter osw = new OutputStreamWriter(fos);
			final BufferedWriter bw = new BufferedWriter(osw);
			time = Get_CurrentTime_For_Log();
			logStr = "[" + time + "] - " + data + "\r\n";
			bw.write(logStr);
			bw.flush();
			bw.close();
		} catch (IOException ie) {
			ie.printStackTrace();
			Write_ExceptionMsg_ToFile(ie);
		} catch (Exception e) {
			e.printStackTrace();
			Write_ExceptionMsg_ToFile(e);
		}
	}
}
