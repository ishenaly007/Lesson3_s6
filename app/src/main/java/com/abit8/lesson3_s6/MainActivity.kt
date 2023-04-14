package com.abit8.lesson3_s6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abit8.lesson3_s6.databinding.ActivityMainBinding
import com.abit8.lesson3_s6.fragments.FirstFragment
import com.abit8.lesson3_s6.fragments.SecondFragment
import com.abit8.lesson3_s6.fragments.ThirdFragment
import com.abit8.lesson3_s6.fragments.viewpageradapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        adapter.addFragment(FirstFragment())
        adapter.addFragment(SecondFragment())
        adapter.addFragment(ThirdFragment())

        binding.viewPager2.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            when (position) {
                0 -> tab.text = "Button Fragment"
                1 -> tab.text = "Result Fragment"
                2 -> tab.text = "History Fragment"
            }
        }.attach()

    }
}