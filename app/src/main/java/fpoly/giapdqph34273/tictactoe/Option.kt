package fpoly.giapdqph34273.tictactoe

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import fpoly.giapdqph34273.tictactoe.navigation.Screen

@Composable
fun Option(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            navController.navigate(Screen.Three.route)
        }) {
            Text(text = "3 x 3")
        }
        Button(onClick = {
            navController.navigate(Screen.Five.route)
        }) {
            Text(text = "5 x 5")
        }
    }
}