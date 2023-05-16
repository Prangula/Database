package com.example.roomdatabase1

import android.app.Application

class EmployeeApp: Application() {

    val db by lazy {

        EmployeeDatabase.getInstance(this)
    }

}