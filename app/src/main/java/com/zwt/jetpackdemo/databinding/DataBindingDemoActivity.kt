package com.zwt.jetpackdemo.databinding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.zwt.jetpackdemo.R
import com.zwt.jetpackdemo.base.BaseActivity
import com.zwt.jetpackdemo.databinding.bean.ObservableUser
import com.zwt.jetpackdemo.databinding.bean.User

class DataBindingDemoActivity : BaseActivity() {

    companion object {
        fun launcher(context: Context) {
            val intent = Intent(context, DataBindingDemoActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //与activity绑定
        val binding: ActivityDataBindingDemoBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_data_binding_demo)
        //或者使用getLayoutInflate()方式绑定
//        val binding1:ActivityDataBindingDemoBinding = ActivityDataBindingDemoBinding.inflate(layoutInflater)
//        setContentView(binding1.root)
        binding.handlers = MyHandlers(this)
        binding.user = User("奔跑的大鸟", "大兴安岭壹号院", 1, 11)
        //list 操作
        val list = arrayListOf<User>()
        val user1 = User("张三", "北京朝阳区", 2, 22)
        list.add(user1)
        val user2 = User("李四", "北京昌平区", 3, 25)
        list.add(user2)
        binding.list = list
        binding.index = 1

        //map 操作
        val user3 = User("王五", "北京海淀区", 4, 21)
        val map = mutableMapOf<String, User>()
        map["4"] = user3
        binding.map = map
        binding.key = "4"

        //可观察字段
        binding.observableUser = ObservableUser()



    }
}