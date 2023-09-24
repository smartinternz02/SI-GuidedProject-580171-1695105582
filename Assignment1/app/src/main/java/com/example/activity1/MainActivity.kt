package com.example.activity1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.activity1.ui.theme.Activity1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Hello()
                Username()
                Column(verticalArrangement = Arrangement.Bottom) {
                    Button1()
                }
            }
        }
    }
}

@Composable
fun Hello(){
    Text(text = "Hello Buddy", modifier = Modifier.padding(50.dp), color = Color.White)
}
@Composable

fun Button1(){
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Submit")
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Username(){
    var text by remember { mutableStateOf("") }
    TextField(modifier = Modifier.padding(top = 10.dp), value = text, onValueChange = {it -> text = it }, label ={ Text(
        text = "Username"
    )}
    )
}



@Preview
@Composable
fun HelloPreview(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Hello()
        Username()
        Column(modifier = Modifier
            .fillMaxSize(1f)
            .padding(bottom = 150.dp), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally) {
            Button1()
        }
    }
}