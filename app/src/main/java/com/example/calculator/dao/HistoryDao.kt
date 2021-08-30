package com.example.calculator.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.calculator.model.History


@Dao //room에 연결된 Dao

interface HistoryDao {
//History에 저장은 어떻게 할 것이고
//조회는 어떻게 하고
//지우는 것은 어떻게?

    @Query("SELECT * FROM history") //모든 history를 조회
    fun getAll() : List<History>

    @Insert
    fun insertHistory(history: History)

    @Query("DELETE FROM history")
    fun deleteAll()

//    @Delete
//    fun delete(history : History)
//
//    @Query("SELECT * FROM history WHERE result LIKE:result")
//    fun findByResult(result: String) :History //하나만 조회
}

