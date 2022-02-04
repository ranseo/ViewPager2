package com.example.viewpager2fragmentstateadapter.swipeview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.viewpager2fragmentstateadapter.R
import com.example.viewpager2fragmentstateadapter.databinding.FragmentTmpObjBinding

class TmpObjFragment() : Fragment() {

    private lateinit var binding: FragmentTmpObjBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentTmpObjBinding>(inflater, R.layout.fragment_tmp_obj, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(KEY)}?.apply {
            binding.item = getParcelable(KEY)
        }
    }

    companion object {
        val KEY = "object"
    }
}