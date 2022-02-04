package com.example.viewpager2fragmentstateadapter.swipeview

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2fragmentstateadapter.data.Tmp

class TmpViewPagerAdapter(fr: Fragment) : FragmentStateAdapter(fr) {
    var data : List<Tmp> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = data.size

    override fun createFragment(position: Int): Fragment {
        val fragment = TmpObjFragment()
        fragment.arguments = Bundle().apply {
            putParcelable(KEY, data[position])
        }
        return fragment

    }

    companion object {

        const val KEY = "object"
    }
}