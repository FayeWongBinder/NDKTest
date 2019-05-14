//
// Created by 54901 on 2019/5/14.
//
#include<jni.h>
#include<stdio.h>
#include "com_study_ndkdemo_JNITest.h"
JNIEXPORT jstring JNICALL Java_com_study_ndkdemo_JNITest_get
  (JNIEnv *env, jclass jclass){
      return (*env)->NewStringUTF(env,"Faye WONG");
}


