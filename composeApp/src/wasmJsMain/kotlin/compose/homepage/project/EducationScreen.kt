package compose.homepage.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
fun EducationScreen() {
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
                Row(
                    modifier = Modifier.padding(0.dp, 64.dp, 0.dp, 8.dp)
                ) {
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "Education",
                        style = MaterialTheme.typography.h2,
                        fontFamily = outfit,
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
                                text = "High School(China)",
                                style = MaterialTheme.typography.h4,
                                fontFamily = outfit,
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
                                text = "Dalhousie University(Canada)",
                                style = MaterialTheme.typography.h4,
                                fontFamily = outfit,
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
                                text = "Hokkaido University(Research Student)",
                                style = MaterialTheme.typography.h4,
                                fontFamily = outfit,
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
                                text = "Hokkaido University(Master Student)",
                                style = MaterialTheme.typography.h4,
                                fontFamily = outfit,
                                color = MaterialTheme.colors.onSecondary,
                                modifier = Modifier
                                //.height(64.dp)
                                //.padding(0.dp, 8.dp)
                            )
                        }

                        /*Text(
                            text = "University",
                            style = MaterialTheme.typography.h4,
                            fontFamily = outfit,
                            color = MaterialTheme.colors.onSecondary,
                            modifier = Modifier
                                //.height(64.dp)
                                //.padding(0.dp)
                        )*/
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
            }

            /*item {
                Text(text = "Internship")
            }

            item {
                Row {
                    Column {
                        Spacer(modifier = Modifier
                            .width(4.dp)
                            .background(color = MaterialTheme.colors.background)
                        )
                    }
                    Column {
                        Text("University")
                    }
                }
            }*/
        }
    }
}