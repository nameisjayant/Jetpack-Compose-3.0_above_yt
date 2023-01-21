package com.example.compose_3_0_above.sharedviewmodel

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.compose_3_0_above.sharedviewmodel.viewmodel.SharedViewModel

@Composable
fun SecondScreen(viewModel: SharedViewModel) {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = viewModel.res.value)

    }

}