package abika.sinau.mycalorietracker

import abika.sinau.core.navigation.Route
import abika.sinau.mycalorietracker.navigation.navigate
import abika.sinau.mycalorietracker.ui.theme.MyCalorieTrackerTheme
import abika.sinau.onboarding_presentation.activity.ActivityScreen
import abika.sinau.onboarding_presentation.age.AgeScreen
import abika.sinau.onboarding_presentation.gender.GenderScreen
import abika.sinau.onboarding_presentation.goal.GoalScreen
import abika.sinau.onboarding_presentation.height.HeightScreen
import abika.sinau.onboarding_presentation.nutrient_goal.NutrientGoalScreen
import abika.sinau.onboarding_presentation.weight.WeightScreen
import abika.sinau.onboarding_presentation.welcome.WelcomeScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.rememberScaffoldState
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCalorieTrackerTheme {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()

                NavHost(navController = navController, startDestination = Route.WELCOME) {
                    composable(Route.WELCOME) {
                        WelcomeScreen(onNavigate = navController::navigate)
                    }
                    composable(Route.AGE) {
                        AgeScreen(
                            scaffoldState = scaffoldState,
                            onNavigate = navController::navigate
                        )
                    }
                    composable(Route.GENDER) {
                        GenderScreen(onNavigate = navController::navigate)
                    }
                    composable(Route.HEIGHT) {
                        HeightScreen(
                            scaffoldState = scaffoldState,
                            onNavigate = navController::navigate
                        )
                    }
                    composable(Route.WEIGHT) {
                        WeightScreen(
                            scaffoldState = scaffoldState,
                            onNavigate = navController::navigate
                        )
                    }
                    composable(Route.NUTRIENT_GOAL) {
                        NutrientGoalScreen(
                            scaffoldState = scaffoldState,
                            onNavigate = navController::navigate
                        )
                    }
                    composable(Route.ACTIVITY) {
                        ActivityScreen(onNavigate = navController::navigate)
                    }
                    composable(Route.GOAL) {
                        GoalScreen(onNavigate = navController::navigate)
                    }
                    composable(Route.TRACKER_OVERVIEW) {

                    }
                    composable(Route.SEARCH) {

                    }
                }
            }
        }
    }
}