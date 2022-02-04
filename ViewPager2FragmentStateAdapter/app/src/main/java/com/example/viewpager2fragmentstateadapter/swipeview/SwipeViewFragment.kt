package com.example.viewpager2fragmentstateadapter.swipeview

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.viewpager2fragmentstateadapter.R
import com.example.viewpager2fragmentstateadapter.databinding.FragmentSwipeViewBinding
import com.google.android.material.tabs.TabLayoutMediator

class SwipeViewFragment() : Fragment() {
    private lateinit var viewModel: SwipeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSwipeViewBinding>(inflater, R.layout.fragment_swipe_view, container, false)

        viewModel = ViewModelProvider(this)[SwipeViewModel::class.java]

        val adapter = TmpViewPagerAdapter(this)
        binding.viewPager.adapter = adapter

        binding.viewModel=viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        TabLayoutMediator(binding.tabLayout, binding.viewPager) {tab, position ->
            tab.text = "OBJECT ${position+1}"
        }.attach()

        return binding.root
    }
}