package com.compose.myapplication.presentation.view
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.compose.myapplication.navigation.route.Screens

@Composable
fun HomeScreen(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home Screen", fontSize = 40.sp)
        Spacer(modifier = Modifier.height(60.dp))
        Button(onClick = {
            navController.navigate(Screens.ScreenARoute.rout)
        }) {
            Text(text = "Go to A)", fontSize = 30.sp)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            navController.navigate(Screens.ScreenBRoute.rout)
        }) {
            Text(text = "Go to B", fontSize = 30.sp)
        }
    }
}