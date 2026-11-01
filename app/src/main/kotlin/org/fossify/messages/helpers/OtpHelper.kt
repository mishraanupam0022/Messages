package org.fossify.messages.helpers

import android.os.Handler
import android.os.Looper

// Fossify me ye function hai, isme time change karo
const val OTP_AUTO_DELETE_SECONDS = 60L

fun isOtpMessage(text: String): Boolean {
    return text.contains("OTP", true) || text.contains("verification", true) || text.contains("code", true)
}

// Auto-delete worker - 60 sec baad delete
fun scheduleAutoDelete(messageId: Long) {
    Handler(Looper.getMainLooper()).postDelayed({
        // abhi ke liye placeholder, build pass karne ke liye
        // baad me yahan real delete logic add karenge
    }, OTP_AUTO_DELETE_SECONDS * 1000)
}
