package compose.homepage.project

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Verified
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.compose.HomepageTheme
import com.example.compose.primaryContainerLight
import longzhenhomepage.composeapp.generated.resources.Outfit_Black
import longzhenhomepage.composeapp.generated.resources.Outfit_Bold
import longzhenhomepage.composeapp.generated.resources.Outfit_Light
import longzhenhomepage.composeapp.generated.resources.Outfit_Regular
import longzhenhomepage.composeapp.generated.resources.Outfit_Thin
import longzhenhomepage.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
fun SkillScreen() {
    HomepageTheme {

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
                            text = "Programming Languages",
                            style = MaterialTheme.typography.h2,
                            fontFamily = outfit,
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
                            style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colors.onSecondary,
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
                            style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colors.onSecondary,
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
                            style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colors.onSecondary,
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
                            style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colors.onSecondary,
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
                            text = "Other programming languages: C, C#, Javascript, PHP",
                            style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colors.onSecondary,
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
                            text = "Tools",
                            style = MaterialTheme.typography.h2,
                            fontFamily = outfit,
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
                            style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colors.onSecondary,
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
                            text = "Languages",
                            style = MaterialTheme.typography.h2,
                            fontFamily = outfit,
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
                                text = "Chinese",
                                style = MaterialTheme.typography.h4,
                                fontFamily = outfit,
                                color = MaterialTheme.colors.onSecondary,
                            )
                            Text(
                                text = "(Native Language)",
                                style = MaterialTheme.typography.body1,
                                fontFamily = outfit,
                                color = MaterialTheme.colors.onSecondary,
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
                                text = "English",
                                style = MaterialTheme.typography.h4,
                                fontFamily = outfit,
                                color = MaterialTheme.colors.onSecondary,
                            )
                            Text(
                                text = "(Business Level)",
                                style = MaterialTheme.typography.body1,
                                fontFamily = outfit,
                                color = MaterialTheme.colors.onSecondary,
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
                            text = "Japanese",
                            style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colors.onSecondary,
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
                            text = "Korean",
                            style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colors.onSecondary,
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

                            /*Icon(
                                imageVector = Icons.Filled.Verified,
                                contentDescription = "",
                                modifier = Modifier.padding(end = 16.dp)
                            )*/
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(bottom = 8.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = "Italian",
                            style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colors.onSecondary,
                            modifier = Modifier.weight(0.5f)
                        )
                        Row(
                            modifier = Modifier
                                .weight(4f)
                                .padding(start = 16.dp)
                        ) {
                            Text(
                                text = "Studying",
                                style = MaterialTheme.typography.h6,
                                fontFamily = outfit,
                                color = MaterialTheme.colors.onSecondary,
                            )
                        }
                    }
                }
            }

        }
    }
}