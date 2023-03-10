package com.example.compose_3_0_above

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import com.example.compose_3_0_above.sharedviewmodel.ScreenNavigation
import com.example.compose_3_0_above.ui.theme.Compose_30_aboveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_30_aboveTheme {
                var selected by remember { mutableStateOf(false) }
                Surface {
//                   Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
//                       CustomToggleButton(selected = selected, onChangeValue = {
//                           selected = it
//                       })
//                   }
                    ScreenNavigation()
                }
            }
        }
    }
}
