package com.example.sportmates.viewmodel

import androidx.lifecycle.*
import androidx.lifecycle.asLiveData
import com.example.sportmates.data.local.dao.GameDao
import com.example.sportmates.data.local.entities.Game
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.*

class GameViewModel(private val gameDao: GameDao) : ViewModel() {

    val allGames: LiveData<List<Game>> = gameDao.getAllGames().asLiveData()
    fun insertGame(game: Game) {
        viewModelScope.launch {
            gameDao.insertGame(game)
        }
    }
    fun updateGame(game: Game) {
        viewModelScope.launch {
            gameDao.updateGame(game)
        }
    }
    fun deleteGame(game: Game) {
        viewModelScope.launch {
            gameDao.deleteGame(game)
        }
    }
}
