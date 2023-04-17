package `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import `in`.iot.lab.bottomnavigationwithbuttons.R
import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.components.AppBar
import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.components.BottomBar
import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.navigation.BottomNavOptions
import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.navigation.HomeNavGraph
import `in`.iot.lab.bottomnavigationwithbuttons.ui.theme.BottomNavigationWithButtonsTheme

class HomeActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationWithButtonsTheme {
                // Setting the navHost controller for this Class which takes care of the rest
                // of the navigation
                val navController = rememberNavController()

                Scaffold(
                    topBar = {
                        AppBar(
                            topBarTitle = R.string.app_name,
//                            icon = Icons.Default.ArrowBack,
                            contentDescription = R.string.back
                        )
                    },
                    bottomBar = {
                        BottomBar(
                            navController = navController,
                            bottomMenu = BottomNavOptions.bottomNavigationOptions
                        )
                    },
                ) {
                    Surface(
                        modifier = Modifier
                            .padding(it)
                            .fillMaxSize(),
                    ) {
                        // Calling the function which haves the navigation graph and route details
                        HomeNavGraph(navController = navController)
                    }
                }
            }
        }
    }
}