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
fun RegisterScreen(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Register screen", fontSize = 40.sp)
        Spacer(modifier = Modifier.height(60.dp))
        Button(onClick = {
            navController.navigate(Screens.ScreenLoginRoute.rout)
        }) {
            Text(text = "Register(go login)", fontSize = 30.sp)
        }

    }
}
