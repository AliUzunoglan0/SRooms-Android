package com.intsoft.core.base

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

abstract class BaseActivity<VM : BaseViewModel> : AppCompatActivity() {

    /*
    * nesnenin sadece ihtiyaç duyulduğu anda
    * oluşturulması için lazy kullanıldı */
    protected val viewModel by lazy {
        return@lazy ViewModelProvider(this)[BaseViewModel::class.java]
    }

}