package com.example.viewpager2fragmentstateadapter

import androidx.databinding.BindingAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2fragmentstateadapter.data.Tmp
import com.example.viewpager2fragmentstateadapter.swipeview.TmpViewPagerAdapter


@BindingAdapter("bindData")
fun bindViewPager(viewPager2: ViewPager2, data:List<Tmp>) {
    val adapter = viewPager2.adapter as TmpViewPagerAdapter
    adapter.data = data
}