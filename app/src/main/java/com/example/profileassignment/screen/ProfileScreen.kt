package com.example.profileassignment.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profileassignment.R

@Composable
fun ProfileScreen(){
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = Color.Black,
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .windowInsetsPadding(WindowInsets.systemBars)
                    .background(Color.Transparent)
                    .height(50.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    painter = painterResource(R.drawable.left_arrow),
                    contentDescription = null,
                    tint = Color.White
                )
                Spacer(modifier = Modifier.weight(0.1f))
                Text(
                    text = "Profile",
                    color = Color.White,
                )
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = {},
                    modifier = Modifier.widthIn(max = 130.dp).height(35.dp),
                    border = BorderStroke(1.dp,Color.White.copy(alpha = 0.5f)),
                    colors = ButtonDefaults.buttonColors(Color.Transparent)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Icon(
                            painter = painterResource(R.drawable.comment),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = "support",
                            color = Color.White.copy(alpha = 0.5f)
                        )
                    }
                }
            }
        }
    ) { _ ->
        Box(
            modifier = Modifier.fillMaxSize()
        ){
            Column {
                Column (
                    modifier = Modifier
                        .clip(RoundedCornerShape(10))
                        .background(Color(0xff3b3c3c).copy(alpha = 0.4f))
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .windowInsetsPadding(WindowInsets.statusBars)
                            .padding(top = 80.dp)
                            .padding(horizontal = 20.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                modifier = Modifier.size(60.dp).clip(CircleShape),
                                painter = painterResource(R.drawable.default_user),
                                contentDescription = null
                            )
                            Spacer(modifier = Modifier.weight(0.2f))
                            Column {
                                Text(
                                    "XYZ",
                                    color = Color.White
                                )
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    "member since Dec, 2020",
                                    color = Color.White.copy(alpha = 0.5f)
                                )
                            }
                            Spacer(modifier = Modifier.weight(1f))
                            OutlinedIconButton(
                                onClick = {},
                                modifier = Modifier.size(30.dp),
                                border = BorderStroke(1.dp, Color.White.copy(alpha = 0.5f))
                            ) {
                                Icon(
                                    painter = painterResource(R.drawable.edit),
                                    contentDescription = null,
                                    modifier = Modifier.size(20.dp),
                                    tint = Color.White
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(80.dp)
                                .border(
                                    1.dp,
                                    Color.White.copy(alpha = 0.5f),
                                    RoundedCornerShape(25)
                                )
                                .clip(RoundedCornerShape(25))
                                .background(Color.Black.copy(alpha = 0.7f))
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                OutlinedIconButton(
                                    onClick = {},
                                    modifier = Modifier.size(30.dp),
                                    border = BorderStroke(1.dp, Color.White)
                                ) {
                                    Icon(
                                        painter = painterResource(R.drawable.car),
                                        contentDescription = null,
                                        tint = Color.White,
                                        modifier = Modifier.size(20.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.width(20.dp))
                                Column(
                                    modifier = Modifier.fillMaxWidth().padding(vertical = 20.dp),
                                ) {
                                    Text(
                                        "get to know your vehicles, Inside out",
                                        color = Color.White.copy(alpha = 0.75f),
                                        fontSize = 12.sp
                                    )
                                    Spacer(modifier = Modifier.weight(1f))
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Text(
                                            "CRED garage",
                                            color = Color.White,
                                            fontSize = 13.sp
                                        )
                                        Spacer(modifier = Modifier.width(20.dp))
                                        Icon(
                                            painter = painterResource(R.drawable.right_arrow),
                                            contentDescription = null,
                                            tint = Color.White,
                                            modifier = Modifier.size(30.dp)
                                        )
                                    }
                                }
                            }
                        }
                        Spacer(modifier = Modifier.height(40.dp))

                        Column {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Spacer(Modifier.weight(0.1f))
                                OutlinedIconButton(
                                    onClick = {},
                                    modifier = Modifier.size(25.dp),
                                    border = BorderStroke(1.dp, Color.Gray)
                                ) {
                                    Icon(
                                        painter = painterResource(R.drawable.speedometer),
                                        contentDescription = null,
                                        tint = Color.White,
                                        modifier = Modifier.size(15.dp)
                                    )
                                }
                                Spacer(Modifier.weight(0.15f))
                                Text(
                                    "credit score",
                                    fontSize = 13.sp,
                                    color = Color.White.copy(alpha = 0.75f)
                                )
                                Spacer(Modifier.weight(0.08f))
                                Text(
                                    "\u2022", //Unicode for bullet point
                                    fontSize = 13.sp,
                                    color = Color(0xff39b574)
                                )
                                Spacer(Modifier.weight(0.08f))
                                Text(
                                    "REFRESH AVAILABLE",
                                    fontSize = 13.sp,
                                    color = Color(0xff39b574)
                                )
                                Spacer(Modifier.weight(1f))
                                Text(
                                    "757",
                                    fontSize = 14.sp,
                                    color = Color.White
                                )
                                Spacer(Modifier.weight(0.35f))
                                Icon(
                                    painter = painterResource(R.drawable.right_arrow),
                                    contentDescription = null,
                                    modifier = Modifier.size(25.dp),
                                    tint = Color.White.copy(alpha = 0.75f)
                                )
                            }
                            HorizontalDivider(
                                modifier = Modifier.padding(vertical = 15.dp),
                                thickness = 1.dp,
                                color = Color.Gray
                            )
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Spacer(Modifier.weight(0.03f))
                                OutlinedIconButton(
                                    onClick = {},
                                    modifier = Modifier.size(25.dp),
                                    border = BorderStroke(1.dp, Color.Gray)
                                ) {
                                    Icon(
                                        painter = painterResource(R.drawable.rupee),
                                        contentDescription = null,
                                        tint = Color.White.copy(alpha = 0.7f),
                                        modifier = Modifier.size(10.dp)
                                    )
                                }
                                Spacer(Modifier.weight(0.03f))
                                Text(
                                    "lifetime cashback",
                                    fontSize = 13.sp,
                                    color = Color.White.copy(alpha = 0.75f)
                                )
                                Spacer(Modifier.weight(1f))
                                Text(
                                    "₹3",
                                    fontSize = 14.sp,
                                    color = Color.White
                                )
                                Spacer(Modifier.weight(0.08f))
                                Icon(
                                    painter = painterResource(R.drawable.right_arrow),
                                    contentDescription = null,
                                    modifier = Modifier.size(25.dp),
                                    tint = Color.White.copy(alpha = 0.75f)
                                )

                            }
                            HorizontalDivider(
                                modifier = Modifier.padding(vertical = 15.dp),
                                thickness = 1.dp,
                                color = Color.Gray
                            )
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Spacer(Modifier.weight(0.03f))
                                OutlinedIconButton(
                                    onClick = {},
                                    modifier = Modifier.size(25.dp),
                                    border = BorderStroke(1.dp, Color.Gray)
                                ) {
                                    Icon(
                                        painter = painterResource(R.drawable.bhim_upi),
                                        contentDescription = null,
                                        tint = Color.White.copy(alpha = 0.7f),
                                        modifier = Modifier.size(15.dp)
                                    )
                                }
                                Spacer(Modifier.weight(0.03f))
                                Text(
                                    "bank balance",
                                    fontSize = 13.sp,
                                    color = Color.White.copy(alpha = 0.75f)
                                )
                                Spacer(Modifier.weight(1f))
                                Text(
                                    "check",
                                    fontSize = 14.sp,
                                    color = Color.White
                                )
                                Spacer(Modifier.weight(0.07f))
                                Icon(
                                    painter = painterResource(R.drawable.right_arrow),
                                    contentDescription = null,
                                    modifier = Modifier.size(25.dp),
                                    tint = Color.White.copy(alpha = 0.75f)
                                )
                            }
                        }
                        Spacer(Modifier.height(20.dp))
                    }
                }

                Spacer(Modifier.height(20.dp))

                Column(
                    modifier = Modifier.padding(start = 30.dp, end = 15.dp)
                ) {
                    Text(
                        "YOUR REWARDS & BENEFITS",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                    Spacer(Modifier.height(30.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "cashback balance",
                            fontSize = 12.sp,
                            color = Color.White
                        )
                        Spacer(Modifier.weight(1f))
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = null,
                            tint = Color.Gray,
                            modifier = Modifier.size(21.dp)
                        )
                    }
                    Text(
                        "₹0",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 15.dp),
                        thickness = 1.dp,
                        color = Color.Gray
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "coins",
                            fontSize = 12.sp,
                            color = Color.White
                        )
                        Spacer(Modifier.weight(1f))
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = null,
                            tint = Color.Gray,
                            modifier = Modifier.size(21.dp)
                        )
                    }
                    Text(
                        "26,46,583",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    HorizontalDivider(
                        modifier = Modifier.padding(vertical = 15.dp),
                        thickness = 1.dp,
                        color = Color.Gray
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "win upto Rs 1000",
                            fontSize = 12.sp,
                            color = Color.White
                        )
                        Spacer(Modifier.weight(1f))
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = null,
                            tint = Color.Gray,
                            modifier = Modifier.size(21.dp)
                        )
                    }
                    Text(
                        "refer and earn",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                    Spacer(Modifier.height(40.dp))
                    Text(
                        "TRANSACTIONS AND SUPPORT",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                    Spacer(Modifier.height(20.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "all transactions",
                            fontSize = 12.sp,
                            color = Color.White
                        )
                        Spacer(Modifier.weight(1f))
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = null,
                            tint = Color.Gray,
                            modifier = Modifier.size(21.dp)
                        )
                    }
                }

            }

        }
    }
}