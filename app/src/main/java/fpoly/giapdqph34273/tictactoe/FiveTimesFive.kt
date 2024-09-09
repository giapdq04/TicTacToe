package fpoly.giapdqph34273.tictactoe

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
@Preview(showBackground = true)
fun FiveTimesFive(navController:NavController? = null) {

    var a1 by rememberSaveable { mutableStateOf("") }
    var a2 by rememberSaveable { mutableStateOf("") }
    var a3 by rememberSaveable { mutableStateOf("") }
    var a4 by rememberSaveable { mutableStateOf("") }
    var a5 by rememberSaveable { mutableStateOf("") }
    var a6 by rememberSaveable { mutableStateOf("") }
    var a7 by rememberSaveable { mutableStateOf("") }

    var b1 by rememberSaveable { mutableStateOf("") }
    var b2 by rememberSaveable { mutableStateOf("") }
    var b3 by rememberSaveable { mutableStateOf("") }
    var b4 by rememberSaveable { mutableStateOf("") }
    var b5 by rememberSaveable { mutableStateOf("") }
    var b6 by rememberSaveable { mutableStateOf("") }
    var b7 by rememberSaveable { mutableStateOf("") }

    var c1 by rememberSaveable { mutableStateOf("") }
    var c2 by rememberSaveable { mutableStateOf("") }
    var c3 by rememberSaveable { mutableStateOf("") }
    var c4 by rememberSaveable { mutableStateOf("") }
    var c5 by rememberSaveable { mutableStateOf("") }
    var c6 by rememberSaveable { mutableStateOf("") }
    var c7 by rememberSaveable { mutableStateOf("") }

    var d1 by rememberSaveable { mutableStateOf("") }
    var d2 by rememberSaveable { mutableStateOf("") }
    var d3 by rememberSaveable { mutableStateOf("") }
    var d4 by rememberSaveable { mutableStateOf("") }
    var d5 by rememberSaveable { mutableStateOf("") }
    var d6 by rememberSaveable { mutableStateOf("") }
    var d7 by rememberSaveable { mutableStateOf("") }

    var e1 by rememberSaveable { mutableStateOf("") }
    var e2 by rememberSaveable { mutableStateOf("") }
    var e3 by rememberSaveable { mutableStateOf("") }
    var e4 by rememberSaveable { mutableStateOf("") }
    var e5 by rememberSaveable { mutableStateOf("") }
    var e6 by rememberSaveable { mutableStateOf("") }
    var e7 by rememberSaveable { mutableStateOf("") }

    var f1 by rememberSaveable { mutableStateOf("") }
    var f2 by rememberSaveable { mutableStateOf("") }
    var f3 by rememberSaveable { mutableStateOf("") }
    var f4 by rememberSaveable { mutableStateOf("") }
    var f5 by rememberSaveable { mutableStateOf("") }
    var f6 by rememberSaveable { mutableStateOf("") }
    var f7 by rememberSaveable { mutableStateOf("") }

    var g1 by rememberSaveable { mutableStateOf("") }
    var g2 by rememberSaveable { mutableStateOf("") }
    var g3 by rememberSaveable { mutableStateOf("") }
    var g4 by rememberSaveable { mutableStateOf("") }
    var g5 by rememberSaveable { mutableStateOf("") }
    var g6 by rememberSaveable { mutableStateOf("") }
    var g7 by rememberSaveable { mutableStateOf("") }

    val p1w by rememberSaveable { mutableStateOf("Player 1 win") }
    val p2w by rememberSaveable { mutableStateOf("Player 2 win") }
    val x by rememberSaveable { mutableStateOf("x") }
    val o by rememberSaveable { mutableStateOf("o") }

    var playerSlot by rememberSaveable { mutableStateOf(true) }

    var resutl by rememberSaveable { mutableStateOf("") }

    // load lại nếu có ô nào được tích
    LaunchedEffect(
        a1,
        a2,
        a3,
        a4,
        a5,
        a6,
        a7,
        b1,
        b2,
        b3,
        b4,
        b5,
        b6,
        b7,
        c1,
        c2,
        c3,
        c4,
        c5,
        c6,
        c7,
        d1,
        d2,
        d3,
        d4,
        d5,
        d6,
        d7,
        e1,
        e2,
        e3,
        e4,
        e5,
        e6,
        e7,
        f1,
        f2,
        f3,
        f4,
        f5,
        f6,
        f7,
        g1,
        g2,
        g3,
        g4,
        g5,
        g6,
        g7
    ) {
        when {
            a1 == x && a2 == x && a3 == x && a4 == x && a5 == x -> resutl = p1w
            a1 == o && a2 == o && a3 == o && a4 == o && a5 == o -> resutl = p2w
            b1 == x && b2 == x && b3 == x && b4 == x && b5 == x -> resutl = p1w
            b1 == o && b2 == o && b3 == o && b4 == o && b5 == o -> resutl = p2w
            c1 == x && c2 == x && c3 == x && c4 == x && c5 == x -> resutl = p1w
            c1 == o && c2 == o && c3 == o && c4 == o && c5 == o -> resutl = p2w
            d1 == x && d2 == x && d3 == x && d4 == x && d5 == x -> resutl = p1w
            d1 == o && d2 == o && d3 == o && d4 == o && d5 == o -> resutl = p2w
            e1 == x && e2 == x && e3 == x && e4 == x && e5 == x -> resutl = p1w
            e1 == o && e2 == o && e3 == o && e4 == o && e5 == o -> resutl = p2w
            f1 == x && f2 == x && f3 == x && f4 == x && f5 == x -> resutl = p1w
            f1 == o && f2 == o && f3 == o && f4 == o && f5 == o -> resutl = p2w
            g1 == x && g2 == x && g3 == x && g4 == x && g5 == x -> resutl = p1w
            g1 == o && g2 == o && g3 == o && g4 == o && g5 == o -> resutl = p2w
            a2 == x && a3 == x && a4 == x && a5 == x && a6 == x -> resutl = p1w
            a2 == o && a3 == o && a4 == o && a5 == o && a6 == o -> resutl = p2w
            b2 == x && b3 == x && b4 == x && b5 == x && b6 == x -> resutl = p1w
            b2 == o && b3 == o && b4 == o && b5 == o && b6 == o -> resutl = p2w
            c2 == x && c3 == x && c4 == x && c5 == x && c6 == x -> resutl = p1w
            c2 == o && c3 == o && c4 == o && c5 == o && c6 == o -> resutl = p2w
            d2 == x && d3 == x && d4 == x && d5 == x && d6 == x -> resutl = p1w
            d2 == o && d3 == o && d4 == o && d5 == o && d6 == o -> resutl = p2w
            e2 == x && e3 == x && e4 == x && e5 == x && e6 == x -> resutl = p1w
            e2 == o && e3 == o && e4 == o && e5 == o && e6 == o -> resutl = p2w
            f2 == x && f3 == x && f4 == x && f5 == x && f6 == x -> resutl = p1w
            f2 == o && f3 == o && f4 == o && f5 == o && f6 == o -> resutl = p2w
            a3 == x && a4 == x && a5 == x && a6 == x && a7 == x -> resutl = p1w
            a3 == o && a4 == o && a5 == o && a6 == o && a7 == o -> resutl = p2w
            b3 == x && b4 == x && b5 == x && b6 == x && b7 == x -> resutl = p1w
            b3 == o && b4 == o && b5 == o && b6 == o && b7 == o -> resutl = p2w
            c3 == x && c4 == x && c5 == x && c6 == x && c7 == x -> resutl = p1w
            c3 == o && c4 == o && c5 == o && c6 == o && c7 == o -> resutl = p2w
            d3 == x && d4 == x && d5 == x && d6 == x && d7 == x -> resutl = p1w
            d3 == o && d4 == o && d5 == o && d6 == o && d7 == o -> resutl = p2w
            e3 == x && e4 == x && e5 == x && e6 == x && e7 == x -> resutl = p1w
            e3 == o && e4 == o && e5 == o && e6 == o && e7 == o -> resutl = p2w
            f3 == x && f4 == x && f5 == x && f6 == x && f7 == x -> resutl = p1w
            f3 == o && f4 == o && f5 == o && f6 == o && f7 == o -> resutl = p2w
            g3 == x && g4 == x && g5 == x && g6 == x && g7 == x -> resutl = p1w
            g3 == o && g4 == o && g5 == o && g6 == o && g7 == o -> resutl = p2w

            a1 == x && b1 == x && c1 == x && d1 == x && e1 == x -> resutl = p1w
            a1 == o && b1 == o && c1 == o && d1 == o && e1 == o -> resutl = p2w
            a2 == x && b2 == x && c2 == x && d2 == x && e2 == x -> resutl = p1w
            a2 == o && b2 == o && c2 == o && d2 == o && e2 == o -> resutl = p2w
            a3 == x && b3 == x && c3 == x && d3 == x && e3 == x -> resutl = p1w
            a3 == o && b3 == o && c3 == o && d3 == o && e3 == o -> resutl = p2w
            a4 == x && b4 == x && c4 == x && d4 == x && e4 == x -> resutl = p1w
            a4 == o && b4 == o && c4 == o && d4 == o && e4 == o -> resutl = p2w
            a5 == x && b5 == x && c5 == x && d5 == x && e5 == x -> resutl = p1w
            a5 == o && b5 == o && c5 == o && d5 == o && e5 == o -> resutl = p2w
            a6 == x && b6 == x && c6 == x && d6 == x && e6 == x -> resutl = p1w
            a6 == o && b6 == o && c6 == o && d6 == o && e6 == o -> resutl = p2w
            a7 == x && b7 == x && c7 == x && d7 == x && e7 == x -> resutl = p1w
            a7 == o && b7 == o && c7 == o && d7 == o && e7 == o -> resutl = p2w

            b1 == x && c1 == x && d1 == x && e1 == x && f1 == x -> resutl = p1w
            b1 == o && c1 == o && d1 == o && e1 == o && f1 == o -> resutl = p2w
            b2 == x && c2 == x && d2 == x && e2 == x && f2 == x -> resutl = p1w
            b2 == o && c2 == o && d2 == o && e2 == o && f2 == o -> resutl = p2w
            b3 == x && c3 == x && d3 == x && e3 == x && f3 == x -> resutl = p1w
            b3 == o && c3 == o && d3 == o && e3 == o && f3 == o -> resutl = p2w
            b4 == x && c4 == x && d4 == x && e4 == x && f4 == x -> resutl = p1w
            b4 == o && c4 == o && d4 == o && e4 == o && f4 == o -> resutl = p2w
            b5 == x && c5 == x && d5 == x && e5 == x && f5 == x -> resutl = p1w
            b5 == o && c5 == o && d5 == o && e5 == o && f5 == o -> resutl = p2w
            b6 == x && c6 == x && d6 == x && e6 == x && f6 == x -> resutl = p1w
            b6 == o && c6 == o && d6 == o && e6 == o && f6 == o -> resutl = p2w
            b7 == x && c7 == x && d7 == x && e7 == x && f7 == x -> resutl = p1w
            b7 == o && c7 == o && d7 == o && e7 == o && f7 == o -> resutl = p2w

            c1 == x && d1 == x && e1 == x && f1 == x && g1 == x -> resutl = p1w
            c1 == o && d1 == o && e1 == o && f1 == o && g1 == o -> resutl = p2w
            c2 == x && d2 == x && e2 == x && f2 == x && g2 == x -> resutl = p1w
            c2 == o && d2 == o && e2 == o && f2 == o && g2 == o -> resutl = p2w
            c3 == x && d3 == x && e3 == x && f3 == x && g3 == x -> resutl = p1w
            c3 == o && d3 == o && e3 == o && f3 == o && g3 == o -> resutl = p2w
            c4 == x && d4 == x && e4 == x && f4 == x && g4 == x -> resutl = p1w
            c4 == o && d4 == o && e4 == o && f4 == o && g4 == o -> resutl = p2w
            c5 == x && d5 == x && e5 == x && f5 == x && g5 == x -> resutl = p1w
            c5 == o && d5 == o && e5 == o && f5 == o && g5 == o -> resutl = p2w
            c6 == x && d6 == x && e6 == x && f6 == x && g6 == x -> resutl = p1w
            c6 == o && d6 == o && e6 == o && f6 == o && g6 == o -> resutl = p2w
            c7 == x && d7 == x && e7 == x && f7 == x && g7 == x -> resutl = p1w
            c7 == o && d7 == o && e7 == o && f7 == o && g7 == o -> resutl = p2w

            a1 == x && b2 == x && c3 == x && d4 == x && e5 == x -> resutl = p1w
            a1 == o && b2 == o && c3 == o && d4 == o && e5 == o -> resutl = p2w
            b2 == x && c3 == x && d4 == x && e5 == x && f6 == x -> resutl = p1w
            b2 == o && c3 == o && d4 == o && e5 == o && f6 == o -> resutl = p2w
            c3 == x && d4 == x && e5 == x && f6 == x && g7 == x -> resutl = p1w
            c3 == o && d4 == o && e5 == o && f6 == o && g7 == o -> resutl = p2w

            a2 == x && b3 == x && c4 == x && d5 == x && e6 == x -> resutl = p1w
            a2 == o && b3 == o && c4 == o && d5 == o && e6 == o -> resutl = p2w
            b3 == x && c4 == x && d5 == x && e6 == x && f7 == x -> resutl = p1w
            b3 == o && c4 == o && d5 == o && e6 == o && f7 == o -> resutl = p2w

            a3 == x && b4 == x && c5 == x && d6 == x && e7 == x -> resutl = p1w
            a3 == o && b4 == o && c5 == o && d6 == o && e7 == o -> resutl = p2w

            b1 == x && c2 == x && d3 == x && e4 == x && f5 == x -> resutl = p1w
            b1 == o && c2 == o && d3 == o && e4 == o && f5 == o -> resutl = p2w
            c2 == x && d3 == x && e4 == x && f5 == x && g6 == x -> resutl = p1w
            c2 == o && d3 == o && e4 == o && f5 == o && g6 == o -> resutl = p2w

            c1 == x && d2 == x && e3 == x && f4 == x && g5 == x -> resutl = p1w
            c1 == o && d2 == o && e3 == o && f4 == o && g5 == o -> resutl = p2w

            a7 == x && b6 == x && c5 == x && d4 == x && e3 == x -> resutl = p1w
            a7 == o && b6 == o && c5 == o && d4 == o && e3 == o -> resutl = p2w
            b6 == x && c5 == x && d4 == x && e3 == x && f2 == x -> resutl = p1w
            b6 == o && c5 == o && d4 == o && e3 == o && f2 == o -> resutl = p2w
            c5 == x && d4 == x && e3 == x && f2 == x && g1 == x -> resutl = p1w
            c5 == o && d4 == o && e3 == o && f2 == o && g1 == o -> resutl = p2w

            a6 == x && b5 == x && c4 == x && d3 == x && e2 == x -> resutl = p1w
            a6 == o && b5 == o && c4 == o && d3 == o && e2 == o -> resutl = p2w
            b5 == x && c4 == x && d3 == x && e2 == x && f1 == x -> resutl = p1w
            b5 == o && c4 == o && d3 == o && e2 == o && f1 == o -> resutl = p2w

            a5 == x && b4 == x && c3 == x && d2 == x && e1 == x -> resutl = p1w
            a5 == o && b4 == o && c3 == o && d2 == o && e1 == o -> resutl = p2w

            b7 == x && c6 == x && d5 == x && e4 == x && f3 == x -> resutl = p1w
            b7 == o && c6 == o && d5 == o && e4 == o && f3 == o -> resutl = p2w
            c6 == x && d5 == x && e4 == x && f3 == x && g2 == x -> resutl = p1w
            c6 == o && d5 == o && e4 == o && f3 == o && g2 == o -> resutl = p2w

            c7 == x && d6 == x && e5 == x && f4 == x && g3 == x -> resutl = p1w
            c7 == o && d6 == o && e5 == o && f4 == o && g3 == o -> resutl = p2w


            else -> if (a1.isNotEmpty() && a2.isNotEmpty() && a3.isNotEmpty() && a4.isNotEmpty() && a5.isNotEmpty() && a6.isNotEmpty() && a7.isNotEmpty() &&
                b1.isNotEmpty() && b2.isNotEmpty() && b3.isNotEmpty() && b4.isNotEmpty() && b5.isNotEmpty() && b6.isNotEmpty() && b7.isNotEmpty() &&
                c1.isNotEmpty() && c2.isNotEmpty() && c3.isNotEmpty() && c4.isNotEmpty() && c5.isNotEmpty() && c6.isNotEmpty() && c7.isNotEmpty() &&
                d1.isNotEmpty() && d2.isNotEmpty() && d3.isNotEmpty() && d4.isNotEmpty() && d5.isNotEmpty() && d6.isNotEmpty() && d7.isNotEmpty() &&
                e1.isNotEmpty() && e2.isNotEmpty() && e3.isNotEmpty() && e4.isNotEmpty() && e5.isNotEmpty() && e6.isNotEmpty() && e7.isNotEmpty() &&
                f1.isNotEmpty() && f2.isNotEmpty() && f3.isNotEmpty() && f4.isNotEmpty() && f5.isNotEmpty() && f6.isNotEmpty() && f7.isNotEmpty() &&
                g1.isNotEmpty() && g2.isNotEmpty() && g3.isNotEmpty() && g4.isNotEmpty() && g5.isNotEmpty() && g6.isNotEmpty() && g7.isNotEmpty()
            ) {
                resutl = "Hòa"
            }
        }
    }

    Box {
        IconButton(
            onClick = {
                navController?.popBackStack()
            },
            modifier = Modifier.offset(x = 20.dp, y = 30.dp)
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = null,
                Modifier.size(30.dp)
            )
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
                        color = if (resutl == p1w) Color("#F24D4F".toColorInt()) else if (resutl == p2w) Color(
                            "#4285F4".toColorInt()
                        ) else Color.Gray,
                        fontWeight = FontWeight(500),
                    )
                } else {
                    Row {
                        Text(
                            text = "Lượt: ${
                                if (playerSlot) "Player 1  "
                                else "Player 2  "
                            }",
                            fontSize = 30.sp,
                            color = if (playerSlot) Color("#F24D4F".toColorInt()) else Color("#4285F4".toColorInt()),
                            fontWeight = FontWeight(500)
                        )

                        val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(if (playerSlot) R.raw.x_animation else R.raw.o_animation))
                        LottieAnimation(
                            composition = composition,
                            modifier = Modifier
                                .size(35.dp)
                        )
                    }
                }
            }
            Column(
                modifier = Modifier
                    .height(400.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                // hàng 7
                Row {
                    // a7
                    ViTri(a7) {
                        // nếu kết quả rỗng thì mới cho đánh
                        if (resutl == "") {
                            // nếu ô trống thì mới cho đánh
                            if (a7 == "") {
                                // nếu lượt của player 1 thì đánh x, ngược lại đánh o
                                if (playerSlot) {
                                    a7 = x
                                } else {
                                    a7 = o
                                }
                                // đổi lượt
                                playerSlot = !playerSlot
                            }
                        }

                        // nếu ô đã đánh rồi thì không cho đánh
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    // b7
                    ViTri(b7) {
                        if (resutl == "")
                            if (b7 == "") {
                                if (playerSlot) {
                                    b7 = x
                                } else {
                                    b7 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    // c7
                    ViTri(c7) {
                        if (resutl == "")
                            if (c7 == "") {
                                if (playerSlot) {
                                    c7 = x
                                } else {
                                    c7 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(d7) {
                        if (resutl == "")
                            if (d7 == "") {
                                if (playerSlot) {
                                    d7 = x
                                } else {
                                    d7 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(e7) {
                        if (resutl == "")
                            if (e7 == "") {
                                if (playerSlot) {
                                    e7 = x
                                } else {
                                    e7 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(f7) {
                        if (resutl == "")
                            if (f7 == "") {
                                if (playerSlot) {
                                    f7 = x
                                } else {
                                    f7 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(g7) {
                        if (resutl == "")
                            if (g7 == "") {
                                if (playerSlot) {
                                    g7 = x
                                } else {
                                    g7 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }

                // hàng 6
                Row {
                    // a6
                    ViTri(a6) {
                        // nếu kết quả rỗng thì mới cho đánh
                        if (resutl == "") {
                            // nếu ô trống thì mới cho đánh
                            if (a6 == "") {
                                // nếu lượt của player 1 thì đánh x, ngược lại đánh o
                                if (playerSlot) {
                                    a6 = x
                                } else {
                                    a6 = o
                                }
                                // đổi lượt
                                playerSlot = !playerSlot
                            }
                        }

                        // nếu ô đã đánh rồi thì không cho đánh
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    // b6
                    ViTri(b6) {
                        if (resutl == "")
                            if (b6 == "") {
                                if (playerSlot) {
                                    b6 = x
                                } else {
                                    b6 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    // c6
                    ViTri(c6) {
                        if (resutl == "")
                            if (c6 == "") {
                                if (playerSlot) {
                                    c6 = x
                                } else {
                                    c6 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(d6) {
                        if (resutl == "")
                            if (d6 == "") {
                                if (playerSlot) {
                                    d6 = x
                                } else {
                                    d6 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(e6) {
                        if (resutl == "")
                            if (e6 == "") {
                                if (playerSlot) {
                                    e6 = x
                                } else {
                                    e6 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(f6) {
                        if (resutl == "")
                            if (f6 == "") {
                                if (playerSlot) {
                                    f6 = x
                                } else {
                                    f6 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(g6) {
                        if (resutl == "")
                            if (g6 == "") {
                                if (playerSlot) {
                                    g6 = x
                                } else {
                                    g6 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }

                // hàng 5
                Row {
                    // a5
                    ViTri(a5) {
                        // nếu kết quả rỗng thì mới cho đánh
                        if (resutl == "") {
                            // nếu ô trống thì mới cho đánh
                            if (a5 == "") {
                                // nếu lượt của player 1 thì đánh x, ngược lại đánh o
                                if (playerSlot) {
                                    a5 = x
                                } else {
                                    a5 = o
                                }
                                // đổi lượt
                                playerSlot = !playerSlot
                            }
                        }

                        // nếu ô đã đánh rồi thì không cho đánh
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    // b5
                    ViTri(b5) {
                        if (resutl == "")
                            if (b5 == "") {
                                if (playerSlot) {
                                    b5 = x
                                } else {
                                    b5 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    // c5
                    ViTri(c5) {
                        if (resutl == "")
                            if (c5 == "") {
                                if (playerSlot) {
                                    c5 = x
                                } else {
                                    c5 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(d5) {
                        if (resutl == "")
                            if (d5 == "") {
                                if (playerSlot) {
                                    d5 = x
                                } else {
                                    d5 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(e5) {
                        if (resutl == "")
                            if (e5 == "") {
                                if (playerSlot) {
                                    e5 = x
                                } else {
                                    e5 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(f5) {
                        if (resutl == "")
                            if (f5 == "") {
                                if (playerSlot) {
                                    f5 = x
                                } else {
                                    f5 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(g5) {
                        if (resutl == "")
                            if (g5 == "") {
                                if (playerSlot) {
                                    g5 = x
                                } else {
                                    g5 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }

                // hàng 4
                Row {
                    // a4
                    ViTri(a4) {
                        // nếu kết quả rỗng thì mới cho đánh
                        if (resutl == "") {
                            // nếu ô trống thì mới cho đánh
                            if (a4 == "") {
                                // nếu lượt của player 1 thì đánh x, ngược lại đánh o
                                if (playerSlot) {
                                    a4 = x
                                } else {
                                    a4 = o
                                }
                                // đổi lượt
                                playerSlot = !playerSlot
                            }
                        }

                        // nếu ô đã đánh rồi thì không cho đánh
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    // b4
                    ViTri(b4) {
                        if (resutl == "")
                            if (b4 == "") {
                                if (playerSlot) {
                                    b4 = x
                                } else {
                                    b4 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    // c4
                    ViTri(c4) {
                        if (resutl == "")
                            if (c4 == "") {
                                if (playerSlot) {
                                    c4 = x
                                } else {
                                    c4 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(d4) {
                        if (resutl == "")
                            if (d4 == "") {
                                if (playerSlot) {
                                    d4 = x
                                } else {
                                    d4 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(e4) {
                        if (resutl == "")
                            if (e4 == "") {
                                if (playerSlot) {
                                    e4 = x
                                } else {
                                    e4 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(f4) {
                        if (resutl == "")
                            if (f4 == "") {
                                if (playerSlot) {
                                    f4 = x
                                } else {
                                    f4 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(g4) {
                        if (resutl == "")
                            if (g4 == "") {
                                if (playerSlot) {
                                    g4 = x
                                } else {
                                    g4 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }

                // hàng 3
                Row {
                    // a3
                    ViTri(a3) {
                        // nếu kết quả rỗng thì mới cho đánh
                        if (resutl == "") {
                            // nếu ô trống thì mới cho đánh
                            if (a3 == "") {
                                // nếu lượt của player 1 thì đánh x, ngược lại đánh o
                                if (playerSlot) {
                                    a3 = x
                                } else {
                                    a3 = o
                                }
                                // đổi lượt
                                playerSlot = !playerSlot
                            }
                        }

                        // nếu ô đã đánh rồi thì không cho đánh
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
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(d3) {
                        if (resutl == "")
                            if (d3 == "") {
                                if (playerSlot) {
                                    d3 = x
                                } else {
                                    d3 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(e3) {
                        if (resutl == "")
                            if (e3 == "") {
                                if (playerSlot) {
                                    e3 = x
                                } else {
                                    e3 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(f3) {
                        if (resutl == "")
                            if (f3 == "") {
                                if (playerSlot) {
                                    f3 = x
                                } else {
                                    f3 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(g3) {
                        if (resutl == "")
                            if (g3 == "") {
                                if (playerSlot) {
                                    g3 = x
                                } else {
                                    g3 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }

                // hàng 2
                Row {
                    // a2
                    ViTri(a2) {
                        // nếu kết quả rỗng thì mới cho đánh
                        if (resutl == "") {
                            // nếu ô trống thì mới cho đánh
                            if (a2 == "") {
                                // nếu lượt của player 1 thì đánh x, ngược lại đánh o
                                if (playerSlot) {
                                    a2 = x
                                } else {
                                    a2 = o
                                }
                                // đổi lượt
                                playerSlot = !playerSlot
                            }
                        }

                        // nếu ô đã đánh rồi thì không cho đánh
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

                    ViTri(d2) {
                        if (resutl == "")
                            if (d2 == "") {
                                if (playerSlot) {
                                    d2 = x
                                } else {
                                    d2 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(e2) {
                        if (resutl == "")
                            if (e2 == "") {
                                if (playerSlot) {
                                    e2 = x
                                } else {
                                    e2 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(f2) {
                        if (resutl == "")
                            if (f2 == "") {
                                if (playerSlot) {
                                    f2 = x
                                } else {
                                    f2 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(g2) {
                        if (resutl == "")
                            if (g2 == "") {
                                if (playerSlot) {
                                    g2 = x
                                } else {
                                    g2 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }

                // hàng 1
                Row {
                    // a1
                    ViTri(a1) {
                        // nếu kết quả rỗng thì mới cho đánh
                        if (resutl == "") {
                            // nếu ô trống thì mới cho đánh
                            if (a1 == "") {
                                // nếu lượt của player 1 thì đánh x, ngược lại đánh o
                                if (playerSlot) {
                                    a1 = x
                                } else {
                                    a1 = o
                                }
                                // đổi lượt
                                playerSlot = !playerSlot
                            }
                        }

                        // nếu ô đã đánh rồi thì không cho đánh
                    }
                    Spacer(modifier = Modifier.width(10.dp))

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

                    // c1
                    ViTri(c1) {
                        if (resutl == "")
                            if (c1 == "") {
                                if (playerSlot) {
                                    c1 = x
                                } else {
                                    c1 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(d1) {
                        if (resutl == "")
                            if (d1 == "") {
                                if (playerSlot) {
                                    d1 = x
                                } else {
                                    d1 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(e1) {
                        if (resutl == "")
                            if (e1 == "") {
                                if (playerSlot) {
                                    e1 = x
                                } else {
                                    e1 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(f1) {
                        if (resutl == "")
                            if (f1 == "") {
                                if (playerSlot) {
                                    f1 = x
                                } else {
                                    f1 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))

                    ViTri(g1) {
                        if (resutl == "")
                            if (g1 == "") {
                                if (playerSlot) {
                                    g1 = x
                                } else {
                                    g1 = o
                                }
                                playerSlot = !playerSlot
                            }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
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
                    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.reset_animation))
                    var isPlaying by rememberSaveable { mutableStateOf(false) }
                    OutlinedButton(
                        enabled = !isPlaying,
                        onClick = {
                            isPlaying = true
                            CoroutineScope(Dispatchers.Main).launch {
                                delay(800)
                                a1 = "";a2 = "";a3 = "";a4 = "";a5 = "";a6 = "";a7 = ""
                                b1 = "";b2 = "";b3 = "";b4 = "";b5 = "";b6 = "";b7 = ""
                                c1 = "";c2 = "";c3 = "";c4 = "";c5 = "";c6 = "";c7 = ""
                                d1 = "";d2 = "";d3 = "";d4 = "";d5 = "";d6 = "";d7 = ""
                                e1 = "";e2 = "";e3 = "";e4 = "";e5 = "";e6 = "";e7 = ""
                                f1 = "";f2 = "";f3 = "";f4 = "";f5 = "";f6 = "";f7 = ""
                                g1 = "";g2 = "";g3 = "";g4 = "";g5 = "";g6 = "";g7 = ""
                                resutl = "";playerSlot = true
                            }
                        }) {
                        if (isPlaying) {
                            LottieAnimation(
                                composition,
                                modifier = Modifier.size(40.dp),
                                isPlaying = isPlaying
                            )
                        } else {
                            Text(
                                text = "Reset",
                                fontSize = 30.sp,
                                color = Color("#4285F4".toColorInt()),
                                fontWeight = FontWeight(500),
                            )
                        }
                    }


                } else {
                    Spacer(modifier = Modifier.width(50.dp))
                }

            }
        }
    }
}

@Composable
private fun ViTri(pot: String, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        modifier = Modifier.size(50.dp),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (pot == "x") {
                val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.x_animation))
                LottieAnimation(composition)
            } else if (pot == "o") {
                val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.o_animation))
                LottieAnimation(composition)
            } else {
                Spacer(modifier = Modifier.background(Color.White))
            }
        }
    }
}