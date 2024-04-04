package com.example.sean

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.sean.ui.theme.SeanTheme
import com.sean.sean.R

class AssignmentActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Assignment2()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Assignment2() {

    Box {

        Image(imageVector = Icons.Default.LocationOn,
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
            )


        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {

            item {

                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(imageVector = Icons.Default.Star, contentDescription = "")
                    Text(text = "travelezy")
                }
                
                Spacer(modifier = Modifier.height(400.dp))
                
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Absolute.Center
                ) {
                    Column(
                        modifier = Modifier
                            .width(250.dp)
                            .height(150.dp)
                            .background(Color.DarkGray),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Explore the world here", fontWeight = FontWeight.Bold, color = Color.White, textAlign = TextAlign.Center)
                        Text(text = "The best travel app in the world in 2021.", color = Color.White, textAlign = TextAlign.Center)
                        Text(text = "Answer of traveller to find their journey.", color = Color.White, textAlign = TextAlign.Center)

                        val account = LocalContext.current
                        Button(onClick = {
                            account.startActivity(Intent(account, GridActivity::class.java))
                        },
                            shape = RoundedCornerShape(20.dp),
                            colors = ButtonDefaults.buttonColors(Color.White)
                        ) {
                            Text(text = "Create an account", color = Color.Black)
                        }

                        val ac = AnnotatedString("Already have an account?",
                            spanStyle = SpanStyle(Color.White)
                        )

                        val ac2 = LocalContext.current
                        ClickableText(text = ac, onClick = {

                            ac2.startActivity(Intent(ac2, GridActivity::class.java))

                        })

                    }

                }
            }

        }
    }

}


