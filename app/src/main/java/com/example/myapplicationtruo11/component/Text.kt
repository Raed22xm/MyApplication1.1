package com.example.myapplicationtruo11.component

import android.text.Layout.Alignment
import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplicationtruo11.R

@Preview
@Composable
fun TextTrue() {
    Text(
        text = "News",
        style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold),
        color = Color.Red,
        textAlign = TextAlign.Center


    )


}