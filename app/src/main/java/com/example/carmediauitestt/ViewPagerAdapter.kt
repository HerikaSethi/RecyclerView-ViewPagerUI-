package com.example.carmediainventoryuitest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.carmediauitestt.ViewPagerFragment

class ViewPagerAdapter(fm:FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fm,lifecycle) {

    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return ViewPagerFragment()
    }
}