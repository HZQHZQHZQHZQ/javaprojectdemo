package com.chu.demo.test4;

import java.util.regex.*;

/**
 * 正则表达式DEMO
 * @author 64310
 */
@SuppressWarnings("unused")
public class Demo {

    public static void test(String pat, String parameter) {
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(parameter);
        print(matcher.matches());
    }

    public static void print(Object obj) {
        System.out.println(obj);
    }
    
	public static void main(String[] args) {
    	/*
    	 * 数字校验
    	 */
    	String num_1 = "^[\\-|\\+]?\\d*$";//整数
    	String num_2 = "^\\d{1}$";//1位的数字
    	String num_3 = "^\\d{1,}$";//至少n位的数字
    	String num_4 = "^\\d{3,5}$";//3-5位的数字
    	String num_5 = "^(0|[1-9][0-9]*)$";//零和非零开头的数字
    	String num_6 = "^([1-9][0-9]*)+(.[0-9]{1,2})?$";//非零开头的最多带两位小数的数字
    	String num_7 = "^(\\-)?\\d+(\\.\\d{1,2})?$";//带1-2位小数的正数或负数
    	String num_8 = "^(\\-|\\+)?\\d+(\\.\\d+)?$";//正数、负数、和小数
    	
    	/*
    	 * 字符串校验
    	 */
		String str_1 = "[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+";//匹配邮箱
		String str_2 = "[https]+\\://[\\w\\d[.-]]+\\.[\\w\\d]+";//匹配网址
		String str_3 = "^[\u4e00-\u9fa5]{0,}$";//汉字
		String str_4 = "^[A-Za-z\\d]+$";//英文和数字
//    	匹配身份证
    	String str_5 = "(^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{2}$)";
    	//匹配日期
    	String str_6 = "(18|19|([23]\\d))\\d{2}\\-((0[1-9])|(10|11|12))\\-(([0-2][1-9])|10|20|30|31)";
    	
    	test(str_5, "");
	}
	
}
