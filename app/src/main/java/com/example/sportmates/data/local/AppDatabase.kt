package com.example.sportmates.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.sportmates.data.local.dao.GameDao
import com.example.sportmates.data.local.dao.UserDao
import com.example.sportmates.data.local.entities.Game
import com.example.sportmates.data.local.entities.User

@Database(entities = [Game::class, User::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun gameDao(): GameDao
    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "sportmates_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
