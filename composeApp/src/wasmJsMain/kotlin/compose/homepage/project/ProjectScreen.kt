package compose.homepage.project

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
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
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.FileDownload
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
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
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.example.compose.HomepageTheme
import com.example.compose.outlineLight
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

@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterialApi::class,
    ExperimentalFoundationApi::class
)
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

        val windowsSize = LocalWindowInfo.current.containerSize
        val uriHandler = LocalUriHandler.current

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(primaryContainerLight),
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
                            style = MaterialTheme.typography.h2,
                            fontFamily = myFont,
                            modifier = Modifier.weight(2.5f)
                        )
                        Text(
                            text = stringResource(Res.string.titleDesign),
                            //maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            style = MaterialTheme.typography.h2,
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
                                            text = stringResource(Res.string.crossClock),
                                            fontFamily = outfit,
                                            style = MaterialTheme.typography.h4,
                                            color = MaterialTheme.colors.onSecondary,
                                            modifier = Modifier
                                                .padding(8.dp)
                                        )
                                        Text(
                                            text = stringResource(Res.string.crossClockIntroduction),
                                            //text = "CrossClock allows you to manage your world clocks and world alarms in one place. You will be able to set alarms for any time zone without complicated time zone conversions.",
                                            fontFamily = myFont,
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
                                            text = stringResource(Res.string.crossLoqui),
                                            fontFamily = outfit,
                                            style = MaterialTheme.typography.h4,
                                            color = MaterialTheme.colors.onSecondary,
                                            modifier = Modifier
                                                .padding(8.dp)
                                        )
                                        Text(
                                            text = stringResource(Res.string.crossLoquiIntroduction),
                                            //text = "Cross Loqui is an instant messaging software that allows users to send public posts and messages. In the future development, it is planned to integrate generative artificial intelligence technology to achieve instant communication between users and characters in specific virtual world, which will be an epoch-making way of communication and entertainment.",
                                            fontFamily = myFont,
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
                                        text = stringResource(Res.string.homepage),
                                        fontFamily = outfit,
                                        style = MaterialTheme.typography.h4,
                                        color = MaterialTheme.colors.onSecondary,
                                        modifier = Modifier
                                            .padding(8.dp)
                                    )
                                    Text(
                                        text = stringResource(Res.string.awesomeHomepageIntroduction),
                                        //text = "Design the official homepage for the project called Awesome Dataset Distillation, which follows the material design principles.",
                                        fontFamily = myFont,
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
                                style = MaterialTheme.typography.h2,
                                fontFamily = myFont,
                                modifier = Modifier
                                    .padding(0.dp, 32.dp, 0.dp, 16.dp)
                            )
                            ListItem(
                                text = { ClickableText(
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
                                    style = MaterialTheme.typography.h6,
                                ) },
                                secondaryText = { Text(
                                    text = "Longzhen Li & Guang Li et al., CVPR 2024 Workshop",
                                    fontFamily = outfit,
                                    style = MaterialTheme.typography.body1,
                                    modifier = Modifier.padding(bottom = 4.dp)
                                ) },
                                //shape = RoundedCornerShape(12.dp),
                                //backgroundColor = MaterialTheme.colors.secondary,
                                modifier = Modifier
                                    //.height(100.dp)
                                    .fillMaxWidth()
                                    .padding(bottom = 16.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(color = MaterialTheme.colors.secondary)
                            )

                            ListItem(
                                text = { ClickableText(
                                    onClick = {
                                        uriHandler.openUri("https://miru-committee.github.io/miru2024/program/timetable/#1620---1820-%E3%82%A4%E3%83%B3%E3%82%BF%E3%83%A9%E3%82%AF%E3%83%86%E3%82%A3%E3%83%961ais-1a--%E4%BC%81%E6%A5%AD%E5%B1%95%E7%A4%BAaex-a--%E3%83%87%E3%83%A2ds3f%E5%A4%A7%E4%BC%9A%E8%AD%B0%E5%AE%A4a")
                                    },
                                    onHover = {
                                        article2Hover = it
                                    },
                                    text = AnnotatedString(
                                        text = "Generative Dataset Distillation Considering Global-local Coherence",
                                        spanStyle = SpanStyle(
                                            fontFamily = outfit,
                                            textDecoration = if (article2Hover == null) TextDecoration.None else TextDecoration.Underline
                                        ),
                                    ),
                                    style = MaterialTheme.typography.h6,
                                ) },
                                secondaryText = { Text(
                                    text = "Longzhen Li & Guang Li et al., MIRU 2024",
                                    fontFamily = outfit,
                                    style = MaterialTheme.typography.body1,
                                    modifier = Modifier.padding(bottom = 4.dp)
                                ) },
                                //shape = RoundedCornerShape(12.dp),
                                //backgroundColor = MaterialTheme.colors.secondary,
                                modifier = Modifier
                                    //.height(100.dp)
                                    .fillMaxWidth()
                                    .padding(bottom = 16.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(color = MaterialTheme.colors.secondary)
                            )

                            ListItem(
                                text = { Text(
                                    text = "Generative Dataset Distillation Based on Large Model Pool",
                                    fontFamily = outfit,
                                    style = MaterialTheme.typography.h6,
                                ) },
                                secondaryText = { Text(
                                    text = "Longzhen Li & Guang Li et al., GCCE 2024",
                                    fontFamily = outfit,
                                    style = MaterialTheme.typography.body1,
                                    modifier = Modifier.padding(bottom = 4.dp)
                                ) },
                                //shape = RoundedCornerShape(12.dp),
                                //backgroundColor = MaterialTheme.colors.secondary,
                                modifier = Modifier
                                    //.height(100.dp)
                                    .fillMaxWidth()
                                    .padding(bottom = 16.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(color = MaterialTheme.colors.secondary)
                            )

                            ListItem(
                                text = { Text(
                                    text = "GENERATIVE DATASET DISTILLATION BASED ON SELF-KNOWLEDGE DISTILLATION",
                                    fontFamily = outfit,
                                    style = MaterialTheme.typography.h6,
                                    ) },
                                secondaryText = { Text(
                                    text = "Longzhen Li & Guang Li et al., ICASSP 2025",
                                    fontFamily = outfit,
                                    style = MaterialTheme.typography.body1,
                                    modifier = Modifier.padding(bottom = 4.dp)
                                ) },
                                overlineText = { Text(
                                    text = "Under Review",
                                    fontFamily = outfit,
                                    style = MaterialTheme.typography.body2,
                                ) },
                                //shape = RoundedCornerShape(12.dp),
                                //backgroundColor = MaterialTheme.colors.secondary,
                                modifier = Modifier
                                    //.height(100.dp)
                                    .fillMaxWidth()
                                    .padding(bottom = 16.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(color = MaterialTheme.colors.secondary)
                            )
                        }
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }
        }

    }
}