package com.example.sean

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sean.ui.theme.SeanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Greeting()

        }
    }
}


@Composable
fun Greeting() {

  Column(

      modifier = Modifier
          .background(Color.LightGray)
          .fillMaxSize()
          .padding(20.dp)

//      verticalArrangement = Arrangement.Center,
//      horizontalAlignment = Alignment.CenterHorizontally

  ) {
      Text("This is the first android project")

      Text("android app development", color = Color.Gray)


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
      
      val image = LocalContext.current
      Button(onClick = {
          
          image.startActivity(Intent(image, ImageActivity::class.java))
          
      },
          colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
          border = BorderStroke(2.dp, Color.Blue),
          shape = CutCornerShape(10)

          )
      {
          Text(text = "Image", color = Color.Blue)
      }

      val input = LocalContext.current
      Button(onClick = {

          input.startActivity(Intent(input, InputActivity::class.java))

      },
          colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
          border = BorderStroke(2.dp, Color.Blue),
          shape = CutCornerShape(10)

      )
      {
          Text(text = "Input", color = Color.Blue)
      }

  }

}

