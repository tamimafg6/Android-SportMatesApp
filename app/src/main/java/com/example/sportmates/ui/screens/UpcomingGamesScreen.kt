package com.example.sportmates.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.sportmates.data.local.entities.Game

@Composable
fun UpcomingGamesScreen(
    games: List<Game>,
    onAddGameClick: () -> Unit
) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = onAddGameClick) {
                Icon(Icons.Default.Add, contentDescription = "Add Game")
            }
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(15.dp)
        ) {
            Text("Upcoming Games", style = MaterialTheme.typography.headlineSmall)
            LazyColumn {
                items(games) { game ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 6.dp),
                        elevation = CardDefaults.cardElevation(6.dp)
                    ) {
                        Column(modifier = Modifier.padding(15.dp)) {
                            Text("Game's Date: ${game.date}")
                            Text("Game's Time: ${game.time}")
                            Text("Game's Location: ${game.location}")
                            Text("Opponent: ${game.opponent}")
                        }
                    }
                }
            }
        }
    }
}
