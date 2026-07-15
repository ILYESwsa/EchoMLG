package com.music.echo.unison
object Unison {
    suspend fun getLyrics(title: String, artist: String, duration: Long, album: String?): Result<String> = Result.failure(NotImplementedError("unison stub"))
    suspend fun getAllLyrics(title: String, artist: String, duration: Long, album: String?, callback: (List<Pair<String, String>>?) -> Unit) { callback(null) }
}
