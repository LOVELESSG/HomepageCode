package compose.homepage.project.navigation.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import compose.homepage.project.navigation.Screen
import compose.homepage.project.ui.education.EducationScreen
import compose.homepage.project.ui.greet.GreetScreen
import compose.homepage.project.ui.project.ProjectScreen
import compose.homepage.project.ui.skill.SkillScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController,
    startScreen: String
) {
    NavHost(
        navController = navController,
        startDestination = startScreen
    ) {
        composable(
            route = Screen.Greet.route
        ) {
            GreetScreen()
        }
        composable(
            route = Screen.Project.route
        ) {
            ProjectScreen()
        }
        composable(
            route = Screen.Education.route
        ) {
            EducationScreen()
        }
        composable(
            route = Screen.Skill.route
        ) {
            SkillScreen()
        }
    }
}