package com.chu.demo.test7;

/**
 * author:hezhiqiang
 * Date:2018/8/19 18:01
 * remark:
 */
public class Constant {

    private String name;

    private Constant(String name){
        this.name = name;
    }

    public static final Constant CONST_ONE = new Constant("aa");

    public static final Constant CONST_TOW = new Constant("bb");

    public String getName() {
        return name;
    }
}
