package com.music.jiosaavn

data class SaavnSong(
    val id: String = "",
    val name: String = "",
    val duration: Int? = null,
    val artists: SaavnArtists = SaavnArtists(),
    val explicitContent: Boolean = false,
    val image: List<SaavnImage> = emptyList(),
    val audioUrl: String? = null,
    val artworkUrl: String? = null,
)

data class SaavnArtists(
    val primary: List<SaavnArtist> = emptyList(),
    val featured: List<SaavnArtist> = emptyList(),
)

data class SaavnArtist(
    val id: String = "",
    val name: String = "",
    val role: String = "",
    val image: String? = null,
    val url: String? = null,
)

data class SaavnImage(
    val quality: String = "",
    val url: String = "",
)
