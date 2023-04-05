package com.abit8.lesson3_s6.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class MyViewModel : ViewModel() {

    private val _historyList = MutableLiveData<List<String>>()
    val historyList: LiveData<List<String>> = _historyList

    private val counts = MutableLiveData<Int>()
    val count: LiveData<Int>
        get() = counts

    init {
        counts.value = 0
        _historyList.value = listOf()
    }

    fun updateCount() {
        counts.value = count.value?.plus(1)
    }

    fun updateCount2() {
        counts.value = count.value?.minus(1)
    }

    //----------------------------------------------------
    fun addToHistory(item: String) {
        val currentList = _historyList.value ?: listOf()
        _historyList.value = currentList.plus(item)
    }
}
