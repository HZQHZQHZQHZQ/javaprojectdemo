package com.chu.demo.test2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {
		Filter f1 = new Filter();
		f1.setId(10);
		Filter f2 = new Filter();
		f2.setUserName("tanyunlong");
		Filter f3 = new Filter();
		f3.setEmail("1234567@qq.com,xiaoming@163.com");

		System.out.println(query(f1));
		System.out.println(query(f2));
		System.out.println(query(f3));

	}

	public static String query(Filter filter) {
		StringBuffer sb = new StringBuffer();
		// 1.获取到Class
		Class c = filter.getClass();
		// 2.获取到table的名字
		boolean exists = c.isAnnotationPresent(Table.class);
		if (!exists) {
			return null;
		}
		Table t = (Table) c.getAnnotation(Table.class);
		String tableName = t.value();
		sb.append(" select * from ").append(tableName).append(" where 1=1 ");
		// 3.遍历所有字段
		Field[] fArray = c.getDeclaredFields();
		for (Field field : fArray) {
			/**
			 * 4.处理每个字段对应的sql 拿到字段名 字段值 拼装sql
			 */
			boolean fExists = field.isAnnotationPresent(Column.class);
			if (!fExists) {
				continue;
			}
			Column column = field.getAnnotation(Column.class);
			String columnName = column.value();// 字段名
			String fieldName = field.getName();
			String getMethodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
			Object fieldValue = null;
			try {
				Method getMethod = c.getMethod(getMethodName);
				fieldValue = getMethod.invoke(filter);// 字段值
			} catch (Exception e) {
				e.printStackTrace();
			}
			// 拼装sql
			if (fieldValue == null || (fieldValue instanceof Integer && (Integer) fieldValue == 0)) {
				continue;
			}
			sb.append(" and ").append(field).append(" = ").append(fieldValue);
		}
		return sb.toString();
	}

}
