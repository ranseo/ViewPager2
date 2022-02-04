package com.example.viewpager2recyclerviewadapter.swipeview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager2recyclerviewadapter.data.Tmp
import com.example.viewpager2recyclerviewadapter.databinding.TmpListItemBinding

class ViewPagerAdapter : ListAdapter<Tmp, ViewPagerAdapter.ViewHolder>(tmpDiffCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tmp = getItem(position)
        holder.bind(tmp)
    }



    class ViewHolder(val binding: TmpListItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(
            tmp: Tmp?
        ) {
            binding.item = tmp
        }

        companion object{
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = TmpListItemBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }

        }

    }

}


class tmpDiffCallback() : DiffUtil.ItemCallback<Tmp>() {
    override fun areItemsTheSame(oldItem: Tmp, newItem: Tmp): Boolean {
        TODO("Not yet implemented")
    }

    override fun areContentsTheSame(oldItem: Tmp, newItem: Tmp): Boolean {
        TODO("Not yet implemented")
    }

}