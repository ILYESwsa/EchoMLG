package com.music.jiosaavn
data class SaavnSong(
    val id: String = "",
    val title: String = "",
    val artist: String = "",
    val album: String = "",
    val duration: Long = 0L,
    val audioUrl: String? = null,
    val artworkUrl: String? = null,
)
