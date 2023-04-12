package com.example.latihan5.ui.dashboard

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Welco3me to dashboard awak pak"
    }
    val text: LiveData<String> = _text
}