package com.zwt.jetpackdemo.viewbinding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.zwt.jetpackdemo.base.BaseActivity
import com.zwt.jetpackdemo.databinding.ActivityViewbindingViewBinding

/**
 *
 * @Author:         wentaozhang
 * @CreateDate:     2022/1/20 5:38 下午
 * @Email：zhangwentao01@tojoy.com
 *
 * ViewBinding 可以一替代findViewById
 * 在项目中的gradle中配置 viewBinding { enabled = true }
 * 如果您希望在生成绑定类时忽略某个布局文件，请将 tools:viewBindingIgnore="true" 属性添加到相应布局文件的根视图中
 */
class ViewBindingActivity : BaseActivity() {

    companion object {
        fun launcher(context: Context) {
            val intent = Intent(context, ViewBindingActivity::class.java)
            context.startActivity(intent)
        }
    }

    private lateinit var binding: ActivityViewbindingViewBinding //对应xml布局文件名

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewbindingViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.testView.text = "再也不用findView了"
    }
}