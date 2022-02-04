package com.example.viewpager2recyclerviewadapter.swipeview

import androidx.lifecycle.ViewModel
import com.example.viewpager2recyclerviewadapter.data.Tmp

class SwipeViewModel : ViewModel() {
    val tmpList = listOf<Tmp>(Tmp(1, "안녕"),Tmp(2, "안녕하세요"),Tmp(3, "반가워요"), Tmp(4, "잘있어요"), Tmp(5, "다시만나요"))
}