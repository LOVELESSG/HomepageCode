package compose.homepage.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextAlign
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
import longzhenhomepage.composeapp.generated.resources.addressIntern1
import longzhenhomepage.composeapp.generated.resources.addressIntern2
import longzhenhomepage.composeapp.generated.resources.highSchool
import longzhenhomepage.composeapp.generated.resources.intern1
import longzhenhomepage.composeapp.generated.resources.intern2
import longzhenhomepage.composeapp.generated.resources.masterStudent
import longzhenhomepage.composeapp.generated.resources.researchStudent
import longzhenhomepage.composeapp.generated.resources.titleEducation
import longzhenhomepage.composeapp.generated.resources.titleInternship
import longzhenhomepage.composeapp.generated.resources.university
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.stringResource

@Composable
fun EducationScreen() {
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
                Row(
                    modifier = Modifier.padding(0.dp, 64.dp, 0.dp, 8.dp)
                ) {
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = stringResource(Res.string.titleEducation),
                        style = MaterialTheme.typography.h2,
                        fontFamily = myFont,
                        color = MaterialTheme.colors.onSecondary,
                        modifier = Modifier.weight(3.5f)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                }
            }

            item {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Spacer(modifier = Modifier.weight(1f))
                    Column(
                        //verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.weight(0.5f)
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                        ) {
                            Spacer(modifier = Modifier
                                //.width(3.dp)
                                .fillMaxWidth()
                                .height(96.dp)
                                .background(color = MaterialTheme.colors.primary)
                            )
                            Text(
                                text = "2014\n~\n2017",
                                textAlign = TextAlign.Center,
                                fontFamily = outfit,
                                color = MaterialTheme.colors.onPrimary
                            )
                        }

                        Box(
                            contentAlignment = Alignment.Center,
                        ) {
                            Spacer(modifier = Modifier
                                //.width(3.dp)
                                .fillMaxWidth()
                                .height(128.dp)
                                .background(color = MaterialTheme.colors.secondary)
                            )
                            Text(
                                text = "2018\n~\n2022",
                                textAlign = TextAlign.Center,
                                fontFamily = outfit,
                                color = MaterialTheme.colors.onSecondary
                            )
                        }

                        Box(
                            contentAlignment = Alignment.Center,
                        ) {
                            Spacer(modifier = Modifier
                                //.width(3.dp)
                                .fillMaxWidth()
                                .height(96.dp)
                                .background(color = MaterialTheme.colors.primary)
                            )
                            Text(
                                text = "2023.9\n~\n2024.4",
                                textAlign = TextAlign.Center,
                                fontFamily = outfit,
                                color = MaterialTheme.colors.onPrimary
                            )
                        }

                        Box(
                            contentAlignment = Alignment.Center,
                        ) {
                            Spacer(modifier = Modifier
                                //.width(3.dp)
                                .fillMaxWidth()
                                .height(64.dp)
                                .background(color = MaterialTheme.colors.secondary)
                            )
                            Text(
                                text = "2024.4\n~",
                                textAlign = TextAlign.Center,
                                fontFamily = outfit,
                                color = MaterialTheme.colors.onSecondary
                            )
                        }

                    }
                    Column(
                        modifier = Modifier
                            .weight(3f)
                            .padding(start = 16.dp),
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.height(96.dp)
                        ) {
                            Text(
                                text = stringResource(Res.string.highSchool),
                                style = MaterialTheme.typography.h4,
                                fontFamily = myFont,
                                color = MaterialTheme.colors.onSecondary,
                                modifier = Modifier
                                    //.height(64.dp)
                                //.padding(0.dp, 8.dp)
                            )

                        }

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.height(128.dp)
                        ) {
                            Text(
                                text = stringResource(Res.string.university),
                                style = MaterialTheme.typography.h4,
                                fontFamily = myFont,
                                color = MaterialTheme.colors.onSecondary,
                                modifier = Modifier
                                //.height(64.dp)
                                //.padding(0.dp, 8.dp)
                            )
                        }

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.height(96.dp)
                        ) {
                            Text(
                                text = stringResource(Res.string.researchStudent),
                                style = MaterialTheme.typography.h4,
                                fontFamily = myFont,
                                color = MaterialTheme.colors.onSecondary,
                                modifier = Modifier
                                //.height(64.dp)
                                //.padding(0.dp, 8.dp)
                            )
                        }

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.height(64.dp)
                        ) {
                            Text(
                                text = stringResource(Res.string.masterStudent),
                                style = MaterialTheme.typography.h4,
                                fontFamily = myFont,
                                color = MaterialTheme.colors.onSecondary,
                                modifier = Modifier
                                //.height(64.dp)
                                //.padding(0.dp, 8.dp)
                            )
                        }

                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
            }

            item {
                Row(
                    modifier = Modifier.padding(0.dp, 16.dp, 0.dp, 8.dp)
                ) {
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = stringResource(Res.string.titleInternship),
                        style = MaterialTheme.typography.h2,
                        fontFamily = myFont,
                        color = MaterialTheme.colors.onSecondary,
                        modifier = Modifier.weight(3.5f)
                    )
                    Spacer(modifier = Modifier.weight(1f))
                }
            }

            item {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Spacer(modifier = Modifier.weight(1f))
                    Column(
                        //verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.weight(0.5f)
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                        ) {
                            Spacer(modifier = Modifier
                                //.width(3.dp)
                                .fillMaxWidth()
                                .height(136.dp)
                                .background(color = MaterialTheme.colors.primary)
                            )
                            Text(
                                text = "2023.3\n~\n2023.6",
                                textAlign = TextAlign.Center,
                                fontFamily = outfit,
                                color = MaterialTheme.colors.onPrimary
                            )
                        }

                        Box(
                            contentAlignment = Alignment.Center,
                        ) {
                            Spacer(modifier = Modifier
                                //.width(3.dp)
                                .fillMaxWidth()
                                .height(136.dp)
                                .background(color = MaterialTheme.colors.secondary)
                            )
                            Text(
                                text = "2023.6\n~\n2023.9",
                                textAlign = TextAlign.Center,
                                fontFamily = outfit,
                                color = MaterialTheme.colors.onSecondary
                            )
                        }

                    }
                    Column(
                        modifier = Modifier
                            .weight(3f)
                            .padding(start = 16.dp),
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.height(136.dp)
                        ) {
                            Column {
                                Text(
                                    text = stringResource(Res.string.intern1),
                                    style = MaterialTheme.typography.h4,
                                    fontFamily = myFont,
                                    color = MaterialTheme.colors.onSecondary,
                                    modifier = Modifier
                                    //.height(64.dp)
                                    //.padding(0.dp, 8.dp)
                                )
                                Text(
                                    text = stringResource(Res.string.addressIntern1),
                                    style = MaterialTheme.typography.body1,
                                    fontFamily = myFont,
                                    color = MaterialTheme.colors.onSecondary,
                                    modifier = Modifier
                                    //.height(64.dp)
                                    //.padding(0.dp, 8.dp)
                                )
                            }


                        }

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.height(136.dp)
                        ) {
                            Column {
                                Text(
                                    text = stringResource(Res.string.intern2),
                                    style = MaterialTheme.typography.h4,
                                    fontFamily = myFont,
                                    color = MaterialTheme.colors.onSecondary,
                                    modifier = Modifier
                                    //.height(64.dp)
                                    //.padding(0.dp, 8.dp)
                                )
                                Text(
                                    text = stringResource(Res.string.addressIntern2),
                                    style = MaterialTheme.typography.body1,
                                    fontFamily = myFont,
                                    color = MaterialTheme.colors.onSecondary,
                                    modifier = Modifier
                                    //.height(64.dp)
                                    //.padding(0.dp, 8.dp)
                                )
                            }

                        }

                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}