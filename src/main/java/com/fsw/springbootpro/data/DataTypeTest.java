package com.fsw.springbootpro.data;

/**
 * Integer引发的思考
 */
public class DataTypeTest {
    public static void main(String[] args) {
        //Integer a = 127;
        Integer a = Integer.valueOf(127);
        Integer b = 127;
        System.out.println((a==b)+"........"+(a.equals(b)));

        Integer c = 128;
        Integer d = 128;
        System.out.println((c==d)+"........"+(c.equals(d)));
    }
}
