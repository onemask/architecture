package android.architecture.mvvm.feature.local

import android.architecture.mvvm.model.Person
import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Query

@Dao
interface PersonDao {
    @Query("SELECT * FROM person")
    fun getPersonSource() : DataSource.Factory<Int,Person>
}