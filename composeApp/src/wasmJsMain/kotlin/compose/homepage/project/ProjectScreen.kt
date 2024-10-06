package compose.homepage.project

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Code
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.compose.HomepageTheme
import com.example.compose.outlineLight
import com.example.compose.primaryContainerLight
import com.example.compose.surfaceDimLight
import longzhenhomepage.composeapp.generated.resources.GetItOnGooglePlay_Badge_Web_color_English
import longzhenhomepage.composeapp.generated.resources.IconCover
import longzhenhomepage.composeapp.generated.resources.Outfit_Black
import longzhenhomepage.composeapp.generated.resources.Outfit_Bold
import longzhenhomepage.composeapp.generated.resources.Outfit_Light
import longzhenhomepage.composeapp.generated.resources.Outfit_Regular
import longzhenhomepage.composeapp.generated.resources.Outfit_Thin
import longzhenhomepage.composeapp.generated.resources.Res
import longzhenhomepage.composeapp.generated.resources.code
import longzhenhomepage.composeapp.generated.resources.titleBackground
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterialApi::class)
@Composable
fun ProjectScreen() {
    HomepageTheme {

        val outfit = FontFamily(
            Font(Res.font.Outfit_Bold, FontWeight.Bold),
            Font(Res.font.Outfit_Thin, FontWeight.Thin),
            Font(Res.font.Outfit_Regular, FontWeight.Normal),
            Font(Res.font.Outfit_Black, FontWeight.Black),
            Font(Res.font.Outfit_Light, FontWeight.Light)
        )

        var crossClockExpand by remember { mutableStateOf(false) }
        var crossLoquiExpand by remember { mutableStateOf(false) }
        var awesomeHomepageExpand by remember { mutableStateOf(false) }

        val windowsSize = LocalWindowInfo.current.containerSize
        val uriHandler = LocalUriHandler.current

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(primaryContainerLight),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier.padding(0.dp, 16.dp)
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "Project",
                    style = MaterialTheme.typography.h2,
                    fontFamily = outfit,
                    modifier = Modifier.weight(2.5f)
                )
                Text(
                    text = "Design",
                    //maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.h2,
                    fontFamily = outfit,
                    modifier = Modifier.weight(2f)
                )
            }
            Row(
                modifier = Modifier
                    //.padding(64.dp)
            ) {
                Spacer(modifier = Modifier.weight(1f))

                Column(
                    modifier = Modifier
                        //.padding(end = 128.dp)
                        .weight(2f)
                ) {

                    Row {
                        Card(
                            shape = RoundedCornerShape(12.dp),
                            backgroundColor = MaterialTheme.colors.secondary,
                            modifier = Modifier
                                //.height(350.dp)
                                .width(400.dp)
                                .weight(1f)
                                .padding(end = 32.dp)
                                .clickable {
                                    crossClockExpand = !crossClockExpand
                                }
                        ) {
                            Column {
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    modifier = Modifier
                                        .height(128.dp)
                                        //.width(400.dp)
                                ) {
                                    Image(
                                        painter = painterResource(Res.drawable.IconCover),
                                        contentDescription = "Project 1 title image",
                                        contentScale = ContentScale.Crop
                                    )
                                }

                                Text(
                                    text = "Cross Clock",
                                    fontFamily = outfit,
                                    style = MaterialTheme.typography.h4,
                                    color = MaterialTheme.colors.onSecondary,
                                    modifier = Modifier
                                        .padding(8.dp)
                                )
                                Text(
                                    text = "CrossClock allows you to manage your world clocks and world alarms in one place. You will be able to set alarms for any time zone without complicated time zone conversions.",
                                    fontFamily = outfit,
                                    style = MaterialTheme.typography.body1,
                                    color = MaterialTheme.colors.onSecondary,
                                    overflow = TextOverflow.Ellipsis,
                                    maxLines = if (crossClockExpand) Int.MAX_VALUE else 4,
                                    modifier = Modifier
                                        .padding(8.dp, 0.dp, 8.dp, 0.dp)
                                )

                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        //.weight(1f)
                                        .padding(8.dp),
                                    contentAlignment = Alignment.CenterEnd
                                ) {
                                    Surface(
                                        modifier = Modifier
                                            .background(Color.Transparent)
                                            .clip(RoundedCornerShape(12.dp))
                                            .height(36.dp)
                                            .clickable { uriHandler.openUri("https://play.google.com/store/apps/details?id=com.crossware.crossclock") }
                                    ) {
                                        Image(
                                            painter = painterResource(Res.drawable.GetItOnGooglePlay_Badge_Web_color_English),
                                            contentDescription = "Download from Google Play",
                                            contentScale = ContentScale.FillHeight
                                        )
                                    }
                                }
                            }
                        }
                        Card(
                            shape = RoundedCornerShape(12.dp),
                            backgroundColor = MaterialTheme.colors.secondary,
                            modifier = Modifier
                                //.height(360.dp)
                                .width(400.dp)
                                .weight(1f)
                                .padding(end = 32.dp)
                                .clickable {
                                    crossLoquiExpand = !crossLoquiExpand
                                }
                        ) {
                            Column {
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    modifier = Modifier
                                        .height(128.dp)
                                        .width(400.dp)
                                ) {
                                    Image(
                                        painter = painterResource(Res.drawable.code),
                                        //painter = painterResource(Res.drawable.code_24dp_E8EAED_FILL0_wght400_GRAD0_opsz24),
                                        contentDescription = "Project 2 title image",
                                        contentScale = ContentScale.Crop
                                    )
                                }

                                Text(
                                    text = "Cross Loqui",
                                    fontFamily = outfit,
                                    style = MaterialTheme.typography.h4,
                                    color = MaterialTheme.colors.onSecondary,
                                    modifier = Modifier
                                        .padding(8.dp)
                                )
                                Text(
                                    text = "Cross Loqui is an instant messaging software that allows users to send public posts and messages. In the future development, it is planned to integrate generative artificial intelligence technology to achieve instant communication between users and characters in specific virtual world, which will be an epoch-making way of communication and entertainment.",
                                    fontFamily = outfit,
                                    style = MaterialTheme.typography.body1,
                                    color = MaterialTheme.colors.onSecondary,
                                    overflow = TextOverflow.Ellipsis,
                                    maxLines = if (crossLoquiExpand) Int.MAX_VALUE else 4,
                                    modifier = Modifier
                                        .padding(8.dp, 0.dp, 8.dp, 0.dp)
                                )

                                Box(
                                    modifier = Modifier
                                        //.height(52.dp)
                                        .fillMaxWidth()
                                        //.clip(RoundedCornerShape(12.dp))
                                        //.background(color = surfaceDimLight)
                                        .padding(8.dp),
                                    contentAlignment = Alignment.CenterEnd
                                ) {
                                    Surface(
                                        shape = RoundedCornerShape(12.dp),
                                        color = surfaceDimLight,
                                        onClick = {},
                                        modifier = Modifier
                                            .height(34.dp),
                                            //.height(34.dp)
                                            //.clip(RoundedCornerShape(12.dp)),
                                        enabled = false
                                    ) {
                                        Text(
                                            text = "Coming Soon",
                                            fontFamily = outfit,
                                            maxLines = 1,
                                            overflow = TextOverflow.Ellipsis,
                                            style = MaterialTheme.typography.body1,
                                            modifier = Modifier.padding(4.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.weight(0.5f))

                Column(
                    modifier = Modifier.weight(1f)
                ) {

                    Card(
                        shape = RoundedCornerShape(12.dp),
                        backgroundColor = MaterialTheme.colors.secondary,
                        modifier = Modifier
                            //.height(300.dp)
                            .width(400.dp)
                            .padding(end = 32.dp)
                            .clickable {
                                awesomeHomepageExpand = !awesomeHomepageExpand
                            }
                    ) {
                        Column {
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier
                                    .height(128.dp)
                                    //.width(400.dp)
                            ) {
                                Box(
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(Res.drawable.titleBackground),
                                        contentDescription = "Project 3 title image",
                                        contentScale = ContentScale.Crop
                                    )
                                    Text(
                                        text = "Awesome Dataset Distillation Homepage",
                                        fontFamily = outfit,
                                        textAlign = TextAlign.Center,
                                        style = MaterialTheme.typography.h6,
                                        color = MaterialTheme.colors.onSecondary,
                                        modifier = Modifier
                                            .padding(8.dp)
                                    )
                                }
                            }

                            Text(
                                text = "Homepage",
                                fontFamily = outfit,
                                style = MaterialTheme.typography.h4,
                                color = MaterialTheme.colors.onSecondary,
                                modifier = Modifier
                                    .padding(8.dp)
                            )
                            Text(
                                text = "Design the official homepage for the project called Awesome Dataset Distillation, which follows the material design principles.",
                                fontFamily = outfit,
                                style = MaterialTheme.typography.body1,
                                color = MaterialTheme.colors.onSecondary,
                                overflow = TextOverflow.Ellipsis,
                                maxLines = if (awesomeHomepageExpand) Int.MAX_VALUE else 4,
                                modifier = Modifier
                                    .padding(8.dp, 0.dp, 8.dp, 0.dp)
                            )

                            Box(
                                modifier = Modifier
                                    //.height(52.dp)
                                    .fillMaxWidth()
                                    //.clip(RoundedCornerShape(12.dp))
                                    //.background(color = surfaceDimLight)
                                    .padding(8.dp),
                                contentAlignment = Alignment.CenterEnd
                            ) {
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = MaterialTheme.colors.surface,
                                    onClick = {
                                        uriHandler.openUri("https://guang000.github.io/Awesome-Dataset-Distillation/")
                                    },
                                    modifier = Modifier
                                        .height(34.dp),
                                    //.height(34.dp)
                                    //.clip(RoundedCornerShape(12.dp)),
                                    enabled = true
                                ) {
                                    Text(
                                        text = "Go to Website",
                                        fontFamily = outfit,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis,
                                        style = MaterialTheme.typography.body1,
                                        color = MaterialTheme.colors.onSurface,
                                        modifier = Modifier.padding(4.dp)
                                    )
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.weight(1f))
            }
            Row(
                modifier = Modifier
                    //.padding(64.dp)
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Column(
                    modifier = Modifier
                        .weight(3.5f)
                ) {
                    Text(
                        text = "Research",
                        style = MaterialTheme.typography.h2,
                        fontFamily = outfit,
                        modifier = Modifier
                            .padding(0.dp, 32.dp, 0.dp, 16.dp)
                    )
                    Card(
                        shape = RoundedCornerShape(12.dp),
                        backgroundColor = MaterialTheme.colors.secondary,
                        modifier = Modifier
                            .height(100.dp)
                            .fillMaxWidth()
                    ) {  }
                }
                Spacer(modifier = Modifier.weight(1f))
            }

        }
    }
}