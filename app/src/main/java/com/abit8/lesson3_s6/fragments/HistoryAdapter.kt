package com.abit8.lesson3_s6.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abit8.lesson3_s6.databinding.ListItemBinding

class HistoryAdapter(private var historyList: List<String>) :
    RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val binding =
            ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HistoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.bind(historyList[position])
    }

    override fun getItemCount() = historyList.size

    fun updateList(newList: List<String>) {
        historyList = newList
        notifyDataSetChanged()
    }

    inner class HistoryViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(text: String) {
            binding.tv1.text = text
        }

    }
}


