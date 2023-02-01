package com.example.newcanaryproject

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*
import com.example.customtoast.ui.theme.CustomToastTheme
import com.example.customtoast.ui.theme.GreenColor
import com.example.customtoast.ui.theme.*

class MainActivity : ComponentActivity() {

       override fun onCreate(savedInstanceState: Bundle?) {
              super.onCreate(savedInstanceState)
              setContent {
                     CustomToastTheme {
                            Surface(
                                   modifier = Modifier.fillMaxSize(),
                                   color = MaterialTheme.colors.background
                            ) {

                            }
                     }
              }
       }
}

@Composable
fun CustomToast() {

}
