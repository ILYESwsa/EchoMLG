package com.music.echo.unison

object Unison {
    suspend fun getLyrics(
        videoId: String,
        title: String,
        artist: String,
        album: String?,
        durationSeconds: Int,
    ): Result<String> = Result.failure(NotImplementedError("unison stub"))

    suspend fun getAllLyrics(
        videoId: String,
        title: String,
        artist: String,
        album: String?,
        durationSeconds: Int,
        callback: (String) -> Unit,
    ) {
        // No-op stub
    }
}
