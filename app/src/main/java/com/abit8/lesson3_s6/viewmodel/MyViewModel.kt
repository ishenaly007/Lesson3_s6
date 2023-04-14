package com.abit8.lesson3_s6.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class MyViewModel : ViewModel() {

    private val counts = MutableLiveData<Int>()
    val count: LiveData<Int> = counts

    private val items = MutableLiveData<String>()
    val item: LiveData<String> = items

    init {
        counts.value = 0
        items.value = ""
    }

    fun updateCount(itemm:String) {
        counts.value = count.value?.plus(1)
        val currentHistory = items.value ?: ""
        items.value = "$currentHistory\n$itemm"
    }

    fun updateCount2(itemm: String) {
        counts.value = count.value?.minus(1)
        val currentHistory = items.value ?: ""
        items.value = "$currentHistory\n$itemm"
    }
}
