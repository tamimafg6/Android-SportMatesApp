package com.example.sportmates.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sportmates.data.local.dao.UserDao
import com.example.sportmates.data.local.entities.User
import kotlinx.coroutines.launch

class UserViewModel(private val userDao: UserDao) : ViewModel() {
    fun insertUser(user: User) {
        viewModelScope.launch {
            userDao.insertUser(user)
        }
    }
    suspend fun getUserByEmail(email: String): User? {
        return userDao.getUserByEmail(email)
    }
}
