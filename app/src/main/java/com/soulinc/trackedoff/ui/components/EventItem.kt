package com.soulinc.trackedoff.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun EventItem() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White)
            .padding(12.dp)
    ) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                // information side
                Column(
                    modifier = Modifier.weight(1F)
                ) {
                    Text(text = "Exercise Daily")
                    Text(
                        modifier = Modifier.height(64.dp),
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis,
                        text = "Tracking if I am daily exercising ot not"
                    )
                }
                // current count and update UI
                Box(
                    modifier = Modifier
                        .wrapContentWidth()
                        .clip(RoundedCornerShape(4.dp))
                        .background(Color.Blue)
                        .padding(8.dp)
                        .align(Alignment.CenterVertically)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(text = "20", fontSize = 24.sp)
                        Text(
                            modifier = Modifier
                                .padding(8.dp)
                                .clickable { },
                            text = "+",
                            fontSize = 24.sp,
                            color = Color.Red
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TextWithLeftImage()
                TextWithLeftImage()
                TextWithLeftImage()
            }
        }
    }
}

@Composable
fun TextWithLeftImage() {
    Row(modifier = Modifier.wrapContentWidth(), verticalAlignment = Alignment.CenterVertically) {
        Image(
            modifier = Modifier.size(14.dp),
            painter = painterResource(id = com.soulinc.trackedoff.R.drawable.ic_fire),
            contentDescription = "left_icon"
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = "24")
    }
}