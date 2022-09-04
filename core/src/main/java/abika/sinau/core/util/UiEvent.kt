package abika.sinau.core.util


/**
 * @author by Abika Chairul Yusri on 9/4/2022
 */


sealed class UiEvent {
    data class Navigate(val route: String): UiEvent()
    object NavigateUp: UiEvent()
}