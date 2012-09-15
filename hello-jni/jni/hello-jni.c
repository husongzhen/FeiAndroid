/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

#ifndef _Included_com_example_hellojni_HelloJni
#define _Included_com_example_hellojni_HelloJni

#include <string.h>
#include <jni.h>
#include <android/log.h>

#ifdef __cplusplus
extern "C"
{
#endif

void testCccc()
{
}

/* This is a trivial JNI example where we use a native method
 * to return a new VM String. See the corresponding Java source
 * file located at:
 *
 *   apps/samples/hello-jni/project/src/com/example/hellojni/HelloJni.java
 */
jstring Java_com_example_hellojni_HelloJni_stringFromJNI(JNIEnv* env,
		jobject thiz)
{

	return (*env)->NewStringUTF(env, "Hello from JNI Kai5!");
}

JNIEXPORT jstring JNICALL Java_com_example_hellojni_HelloJni_stringFromJNIWithParam(
		JNIEnv * env, jobject thiz, jstring src)
{
	char uu[64];
	const char* srcStr = (*env)->GetStringUTFChars(env, src, 0);
	strcpy(uu, srcStr);

	char* destStr = strcat(uu, " cat C.");
	__android_log_print(ANDROID_LOG_ERROR, "NDK_Kai", destStr);
	return (*env)->NewStringUTF(env, destStr);

}

JNIEXPORT jint JNICALL Java_com_example_hellojni_HelloJni_sumArray(JNIEnv * env,
		jobject thiz, jintArray arr, jint len)
{
	jint buf[5], i, sum = 0;
	(*env)->GetIntArrayRegion(env, arr, 0, 5, buf);
	for (i = 0; i < 5; ++i)
	{
		sum += buf[i];
	}
	return sum;
}

JNIEXPORT jobjectArray JNICALL Java_com_example_hellojni_HelloJni_initInt2DArray(
		JNIEnv * env, jobject thiz, int size)
{
	jobjectArray result;
	int i;
	jclass intArrCls = (*env)->FindClass(env, "[I");
	if (intArrCls == NULL)
	{
		return NULL; /* exception thrown */
	}
	result = (*env)->NewObjectArray(env, size, intArrCls, NULL);
	if (result == NULL)
	{
		return NULL; /* out of memory error thrown */
	}
	for (i = 0; i < size; i++)
	{
		jint tmp[256]; /* make sure it is large enough! */
		int j;
		jintArray iarr = (*env)->NewIntArray(env, size);
		if (iarr == NULL)
		{
			return NULL; /* out of memory error thrown */
		}
		for (j = 0; j < size; j++)
		{
			tmp[j] = i + j;
		}
		(*env)->SetIntArrayRegion(env, iarr, 0, size, tmp);
		(*env)->SetObjectArrayElement(env, result, i, iarr);
		(*env)->DeleteLocalRef(env, iarr);
	}
	return result;

}

#ifdef __cplusplus
}
#endif

#endif
