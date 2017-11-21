package com.zhou.jniTest;

/**
 * Created by zhou on 2017/4/18.
 */

public class JniDemo {
    static {
        System.loadLibrary("jni_test");
    }
    public native String getFromC();


}
