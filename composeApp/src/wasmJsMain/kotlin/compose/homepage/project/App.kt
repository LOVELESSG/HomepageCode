package compose.homepage.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import longzhenhomepage.composeapp.generated.resources.Outfit_Black
import longzhenhomepage.composeapp.generated.resources.Outfit_Bold
import longzhenhomepage.composeapp.generated.resources.Outfit_Light
import longzhenhomepage.composeapp.generated.resources.Outfit_Regular
import longzhenhomepage.composeapp.generated.resources.Outfit_Thin
import org.jetbrains.compose.resources.painterResource

import longzhenhomepage.composeapp.generated.resources.Res
import longzhenhomepage.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.Font

@Composable
fun App() {
    MaterialTheme {
        val outfit = FontFamily(
            Font(Res.font.Outfit_Bold, FontWeight.Bold),
            Font(Res.font.Outfit_Thin, FontWeight.Thin),
            Font(Res.font.Outfit_Regular, FontWeight.Normal),
            Font(Res.font.Outfit_Black, FontWeight.Black),
            Font(Res.font.Outfit_Light, FontWeight.Light)
        )
        //var showContent by remember { mutableStateOf(false) }

        

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ) {
            Text(
                text = "Hi there! My name is",
                style = MaterialTheme.typography.h3,
                textAlign = TextAlign.Center,
                fontFamily = outfit
            )
            Text(
                text = "Li Longzhen",
                style = MaterialTheme.typography.h1,
                textAlign = TextAlign.Center,
                fontFamily = outfit
            )
            Text(
                text = "I am a Android Developer,\na Computer Vision master student,\na Design Enthusiasts",
                style = MaterialTheme.typography.h3,
                textAlign = TextAlign.Center,
                fontFamily = outfit
            )
            Text(
                text = "And a Technophile",
                style = MaterialTheme.typography.h2,
                textAlign = TextAlign.Center,
                fontFamily = outfit
            )
            /*Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }*/
        }
    }
}