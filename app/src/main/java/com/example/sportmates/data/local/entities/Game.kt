package com.example.sportmates.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "games")
data class Game(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val date: String,
    val time: String,
    val location: String,
    val opponent: String,
    val playerRoster: String,
    val playerAvailability: String
)
