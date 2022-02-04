package com.example.viewpager2fragmentstateadapter.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Tmp(
    val id: Long,
    val text: String
) : Parcelable {

}