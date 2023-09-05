package com.ubuntuyouiwe.tekrarders6

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val nameAndSurname : String = "",
    val number : String = ""
): Parcelable
