package com.music.shazamkit

import com.music.shazamkit.models.RecognitionResult

object Shazam {
    fun recognize(signature: ByteArray, sampleDurationMs: Long): Result<RecognitionResult> =
        Result.failure(NotImplementedError("shazamkit stub"))
}
