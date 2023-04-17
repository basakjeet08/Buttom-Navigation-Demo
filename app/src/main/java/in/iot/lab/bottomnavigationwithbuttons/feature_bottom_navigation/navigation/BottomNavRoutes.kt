package `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.navigation

import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.navigation.BottomNavRoutes.*
import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.screens.*


/**
 * This File contains all the Routes inside the Bottom Navigation Bar
 *
 * @property StartRoute This is the Route to the [StartScreen]
 * @property FlavourRoute This is the route to the [FlavourScreen]
 * @property PickupRoute This is the route to the [PickupScreen]
 * @property SummaryRoute This is the route to the [SummaryScreen]
 */
sealed class BottomNavRoutes(val route: String) {
    object StartRoute : BottomNavRoutes("start-screen")
    object FlavourRoute : BottomNavRoutes("flavour-screen")
    object PickupRoute : BottomNavRoutes(route = "pickup-screen")
    object SummaryRoute : BottomNavRoutes(route = "summary-screen")
}