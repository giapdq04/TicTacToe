package fpoly.giapdqph34273.tictactoe.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fpoly.giapdqph34273.tictactoe.FiveTimesFive
import fpoly.giapdqph34273.tictactoe.Option
import fpoly.giapdqph34273.tictactoe.ThreeTimesThree
import fpoly.giapdqph34273.tictactoe.WelcomeScreen

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
        composable(Screen.Three.route) {
            ThreeTimesThree()
        }
        composable(Screen.Five.route) {
            FiveTimesFive()
        }
        composable(Screen.Option.route) {
            Option(navController)
        }
    }
}