package compose.homepage.project.ui.project

import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Card
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.compose.HomepageTheme
import com.example.compose.primaryContainerLight
import com.example.compose.surfaceDimLight
import longzhenhomepage.composeapp.generated.resources.GetItOnGooglePlay_Badge_Web_color_English
import longzhenhomepage.composeapp.generated.resources.IconCover
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
import longzhenhomepage.composeapp.generated.resources.awesomeHomepageIntroduction
import longzhenhomepage.composeapp.generated.resources.code
import longzhenhomepage.composeapp.generated.resources.crossClock
import longzhenhomepage.composeapp.generated.resources.crossClockIntroduction
import longzhenhomepage.composeapp.generated.resources.crossLoqui
import longzhenhomepage.composeapp.generated.resources.crossLoquiIntroduction
import longzhenhomepage.composeapp.generated.resources.homepage
import longzhenhomepage.composeapp.generated.resources.titleBackground
import longzhenhomepage.composeapp.generated.resources.titleDesign
import longzhenhomepage.composeapp.generated.resources.titleProject
import longzhenhomepage.composeapp.generated.resources.titleResearch
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ProjectScreen() {
    HomepageTheme {

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

        var article1Hover: Int? by remember { mutableStateOf(null) }
        var article2Hover: Int? by remember { mutableStateOf(null) }

        //val windowsSize = LocalWindowInfo.current.containerSize
        val uriHandler = LocalUriHandler.current

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.primaryContainer),
                //.background(primaryContainerLight),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            item {
                Column {
                    Row(
                        modifier = Modifier.padding(0.dp, 64.dp, 0.dp, 16.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = stringResource(Res.string.titleProject),
                            style = MaterialTheme.typography.headlineMedium,
                            fontFamily = myFont,
                            modifier = Modifier.weight(2.5f)
                        )
                        Text(
                            text = stringResource(Res.string.titleDesign),
                            overflow = TextOverflow.Ellipsis,
                            style = MaterialTheme.typography.headlineMedium,
                            fontFamily = myFont,
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
                                    modifier = Modifier
                                        .background(color = MaterialTheme.colorScheme.primaryContainer)
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
                                        ) {
                                            Image(
                                                painter = painterResource(Res.drawable.IconCover),
                                                contentDescription = "Project 1 title image",
                                                contentScale = ContentScale.Crop
                                            )
                                        }

                                        Text(
                                            text = stringResource(Res.string.crossClock),
                                            fontFamily = outfit,
                                            style = MaterialTheme.typography.titleMedium,
                                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                                            modifier = Modifier
                                                .padding(8.dp)
                                        )
                                        Text(
                                            text = stringResource(Res.string.crossClockIntroduction),
                                            //text = "CrossClock allows you to manage your world clocks and world alarms in one place. You will be able to set alarms for any time zone without complicated time zone conversions.",
                                            fontFamily = myFont,
                                            style = MaterialTheme.typography.bodyMedium,
                                            color = MaterialTheme.colorScheme.onPrimaryContainer,
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
                                    modifier = Modifier
                                        .background(color = MaterialTheme.colorScheme.primaryContainer)
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
                                                contentDescription = "Project 2 title image",
                                                contentScale = ContentScale.Crop
                                            )
                                        }

                                        Text(
                                            text = stringResource(Res.string.crossLoqui),
                                            fontFamily = outfit,
                                            style = MaterialTheme.typography.titleMedium,
                                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                                            modifier = Modifier
                                                .padding(8.dp)
                                        )
                                        Text(
                                            text = stringResource(Res.string.crossLoquiIntroduction),
                                            fontFamily = myFont,
                                            style = MaterialTheme.typography.bodyMedium,
                                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                                            overflow = TextOverflow.Ellipsis,
                                            maxLines = if (crossLoquiExpand) Int.MAX_VALUE else 4,
                                            modifier = Modifier
                                                .padding(8.dp, 0.dp, 8.dp, 0.dp)
                                        )

                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(8.dp),
                                            contentAlignment = Alignment.CenterEnd
                                        ) {
                                            Surface(
                                                shape = RoundedCornerShape(12.dp),
                                                color = MaterialTheme.colorScheme.surfaceDim,
                                                onClick = {},
                                                modifier = Modifier
                                                    .height(34.dp),
                                                enabled = false
                                            ) {
                                                Text(
                                                    text = "Coming Soon",
                                                    fontFamily = outfit,
                                                    maxLines = 1,
                                                    overflow = TextOverflow.Ellipsis,
                                                    style = MaterialTheme.typography.bodyMedium,
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
                                //backgroundColor = MaterialTheme.colorScheme.secondary,
                                modifier = Modifier
                                    .background(color = MaterialTheme.colorScheme.primaryContainer)
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
                                                //style = MaterialTheme.typography.h6,
                                                color = MaterialTheme.colorScheme.onPrimaryContainer,
                                                modifier = Modifier
                                                    .padding(8.dp)
                                            )
                                        }
                                    }

                                    Text(
                                        text = stringResource(Res.string.homepage),
                                        fontFamily = outfit,
                                        style = MaterialTheme.typography.headlineMedium,
                                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                                        modifier = Modifier
                                            .padding(8.dp)
                                    )
                                    Text(
                                        text = stringResource(Res.string.awesomeHomepageIntroduction),
                                        fontFamily = myFont,
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                                        overflow = TextOverflow.Ellipsis,
                                        maxLines = if (awesomeHomepageExpand) Int.MAX_VALUE else 4,
                                        modifier = Modifier
                                            .padding(8.dp, 0.dp, 8.dp, 0.dp)
                                    )

                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(8.dp),
                                        contentAlignment = Alignment.CenterEnd
                                    ) {
                                        Surface(
                                            shape = RoundedCornerShape(12.dp),
                                            color = MaterialTheme.colorScheme.surface,
                                            onClick = {
                                                uriHandler.openUri("https://guang000.github.io/Awesome-Dataset-Distillation/")
                                            },
                                            modifier = Modifier
                                                .height(34.dp),
                                            enabled = true
                                        ) {
                                            Text(
                                                text = "Go to Website",
                                                fontFamily = outfit,
                                                maxLines = 1,
                                                overflow = TextOverflow.Ellipsis,
                                                style = MaterialTheme.typography.bodyMedium,
                                                color = MaterialTheme.colorScheme.onSurface,
                                                modifier = Modifier.padding(4.dp)
                                            )
                                        }
                                    }
                                }
                            }
                        }

                        Spacer(modifier = Modifier.weight(1f))
                    }

                    // Research Part
                    Row(
                        modifier = Modifier
                        .padding(top = 32.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Column(
                            modifier = Modifier
                                .weight(3.5f)
                                .padding(end = 32.dp)
                                .padding(8.dp)
                        ) {
                            Text(
                                text = stringResource(Res.string.titleResearch),
                                style = MaterialTheme.typography.headlineMedium,
                                fontFamily = myFont,
                                modifier = Modifier
                                    .padding(0.dp, 32.dp, 0.dp, 16.dp)
                            )
                            ListItem(
                                headlineContent = { Text(
                                    text = "Generative Dataset Distillation: Balancing Global Structure and Local Details",
                                    fontFamily = outfit,
                                    //style = MaterialTheme.typography.h6,
                                ) },
                                /*headlineContent = { ClickableText(
                                    onClick = {
                                        uriHandler.openUri("https://arxiv.org/abs/2404.17732")
                                    },
                                    onHover = {
                                        article1Hover = it
                                    },
                                    text = AnnotatedString(
                                        text = "Generative Dataset Distillation: Balancing Global Structure and Local Details",
                                        spanStyle = SpanStyle(
                                            fontFamily = outfit,
                                            textDecoration = if (article1Hover == null) TextDecoration.None else TextDecoration.Underline
                                        ),
                                    ),
                                    //style = MaterialTheme.typography.h6,
                                ) },*/
                                supportingContent = { Text(
                                    text = "Longzhen Li & Guang Li et al., CVPR 2024 Workshop",
                                    fontFamily = outfit,
                                    style = MaterialTheme.typography.bodyLarge,
                                    modifier = Modifier.padding(bottom = 4.dp)
                                ) },
                                modifier = Modifier
                                    .clickable {
                                        uriHandler.openUri("https://arxiv.org/abs/2404.17732")
                                    }
                                    .fillMaxWidth()
                                    .padding(bottom = 16.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(color = MaterialTheme.colorScheme.secondary)
                            )

                            ListItem(
                                headlineContent = { Text(
                                    text = "Generative Dataset Distillation Considering Global-local Coherence",
                                    fontFamily = outfit,
                                    //style = MaterialTheme.typography.h6,
                                ) },
                                supportingContent = { Text(
                                    text = "Longzhen Li & Guang Li et al., MIRU 2024",
                                    fontFamily = outfit,
                                    style = MaterialTheme.typography.bodyLarge,
                                    modifier = Modifier.padding(bottom = 4.dp)
                                ) },
                                modifier = Modifier
                                    .clickable {
                                        uriHandler.openUri("https://miru-committee.github.io/miru2024/program/timetable/#1620---1820-%E3%82%A4%E3%83%B3%E3%82%BF%E3%83%A9%E3%82%AF%E3%83%86%E3%82%A3%E3%83%961ais-1a--%E4%BC%81%E6%A5%AD%E5%B1%95%E7%A4%BAaex-a--%E3%83%87%E3%83%A2ds3f%E5%A4%A7%E4%BC%9A%E8%AD%B0%E5%AE%A4a")
                                    }
                                    .fillMaxWidth()
                                    .padding(bottom = 16.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(color = MaterialTheme.colorScheme.secondary)
                            )

                            ListItem(
                                headlineContent = { Text(
                                    text = "Generative Dataset Distillation Based on Large Model Pool",
                                    fontFamily = outfit,
                                    //style = MaterialTheme.typography.h6,
                                ) },
                                supportingContent = { Text(
                                    text = "Longzhen Li & Guang Li et al., GCCE 2024",
                                    fontFamily = outfit,
                                    style = MaterialTheme.typography.bodyLarge,
                                    modifier = Modifier.padding(bottom = 4.dp)
                                ) },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(bottom = 16.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(color = MaterialTheme.colorScheme.secondary)
                            )

                            ListItem(
                                headlineContent = { Text(
                                    text = "Generative Dataset Distillation Based on Self-knowledge Distillation",
                                    fontFamily = outfit,
                                    //style = MaterialTheme.typography.h6,
                                    ) },
                                supportingContent = { Text(
                                    text = "Longzhen Li & Guang Li et al., ICASSP 2025",
                                    fontFamily = outfit,
                                    //style = MaterialTheme.typography.bodyLarge,
                                    modifier = Modifier.padding(bottom = 4.dp)
                                ) },
                                trailingContent = { Text(
                                    text = "Under Review",
                                    fontFamily = outfit,
                                    //style = MaterialTheme.typography.bodySmall,
                                ) },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(bottom = 16.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(color = MaterialTheme.colorScheme.secondary)
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
        }

    }
}