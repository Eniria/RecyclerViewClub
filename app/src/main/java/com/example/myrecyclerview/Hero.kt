package com.example.myrecyclerview

import android.os.Parcelable
import android.provider.ContactsContract
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero(
    val name: String,
    val description: String,
    val photo: String
) : Parcelable

