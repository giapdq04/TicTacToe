package fpoly.giapdqph34273.tictactoe

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import fpoly.giapdqph34273.tictactoe.navigation.Screen

@Composable
@Preview(showBackground = true)
fun WelcomeScreen(navController: NavController? = null) {
    Column {
        val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.xo_animation))
        val progress by animateLottieCompositionAsState(composition)
        LaunchedEffect(progress) {
            if (progress == 1f) {
                navController?.navigate(Screen.Play.route)
            }
        }
        LottieAnimation(
            composition = composition,
            progress = progress,
        )
    }
}