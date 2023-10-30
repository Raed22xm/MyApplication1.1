package com.example.myapplicationtruo11

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.myapplicationtruo11.component.CardExample


import com.example.myapplicationtruo11.component.ImageCard
import com.example.myapplicationtruo11.component.MyCard
import com.example.myapplicationtruo11.component.MyCard1
import com.example.myapplicationtruo11.component.MyCard2
import com.example.myapplicationtruo11.component.MyCard3
import com.example.myapplicationtruo11.component.NewsScreen
import com.example.myapplicationtruo11.component.TextTrue
import com.example.myapplicationtruo11.ui.theme.MyApplicationTruo11Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTruo11Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }

                Column( modifier = Modifier
                    .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    TextTrue()
                    NewsScreen()
                    CardExample()


                    }
                ImageCard()
                MyCard()
                MyCard1()
                MyCard2()
                MyCard3()
                }
            }
        }
}

