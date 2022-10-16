package com.example.businesscardapp

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
        verticalArrangement = Arrangement.Center){
        Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
                 ) {
            val logoA= painterResource(id = R.drawable.android_logo);
            Image(painter = logoA, contentDescription = "logo", modifier = Modifier.fillMaxWidth(0.3f));
            Text(text = "Pelko Minto", fontSize = 36.sp, modifier = Modifier.padding(/*bottom = 10.dp*/),color=Color.White);
            Text(text = "Junior Android Developer", fontSize = 15.sp, modifier = Modifier.padding(bottom = 10.dp),color=Color.Green);

            // Text(text = "hi");
            /*androidx.compose.material.Icon(imageVector = Micon, contentDescription = null, modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth(0.5f));
                */

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        Card();
    }
}