package org.d3if0066.hitungbmi.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

class BmiDao {
    @Dao
    interface BmiDao {

        @Insert
        fun insert(bmi: BmiEntity)

        @Query("SELECT * FROM bmi ORDER BY id DESC LIMIT 1")
        fun getLastBmi(): LiveData<BmiEntity?>
    }
}