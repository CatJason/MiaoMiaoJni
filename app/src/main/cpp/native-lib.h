#ifndef NATIVE_LIB_H
#define NATIVE_LIB_H

#include <jni.h>

#ifdef __cplusplus
extern "C" {
#endif

extern "C" {
    JNIEXPORT jstring JNICALL Java_com_example_myapp_MainActivity_stringFromJNI(JNIEnv* env, jobject instance);
}

#ifdef __cplusplus
}
#endif

#endif // NATIVE_LIB_H
