package android.architecture.mvvm.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "person")
data class Person constructor(
    @PrimaryKey(autoGenerate = true)
    val id : Long,
    val name : String,
    val bith : String
)