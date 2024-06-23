package fpoly.giapdqph34273.tictactoe.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fpoly.giapdqph34273.tictactoe.PlayScreen
import fpoly.giapdqph34273.tictactoe.WelcomeScreen
import fpoly.giapdqph34273.tictactoe.navigation.Screen

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Welcome.route,
    ) {

        composable(Screen.Welcome.route) {
            WelcomeScreen(navController)
        }
        composable(Screen.Play.route) {
            PlayScreen()
        }
    }
}