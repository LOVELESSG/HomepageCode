package compose.homepage.project.ui.skill

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Verified
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.compose.HomepageTheme
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
import longzhenhomepage.composeapp.generated.resources.businessLevel
import longzhenhomepage.composeapp.generated.resources.chinese
import longzhenhomepage.composeapp.generated.resources.english
import longzhenhomepage.composeapp.generated.resources.italian
import longzhenhomepage.composeapp.generated.resources.japanese
import longzhenhomepage.composeapp.generated.resources.korean
import longzhenhomepage.composeapp.generated.resources.languages
import longzhenhomepage.composeapp.generated.resources.nativeLanguage
import longzhenhomepage.composeapp.generated.resources.otherProgrammingLanguages
import longzhenhomepage.composeapp.generated.resources.studying
import longzhenhomepage.composeapp.generated.resources.titleProgrammingLanguage
import longzhenhomepage.composeapp.generated.resources.titleTools
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.stringResource

@Composable
fun SkillScreen() {
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

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(primaryContainerLight),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            item {
                Column {

                    Row(
                        modifier = Modifier.padding(0.dp, 64.dp, 0.dp, 8.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = stringResource(Res.string.titleProgrammingLanguage),
                            //style = MaterialTheme.typography.h2,
                            fontFamily = myFont,
                            modifier = Modifier.weight(3.5f)
                        )
                        Spacer(modifier = Modifier.weight(1f))
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = "Kotlin",
                            //style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colorScheme.onSecondary,
                            modifier = Modifier.weight(0.5f)
                        )
                        Row(
                            modifier = Modifier.weight(4f)
                        ) {
                            repeat(6) {
                                Icon(
                                    imageVector = Icons.Filled.Verified,
                                    contentDescription = "",
                                    modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                                )
                            }
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = "Python",
                            //style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colorScheme.onSecondary,
                            modifier = Modifier.weight(0.5f)
                        )
                        Row(
                            modifier = Modifier.weight(4f)
                        ) {
                            repeat(4) {
                                Icon(
                                    imageVector = Icons.Filled.Verified,
                                    contentDescription = "",
                                    modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                                )
                            }
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = "Java",
                            //style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colorScheme.onSecondary,
                            modifier = Modifier.weight(0.5f)
                        )
                        Row(
                            modifier = Modifier.weight(4f)
                        ) {
                            repeat(3) {
                                Icon(
                                    imageVector = Icons.Filled.Verified,
                                    contentDescription = "",
                                    modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                                )
                            }
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = "SQL",
                            //style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colorScheme.onSecondary,
                            modifier = Modifier.weight(0.5f)
                        )
                        Row(
                            modifier = Modifier.weight(4f)
                        ) {
                            repeat(3) {
                                Icon(
                                    imageVector = Icons.Filled.Verified,
                                    contentDescription = "",
                                    modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                                )
                            }
                        }
                    }

                    Row(
                        modifier = Modifier
                            .padding(0.dp, 16.dp, 0.dp, 32.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = stringResource(Res.string.otherProgrammingLanguages),
                            //style = MaterialTheme.typography.h4,
                            fontFamily = myFont,
                            color = MaterialTheme.colorScheme.onSecondary,
                            modifier = Modifier.weight(3.5f)
                        )
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }

            item {
                Column {

                    Row {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = stringResource(Res.string.titleTools),
                            //style = MaterialTheme.typography.h2,
                            fontFamily = myFont,
                            modifier = Modifier.weight(3.5f)
                        )
                        Spacer(modifier = Modifier.weight(1f))
                    }

                    Row(
                        modifier = Modifier
                            .padding(0.dp, 8.dp, 0.dp, 32.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = "Jetpack Compose, Firebase, Compose Multiplatform, Git, GitHub, Android Studio, Google Play Console, Google Search Console, Google Cloud, Google Colaboratory, webstorm, pycharm, Figma, Linux, HTML, CSS, markdown",
                            //style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colorScheme.onSecondary,
                            modifier = Modifier.weight(3.5f)
                        )
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }

            item {
                Column {

                    Row(
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = stringResource(Res.string.languages),
                            //style = MaterialTheme.typography.h2,
                            fontFamily = myFont,
                            modifier = Modifier.weight(3.5f)
                        )
                        Spacer(modifier = Modifier.weight(1f))
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Column(modifier = Modifier.weight(0.5f)) {
                            Text(
                                text = stringResource(Res.string.chinese),
                                //style = MaterialTheme.typography.h4,
                                fontFamily = myFont,
                                color = MaterialTheme.colorScheme.onSecondary,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                            Text(
                                text = stringResource(Res.string.nativeLanguage),
                                //style = MaterialTheme.typography.body1,
                                fontFamily = myFont,
                                color = MaterialTheme.colorScheme.onSecondary,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }

                        Row(
                            modifier = Modifier.weight(4f)
                        ) {
                            repeat(6) {
                                Icon(
                                    imageVector = Icons.Filled.Verified,
                                    contentDescription = "",
                                    modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                                )
                            }
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Column(modifier = Modifier.weight(0.5f)) {
                            Text(
                                text = stringResource(Res.string.english),
                                //style = MaterialTheme.typography.h4,
                                fontFamily = myFont,
                                color = MaterialTheme.colorScheme.onSecondary,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                            Text(
                                text = stringResource(Res.string.businessLevel),
                                //style = MaterialTheme.typography.body1,
                                fontFamily = myFont,
                                color = MaterialTheme.colorScheme.onSecondary,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        Row(
                            modifier = Modifier.weight(4f)
                        ) {
                            repeat(5) {
                                Icon(
                                    imageVector = Icons.Filled.Verified,
                                    contentDescription = "",
                                    modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                                )
                            }
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = stringResource(Res.string.japanese),
                            //style = MaterialTheme.typography.h4,
                            fontFamily = myFont,
                            color = MaterialTheme.colorScheme.onSecondary,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.weight(0.5f)
                        )
                        Row(
                            modifier = Modifier.weight(4f)
                        ) {
                            repeat(3) {
                                Icon(
                                    imageVector = Icons.Filled.Verified,
                                    contentDescription = "",
                                    modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                                )
                            }
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = stringResource(Res.string.korean),
                            //style = MaterialTheme.typography.h4,
                            fontFamily = myFont,
                            color = MaterialTheme.colorScheme.onSecondary,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.weight(0.5f)
                        )
                        Row(
                            modifier = Modifier.weight(4f)
                        ) {
                            repeat(1) {
                                Icon(
                                    imageVector = Icons.Filled.Verified,
                                    contentDescription = "",
                                    modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                                )
                            }
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = stringResource(Res.string.italian),
                            //style = MaterialTheme.typography.h4,
                            fontFamily = myFont,
                            color = MaterialTheme.colorScheme.onSecondary,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.weight(0.5f)
                        )
                        Row(
                            modifier = Modifier
                                .weight(4f)
                                .padding(start = 16.dp)
                        ) {
                            Text(
                                text = stringResource(Res.string.studying),
                                //style = MaterialTheme.typography.h6,
                                fontFamily = myFont,
                                color = MaterialTheme.colorScheme.onSecondary,
                            )
                        }
                    }
                }
            }

        }
    }
}