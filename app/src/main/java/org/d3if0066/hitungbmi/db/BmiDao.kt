package org.d3if0066.hitungbmi.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import org.d3if0066.hitungbmi.db.BmiDao
@Dao
interface BmiDao {
    @Insert
    fun insert(bmi: BmiEntity)
    @Query("SELECT * FROM bmi ORDER BY id DESC")
    fun getLastBmi(): LiveData<List<BmiEntity>>
    @Query("DELETE FROM bmi")
    fun clearData()
}
