package com.raywenderlich.android.jetnotes.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.raywenderlich.android.jetnotes.data.database.dao.ColorDao
import com.raywenderlich.android.jetnotes.data.database.dao.NoteDao
import com.raywenderlich.android.jetnotes.data.database.model.ColorDbModel
import com.raywenderlich.android.jetnotes.data.database.model.NoteDbModel

/**
 * База данных приложения.
 *
 * Он содержит две таблицы: таблицу заметок и таблицу цветов.
 */
@Database(entities = [NoteDbModel::class, ColorDbModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

  companion object {
    const val DATABASE_NAME = "note-maker-database"
  }

  abstract fun noteDao(): NoteDao

  abstract fun colorDao(): ColorDao
}
