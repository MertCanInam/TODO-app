package com.mertinam.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mertinam.todoapp.databinding.ListItemBinding

class ToDoAdapter(private val list: MutableList<ItemDataModel>): RecyclerView.Adapter<ToDoAdapter.MyListViewHolder>() {

    fun deleteItem(position: Int) {
        list.removeAt(position)
        notifyItemRemoved(position)
    }

    inner class MyListViewHolder(private val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root) {
        init {
            initView()
        }

        private fun initView() {
            binding.imageButton.setOnClickListener {
                val position = adapterPosition
                deleteItem(position)
            }
        }

        fun bind(getList: ItemDataModel) {
            binding.textView2.text = getList.title
            binding.textView3.text = getList.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyListViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyListViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}