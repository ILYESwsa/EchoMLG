package com.music.paxsenix

object Paxsenix {
    suspend fun getLyrics(id: String, duration: Long): Result<String> =
        Result.failure(NotImplementedError("paxsenix stub"))
    suspend fun getAllLyrics(id: String, duration: Long, callback: (String) -> Unit) {
        // No-op stub
    }
}
