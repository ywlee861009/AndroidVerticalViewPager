package com.example.verticalviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter : FragmentPagerAdapter {
    private val list: ArrayList<ItemFragment> = ArrayList()

    constructor(fragmentManager: FragmentManager) : super(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        list.add(ItemFragment())
        list.add(ItemFragment())
        list.add(ItemFragment())
        list.add(ItemFragment())
        list.add(ItemFragment())
    }

    override fun getItem(position: Int): Fragment {
        return list[position]
    }

    override fun getCount(): Int {
        return list.size
    }
}
