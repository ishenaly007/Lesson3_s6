package com.abit8.lesson3_s6.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.abit8.lesson3_s6.databinding.FragmentFirstBinding
import com.abit8.lesson3_s6.viewmodel.MyViewModel


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private lateinit var viewModel: MyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MyViewModel::class.java)

        binding.btnPlus.setOnClickListener {
            viewModel.updateCount("+")
        }

        binding.btnMinus.setOnClickListener {
            viewModel.updateCount2("-")
        }
    }
}