package com.example.compose_3_0_above.screen.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.compose_3_0_above.screen.viewmodel.SharedViewModel


@Composable
fun FirstScreen(
    navHostController: NavHostController,
    viewModel: SharedViewModel
) {

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Button(onClick = {
            viewModel.setData("Hello , how are you")
            navHostController.navigate(Screen.SECOND)
        }) {
            Text(text = "Send message")
        }
    }

}