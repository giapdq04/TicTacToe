package fpoly.giapdqph34273.tictactoe

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
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

    val p1w by remember { mutableStateOf("Player 1 win") }
    val p2w by remember { mutableStateOf("Player 2 win") }
    val x by remember { mutableStateOf("x") }
    val o by remember { mutableStateOf("o") }

    var playerSlot by remember { mutableStateOf(true) }

    var resutl by remember { mutableStateOf("") }

    // load lại nếu có ô nào được tích
    LaunchedEffect(a1, a2, a3, b1, b2, b3, c1, c2, c3) {
        if (a1 == x && a2 == a1 && a3 == a1) {
            resutl = p1w
        } else if (a1 == o && a2 == a1 && a3 == a1) {
            resutl = p2w
        } else if (b1 == x && b2 == b1 && b3 == b1) {
            resutl = p1w
        } else if (b1 == o && b2 == b1 && b3 == b1) {
            resutl = p2w
        } else if (c1 == x && c2 == c1 && c3 == c1) {
            resutl = p1w
        } else if (c1 == o && c2 == c1 && c3 == c1) {
            resutl = p2w
        } else if (a1 == x && b1 == a1 && c1 == a1) {
            resutl = p1w
        } else if (a1 == o && b1 == a1 && c1 == a1) {
            resutl = p2w
        } else if (a2 == x && b2 == a2 && c2 == a2) {
            resutl = p1w
        } else if (a2 == o && b2 == a2 && c2 == a2) {
            resutl = p2w
        } else if (a3 == x && b3 == a3 && c3 == a3) {
            resutl = p1w
        } else if (a3 == o && b3 == a3 && c3 == a3) {
            resutl = p2w
        } else if (a1 == x && b2 == a1 && c3 == a1) {
            resutl = p1w
        } else if (a1 == o && b2 == a1 && c3 == a1) {
            resutl = p2w
        } else if (a3 == x && b2 == a3 && c1 == a3) {
            resutl = p1w
        } else if (a3 == o && b2 == a3 && c1 == a3) {
            resutl = p2w
        } else if (a1.isNotEmpty() && a2.isNotEmpty() && a3.isNotEmpty() && b1.isNotEmpty() && b2.isNotEmpty() && b3.isNotEmpty() && c1.isNotEmpty() && c2.isNotEmpty() && c3.isNotEmpty()) {
            resutl = "Hòa"
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (resutl.isNotEmpty()) {
                Text(
                    text = resutl,
                    fontSize = 60.sp,
                    color = if (resutl == p1w) Color.Blue else if (resutl == p2w) Color.Red else Color.Gray,
                    fontWeight = FontWeight(500),
                )
            } else {
                Text(
                    text = "Lượt: ${
                        if (playerSlot) "Player 1"
                        else "Player 2"
                    }",
                    fontSize = 30.sp,
                    color = if (playerSlot) Color.Blue else Color.Red,
                    fontWeight = FontWeight(500)
                )
            }
        }
        Column(
            modifier = Modifier
                .height(320.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // hàng 3
            Row {
                // c1
                ViTri(c1) {
                    // nếu kết quả rỗng thì mới cho đánh
                    if (resutl == "") {
                        // nếu ô trống thì mới cho đánh
                        if (c1 == "") {
                            // nếu lượt của player 1 thì đánh x, ngược lại đánh o
                            if (playerSlot) {
                                c1 = x
                            } else {
                                c1 = o
                            }
                            // đổi lượt
                            playerSlot = !playerSlot
                        }
                    }

                    // nếu ô đã đánh rồi thì không cho đánh
                }
                Spacer(modifier = Modifier.width(10.dp))

                // c2
                ViTri(c2) {
                    if (resutl == "")
                        if (c2 == "") {
                            if (playerSlot) {
                                c2 = x
                            } else {
                                c2 = o
                            }
                            playerSlot = !playerSlot
                        }
                }
                Spacer(modifier = Modifier.width(10.dp))

                // c3
                ViTri(c3) {
                    if (resutl == "")
                        if (c3 == "") {
                            if (playerSlot) {
                                c3 = x
                            } else {
                                c3 = o
                            }
                            playerSlot = !playerSlot
                        }
                }
            }

            // hàng 2
            Row {
                // b1
                ViTri(b1) {
                    if (resutl == "")
                        if (b1 == "") {
                            if (playerSlot) {
                                b1 = x
                            } else {
                                b1 = o
                            }
                            playerSlot = !playerSlot
                        }
                }
                Spacer(modifier = Modifier.width(10.dp))

                // b2
                ViTri(b2) {
                    if (resutl == "")
                        if (b2 == "") {
                            if (playerSlot) {
                                b2 = x
                            } else {
                                b2 = o
                            }
                            playerSlot = !playerSlot
                        }
                }
                Spacer(modifier = Modifier.width(10.dp))

                // b3
                ViTri(b3) {
                    if (resutl == "")
                        if (b3 == "") {
                            if (playerSlot) {
                                b3 = x
                            } else {
                                b3 = o
                            }
                            playerSlot = !playerSlot
                        }
                }
            }

            // hàng 1
            Row {
                // a1
                ViTri(pot = a1) {
                    if (resutl == "")
                        if (a1 == "") {
                            if (playerSlot) {
                                a1 = x
                            } else {
                                a1 = o
                            }
                            playerSlot = !playerSlot
                        }
                }
                Spacer(modifier = Modifier.width(10.dp))

                // a2
                ViTri(pot = a2) {
                    if (resutl == "")
                        if (a2 == "") {
                            if (playerSlot) {
                                a2 = x
                            } else {
                                a2 = o
                            }
                            playerSlot = !playerSlot
                        }
                }
                Spacer(modifier = Modifier.width(10.dp))
                // a3
                ViTri(pot = a3) {
                    if (resutl == "")
                        if (a3 == "") {
                            if (playerSlot) {
                                a3 = x
                            } else {
                                a3 = o
                            }
                            playerSlot = !playerSlot
                        }
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            if (resutl.isNotEmpty()) {
                Button(onClick = {
                    a1 = ""; a2 = ""; a3 = ""; b1 = ""; b2 = ""; b3 = ""; c1 = ""; c2 = ""; c3 =
                    ""; resutl = "";playerSlot = true
                }) {
                    Text(
                        text = "Reset",
                        fontSize = 30.sp,
                        color = Color.White,
                        fontWeight = FontWeight(500),
                    )
                }
            } else {
                Spacer(modifier = Modifier.width(50.dp))
            }

        }
    }
}

@Composable
fun ViTri(pot: String, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        modifier = Modifier.size(100.dp)
    ) {
        if (pot == "x") {
            Image(
                painter = painterResource(id = R.drawable.x_icon),
                contentDescription = null
            )
        } else if (pot == "o") {
            Image(
                painter = painterResource(id = R.drawable.o_icon),
                contentDescription = null
            )
        } else {
            Spacer(modifier = Modifier.background(Color.White))
        }
    }
}