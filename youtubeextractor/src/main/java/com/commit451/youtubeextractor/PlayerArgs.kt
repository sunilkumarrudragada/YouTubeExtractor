package com.commit451.youtubeextractor

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
internal data class PlayerArgs(
    @Json(name = "player_response")
    var playerResponse: String? = null
)
