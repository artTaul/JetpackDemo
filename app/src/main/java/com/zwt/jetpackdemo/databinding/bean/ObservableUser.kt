package com.zwt.jetpackdemo.databinding.bean

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

/**
 *
 * @Author:         wentaozhang
 * @CreateDate:     2022/1/27 9:48 上午
 * @Email：zhangwentao01@tojoy.com
 */
class ObservableUser {
    val name: ObservableField<String> = ObservableField<String>()
    val age = ObservableInt()
}