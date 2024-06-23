package fpoly.giapdqph34273.tictactoe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GameTitle()
        Image(
            painter = painterResource(id = R.drawable.xoimage),
            contentDescription = null
        )
        GameButton()
    }
}

@Composable
fun GameButton() {
    Button(onClick = { /*TODO*/ }) {
        Text(
            text = "Start Game",
            fontSize = 20.sp,
            fontWeight = FontWeight(500)
        )
    }
}

@Composable
fun GameTitle() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Tic Tac Toe",
            fontSize = 60.sp,
            fontWeight = FontWeight(500)
        )
    }
}