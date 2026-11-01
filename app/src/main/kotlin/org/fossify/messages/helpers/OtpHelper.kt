// Fossify me ye function hai, isme time change karo
const val OTP_AUTO_DELETE_SECONDS = 60L

fun isOtpMessage(text: String): Boolean {
    return text.contains("OTP", true) || text.contains("verification", true)
}

// Auto-delete worker
fun scheduleAutoDelete(messageId: Long) {
    Handler(Looper.getMainLooper()).postDelayed({
        deleteMessage(messageId) // 60 sec baad delete
    }, OTP_AUTO_DELETE_SECONDS * 1000)
}
