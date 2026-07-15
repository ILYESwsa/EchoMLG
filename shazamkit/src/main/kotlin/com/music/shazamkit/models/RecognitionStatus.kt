package com.music.shazamkit.models

sealed class RecognitionStatus {
    data object Ready : RecognitionStatus()
    data object Listening : RecognitionStatus()
    data object Processing : RecognitionStatus()
    data class Success(val result: RecognitionResult) : RecognitionStatus()
    data class NoMatch(val message: String) : RecognitionStatus()
    data class Error(val message: String) : RecognitionStatus()
}
