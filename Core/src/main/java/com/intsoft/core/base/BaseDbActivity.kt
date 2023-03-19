package com.intsoft.core.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseDbActivity<VM : BaseViewModel, VB : ViewDataBinding> : BaseActivity<VM>() {

    private lateinit var viewBinding: VB

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setViewDataBinding()

    }

    /*
    * Returns layout resource ID
    * */
    @LayoutRes
    abstract fun getLayoutResourceId(): Int

    open fun setViewDataBinding() {
        viewBinding = DataBindingUtil.setContentView(this, getLayoutResourceId())
        viewBinding.lifecycleOwner = this
        onInitDataBinding()
    }

    abstract fun onInitDataBinding()

}