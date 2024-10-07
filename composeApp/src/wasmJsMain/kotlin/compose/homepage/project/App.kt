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
import androidx.compose.foundation.layout.widthIn
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.compose.HomepageTheme
import com.example.compose.tertiaryContainerLight
import longzhenhomepage.composeapp.generated.resources.Outfit_Black
import longzhenhomepage.composeapp.generated.resources.Outfit_Bold
import longzhenhomepage.composeapp.generated.resources.Outfit_Light
import longzhenhomepage.composeapp.generated.resources.Outfit_Regular
import longzhenhomepage.composeapp.generated.resources.Outfit_Thin
import longzhenhomepage.composeapp.generated.resources.Res
import longzhenhomepage.composeapp.generated.resources.avatar
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource

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

        var isGreet by remember { mutableStateOf(false) }
        var isProject by remember { mutableStateOf(false) }
        var isEdu by remember { mutableStateOf(false) }
        var isSkills by remember { mutableStateOf(true) }


        Row {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    //.widthIn(min = 256.dp)
                    .weight(1.5f)
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
                                onClick = {
                                    isGreet = true
                                    isProject = false
                                    isEdu = false
                                    isSkills = false
                                },
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
                                onClick = {
                                    isGreet = false
                                    isProject = true
                                    isEdu = false
                                    isSkills = false
                                },
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
                                "Education/Intern",
                                fontFamily = outfit,
                                fontWeight = if (eduIsHovered) FontWeight.SemiBold else FontWeight.Normal
                            )
                        },
                        icon = {
                            Icon(Icons.Filled.HistoryEdu, "")
                        },
                        modifier = Modifier
                            .clickable(
                                onClick = {
                                    isGreet = false
                                    isProject = false
                                    isEdu = true
                                    isSkills = false
                                },
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
                                onClick = {
                                    isGreet = false
                                    isProject = false
                                    isEdu = false
                                    isSkills = true
                                },
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

            Box(modifier = Modifier.weight(9f)) {
                if (isGreet) {
                    GreetScreen()
                } else if (isProject) {
                    ProjectScreen()
                } else if (isEdu) {
                    EducationScreen()
                } else if (isSkills) {
                    SkillScreen()
                }
            }
        }


    }
}