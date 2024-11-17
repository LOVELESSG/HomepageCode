package compose.homepage.project.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Architecture
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteDefaults
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldDefaults
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScope
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import compose.homepage.project.navigation.Screen
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
import longzhenhomepage.composeapp.generated.resources.item1
import longzhenhomepage.composeapp.generated.resources.item2
import longzhenhomepage.composeapp.generated.resources.item3
import longzhenhomepage.composeapp.generated.resources.item4
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.stringResource

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun HomepageSuiteScaffold(
    navController: NavController,
    innerPaddingValues: PaddingValues,
    content: @Composable () -> Unit
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    val size = calculateWindowSizeClass().widthSizeClass

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

    NavigationSuiteScaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPaddingValues),
        navigationSuiteItems = navigationSuiteItems(myFont, currentDestination, navController),
        content = content
    )
}

@Composable
private fun navigationSuiteItems(
    myFont: FontFamily,
    currentDestination: NavDestination?,
    navController: NavController
): NavigationSuiteScope.() -> Unit = {

    item(
        selected = currentDestination?.hierarchy?.any { it.route == Screen.Greet.route } == true,
        onClick = {
            navigateWithBackStackHandling(Screen.Greet.route, navController)
        },
        label = { Text(
            text = stringResource(Res.string.item1),
            fontFamily = myFont
        ) },
        icon = {
            Icon(Icons.Filled.Home, "Greeting Screen Button")
        }
    )
    item(
        selected = currentDestination?.hierarchy?.any { it.route == Screen.Project.route } == true,
        onClick = {
            navigateWithBackStackHandling(Screen.Project.route, navController)
        },
        label = { Text(
            text = stringResource(Res.string.item2),
            fontFamily = myFont
        ) },
        icon = {
            Icon(Icons.Filled.EmojiEvents, "Project Screen Button")
        }
    )
    item(
        selected = currentDestination?.hierarchy?.any { it.route == Screen.Education.route } == true,
        onClick = {
            navigateWithBackStackHandling(Screen.Education.route, navController)
        },
        label = { Text(
            text = stringResource(Res.string.item3),
            fontFamily = myFont
        ) },
        icon = {
            Icon(Icons.Filled.HistoryEdu, "Education Screen Button")
        }
    )
    item(
        selected = currentDestination?.hierarchy?.any { it.route == Screen.Skill.route } == true,
        onClick = {
            navigateWithBackStackHandling(Screen.Skill.route, navController)
        },
        label = { Text(
            text = stringResource(Res.string.item4),
            fontFamily = myFont
        ) },
        icon = {
            Icon(Icons.Filled.Architecture, "Skills Screen Button")
        }
    )
}

fun navigateWithBackStackHandling(route: String, navController: NavController) {
    navController.navigate(route) {
        popUpTo(navController.graph.findStartDestination().id) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }
}