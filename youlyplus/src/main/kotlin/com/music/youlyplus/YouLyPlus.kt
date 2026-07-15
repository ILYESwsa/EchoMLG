package com.music.youlyplus
object YouLyPlus {
    suspend fun getLyrics(title: String, artist: String, duration: Long, album: String?, id: String): Result<String> = Result.failure(NotImplementedError("youlyplus stub"))
    suspend fun getAllLyrics(title: String, artist: String, duration: Long, album: String?, id: String, callback: (List<Pair<String, String>>?) -> Unit) { callback(null) }
}
