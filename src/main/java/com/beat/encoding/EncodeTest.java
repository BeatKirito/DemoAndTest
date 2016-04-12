package com.beat.encoding;

import java.io.UnsupportedEncodingException;

/**
 * Created by beatkirito on 2016/3/26.
 */
public class EncodeTest {

    public static void main(String[] args) {

        String s = "这是一串即将编码的字符串";
        try {
            byte[] bs = s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
