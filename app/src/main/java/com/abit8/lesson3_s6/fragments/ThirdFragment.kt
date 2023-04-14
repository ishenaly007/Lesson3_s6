package com.abit8.lesson3_s6.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.abit8.lesson3_s6.databinding.FragmentThirdBinding
import com.abit8.lesson3_s6.viewmodel.MyViewModel


class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    private var viewModel: MyViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MyViewModel::class.java]

        viewModel!!.item.observe(viewLifecycleOwner) {
            binding.tvHistoryItem.text = it.toString()
        }
    }
}