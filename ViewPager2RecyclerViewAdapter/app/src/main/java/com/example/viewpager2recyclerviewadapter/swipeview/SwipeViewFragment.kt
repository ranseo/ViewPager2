package com.example.viewpager2recyclerviewadapter.swipeview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewpager2recyclerviewadapter.R
import com.example.viewpager2recyclerviewadapter.data.Tmp
import com.example.viewpager2recyclerviewadapter.databinding.FragmentSwipeViewBinding
import com.google.android.material.tabs.TabLayoutMediator

class SwipeViewFragment : Fragment() {


    private lateinit var viewModel : SwipeViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSwipeViewBinding>(inflater, R.layout.fragment_swipe_view, container, false)

        viewModel = ViewModelProvider(this)[SwipeViewModel::class.java]

        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        val adapter = ViewPagerAdapter()

        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) {tab, position ->
            tab.text = "Object ${position+1}"
        }.attach()

        return binding.root
    }
}