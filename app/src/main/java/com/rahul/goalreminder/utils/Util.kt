package com.rahul.goalreminder.utils

import android.text.format.DateFormat
import java.util.*

/**
 * Util class is used whenever we are using same object/instance multiple times
 */
class Util {
    companion object{
        //To get the Current Day, Month and Date
        fun getCurrentDayMonthDate() = DateFormat.format("EEEE, MMMM dd", Date()) as String
    }
}