package compose.homepage.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Architecture
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Light
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Work
import androidx.compose.material.icons.outlined.Light
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.example.compose.HomepageTheme
import com.example.compose.onPrimaryContainerLight
import com.example.compose.primaryContainerLight
import com.example.compose.surfaceDimLight
import com.example.compose.tertiaryContainerLight
import longzhenhomepage.composeapp.generated.resources.Outfit_Black
import longzhenhomepage.composeapp.generated.resources.Outfit_Bold
import longzhenhomepage.composeapp.generated.resources.Outfit_Light
import longzhenhomepage.composeapp.generated.resources.Outfit_Regular
import longzhenhomepage.composeapp.generated.resources.Outfit_Thin
import org.jetbrains.compose.resources.painterResource

import longzhenhomepage.composeapp.generated.resources.Res
import longzhenhomepage.composeapp.generated.resources.avatar
import longzhenhomepage.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.Font

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun App() {
    HomepageTheme {
        val outfit = FontFamily(
            Font(Res.font.Outfit_Bold, FontWeight.Bold),
            Font(Res.font.Outfit_Thin, FontWeight.Thin),
            Font(Res.font.Outfit_Regular, FontWeight.Normal),
            Font(Res.font.Outfit_Black, FontWeight.Black),
            Font(Res.font.Outfit_Light, FontWeight.Light)
        )
        //var showContent by remember { mutableStateOf(false) }

        Row {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(color = tertiaryContainerLight),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f),
                    contentAlignment = Alignment.TopCenter
                ) {
                    Surface(
                        shape = CircleShape,
                        modifier = Modifier.padding(top = 32.dp)
                    ) {
                        Image(
                            painter = painterResource(Res.drawable.avatar),
                            contentDescription = "avatar",
                            modifier = Modifier
                                .size(80.dp)
                        )
                    }
                }

                Column(
                    modifier = Modifier
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    ListItem(
                        text = { Text(text = "Introduction", fontFamily = outfit) },
                        icon = {
                            Icon(Icons.Filled.Home, "")
                        },
                    )
                    ListItem (
                        text = { Text("Project/Research", fontFamily = outfit) },
                        icon = {
                            Icon(Icons.Filled.EmojiEvents, "")
                        }
                    )
                    ListItem(
                        text = { Text("Education/Work", fontFamily = outfit) },
                        icon = {
                            Icon(Icons.Filled.HistoryEdu, "")
                        }
                    )
                    ListItem(
                        text = { Text("Skills", fontFamily = outfit) },
                        icon = {
                            Icon(Icons.Filled.Architecture, "")
                        }
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .padding(bottom = 16.dp),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    IconButton(
                        onClick = {},
                        content = {
                            Icon(Icons.Filled.Light, "change display mode")
                        }
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(primaryContainerLight)
                    .weight(9f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Hi there! My name is",
                    style = MaterialTheme.typography.h3,
                    textAlign = TextAlign.Center,
                    fontFamily = outfit,
                    //color = MaterialTheme.colors.onBackground
                    color = onPrimaryContainerLight
                )
                Text(
                    text = "Li Longzhen",
                    style = MaterialTheme.typography.h1,
                    textAlign = TextAlign.Center,
                    fontFamily = outfit,
                    fontWeight = FontWeight.SemiBold,
                    //color = MaterialTheme.colors.onBackground
                    color = onPrimaryContainerLight
                )
                Text(
                    text = "I am a Android Developer,\na Computer Vision master student,\na Design Enthusiasts",
                    style = MaterialTheme.typography.h3,
                    textAlign = TextAlign.Center,
                    fontFamily = outfit,
                    //color = MaterialTheme.colors.onBackground
                    color = onPrimaryContainerLight
                )
                Text(
                    text = buildAnnotatedString {
                        append("And a ")
                        withStyle(style = SpanStyle(
                            fontFamily = outfit,
                            fontWeight = FontWeight.SemiBold
                        )) {
                            append("Technophile")
                        }
                    },
                    style = MaterialTheme.typography.h2,
                    textAlign = TextAlign.Center,
                    fontFamily = outfit,
                    //color = MaterialTheme.colors.onBackground
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
}