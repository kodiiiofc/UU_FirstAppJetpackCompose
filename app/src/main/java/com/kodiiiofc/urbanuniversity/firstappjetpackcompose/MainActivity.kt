package com.kodiiiofc.urbanuniversity.firstappjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kodiiiofc.urbanuniversity.firstappjetpackcompose.ui.theme.FirstAppJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstAppJetpackComposeTheme {
                Greeting("Роман Мохнаткин")
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(
        text = "Студент университета Urban: $name!",
        fontSize = 16.sp,
        color = Color.Red,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirstAppJetpackComposeTheme {
        Greeting("Роман Мохнаткин")
    }
}