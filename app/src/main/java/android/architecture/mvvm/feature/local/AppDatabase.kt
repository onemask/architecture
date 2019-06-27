package android.architecture.mvvm.feature.local

import android.architecture.mvvm.model.Person
import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Person::class],version = 1,exportSchema = false)
abstract class AppDatabase : RoomDatabase(){
    abstract fun dao() : PersonDao
}