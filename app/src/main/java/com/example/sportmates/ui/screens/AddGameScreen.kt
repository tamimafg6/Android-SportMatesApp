package com.example.sportmates.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.*
import com.example.sportmates.data.local.entities.Game

@Composable
fun AddGameScreen(onGameAdded: (Game) -> Unit) {
    var date by remember { mutableStateOf("") }
    var time by remember { mutableStateOf("") }
    var location by remember { mutableStateOf("") }
    var opponent by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(15.dp)) {

        Text("Add New Game", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = date,
            onValueChange = { date = it },
            label = { Text("Game's Date") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = time,
            onValueChange = { time = it },
            label = { Text("Game's Time") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = location,
            onValueChange = { location = it },
            label = { Text("Game's Location") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = opponent,
            onValueChange = { opponent = it },
            label = { Text("Opponent") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                val newGame = Game(
                    date = date,
                    time = time,
                    location = location,
                    opponent = opponent,
                    playerRoster = "",
                    playerAvailability = ""
                )
                onGameAdded(newGame)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Save Game to System")
        }
    }
}
