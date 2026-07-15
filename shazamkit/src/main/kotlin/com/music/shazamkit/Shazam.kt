package com.music.shazamkit
import com.music.shazamkit.models.RecognitionResult
object Shazam {
    fun recognize(audioData: ByteArray): RecognitionResult = RecognitionResult(RecognitionResult.Status.ERROR, null, null)
}
