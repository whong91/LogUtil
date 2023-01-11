package com.waihong.logutil

import android.util.Log

class LogDebug {
    companion object {
        private val TAG = "SUPER_AWESOME_APP"

        fun d(message: String) {
            Log.d(TAG, message)
        }
    }
}