package com.music.simpmusic

object SimpMusicLyrics {
    suspend fun getLyrics(id: String, duration: Long): Result<String> =
        Result.failure(NotImplementedError("simpmusic stub"))
    suspend fun getAllLyrics(id: String, duration: Long, callback: (String) -> Unit) {
        // No-op stub
    }
}
