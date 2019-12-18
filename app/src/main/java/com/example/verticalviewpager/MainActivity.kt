package com.example.verticalviewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.verticalviewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding

    /**
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        setViewPager()
    }

    /**
     * View pager setting
     */
    private fun setViewPager() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        mBinding.vpgContents.adapter = adapter
    }
}
