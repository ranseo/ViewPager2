package com.example.viewpager2recyclerviewadapter

import androidx.databinding.BindingAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2recyclerviewadapter.data.Tmp
import com.example.viewpager2recyclerviewadapter.swipeview.ViewPagerAdapter

@BindingAdapter("bindAdapter")
fun bindViewPagerAdapter(viewPager: ViewPager2, tmpList: List<Tmp>) {
    val adapter = viewPager.adapter as ViewPagerAdapter
    adapter.submitList(tmpList)
}
