package com.commit451.youtubeextractor

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class PlayerResponse(
    @Json(name = "streamingData")
    var streamingData: StreamingData? = null,
    @Json(name = "videoDetails")
    var videoDetails: VideoDetails? = null
) {

    @JsonClass(generateAdapter = true)
    data class StreamingData(
        @Json(name = "hlsManifestUrl")
        var hlsManifestUrl: String? = null,
        @Json(name = "formats")
        var formats: List<Format>? = null,
        @Json(name = "adaptiveFormats")
        var adaptiveFormats: List<Format>? = null
    )

    @JsonClass(generateAdapter = true)
    data class Format(
        @Json(name = "itag")
        var itag: Int? = null,
        @Json(name = "approxDurationMs")
        var approxDurationMs: String? = null,
        @Json(name = "url")
        var url: String? = null,
        @Json(name = "signatureCipher")
        var cipher: String? = null
    )

    @JsonClass(generateAdapter = true)
    data class VideoDetails(
            @Json(name = "title")
            var title: String? = null,
            @Json(name = "author")
            var author: String? = null,
            @Json(name = "shortDescription")
            var description: String? = null
    )
}
