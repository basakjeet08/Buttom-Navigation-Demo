package `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.screens.FlavourScreen
import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.screens.StartScreen
import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.screens.PickupScreen
import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.screens.SummaryScreen

/**
 * Navigation Graph : It contains all the Different Routes in the bottom Navigation
 */
@Composable
fun HomeNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = BottomNavRoutes.StartRoute.route,
        builder = {

            // Start Option Screen Route Option
            composable(
                BottomNavRoutes.StartRoute.route,
                content = {
                    StartScreen(navController = navController)
                }
            )

            // Flavour Option Screen Route Option
            composable(
                BottomNavRoutes.FlavourRoute.route,
                content = { FlavourScreen(navController = navController) }
            )

            // Pickup Option Screen Route Option
            composable(
                BottomNavRoutes.PickupRoute.route,
                content = { PickupScreen(navController = navController) }
            )

            // Summary Option Screen Route Option
            composable(
                BottomNavRoutes.SummaryRoute.route,
                content = { SummaryScreen(navController = navController) }
            )
        }
    )
}