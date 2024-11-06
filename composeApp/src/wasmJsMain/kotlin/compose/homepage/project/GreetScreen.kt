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
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import com.example.compose.HomepageTheme
import com.example.compose.onPrimaryContainerLight
import com.example.compose.primaryContainerLight
import longzhenhomepage.composeapp.generated.resources.NotoSansSC_Black
import longzhenhomepage.composeapp.generated.resources.NotoSansSC_Bold
import longzhenhomepage.composeapp.generated.resources.NotoSansSC_Light
import longzhenhomepage.composeapp.generated.resources.NotoSansSC_Medium
import longzhenhomepage.composeapp.generated.resources.NotoSansSC_Regular
import longzhenhomepage.composeapp.generated.resources.NotoSansSC_Thin
import longzhenhomepage.composeapp.generated.resources.Outfit_Black
import longzhenhomepage.composeapp.generated.resources.Outfit_Bold
import longzhenhomepage.composeapp.generated.resources.Outfit_ExtraBold
import longzhenhomepage.composeapp.generated.resources.Outfit_ExtraLight
import longzhenhomepage.composeapp.generated.resources.Outfit_Light
import longzhenhomepage.composeapp.generated.resources.Outfit_Medium
import longzhenhomepage.composeapp.generated.resources.Outfit_Regular
import longzhenhomepage.composeapp.generated.resources.Outfit_SemiBold
import longzhenhomepage.composeapp.generated.resources.Outfit_Thin
import longzhenhomepage.composeapp.generated.resources.Res
import longzhenhomepage.composeapp.generated.resources.ZenMaruGothic_Black
import longzhenhomepage.composeapp.generated.resources.ZenMaruGothic_Bold
import longzhenhomepage.composeapp.generated.resources.ZenMaruGothic_Light
import longzhenhomepage.composeapp.generated.resources.ZenMaruGothic_Medium
import longzhenhomepage.composeapp.generated.resources.ZenMaruGothic_Regular
import longzhenhomepage.composeapp.generated.resources.fullName
import longzhenhomepage.composeapp.generated.resources.greeting1
import longzhenhomepage.composeapp.generated.resources.greeting2
import longzhenhomepage.composeapp.generated.resources.greeting3
import longzhenhomepage.composeapp.generated.resources.greeting4
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.stringResource

@Composable
fun GreetScreen() {
    HomepageTheme {
        /*val outfit = FontFamily(
            Font(Res.font.Outfit_Bold, FontWeight.Bold),
            Font(Res.font.Outfit_Thin, FontWeight.Thin),
            Font(Res.font.Outfit_Regular, FontWeight.Normal),
            Font(Res.font.Outfit_Black, FontWeight.Black),
            Font(Res.font.Outfit_Light, FontWeight.Light)
        )*/
        val myFont = when (Locale.current.language) {
            "ja" -> {
                FontFamily(
                    Font(Res.font.ZenMaruGothic_Bold, FontWeight.Bold),
                    Font(Res.font.ZenMaruGothic_Regular, FontWeight.Normal),
                    Font(Res.font.ZenMaruGothic_Black, FontWeight.Black),
                    Font(Res.font.ZenMaruGothic_Medium, FontWeight.Medium),
                    Font(Res.font.ZenMaruGothic_Light, FontWeight.Light),
                )
            }
            "zh" -> {
                FontFamily(
                    Font(Res.font.NotoSansSC_Bold, FontWeight.Bold),
                    Font(Res.font.NotoSansSC_Thin, FontWeight.Thin),
                    Font(Res.font.NotoSansSC_Black, FontWeight.Black),
                    Font(Res.font.NotoSansSC_Light, FontWeight.Light),
                    Font(Res.font.NotoSansSC_Medium, FontWeight.Medium),
                    Font(Res.font.NotoSansSC_Regular, FontWeight.Normal)
                )
            }
            else -> {
                FontFamily(
                    Font(Res.font.Outfit_Bold, FontWeight.Bold),
                    Font(Res.font.Outfit_Thin, FontWeight.Thin),
                    Font(Res.font.Outfit_Regular, FontWeight.Normal),
                    Font(Res.font.Outfit_Black, FontWeight.Black),
                    Font(Res.font.Outfit_Light, FontWeight.Light),
                    Font(Res.font.Outfit_ExtraBold, FontWeight.ExtraBold),
                    Font(Res.font.Outfit_ExtraLight, FontWeight.ExtraLight),
                    Font(Res.font.Outfit_Medium, FontWeight.Medium),
                    Font(Res.font.Outfit_SemiBold, FontWeight.SemiBold)
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(primaryContainerLight),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(Res.string.greeting1),
                style = MaterialTheme.typography.h3,
                textAlign = TextAlign.Center,
                fontFamily = myFont,
                color = onPrimaryContainerLight
            )
            Text(
                //text = Locale.current.language,
                text = stringResource(Res.string.fullName),
                style = MaterialTheme.typography.h1,
                textAlign = TextAlign.Center,
                fontFamily = myFont,
                fontWeight = FontWeight.SemiBold,
                color = onPrimaryContainerLight
            )
            Text(
                text = stringResource(Res.string.greeting2),
                //text = "I am a Android Developer,\na Computer Vision master student,\na Design Enthusiasts",
                style = MaterialTheme.typography.h3,
                textAlign = TextAlign.Center,
                fontFamily = myFont,
                //fontFamily = FontFamily(Font(Res.font.ZenMaruGothic_Regular)),
                color = onPrimaryContainerLight
            )
            Text(
                text = buildAnnotatedString {
                    append(stringResource(Res.string.greeting3))
                    withStyle(style = SpanStyle(
                        fontFamily = myFont,
                        fontWeight = FontWeight.SemiBold
                    )
                    ) {
                        append(stringResource(Res.string.greeting4))
                    }
                },
                style = MaterialTheme.typography.h2,
                textAlign = TextAlign.Center,
                fontFamily = myFont,
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