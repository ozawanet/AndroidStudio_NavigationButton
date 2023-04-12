package com.example.latihan5.ui.notifications

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "iko Notifikasi namoe pak"
    }
    val text: LiveData<String> = _text
}