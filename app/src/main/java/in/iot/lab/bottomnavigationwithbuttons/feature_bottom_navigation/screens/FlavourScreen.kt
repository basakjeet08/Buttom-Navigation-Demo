package `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.navigation.BottomNavRoutes

@Composable
fun FlavourScreen(
    navController: NavController
) {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Flavour Screen")

        Button(onClick = {
            navController.navigate(BottomNavRoutes.PickupRoute.route)
        }) {
            Text(text = "Move to Pick Up Screen")
        }
    }
}