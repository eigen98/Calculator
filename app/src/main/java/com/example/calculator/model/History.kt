package com.example.calculator.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//DB 테이블 생성
@Entity //gradle에서 room 라이브러리 추가
data class History ( //이 클래스 자체를 테이블로 이용

    @PrimaryKey val uid : Int?,
    @ColumnInfo(name = "expression") val expression : String?,
    @ColumnInfo(name = "result") val result : String?
    )