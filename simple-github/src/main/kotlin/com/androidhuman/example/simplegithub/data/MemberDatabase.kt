package com.androidhuman.example.simplegithub.data

import android.arch.persistence.room.Database
import android.location.Address

@Database(entities = arrayOf(User::class, Address::class))