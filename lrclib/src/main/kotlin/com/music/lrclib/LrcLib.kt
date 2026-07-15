package com.music.lrclib
object LrcLib {
    suspend fun getLyrics(title: String, artist: String, duration: Long, album: String?): Result<String> = Result.failure(NotImplementedError("lrclib stub"))
    suspend fun getAllLyrics(title: String, artist: String, duration: Long, album: String?, callback: (List<Pair<String, String>>?) -> Unit) { callback(null) }
}
