package com.example.sean

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sean.ui.theme.SeanTheme
import com.sean.sean.R

class AssignmentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment1()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Assignment1() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)

    ) {

        item {

            Row(
                modifier = Modifier
                    .height(50.dp)
                    .background(Color.White)

            ) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "")

                Spacer(modifier = Modifier.width(100.dp))

                Column {
                    Text(text = "   Current location")
                    Row {
                        Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                        Text(text = "Denpasar,Bali")
                    }
                }

                Spacer(modifier = Modifier.width(100.dp))
                
                Image(imageVector = Icons.Default.Person, contentDescription = "")

            }

            Spacer(modifier = Modifier.height(30.dp))            
            
            Row(
                modifier = Modifier
                    .height(50.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
                   

            ){
                    Row(
                        modifier = Modifier
                            .padding(10.dp)

                    ) {
                        Icon(imageVector = Icons.Default.Home, contentDescription = "")
                        Text(text = "Hotels")
                    }

                Spacer(modifier = Modifier.width(100.dp))

                    Row (
                        modifier = Modifier
                            .padding(10.dp)

                    ){
                        Icon(imageVector = Icons.Default.Home, contentDescription = "")
                        Text(text = "Holiday")
                    }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .height(50.dp),
                horizontalArrangement = Arrangement.SpaceEvenly


            ){

                Row (
                    modifier = Modifier
                        .padding(10.dp)

                ){
                    Icon(imageVector = Icons.Default.Home, contentDescription = "")
                    Text(text = "Taxi")
                }



                Spacer(modifier = Modifier.width(110.dp))

                Row (
                    modifier = Modifier
                        .padding(10.dp)

                ){
                    Icon(imageVector = Icons.Default.Home, contentDescription = "")
                    Text(text = "Ticket")
                }

            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .height(50.dp),
                horizontalArrangement = Arrangement.SpaceEvenly


            ){
                   Row (
                       modifier = Modifier
                           .padding(10.dp)

                   ){
                       Icon(imageVector = Icons.Default.Home, contentDescription = "")
                       Text(text = "Airplane")
                   }

                Spacer(modifier = Modifier.width(90.dp))

                    Row (
                        modifier = Modifier
                            .padding(10.dp)
                            
                    ){
                        Icon(imageVector = Icons.Default.Home, contentDescription = "")
                        Text(text = "Harbour")
                    }
            }

            Spacer(modifier = Modifier.height(10.dp))
            
            
            Row(
                modifier = Modifier
                    .height(50.dp)
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceEvenly

            ){
                Text(text = "Popular in town")
                
                Spacer(modifier = Modifier.width(150.dp))

                val va = AnnotatedString("View all",
                    spanStyle = SpanStyle(Color.Blue)
                )

                val vb = LocalContext.current
                ClickableText(text = va, onClick = {

                    vb.startActivity(Intent(vb, GridActivity::class.java))

                })
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Card {
                    Image(painter = painterResource(id = R.drawable.focus), contentDescription = "", Modifier.size(150.dp))
                    Column {
                        Text(text = "Nusa Penida")
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "Nusa Penida")
                        }
                    }
                }

                Spacer(modifier = Modifier.width(20.dp))

                Card {
                    Image(painter = painterResource(id = R.drawable.focus), contentDescription = "", Modifier.size(150.dp))
                    Column {
                        Text(text = "Tanah Lot")
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "Tanah Lot")
                        }
                    }
                }

            }


            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Card {
                    Image(painter = painterResource(id = R.drawable.focus), contentDescription = "", Modifier.size(150.dp))
                    Column {
                        Text(text = "Nusa Penida")
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "Nusa Penida")
                        }
                    }
                }

                Spacer(modifier = Modifier.width(20.dp))

                Card {
                    Image(painter = painterResource(id = R.drawable.focus), contentDescription = "", Modifier.size(150.dp))
                    Column {
                        Text(text = "Tanah Lot")
                        Row {
                            Icon(imageVector = Icons.Default.LocationOn, contentDescription = "")
                            Text(text = "Tanah Lot")
                        }
                    }
                }

            }
        

        }
    }

}

