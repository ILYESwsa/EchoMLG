package com.music.simpmusic

object SimpMusicLyrics {
    suspend fun getLyrics(id: String, duration: Int): Result<String> =
        Result.failure(NotImplementedError("simpmusic stub"))
    suspend fun getAllLyrics(id: String, duration: Int, callback: (String) -> Unit) {
        // No-op stub
    }
}
