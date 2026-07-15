package com.music.paxsenix

object Paxsenix {
    fun init(context: android.content.Context) {}

    suspend fun getLyrics(title: String, artist: String, duration: Int, album: String?): Result<String> =
        Result.failure(NotImplementedError("paxsenix stub"))

    suspend fun getAllLyrics(title: String, artist: String, duration: Int, album: String?, callback: (String) -> Unit) {
        // No-op stub
    }
}
