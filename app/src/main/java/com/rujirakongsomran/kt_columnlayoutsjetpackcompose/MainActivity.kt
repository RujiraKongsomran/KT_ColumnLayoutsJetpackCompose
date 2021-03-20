package com.rujirakongsomran.kt_columnlayoutsjetpackcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(0xFFF2F2F2))
            ) {
                Image(
                    bitmap = ImageBitmap
                        .imageResource(
                            id = R.drawable.happy_meal
                        ),
                    contentDescription = null,
                    modifier = Modifier.height(300.dp),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier.padding(16.dp),
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Happy Meal",
                            fontSize = 26.sp,
                        )
                        Text(
                            text = "$5.99",
                            fontSize = 17.sp,
                            style = TextStyle(
                                color = Color(0xFF85bb65)
                            ),
                            modifier = Modifier.align(Alignment.CenterVertically)
                        )
                    }
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "800 Calories", fontSize = 17.sp)
                    Spacer(modifier = Modifier.padding(top = 20.dp))
                    Button(
                        onClick = {},
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text(text = "ORDER NOW")
                    }
                }
            }
        }
    }
}