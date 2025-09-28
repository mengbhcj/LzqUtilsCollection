package com.lzq.lzqutils

import android.content.Context
import android.content.Intent

/**
 * Description
 * Author: lzq
 * Date:2025/9/28 11:05
 */
object CommonUtils {
    fun test(): String {
        return "测试成功"
    }
    fun startTestActivity(context: Context) {
        context.startActivity(Intent(context, LzqTestActivity::class.java))
    }
}