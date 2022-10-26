package com.example.kotlin2_3

import android.content.Context
import android.widget.Toast

//fun activity.showToast(message: String) {
fun Context.showToast(
    message: String,
    duration: Int = Toast.LENGTH_SHORT // Short as default
) { // Context is the super class of Activity()
    Toast.makeText(this, message, duration).show()
}