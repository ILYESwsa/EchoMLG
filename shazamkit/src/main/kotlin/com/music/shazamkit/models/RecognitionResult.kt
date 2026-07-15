package com.music.shazamkit.models
data class RecognitionResult(
    val status: Status,
    val title: String?,
    val artist: String?,
) {
    enum class Status { SUCCESS, ERROR, NO_MATCH }
}
