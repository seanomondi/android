package com.example.sean

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            
            About()
            
        }
    }
}

@Preview(showBackground = true)
@Composable
fun About() {
    Column(

        modifier = Modifier
            .background(Color.LightGray)
//            .fillMaxWidth()
//            .fillMaxHeight()
            .fillMaxSize(),

//        verticalArrangement = Arrangement.Center,

        horizontalAlignment = Alignment.CenterHorizontally


    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(30.dp)

        ) {
            Text(text = "Home")
            Spacer(modifier = Modifier.width(20.dp))

            Text(text = "About")
            Spacer(modifier = Modifier.width(20.dp))

            Text(text = "Updates")
        }


        Spacer(modifier = Modifier.height(100.dp))


        Text(text = "this is the about screen", fontSize = 30.sp)
        
        Text(text = "added text", fontFamily = FontFamily.Cursive)

        Text(text = "text line three", modifier = Modifier.background(Color.Gray))


//        val home = LocalContext.current
//        Button(onClick = {
//
//            home.startActivity(Intent(home, MainActivity::class.java))
//
//        }) {
//
//            Text(text = "Home")
//
//        }

        val aa = AnnotatedString("click here to go to the home screen",
            spanStyle = SpanStyle(Color.Blue))

        val bb = LocalContext.current
        ClickableText(text = aa, onClick = {

            bb.startActivity(Intent(bb, MainActivity::class.java))

        })

        val cc = LocalContext.current
        Text(text = "click here to go to the image screen", color = Color.Blue,
            modifier = Modifier
                .clickable {
                    cc.startActivity(Intent(cc, ImageActivity::class.java))
                }
            )

        
    }
}


