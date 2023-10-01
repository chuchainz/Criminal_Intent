package com.bignerdranch.android.criminalintent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
import java.util.UUID

//book sucks, idk why it tells me to do this when it doesnt work
@Entity
data class Crime(
    @PrimaryKey val id: UUID,
    val title: String,
    val date: Date,
    val isSolved: Boolean
)

//@Entity
//data class Crime(
//    @PrimaryKey val id: UUID = UUID.randomUUID(),
//    var title: String = "",
//    var date: Date = Date(),
//    var isSolved: Boolean = false
//)
