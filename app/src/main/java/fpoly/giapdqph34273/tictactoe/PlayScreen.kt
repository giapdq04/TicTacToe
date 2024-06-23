package fpoly.giapdqph34273.tictactoe

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun PlayScreen() {

    var a1 by remember { mutableStateOf("") }
    var a2 by remember { mutableStateOf("") }
    var a3 by remember { mutableStateOf("") }
    var b1 by remember { mutableStateOf("") }
    var b2 by remember { mutableStateOf("") }
    var b3 by remember { mutableStateOf("") }
    var c1 by remember { mutableStateOf("") }
    var c2 by remember { mutableStateOf("") }
    var c3 by remember { mutableStateOf("") }

    var playerSlot by remember { mutableStateOf(true) }

    var resutl by remember { mutableStateOf("") }

    LaunchedEffect(a1, a2, a3, b1, b2, b3, c1, c2, c3) {
        if (a1 == "x" && a2 == a1 && a3 == a1) {
            resutl = "Player 1 win"
        } else if (a1 == "o" && a2 == a1 && a3 == a1) {
            resutl = "Player 2 win"
        } else if (b1 == "x" && b2 == b1 && b3 == b1) {
            resutl = "Player 1 win"
        } else if (b1 == "o" && b2 == b1 && b3 == b1) {
            resutl = "Player 2 win"
        } else if (c1 == "x" && c2 == c1 && c3 == c1) {
            resutl = "Player 1 win"
        } else if (c1 == "o" && c2 == c1 && c3 == c1) {
            resutl = "Player 2 win"
        } else if (a1 == "x" && b1 == a1 && c1 == a1) {
            resutl = "Player 1 win"
        } else if (a1 == "o" && b1 == a1 && c1 == a1) {
            resutl = "Player 2 win"
        } else if (a2 == "x" && b2 == a2 && c2 == a2) {
            resutl = "Player 1 win"
        } else if (a2 == "o" && b2 == a2 && c2 == a2) {
            resutl = "Player 2 win"
        } else if (a3 == "x" && b3 == a3 && c3 == a3) {
            resutl = "Player 1 win"
        } else if (a3 == "o" && b3 == a3 && c3 == a3) {
            resutl = "Player 2 win"
        } else if (a1 == "x" && b2 == a1 && c3 == a1) {
            resutl = "Player 1 win"
        } else if (a1 == "o" && b2 == a1 && c3 == a1) {
            resutl = "Player 2 win"
        } else if (a3 == "x" && b2 == a3 && c1 == a3) {
            resutl = "Player 1 win"
        } else if (a3 == "o" && b2 == a3 && c1 == a3) {
            resutl = "Player 2 win"
        }
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = resutl,
            fontSize = 60.sp,
            color = if (resutl == "Player 1 win") Color.Blue else Color.Red,
            fontWeight = FontWeight(500),
        )
        Column(
            modifier = Modifier
                .height(320.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // hàng 3
            Row {

                // c1
                Card(
                    onClick = {},
                    modifier = Modifier.size(100.dp)
                ) {
                    if (c1 == "x") {
                        Image(
                            painter = painterResource(id = R.drawable.x_icon),
                            contentDescription = null
                        )
                    } else if (c1 == "o") {
                        Image(
                            painter = painterResource(id = R.drawable.o_icon),
                            contentDescription = null
                        )
                    } else {
                        Spacer(modifier = Modifier.background(Color.White))
                    }
                }

                Spacer(modifier = Modifier.width(10.dp))

                // c2
                Card(
                    onClick = {},
                    modifier = Modifier.size(100.dp)
                ) {
                    if (c2 == "x") {
                        Image(
                            painter = painterResource(id = R.drawable.x_icon),
                            contentDescription = null
                        )
                    } else if (c2 == "o") {
                        Image(
                            painter = painterResource(id = R.drawable.o_icon),
                            contentDescription = null
                        )
                    } else {
                        Spacer(modifier = Modifier.background(Color.White))
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))

                // c3
                Card(
                    onClick = {},
                    modifier = Modifier.size(100.dp)
                ) {
                    if (c3 == "x") {
                        Image(
                            painter = painterResource(id = R.drawable.x_icon),
                            contentDescription = null
                        )
                    } else if (c3 == "o") {
                        Image(
                            painter = painterResource(id = R.drawable.o_icon),
                            contentDescription = null
                        )
                    } else {
                        Spacer(modifier = Modifier.background(Color.White))
                    }
                }
            }

            // hàng 2
            Row {

                // b1
                Card(
                    onClick = {},
                    modifier = Modifier.size(100.dp)
                ) {
                    if (b1 == "x") {
                        Image(
                            painter = painterResource(id = R.drawable.x_icon),
                            contentDescription = null
                        )
                    } else if (b1 == "o") {
                        Image(
                            painter = painterResource(id = R.drawable.o_icon),
                            contentDescription = null
                        )
                    } else {
                        Spacer(modifier = Modifier.background(Color.White))
                    }
                }

                Spacer(modifier = Modifier.width(10.dp))

                // b2
                Card(
                    onClick = {},
                    modifier = Modifier.size(100.dp)
                ) {
                    if (b2 == "x") {
                        Image(
                            painter = painterResource(id = R.drawable.x_icon),
                            contentDescription = null
                        )
                    } else if (b2 == "o") {
                        Image(
                            painter = painterResource(id = R.drawable.o_icon),
                            contentDescription = null
                        )
                    } else {
                        Spacer(modifier = Modifier.background(Color.White))
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))

                // b3
                Card(
                    onClick = {},
                    modifier = Modifier.size(100.dp)
                ) {
                    if (b3 == "x") {
                        Image(
                            painter = painterResource(id = R.drawable.x_icon),
                            contentDescription = null
                        )
                    } else if (b3 == "o") {
                        Image(
                            painter = painterResource(id = R.drawable.o_icon),
                            contentDescription = null
                        )
                    } else {
                        Spacer(modifier = Modifier.background(Color.White))
                    }
                }
            }

            // hàng 1
            Row {

                // a1
                Card(
                    onClick = {},
                    modifier = Modifier.size(100.dp)
                ) {
                    if (a1 == "x") {
                        Image(
                            painter = painterResource(id = R.drawable.x_icon),
                            contentDescription = null
                        )
                    } else if (a1 == "o") {
                        Image(
                            painter = painterResource(id = R.drawable.o_icon),
                            contentDescription = null
                        )
                    } else {
                        Spacer(modifier = Modifier.background(Color.White))
                    }
                }

                Spacer(modifier = Modifier.width(10.dp))

                // a2
                Card(
                    onClick = {},
                    modifier = Modifier.size(100.dp)
                ) {
                    if (a2 == "x") {
                        Image(
                            painter = painterResource(id = R.drawable.x_icon),
                            contentDescription = null
                        )
                    } else if (a2 == "o") {
                        Image(
                            painter = painterResource(id = R.drawable.o_icon),
                            contentDescription = null
                        )
                    } else {
                        Spacer(modifier = Modifier.background(Color.White))
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))

                // a3
                Card(
                    onClick = {},
                    modifier = Modifier.size(100.dp)
                ) {
                    if (a3 == "x") {
                        Image(
                            painter = painterResource(id = R.drawable.x_icon),
                            contentDescription = null
                        )
                    } else if (a3 == "o") {
                        Image(
                            painter = painterResource(id = R.drawable.o_icon),
                            contentDescription = null
                        )
                    } else {
                        Spacer(modifier = Modifier.background(Color.White))
                    }
                }
            }
        }
    }
}