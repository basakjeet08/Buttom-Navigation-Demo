package `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import `in`.iot.lab.bottomnavigationwithbuttons.R
import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.navigation.BottomNavOptions.*
import `in`.iot.lab.bottomnavigationwithbuttons.feature_bottom_navigation.navigation.BottomNavOptions.Companion.bottomNavigationOptions

/**
 * This class will contain all the Various Screens related to the bottom Navigation bar
 *
 * @param route It keeps the Route to the Option
 * @param labelOfIcon It keeps the Label of the String
 * @param unselectedIcon It is the ImageVector which we have to show when the option is not selected
 * @param selectedIcon It is the ImageVector which we have to show when the option is selected
 * @param onOptionClicked It is a function which executes when we click this button to navigate
 *
 * @property bottomNavigationOptions This is a list of all the menu Items
 * @property StartOption This is the option which contains the data of the Home Menu Item
 * @property FlavourOption This is the option which contains the data of the History Menu Item
 * @property PickupOption This is the option which contains the data of the Profile Menu Item
 */
sealed class BottomNavOptions(
    val route: String,
    @StringRes val labelOfIcon: Int,
    val unselectedIcon: ImageVector,
    val selectedIcon: ImageVector,
    val onOptionClicked: (NavController) -> Unit
) {

    // This is made companion to let everyone in the App to get to User
    companion object {
        val bottomNavigationOptions = listOf(
            StartOption,
            FlavourOption,
            PickupOption,
            SummaryOption
        )
    }

    // Teacher List Option for Going
    object StartOption : BottomNavOptions(
        route = BottomNavRoutes.StartRoute.route,
        labelOfIcon = R.string.start,
        unselectedIcon = Icons.Outlined.Home,
        selectedIcon = Icons.Filled.Home,
        onOptionClicked = {
            it.navigate(BottomNavRoutes.StartRoute.route) {
                popUpTo(it.graph.startDestinationId)
                launchSingleTop = true
            }
        }
    )

    // Student Review History Option for Going
    object FlavourOption : BottomNavOptions(
        route = BottomNavRoutes.FlavourRoute.route,
        labelOfIcon = R.string.flavour,
        unselectedIcon = Icons.Outlined.Email,
        selectedIcon = Icons.Filled.Email,
        onOptionClicked = {
            it.navigate(BottomNavRoutes.FlavourRoute.route) {
                popUpTo(it.graph.startDestinationId)
                launchSingleTop = true
            }
        }
    )

    // Profile Option to go For
    object PickupOption : BottomNavOptions(
        route = BottomNavRoutes.PickupRoute.route,
        labelOfIcon = R.string.pickup,
        unselectedIcon = Icons.Outlined.Person,
        selectedIcon = Icons.Filled.Person,
        onOptionClicked = {
            it.navigate(BottomNavRoutes.PickupRoute.route) {
                popUpTo(it.graph.startDestinationId)
                launchSingleTop = true
            }
        }
    )

    // Profile Option to go For
    object SummaryOption : BottomNavOptions(
        route = BottomNavRoutes.SummaryRoute.route,
        labelOfIcon = R.string.summary,
        unselectedIcon = Icons.Outlined.Person,
        selectedIcon = Icons.Filled.Person,
        onOptionClicked = {
            it.navigate(BottomNavRoutes.SummaryRoute.route) {
                popUpTo(it.graph.startDestinationId)
                launchSingleTop = true
            }
        }
    )
}
