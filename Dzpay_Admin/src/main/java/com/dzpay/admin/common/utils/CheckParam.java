package com.dzpay.admin.common.utils;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

/*
 * 2020.08.03
 * mybatis param not null 검사에 유용하도록 개발
 * *_SQL.xml에서 사용 예정
 */
public class CheckParam {
	public static boolean isEmpty(Object obj) {
		if (obj instanceof String)
			return obj == null || "".equals(obj.toString().trim());
		else if (obj instanceof List)
			return obj == null || ((List<?>) obj).isEmpty();
		else if (obj instanceof Map)
			return obj == null || ((Map<?, ?>) obj).isEmpty();
		else if (obj instanceof Object[])
			return obj == null || Array.getLength(obj) == 0;
		else
			return obj == null;
	}

	public static boolean isNotEmpty(String s) {
		return !isEmpty(s);
	}
}
