package com.example.sean

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sean.ui.theme.SeanTheme
import com.sean.sean.R

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Picha()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Picha() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(20.dp)
    ) {



        Image(painter = painterResource(id = R.drawable.focus),
            contentDescription = "image",
            modifier = Modifier
//                .background(Color.White)
                .clip(CircleShape)
                 .size(200.dp),
//            colorFilter = ColorFilter.tint(Color.Cyan)
//            contentScale = ContentScale.FillBounds
            )



        val home = LocalContext.current
        Button(onClick = {

            home.startActivity(Intent(home, MainActivity::class.java))

        }) {

            Text(text = "Home")

        }

        val about = LocalContext.current
        Button(onClick = {

            about.startActivity(Intent(about, AboutActivity::class.java))

        },
//         colors = ButtonDefaults.buttonColors(Color.Blue),
            colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
            border = BorderStroke(2.dp, Color.Blue),
//         shape = RectangleShape,
//         shape = RoundedCornerShape(10.dp),
            shape = CutCornerShape(10)

        ) {

            Text(text = "About", color = Color.Blue)

        }

    }



}


