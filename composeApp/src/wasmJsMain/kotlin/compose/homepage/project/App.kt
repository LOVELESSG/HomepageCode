package compose.homepage.project

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Architecture
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Light
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.example.compose.tertiaryContainerLight
import longzhenhomepage.composeapp.generated.resources.Outfit_Black
import longzhenhomepage.composeapp.generated.resources.Outfit_Bold
import longzhenhomepage.composeapp.generated.resources.Outfit_Light
import longzhenhomepage.composeapp.generated.resources.Outfit_Regular
import longzhenhomepage.composeapp.generated.resources.Outfit_Thin
import org.jetbrains.compose.resources.painterResource

import longzhenhomepage.composeapp.generated.resources.Res
import longzhenhomepage.composeapp.generated.resources.avatar
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

        val introInteractionSource = remember { MutableInteractionSource() }
        val projectInteractionSource = remember { MutableInteractionSource() }
        val eduInteractionSource = remember { MutableInteractionSource() }
        val skillInteractionSource = remember { MutableInteractionSource() }

        val introIsHovered by introInteractionSource.collectIsHoveredAsState()
        val projectIsHovered by projectInteractionSource.collectIsHoveredAsState()
        val eduIsHovered by eduInteractionSource.collectIsHoveredAsState()
        val skillIsHovered by skillInteractionSource.collectIsHoveredAsState()
        /*val introIsHovered = remember { MutableInteractionSource() }.collectIsHoveredAsState().value
        val projectIsHovered = remember { MutableInteractionSource() }.collectIsHoveredAsState().value
        val eduIsHovered = remember { MutableInteractionSource() }.collectIsHoveredAsState().value
        val skillIsHovered = remember { MutableInteractionSource() }.collectIsHoveredAsState().value*/


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
                        text = {
                            Text(
                                text = "Introduction",
                                fontFamily = outfit,
                                fontWeight = if (introIsHovered) FontWeight.SemiBold else FontWeight.Normal
                            )
                        },
                        icon = {
                            Icon(Icons.Filled.Home, "")
                        },
                        modifier = Modifier
                            .clickable(
                                onClick = {},
                            )
                            .hoverable(interactionSource = introInteractionSource)
                            .background(color = if (introIsHovered) {
                                MaterialTheme.colors.primary
                            } else {
                                Color.Transparent
                            },
                                shape = RoundedCornerShape(bottomEnd = 50.dp, topEnd =  50.dp)
                            )
                    )
                    ListItem (
                        text = {
                            Text(
                                "Project/Research",
                                fontFamily = outfit,
                                fontWeight = if (projectIsHovered) FontWeight.SemiBold else FontWeight.Normal
                            )
                        },
                        icon = {
                            Icon(Icons.Filled.EmojiEvents, "")
                        },
                        modifier = Modifier
                            .clickable(
                                onClick = {},
                            )
                            .hoverable(interactionSource = projectInteractionSource)
                            .background(color = if (projectIsHovered) {
                                MaterialTheme.colors.primary
                            } else {
                                Color.Transparent
                            },
                                shape = RoundedCornerShape(bottomEnd = 50.dp, topEnd =  50.dp)
                            )
                    )
                    ListItem(
                        text = {
                            Text(
                                "Education/Work",
                                fontFamily = outfit,
                                fontWeight = if (eduIsHovered) FontWeight.SemiBold else FontWeight.Normal
                            )
                        },
                        icon = {
                            Icon(Icons.Filled.HistoryEdu, "")
                        },
                        modifier = Modifier
                            .clickable(
                                onClick = {},
                            )
                            .hoverable(interactionSource = eduInteractionSource)
                            .background(color = if (eduIsHovered) {
                                MaterialTheme.colors.primary
                            } else {
                                Color.Transparent
                            },
                                shape = RoundedCornerShape(bottomEnd = 50.dp, topEnd =  50.dp)
                            )
                    )
                    ListItem(
                        text = {
                            Text(
                                "Skills",
                                fontFamily = outfit,
                                fontWeight = if (skillIsHovered) FontWeight.SemiBold else FontWeight.Normal
                            )
                        },
                        icon = {
                            Icon(Icons.Filled.Architecture, "")
                        },
                        modifier = Modifier
                            .clickable(
                                onClick = {},
                            )
                            .hoverable(interactionSource = skillInteractionSource)
                            .background(color = if (skillIsHovered) {
                                MaterialTheme.colors.primary
                            } else {
                                Color.Transparent
                            },
                                shape = RoundedCornerShape(bottomEnd = 50.dp, topEnd =  50.dp)
                            )
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