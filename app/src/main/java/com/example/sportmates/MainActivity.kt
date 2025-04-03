package com.example.sportmates

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.sportmates.ui.navigation.AppNavigation
import com.example.sportmates.ui.theme.SportMatesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SportMatesTheme {
                AppNavigation()
            }
        }
    }
}
