package com.example.practica1_3_8nueva

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.practica1_3_8nueva.ui.theme.Practica1_3_8NuevaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practica1_3_8NuevaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Aplicacion()
                }
            }
        }
    }
}

@Composable
fun Aplicacion() {
    val instagram = painterResource(R.drawable.iconoinstagram)
    val gmail = painterResource(R.drawable.iconogmail)
    val whatsapp = painterResource(R.drawable.iconowhatsapp)
    val github = painterResource(R.drawable.iconogithub)
    val fondoGmail = painterResource(R.drawable.fondocorreo)
    val fondogithub = painterResource(R.drawable.fondogithub)
    Column (modifier = Modifier.fillMaxSize()){
    }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan)
        ){
            val image = painterResource(R.drawable.avatar)
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .size(500.dp)
                    .padding(bottom = 250.dp)
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 200.dp)
                .width(700.dp)
                .height(450.dp)
                .background(Color.White)
    ) {
            Column {
                Text(
                    text = "Mario Plaza Diaz",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(
                    text = "Desarrollador de Software",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                )
                Text(
                    text = "----------------------------------------------",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 20.dp)
                    )

                Row(Modifier.padding(10.dp)) {
                    Image(
                        painter = instagram,
                        contentDescription = null,
                        modifier = Modifier
                            .size(60.dp)
                    )
                    Text(
                        text = "@_plazaa01",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 18.dp)
                            .padding(horizontal = 7.dp)
                    )

                    Row(Modifier.padding(horizontal = 16.dp)) {
                        Image(
                            painter = whatsapp,
                            contentDescription = null,
                            modifier = Modifier
                                .size(60.dp)
                        )
                        Text(
                            text = "665 67 17 49",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 18.dp)
                                .padding(horizontal = 7.dp)
                                .fillMaxWidth()
                        )
                    }
                }
                Surface(modifier = Modifier.padding(top = 20.dp)) {
                    val contexto: Context = LocalContext.current
                    val webIntent: Intent = Uri.parse("https://www.google.com/intl/es/gmail/about/").let { Intent(Intent.ACTION_VIEW) }
                    Image(
                        painter = fondoGmail,
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        alpha = 0.6f,
                        modifier = Modifier
                            .height(60.dp)
                            .padding(horizontal = 20.dp)
                            .clip(CircleShape)
                            .clickable {
                                ContextCompat.startActivity(contexto, webIntent, null)
                            }

                    )
                    Row(Modifier.padding(horizontal = 50.dp)) {
                        Image(
                            painter = gmail,
                            contentDescription = null,
                            modifier = Modifier
                                .size(60.dp)
                        )
                        Text(
                            text = "plazadiazmario@gmail.com",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 18.dp)
                                .padding(horizontal = 7.dp)
                        )
                    }
                }
                Surface(modifier = Modifier.padding(top = 30.dp)) {
                    val contexto: Context = LocalContext.current
                    val webIntent: Intent = Uri.parse("https://github.com/Plaziita").let { Intent(Intent.ACTION_VIEW) }
                    Image(
                        painter = fondogithub,
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth,
                        alpha = 0.6f,
                        modifier = Modifier
                            .height(60.dp)
                            .padding(horizontal = 20.dp)
                            .clip(CircleShape)
                            .clickable {
                                ContextCompat.startActivity(contexto, webIntent, null)
                            }

                    )
                    Row(Modifier.padding(horizontal = 50.dp)) {
                        Image(
                            painter = github,
                            contentDescription = null,
                            modifier = Modifier
                                .size(60.dp)
                        )
                        Text(
                            text = "https://github.com/Plaziita",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 18.dp)
                                .padding(horizontal = 7.dp)
                        )
                    }
                }

                Text(
                    text = "----------------------------------------------",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 20.dp)
                )
            }
        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practica1_3_8NuevaTheme {
       Aplicacion()
    }
}