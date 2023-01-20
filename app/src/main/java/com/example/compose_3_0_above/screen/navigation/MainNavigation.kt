package com.example.compose_3_0_above.screen.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose_3_0_above.screen.viewmodel.SharedViewModel


@Composable
fun MainNavigation() {
    val viewModel: SharedViewModel = viewModel()
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Screen.FIRST) {
        composable(Screen.FIRST) {
            FirstScreen(navHostController = navHostController, viewModel = viewModel)
        }
        composable(Screen.SECOND) {
            SecondScreen(viewModel = viewModel)
        }
    }

}

object Screen {
    const val FIRST = "First"
    const val SECOND = "Second"
}