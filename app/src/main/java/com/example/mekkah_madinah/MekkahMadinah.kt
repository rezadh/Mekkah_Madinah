package com.example.mekkah_madinah

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MekkahMadinah (
    var name: String = "",
    var lokasi: String = "",
    var detail: String = "",
    var photo: Int = 0
): Parcelable
