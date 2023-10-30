package com.example.myapplicationtruo11.component

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationtruo11.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.dp

import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow

import androidx.compose.ui.unit.dp




@Preview
@Composable
fun ImageCard() {
    Box(
        modifier = Modifier
            .padding(top = 100.dp)
            .padding(12.dp)
            .clip(
                RoundedCornerShape(24.dp)
            )
    ) {
        Image(painterResource(id = R.drawable.imagescaler), contentDescription = "card")
        Text(
            text = "Image text",
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        )
                    )
                )
                .padding(12.dp),
            color = Color.White,
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center
        )
    }
}
@Preview
@Composable
fun MyCard(){
    Column(
        modifier = Modifier
            .padding(top=370.dp)
            .padding(end = 170.dp)
            .fillMaxWidth(),

            //.background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
      Card(
          modifier = Modifier
              .width(150.dp)
              .background(Color.White)
              .height(160.dp),
          shape = RoundedCornerShape(topStart=16.dp),
          //border = BorderStroke(width = 3.dp, Color.DarkGray),
          //backgroundColor = Color.White,
          elevation = CardDefaults.cardElevation(10.dp)

      ){
        Column {
            Image(painter = painterResource(id = R.drawable.sport_news),
                contentDescription = " Sport Section",
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
                )
            Column(
                modifier = Modifier
                    .padding(4.dp)
            ) {
                  Text(
                      text = " Titel",
                      fontSize = 8.sp,
                      fontWeight = FontWeight.Bold,
                      fontFamily = FontFamily.Monospace
                  )
                  Text(
                      text = " Sport news",
                      modifier =Modifier
                          .padding(4.dp),
                      color=Color.DarkGray,
                      fontSize = 6.sp,
                      maxLines = 2,
                      overflow = TextOverflow.Ellipsis


                  )
            }
        }
      }
    }
}
@Preview
@Composable
fun MyCard1(){
    Column(
        modifier = Modifier
            .padding(top=370.dp)
            .padding(start = 170.dp)
            .fillMaxWidth(),

        //.background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Card(
            modifier = Modifier
                .width(150.dp)
                .background(Color.White)
                .height(160.dp),
            shape = RoundedCornerShape(topStart=16.dp),
            //border = BorderStroke(width = 3.dp, Color.DarkGray),
            //backgroundColor = Color.White,
            elevation = CardDefaults.cardElevation(10.dp)

        ){
            Column {
                Image(painter = painterResource(id = R.drawable.monay),
                    contentDescription = " Economy Section",
                    modifier = Modifier
                        .height(100.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .padding(4.dp)
                ) {
                    Text(
                        text = " Titel",
                        fontSize = 8.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = " Economy news",
                        modifier =Modifier
                            .padding(4.dp),
                        color=Color.DarkGray,
                        fontSize = 6.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis


                    )
                }
            }
        }
    }
}
@Preview
@Composable
fun MyCard2(){
    Column(
        modifier = Modifier
            .padding(top=520.dp)
            .padding(start = 170.dp)
            .fillMaxWidth(),

        //.background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Card(
            modifier = Modifier
                .width(150.dp)
                .background(Color.White)
                .height(160.dp),
            shape = RoundedCornerShape(topStart=16.dp),
            //border = BorderStroke(width = 3.dp, Color.DarkGray),
            //backgroundColor = Color.White,
            elevation = CardDefaults.cardElevation(10.dp)

        ){
            Column {
                Image(painter = painterResource(id = R.drawable.weater),
                    contentDescription = " Weater Section",
                    modifier = Modifier
                        .height(100.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .padding(4.dp)
                ) {
                    Text(
                        text = " Titel",
                        fontSize = 8.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = " Weater news",
                        modifier =Modifier
                            .padding(4.dp),
                        color=Color.DarkGray,
                        fontSize = 6.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis


                    )
                }
            }
        }
    }
}
@Preview
@Composable
fun MyCard3(){
    Column(
        modifier = Modifier
            .padding(top=520.dp)
            .padding(end = 170.dp)
            .fillMaxWidth(),

        //.background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Card(
            modifier = Modifier
                .width(150.dp)
                .background(Color.White)
                .height(160.dp),
            shape = RoundedCornerShape(topStart=16.dp),
            //border = BorderStroke(width = 3.dp, Color.DarkGray),
            //backgroundColor = Color.White,
            elevation = CardDefaults.cardElevation(10.dp)

        ){
            Column {
                Image(painter = painterResource(id = R.drawable.politics_),
                    contentDescription = " Politics Section",
                    modifier = Modifier
                        .height(100.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .padding(4.dp)
                ) {
                    Text(
                        text = " Titel",
                        fontSize = 8.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace
                    )
                    Text(
                        text = " Politics news",
                        modifier =Modifier
                            .padding(4.dp),
                        color=Color.DarkGray,
                        fontSize = 6.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis


                    )
                }
            }
        }
    }
}