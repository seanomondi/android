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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sean.ui.theme.SeanTheme
import com.sean.sean.R
import androidx.compose.runtime.mutableStateOf as mutableStateOf

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Input()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Input(){

        Column(
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxSize(),

            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {


//        var name by remember { mutableStateOf(TextFieldValue("")) }
//        TextField(
//            value = name,
//            onValueChange = { name = it },
//            label = { Text(text = "Enter name")}
//        )

            Image(painter = painterResource(id = R.drawable.login),
                contentDescription = "login",
                modifier = Modifier
                    .size(200.dp)
                )


            Spacer(modifier = Modifier.height(10.dp))


            var username by remember { mutableStateOf(TextFieldValue("")) }
            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                label = { Text(text = "Username")},
                leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") }
            )


            Spacer(modifier = Modifier.height(20.dp))


            var password by remember { mutableStateOf(TextFieldValue("")) }
            OutlinedTextField(value = password,
                onValueChange = { password = it },
                label = { Text(text = "Password")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "")}
            )


//            Spacer(modifier = Modifier.height(20.dp))
//
//
//            var email by remember { mutableStateOf(TextFieldValue("")) }
//            OutlinedTextField(value = email,
//                onValueChange = { email = it },
//                label = { Text(text = "Email")},
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
//                leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")}
//            )
//
//
//            Spacer(modifier = Modifier.height(20.dp))
//
//
//            var phone by remember { mutableStateOf(TextFieldValue("")) }
//            OutlinedTextField(value = phone,
//                onValueChange = { phone = it },
//                label = { Text(text = "Phone number")},
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
//                leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "")},
//                textStyle = TextStyle(Color.Black),
//                colors = TextFieldDefaults.outlinedTextFieldColors(
//                    focusedBorderColor = Color.Blue,
//                    focusedLabelColor = Color.Blue,
//                    focusedLeadingIconColor = Color.Blue,
//                    unfocusedBorderColor = Color.Black,
//                    unfocusedLabelColor = Color.Black,
//                    unfocusedLeadingIconColor = Color.Black,
//                    cursorColor = Color.Blue
//                )
//            )


            Spacer(modifier = Modifier.height(20.dp))

            val login = LocalContext.current
            Button(onClick = {

                login.startActivity(Intent(login, MainActivity::class.java))

            }) {

                Text(text = "Log In")

            }

        val aa = AnnotatedString("no account? click here to sign up",
            spanStyle = SpanStyle(Color.Blue)
        )

        val bb = LocalContext.current
        ClickableText(text = aa, onClick = {

            bb.startActivity(Intent(bb, ScrollActivity::class.java))

        })



        }

}



