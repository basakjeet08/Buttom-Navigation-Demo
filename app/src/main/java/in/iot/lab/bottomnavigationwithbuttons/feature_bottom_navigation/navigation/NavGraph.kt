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

            // Teacher List Bottom Navigation Option
            composable(
                BottomNavRoutes.StartRoute.route,
                content = {
                    StartScreen(navController = navController)
                }
            )

            // History Bottom Navigation Option
            composable(
                BottomNavRoutes.FlavourRoute.route,
                content = { FlavourScreen(navController = navController) }
            )

            // Profile Bottom Navigation Options
            composable(
                BottomNavRoutes.PickupRoute.route,
                content = { PickupScreen(navController = navController) }
            )

            composable(
                BottomNavRoutes.SummaryRoute.route,
                content = { SummaryScreen(navController = navController) }
            )
        }
    )
}