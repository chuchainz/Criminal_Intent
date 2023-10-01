package com.bignerdranch.android.criminalintent

import java.util.Date
import java.util.UUID

//book sucks, idk why it tells me to do this when it doesnt work
//class Crime {
//    val id: UUID,
//    val title: String,
//    val date: Date,
//    val isSolved: Boolean
//}
data class Crime(
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false
)
