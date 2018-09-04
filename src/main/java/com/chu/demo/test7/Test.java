package com.chu.demo.test7;

/**
 * author:hezhiqiang
 * Date:2018/8/30 14:23
 * remark:
 */
public class Test {

    public static void main(String[] args) {
        String path = "http://118.190.164.186/portal_attach/item/1274e40d9a284dc78177b22b710f13e8.txt";
        
        String[] d = path.split("/");
        for (int i = 3; i < d.length-1; i++) {
            System.out.println(d[i]);
        }

        String str = path.substring(path.lastIndexOf("/") + 1, path.length());

//        System.out.println(str);
    }
    
}
