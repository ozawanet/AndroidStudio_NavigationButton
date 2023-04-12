package com.example.latihan5.ui.keranjang

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class KeranjangViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Iko isi dari keranjang mah...! "
    }
    val text: LiveData<String> = _text
}