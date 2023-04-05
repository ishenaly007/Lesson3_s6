package com.abit8.lesson3_s6.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.abit8.lesson3_s6.R
import com.abit8.lesson3_s6.databinding.FragmentSecondBinding
import com.abit8.lesson3_s6.viewmodel.MyViewModel


class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var viewModel: MyViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MyViewModel::class.java)

        viewModel.count.observe(viewLifecycleOwner, Observer {
            binding.tvCount.text = it.toString()
        })
    }

    /*fun updateCount(count: Int) {
        binding.tvCount.text = count.toString()
    }*/
}