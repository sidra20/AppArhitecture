package com.sidra.local_data_source

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sidra.core.model.Note

@Database(entities = [Note::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun noteDao():AppDao

    companion object{
        private var instance:AppDatabase?=null


        fun getInstance(context: Context):AppDatabase
        {
            @Volatile
            if(instance==null)
            {


                synchronized(this)
                {


                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "mynotedb"
                    )
                        .build()
                }
            }
            return instance!!
        }

    }
}