package com.example.openinapp.ui.Campaigns

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class campaignViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Coming Soon"
    }
    val text: LiveData<String> = _text
}