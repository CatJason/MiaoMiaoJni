//
// Created by 王之俊 on 2023/6/13.
//

#include <jni.h>
#include <string>

extern "C" {
    JNIEXPORT jstring Java_com_miao_javajni_MainActivity_stringFromJNI(JNIEnv* env, jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
    }
}
