package com.aayushma.aayushmaag.datasource

import com.google.gson.annotations.SerializedName

data class CharacterListResponse(
    @SerializedName("count") val count: Int,
    @SerializedName("next") val next: String,
    @SerializedName("previous") val previous: String,
    @SerializedName("results") val results: List<CharacterListItemResponse>,
)

data class CharacterListItemResponse(
    @SerializedName("name") val name: String,
    @SerializedName("height") val height: String,
    @SerializedName("mass") val mass: String,
    @SerializedName("hair_color") val hairColor: String,
    @SerializedName("skin_color") val skinColor: String,
    @SerializedName("eye_color") val eyeColor: String,
    @SerializedName("birth_year") val birthYear: String,
    @SerializedName("gender") val gender: String,
    @SerializedName("url") val url: String
)
