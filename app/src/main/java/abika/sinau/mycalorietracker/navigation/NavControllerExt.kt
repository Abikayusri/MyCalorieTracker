package abika.sinau.mycalorietracker.navigation

import abika.sinau.core.util.UiEvent
import androidx.navigation.NavController


/**
 * @author by Abika Chairul Yusri on 9/4/2022
 */

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}