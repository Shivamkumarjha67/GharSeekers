package com.shivam.gharseekers.Util

import android.content.Context
import android.widget.Toast

object AndroidUtil {
    fun showToast(context: Context?, msg: String?) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}