package com.example.verticalviewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.verticalviewpager.databinding.ItemViewpagerBinding

class ItemFragment: Fragment() {
    private lateinit var mBinding: ItemViewpagerBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DataBindingUtil.inflate(inflater,
            R.layout.item_viewpager,
            container,
            false)

        setData("test")
        return mBinding.root
    }


    /**
     *
     * @param text
     */
    fun setData(text: String) {
        mBinding.txvName.text = text
    }
}