package com.example.viewpager2_with_tablayout.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager2_with_tablayout.R
import com.example.viewpager2_with_tablayout.adapter.PagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupTabLayoutWithViewPager()
    }

    private fun setupTabLayoutWithViewPager() {
        val title = listOf("First", "Second", "Third")

        viewPagerId.adapter = PagerAdapter(this)
        viewPagerId.isUserInputEnabled = false  // for disable user input like swipe
        TabLayoutMediator(tabLayoutId, viewPagerId) { tab, position ->
            tab.text = title[position]
        }.attach()

    }

}