package com.example.sean

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.sean.ui.theme.SeanTheme

class AssignmentActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment3()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Assignment3(){
    Box {

        Image(
            imageVector = Icons.Default.Home,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        LazyColumn {
            item{
                Column(
                    modifier = Modifier
                        .padding(70.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Text(text = "Wanderly")

                    Text(text = "Your Ultimate Companion for Seamless Travel Experiences")

                    Spacer(modifier = Modifier.height(350.dp))

                    val signin = LocalContext.current
                    Button(onClick = {
                        signin.startActivity(Intent(signin, GridActivity::class.java))
                    },
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.buttonColors(Color.Green)
                    ) {
                        Text(text = "Sign in with Phone Number", color = Color.White)
                    }

                    val signin2 = LocalContext.current
                    Button(onClick = {
                        signin2.startActivity(Intent(signin2, GridActivity::class.java))
                    },
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(text = "Sign in with Apple", color = Color.Black)
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    val ac = AnnotatedString("Already have an account? Sign Up",
                        spanStyle = SpanStyle(Color.White)
                    )

                    val ac2 = LocalContext.current
                    ClickableText(text = ac, onClick = {

                        ac2.startActivity(Intent(ac2, GridActivity::class.java))

                    })

                    Text(text = "By creating an account or signing in, " +
                            "you agree to our Terms of Service and Privacy Policy.")


                }
            }
        }
    }
}


