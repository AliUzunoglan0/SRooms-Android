package com.intsoft.core.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

abstract class BaseFragment<VM: BaseViewModel> : Fragment() {

    private lateinit var viewModel: VM

    abstract fun getViewModel() : Class<VM>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[getViewModel()]
    }

    @LayoutRes
    abstract fun getLayoutResourceId(): Int

}