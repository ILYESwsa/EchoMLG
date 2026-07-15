@Suppress("UnstableApiUsage")
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://maven.aliyun.com/repository/public") }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://maven.aliyun.com/repository/public") }
    }
}
rootProject.name = "EchoMusic"
include(":app")
include(":innertube")
include(":canvas")
include(":applecanvas")
include(":echomusiccanvas")
include(":artistvideo")
include(":betterlyrics")
include(":kugou")

include(":lrclib")
include(":simpmusic")
include(":youlyplus")
include(":shazamkit")
include(":paxsenixlyrics")
include(":jiosaavn")
include(":unison")