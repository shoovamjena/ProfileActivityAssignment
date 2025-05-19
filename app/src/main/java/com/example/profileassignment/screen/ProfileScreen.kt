package com.example.profileassignment.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
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
                    .windowInsetsPadding(WindowInsets.statusBars)
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
    ) {
    }
}