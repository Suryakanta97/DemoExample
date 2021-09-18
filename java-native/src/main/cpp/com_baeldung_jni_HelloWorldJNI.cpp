#include "com_surya_jni_HelloWorldJNI.h"
#include <iostream>

/*
 * Class:     com_surya_jni_HelloWorldJNI
 * Method:    sayHello
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_surya_jni_HelloWorldJNI_sayHello (JNIEnv* env, jobject thisObject) {
	std::string hello = "Hello from C++ !!";
    std::cout << hello << std::endl;
    return env->NewStringUTF(hello.c_str());
}