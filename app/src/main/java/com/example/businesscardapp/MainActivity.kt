package com.example.businesscardapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0, 85, 105)//MaterialTheme.colors.background
                ) {
                    Card();
                }
            }
        }
    }
}

@Composable
fun Card() {
    Column(modifier = Modifier
        .fillMaxSize()
        .fillMaxWidth(),horizontalAlignment = Alignment.CenterHorizontally,
        /*verticalArrangement = Arrangement.Center*/){
        Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center, modifier = Modifier.padding(top=200.dp, bottom = 250.dp)
                 ) {
            val logoA= painterResource(id = R.drawable.android_logo);
            Image(painter = logoA, contentDescription = "logo", modifier = Modifier.fillMaxWidth(0.3f));
            //Log.i("Card","Img created");
            Text(text = "Pelko Minto", fontSize = 36.sp, modifier = Modifier.padding(/*bottom = 10.dp*/),color=Color.White);
            Text(text = "Junior Android Developer", fontSize = 15.sp, modifier = Modifier.padding(bottom = 10.dp),color=Color.Green);


        }
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            BlockInfo(info = "+3805078948253", Micon = Icons.Rounded.Call)
            BlockInfo(info = "@AndroidDev", Micon = Icons.Rounded.Share)
            BlockInfo(info = "Pikelton@android.com", Micon = Icons.Rounded.Email)
        }

    }
}
@Composable
fun BlockInfo(info:String, Micon: ImageVector){
    Row( modifier = Modifier
        //.fillMaxSize()
        .fillMaxWidth()
        .wrapContentWidth(Alignment.Start).padding(bottom = 10.dp)) {
        Icon(imageVector = Micon, contentDescription = null, modifier = Modifier
           .fillMaxWidth(0.16f)
           .fillMaxSize(0.16f)
            .padding(start = 20.dp), Color(0, 191, 89));
        Text(text = info, fontSize = 26.sp, modifier = Modifier
            .fillMaxWidth()
            .padding(start=10.dp)
            , textAlign = TextAlign.Justify, color = Color.White)



            /*.wrapContentWidth(align = Alignment.End)*/
    }
}
@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        Card();
    }
}