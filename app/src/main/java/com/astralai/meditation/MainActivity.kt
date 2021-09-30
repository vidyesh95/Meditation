package com.astralai.meditation

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.astralai.meditation.ui.theme.MeditationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    MeditationTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {

        }
    }
}

@Preview(showBackground = true, name = "light mode")
@Preview(showBackground = true, name = "Night mode", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreview() {
    MyApp()
}