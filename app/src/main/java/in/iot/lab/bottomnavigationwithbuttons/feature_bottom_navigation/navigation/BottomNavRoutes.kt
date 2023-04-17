package `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.navigation

import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.navigation.BottomNavRoutes.*

/**
 * This File contains all the Routes inside the Bottom Navigation Bar
 *
 * @property StartRoute This is the Route to the [HomeScreenControl]
 * @property FlavourRoute This is the route to the History Screen
 * @property PickupRoute This is the route to the Profile Screen
 */
sealed class BottomNavRoutes(val route: String) {
    object StartRoute : BottomNavRoutes("start-screen")
    object FlavourRoute : BottomNavRoutes("flavour-screen")
    object PickupRoute : BottomNavRoutes(route = "pickup-screen")
    object SummaryRoute : BottomNavRoutes(route = "summary-screen")
}