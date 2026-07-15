package com.music.shazamkit.models

data class RecognitionResult(
    val trackId: String = "",
    val title: String = "",
    val artist: String = "",
    val album: String = "",
    val coverArtUrl: String? = null,
    val coverArtHqUrl: String? = null,
    val genre: String = "",
    val releaseDate: String = "",
    val label: String = "",
    val shazamUrl: String = "",
    val appleMusicUrl: String = "",
    val spotifyUrl: String = "",
    val isrc: String = "",
    val youtubeVideoId: String = "",
)
