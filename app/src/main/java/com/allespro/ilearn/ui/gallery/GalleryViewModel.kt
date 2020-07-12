package com.allespro.ilearn.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel





class GalleryViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Here would be threads, I want sleep"
    }
    val text: LiveData<String> = _text
}