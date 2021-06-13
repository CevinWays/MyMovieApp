package com.submission1.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.submission1.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)
        val sectionsPagerAdapter = SectionPagerAdapter(this, supportFragmentManager)
        with(activityHomeBinding) {
            viewPager.adapter = sectionsPagerAdapter
            tabs.setupWithViewPager(viewPager)
        }
        supportActionBar?.elevation = 0F
    }
}