package com.music.kugou

object KuGou {
    var useTraditionalChinese: Boolean = false

    fun getLyrics(
        title: String,
        artist: String,
        duration: Int,
        album: String?,
    ): Result<String> = Result.failure(NotImplementedError("kugou stub"))

    fun getAllPossibleLyricsOptions(
        title: String,
        artist: String,
        duration: Int,
        album: String?,
        callback: (String) -> Unit,
    ) {
        // No-op stub
    }
}
