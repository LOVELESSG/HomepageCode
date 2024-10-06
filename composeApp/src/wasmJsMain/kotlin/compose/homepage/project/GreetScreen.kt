package compose.homepage.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import com.example.compose.HomepageTheme
import com.example.compose.onPrimaryContainerLight
import com.example.compose.primaryContainerLight
import longzhenhomepage.composeapp.generated.resources.Outfit_Black
import longzhenhomepage.composeapp.generated.resources.Outfit_Bold
import longzhenhomepage.composeapp.generated.resources.Outfit_Light
import longzhenhomepage.composeapp.generated.resources.Outfit_Regular
import longzhenhomepage.composeapp.generated.resources.Outfit_Thin
import longzhenhomepage.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
fun GreetScreen() {
    HomepageTheme {
        val outfit = FontFamily(
            Font(Res.font.Outfit_Bold, FontWeight.Bold),
            Font(Res.font.Outfit_Thin, FontWeight.Thin),
            Font(Res.font.Outfit_Regular, FontWeight.Normal),
            Font(Res.font.Outfit_Black, FontWeight.Black),
            Font(Res.font.Outfit_Light, FontWeight.Light)
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(primaryContainerLight),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Hi there! My name is",
                style = MaterialTheme.typography.h3,
                textAlign = TextAlign.Center,
                fontFamily = outfit,
                color = onPrimaryContainerLight
            )
            Text(
                text = "Li Longzhen",
                style = MaterialTheme.typography.h1,
                textAlign = TextAlign.Center,
                fontFamily = outfit,
                fontWeight = FontWeight.SemiBold,
                color = onPrimaryContainerLight
            )
            Text(
                text = "I am a Android Developer,\na Computer Vision master student,\na Design Enthusiasts",
                style = MaterialTheme.typography.h3,
                textAlign = TextAlign.Center,
                fontFamily = outfit,
                color = onPrimaryContainerLight
            )
            Text(
                text = buildAnnotatedString {
                    append("And a ")
                    withStyle(style = SpanStyle(
                        fontFamily = outfit,
                        fontWeight = FontWeight.SemiBold
                    )
                    ) {
                        append("Technophile")
                    }
                },
                style = MaterialTheme.typography.h2,
                textAlign = TextAlign.Center,
                fontFamily = outfit,
                color = onPrimaryContainerLight
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