package com.music.kugou

/**
 * Stub KuGou lyrics provider — the original kugou module was not included in
 * the source archive. This stub returns null/empty so the app builds and runs
 * without KuGou lyrics support. All other lyrics providers still work.
 */
object KuGou {
    var useTraditionalChinese: Boolean = false

    fun getLyrics(
        title: String,
        artist: String,
        duration: Long,
        album: String?,
    ): String? = null

    fun getAllPossibleLyricsOptions(
        title: String,
        artist: String,
        duration: Long,
        album: String?,
        callback: (List<Pair<String, String>>?) -> Unit,
    ) {
        callback(emptyList())
    }
}
