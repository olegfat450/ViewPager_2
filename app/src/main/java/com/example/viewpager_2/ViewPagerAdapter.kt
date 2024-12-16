package com.example.viewpager_2

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragment: FragmentActivity, private val viewPagerList: List<Picture>): FragmentStateAdapter(fragment) {



    override fun getItemCount() = viewPagerList.size

    override fun createFragment(position: Int): Fragment {

        val fragment = Fragment_1()
        fragment.arguments = bundleOf("key1" to viewPagerList[position])
        return fragment
    }
}