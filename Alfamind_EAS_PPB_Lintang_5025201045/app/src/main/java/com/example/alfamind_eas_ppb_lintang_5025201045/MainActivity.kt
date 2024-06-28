package com.example.alfamind_eas_ppb_lintang_5025201045

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.alfamind_eas_ppb_lintang_5025201045.navigation.AppNavigation
import com.example.alfamind_eas_ppb_lintang_5025201045.ui.theme.Alfamind_EAS_PPB_Lintang_5025201045Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Alfamind_EAS_PPB_Lintang_5025201045Theme {
                val navController = rememberNavController()
                AppNavigation(navController)
            }
        }
    }
}