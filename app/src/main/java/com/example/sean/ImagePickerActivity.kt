package com.example.sean//package com.example.sean
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.rememberLauncherForActivityResult
//import androidx.activity.compose.setContent
//import androidx.activity.result.PickVisualMediaRequest
//import androidx.activity.result.contract.ActivityResultContracts
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.material3.Button
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.example.sean.ui.theme.SeanTheme
//
//class ImagePickerActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            ImagePicker()
//        }
//    }
//}
//
//@Composable
//fun ImagePicker() {
//   val result = remember { mutableStateOf(null) }
//   val launcher = rememberLauncherForActivityResult(contract = ActivityResultContracts.PickVisualMedia())
//   {
//        result.value = it
//   }
//
//    Column {
//        Button(onClick = { launcher.launch(PickVisualMediaRequest
//            (mediaType = ActivityResultContracts.PickVisualMedia.ImageOnly)) })
//        {
//            Text(text = "Select Image")
//        }
//
//        result.value?.let{image ->
//
//            val painter = rememberAsyncImagePainter(
//                ImageRequest
//                    .Builder(LocalContext.current)
//                    .data(data = image)
//                    .build()
//            )
//
//            Image(
//                painter = painter,
//                contentDescription = null,
//                modifier = Modifier.size(150.dp, 150.dp)
//                    .padding(16.dp)
//            )
//        }
//
//    }
//
//}
//
//
