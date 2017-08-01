//
// Created by 融易乐 on 2017/8/1.
//

#include "trying.h"

JNIEXPORT jint JNICALL Java_com_example_rongyile_trying_MainActivity_add(JNIEnv *env, jobject instance,jint a,jint b) {

    return a+b;
}