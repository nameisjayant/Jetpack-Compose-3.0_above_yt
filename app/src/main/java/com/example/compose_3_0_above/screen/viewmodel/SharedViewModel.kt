package com.example.compose_3_0_above.screen.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {


    private val _res = mutableStateOf("")
    val res:State<String> = _res

    fun setData(data:String){
        _res.value = data
    }


}