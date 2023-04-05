package com.abit8.lesson3_s6.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.abit8.lesson3_s6.databinding.FragmentThirdBinding
import com.abit8.lesson3_s6.viewmodel.MyViewModel


class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    private lateinit var adapter: HistoryAdapter
    private lateinit var viewModel: MyViewModel
    private  var list = arrayListOf<String>(viewModel.historyList.toString())
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MyViewModel::class.java)
        val adapter = HistoryAdapter(list)
        binding.recycler.adapter = adapter
        binding.recycler.layoutManager = LinearLayoutManager(activity)
        adapter.updateList(list)
<<<<<<< HEAD
=======


        println("что то там добавили")
>>>>>>> 62af5e7 (Initial commit)
    }
}