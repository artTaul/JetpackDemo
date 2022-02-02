package com.zwt.jetpackdemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zwt.jetpackdemo.adapter.MainAdapter
import com.zwt.jetpackdemo.databinding.ActivityMainBinding
import com.zwt.jetpackdemo.databinding.MainItemViewBinding
import com.zwt.jetpackdemo.util.IntentUtil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val list = arrayListOf<String>()
    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context = this
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initData()
        val manager = LinearLayoutManager(this)
        val adapter =
            MainAdapter(this, list, object : MainAdapter.OnItemClickListener {
                override fun itemClick(position: Int) {
                    IntentUtil.intentActivity(context, position)
                }
            })
        with(binding)
        {
            listView.layoutManager = manager
            listView.adapter = adapter
        }
    }

    private fun initData() {
        list.add("ViewBinding demo")
        list.add("DataBinding demo")
    }
}