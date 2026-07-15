package com.music.jiosaavn
object SaavnService {
    suspend fun searchSongs(query: String): Result<List<SaavnSong>> = Result.success(emptyList())
    suspend fun getSong(id: String): Result<SaavnSong> = Result.failure(NotImplementedError("saavn stub"))
}
