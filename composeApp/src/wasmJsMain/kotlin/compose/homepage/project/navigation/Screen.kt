package compose.homepage.project.navigation

sealed class Screen(val route: String) {
    data object Greet: Screen(route = "greet_screen")
    data object Project: Screen(route = "project_screen")
    data object Education: Screen(route = "education_screen")
    data object Skill: Screen(route = "skill_screen")
}