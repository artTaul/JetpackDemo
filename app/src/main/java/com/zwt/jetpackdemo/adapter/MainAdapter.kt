package com.zwt.jetpackdemo.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.zwt.jetpackdemo.databinding.MainItemViewBinding

/**
 *
 * @Author:         wentaozhang
 * @CreateDate:     2022/1/21 9:55 上午
 * @Email：zhangwentao01@tojoy.com
 */
class MainAdapter(var context: Context, var list: List<String>, var listener: OnItemClickListener) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    class ViewHolder(binding: MainItemViewBinding) : RecyclerView.ViewHolder(binding.root) {
        var itemTitle: TextView = binding.titleView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(MainItemViewBinding.inflate(LayoutInflater.from(context)))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = list[position]
        holder.itemTitle.setOnClickListener {
            Log.e("debug", "click")
            listener.itemClick(position)
        }
    }

    override fun getItemCount(): Int = list.size

    interface OnItemClickListener {
        fun itemClick(position: Int)
    }
}