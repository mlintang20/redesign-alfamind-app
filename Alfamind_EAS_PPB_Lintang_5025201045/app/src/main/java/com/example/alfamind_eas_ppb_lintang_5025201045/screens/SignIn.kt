package com.example.alfamind_eas_ppb_lintang_5025201045.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.alfamind_eas_ppb_lintang_5025201045.R

@Composable
fun SignIn(navController: NavHostController) {
//    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Column(horizontalAlignment = Alignment.CenterHorizontally) {
//            Text(buildAnnotatedString {
//                append("Belum punya akun? ")
//                withStyle(style = SpanStyle(color = Color.Blue, textDecoration = TextDecoration.Underline)) {
//                    append("Daftar")
//                }
//            }, modifier = Modifier.clickable { navController.navigate("signup") })
//            Spacer(modifier = Modifier.height(8.dp))
//            Button(onClick = { navController.navigate("main") }) {
//                Text(text = "Masuk")
//            }
//        }
//    }

    var username by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.alfamind_logo),
            contentDescription = "Alfamind Logo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.height(4.dp))

        Column(
            modifier = Modifier.width(280.dp)
        ) {
            Text(
                text = "Welcome to Alfamind",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFD5EEC)
            )

            Spacer(modifier = Modifier.size(4.dp))

            Text(
                text = "Masuk ke Alfamind sebagai Store Owner untuk melanjutkan usaha Anda",
                color = Color(0xFFFD5EEC)
            )
        }

        Spacer(modifier = Modifier.size(16.dp))

        OutlinedTextField(
            value = username,
            onValueChange = {
                username = it
            },
            label = {
                Text(
                    text = "Username",
                    color = Color(0xFF12D1FD)
                )
            }
        )

        Spacer(modifier = Modifier.size(16.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            label = {
                Text(
                    text = "Password",
                    color = Color(0xFF12D1FD)
                )
            },
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.size(8.dp))

        Text(buildAnnotatedString {
            append("Belum punya akun? ")
            withStyle(style = SpanStyle(color = Color(0xFFFD5EEC), textDecoration = TextDecoration.Underline)) {
                append("Daftar")
            }
        }, modifier = Modifier.clickable { navController.navigate("signup") }, color = Color(0xFFFD5EEC))

        Spacer(modifier = Modifier.size(8.dp))

        GradientButton(
            text = "Masuk",
            onClick = { navController.navigate("main") },
            modifier = Modifier
                .width(280.dp)
        )

        Spacer(modifier = Modifier.size(16.dp))

        Text(
            text = "Atau masuk dengan",
            color = Color(0xFFFD5EEC)
        )

        Spacer(modifier = Modifier.size(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(id = R.drawable.facebook_logo),
                contentDescription = "Facebook",
                modifier = Modifier
                    .size(80.dp)
                    .clickable { }
            )

            Column {
                Spacer(modifier = Modifier.height(16.dp))

                Image(
                    painter = painterResource(id = R.drawable.google_logo),
                    contentDescription = "Google",
                    modifier = Modifier
                        .size(50.dp)
                        .clickable { }
                )
            }
        }
    }
}