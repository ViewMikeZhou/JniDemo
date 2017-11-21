#include <stdio.h>
#include <stdlib.h>
#include <jni.h>

jstring Java_com_zhou_jniTest_JniDemo_getFromC(JNIEnv* env,jobject jobj){
    char* text ="i am from c" ;
    return (*env) ->NewStringUTF(env,text);
}