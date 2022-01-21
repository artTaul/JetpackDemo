package com.zwt.jetpackdemo.util

import android.content.Context
import android.util.Log
import com.zwt.jetpackdemo.viewbinding.ViewBindingActivity
import java.text.ParsePosition

/**
 *
 * @Author:         wentaozhang
 * @CreateDate:     2022/1/21 10:37 上午
 * @Email：zhangwentao01@tojoy.com
 */
class IntentUtil {
    companion object {
        fun intentActivity(context: Context, position: Int) {
            Log.e("debug", "position : $position")
            when (position) {
                Constants.VIEW_BINDING -> ViewBindingActivity.launcher(context)
            }
        }
    }
}