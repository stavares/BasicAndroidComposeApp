package org.sctgamingllc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import org.sctgamingllc.ui.theme.BasicAndroidComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicAndroidComposeAppTheme(darkTheme = true) {
                // A surface container using the 'background' color from the theme
                Surface(
                    color= MaterialTheme.colors.background,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        color = MaterialTheme.colors.onBackground,
        style = MaterialTheme.typography.h3
        )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicAndroidComposeAppTheme {
        Greeting("Android")
    }
}