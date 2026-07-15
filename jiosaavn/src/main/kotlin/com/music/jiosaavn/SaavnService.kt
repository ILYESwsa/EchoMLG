package com.music.jiosaavn

object SaavnService {
    suspend fun searchSongs(query: String): Result<List<SaavnSong>> = Result.success(emptyList())
    suspend fun getSong(id: String): Result<SaavnSong> = Result.failure(NotImplementedError("saavn stub"))
    suspend fun getBestStreamUrl(songId: String, quality: String): String? = null
}

object SaavnMatcher {
    fun variantPenalty(title: String, candidateName: String): Int = 0
}
