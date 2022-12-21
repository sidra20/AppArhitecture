package com.sidra.core.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note")
data class Note(@PrimaryKey(autoGenerate = true)
                   var id:Int=0,

                   @ColumnInfo(name = "name")
                   var name: String,
){

}