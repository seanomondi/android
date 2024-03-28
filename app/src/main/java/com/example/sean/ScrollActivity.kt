package com.example.sean

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sean.ui.theme.SeanTheme
import com.sean.sean.R

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Lazy()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Lazy() {

    LazyColumn(

        modifier = Modifier
            .fillMaxSize()

    ){

        item {

            Column(
                modifier = Modifier
                    .background(Color.LightGray)
                    .fillMaxSize(),

                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(painter = painterResource(id = R.drawable.register),
                    contentDescription = "image",
                    modifier = Modifier
                        .size(250.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                var name by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(value = name,
                    onValueChange = { name = it },
                    label = { Text(text = "Name")},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    leadingIcon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "") },
                    textStyle = TextStyle(Color.Black),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Blue,
                        focusedLabelColor = Color.Blue,
                        focusedLeadingIconColor = Color.Blue,
                        unfocusedBorderColor = Color.Black,
                        unfocusedLabelColor = Color.Black,
                        unfocusedLeadingIconColor = Color.Black,
                        cursorColor = Color.Blue
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

                var email by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(value = email,
                    onValueChange = { email = it },
                    label = { Text(text = "Email")},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
                    textStyle = TextStyle(Color.Black),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Blue,
                        focusedLabelColor = Color.Blue,
                        focusedLeadingIconColor = Color.Blue,
                        unfocusedBorderColor = Color.Black,
                        unfocusedLabelColor = Color.Black,
                        unfocusedLeadingIconColor = Color.Black,
                        cursorColor = Color.Blue
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

                var phone by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(value = phone,
                    onValueChange = { phone = it },
                    label = { Text(text = "Phone number")},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                    leadingIcon = { Icon(imageVector = Icons.Default.Phone, contentDescription = "") },
                    textStyle = TextStyle(Color.Black),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Blue,
                        focusedLabelColor = Color.Blue,
                        focusedLeadingIconColor = Color.Blue,
                        unfocusedBorderColor = Color.Black,
                        unfocusedLabelColor = Color.Black,
                        unfocusedLeadingIconColor = Color.Black,
                        cursorColor = Color.Blue
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

                var username by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(value = username,
                    onValueChange = { username = it },
                    label = { Text(text = "Username")},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    leadingIcon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "") },
                    textStyle = TextStyle(Color.Black),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Blue,
                        focusedLabelColor = Color.Blue,
                        focusedLeadingIconColor = Color.Blue,
                        unfocusedBorderColor = Color.Black,
                        unfocusedLabelColor = Color.Black,
                        unfocusedLeadingIconColor = Color.Black,
                        cursorColor = Color.Blue
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

                var password by remember { mutableStateOf(TextFieldValue("")) }
                OutlinedTextField(value = password,
                    onValueChange = { password = it },
                    label = { Text(text = "Password")},
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
                    textStyle = TextStyle(Color.Black),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Blue,
                        focusedLabelColor = Color.Blue,
                        focusedLeadingIconColor = Color.Blue,
                        unfocusedBorderColor = Color.Black,
                        unfocusedLabelColor = Color.Black,
                        unfocusedLeadingIconColor = Color.Black,
                        cursorColor = Color.Blue
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

                val signup = LocalContext.current
                Button(onClick = {

                    signup.startActivity(Intent(signup, InputActivity::class.java))

                }) {

                    Text(text = "Sign Up")

                }

                Spacer(modifier = Modifier.height(20.dp))

            }

        }

    }

}


