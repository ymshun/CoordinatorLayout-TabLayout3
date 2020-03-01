package com.example.coordinatorlayouttablayout3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.coordinatorlayouttablayout3.ViewPagerAdapter
import com.example.coordinatorlayouttablayout3.ViewPagerFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        val fragmentList = arrayListOf<Fragment>()
        for(i in 0..3){
            fragmentList.add(ViewPagerFragment(i))
        }

        val adapter = ViewPagerAdapter(supportFragmentManager, fragmentList)
        viewPager.adapter = adapter

        tabLayout.setupWithViewPager(viewPager)
    }
}
