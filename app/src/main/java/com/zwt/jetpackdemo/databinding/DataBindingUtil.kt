package com.zwt.jetpackdemo.databinding

import com.zwt.jetpackdemo.databinding.bean.User

/**
 *
 * @Author:         wentaozhang
 * @CreateDate:     2022/1/25 3:30 下午
 * @Email：zhangwentao01@tojoy.com
 */
class DataBindingUtil {

    companion object {
        @JvmStatic
        fun getUserName(user: User): String {
            return user.name
        }
    }
}