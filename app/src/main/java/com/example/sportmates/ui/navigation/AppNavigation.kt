package com.example.sportmates.ui.navigation

import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.sportmates.data.local.AppDatabase
import com.example.sportmates.ui.screens.*
import com.example.sportmates.viewmodel.GameViewModel

object Routes {
    const val LOGIN = "login"
    const val UPCOMING_GAMES = "upcoming_games"
    const val ADD_GAME = "add_game"
}
@Composable
fun AppNavigation(navController: NavHostController = rememberNavController()) {
    val context = LocalContext.current
    val db = remember { AppDatabase.getDatabase(context) }
    val gameViewModel = remember {
        GameViewModel(db.gameDao())
    }
    val games by gameViewModel.allGames.observeAsState(emptyList())
    NavHost(navController = navController, startDestination = Routes.LOGIN) {
        composable(Routes.LOGIN) {
            LoginScreen(onLoginClick = {
                navController.navigate(Routes.UPCOMING_GAMES)
            })
        }
        composable(Routes.UPCOMING_GAMES) {
            UpcomingGamesScreen(
                games = games,
                onAddGameClick = { navController.navigate(Routes.ADD_GAME) }
            )
        }
        composable(Routes.ADD_GAME) {
            AddGameScreen(onGameAdded = { game ->
                gameViewModel.insertGame(game)
                navController.popBackStack()
            })
        }
    }
}
