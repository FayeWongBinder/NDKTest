package com.study.ndkdemo;

public class JNITest {
    static {
        System.loadLibrary("JNITest");
    }

    public JNITest(){
    }
    public native static String get();
}
