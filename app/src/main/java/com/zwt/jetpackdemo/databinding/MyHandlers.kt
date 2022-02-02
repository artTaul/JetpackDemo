package com.zwt.jetpackdemo.databinding

import android.content.Context
import android.util.Log
import android.view.View
import androidx.databinding.ObservableArrayMap
import com.zwt.jetpackdemo.databinding.bean.ObservableUser
import com.zwt.jetpackdemo.databinding.bean.User

/**
 *
 * @Author:         wentaozhang
 * @CreateDate:     2022/1/25 4:02 下午
 * @Email：zhangwentao01@tojoy.com
 */
class MyHandlers(var context: Context) {

    fun onClick(v: View) {
        Log.e("debug", "${v.id}")
    }

    fun onSaveUser(view: View, user: User) {
        Log.e("debug", "${view.id}  save user info")
    }

    fun onObservableClick(view: View, user: ObservableUser) {
        Log.e("debug", "${view.id}  onObservableClick")
        user.name.set("张三")
        user.age.set(15)
    }

    fun onObservableArrayMapClick(view: View, map: ObservableArrayMap<String, Any>) {
        Log.e("debug", "${view.id}  onObservableClick")
        map.apply {
            put("name", "ObservableArrayMap")
        }

    }
}