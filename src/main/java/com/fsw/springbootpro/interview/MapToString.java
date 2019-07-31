package com.fsw.springbootpro.interview;

import java.util.HashMap;

/**
 * 将map转换为字符串进行输出
 * 例如"key1:value1;key2:value2"
 */
public class MapToString {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("key1","value1");
        map.put("key2","value2");
        System.out.println(map.toString());
    }
}
