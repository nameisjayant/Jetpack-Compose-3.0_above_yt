package com.example.compose_3_0_above.sharedviewmodel.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private val _res:MutableState<String> = mutableStateOf("")
    val res:State<String> =_res


    fun setData(data:String){
        _res.value = data
    }

}