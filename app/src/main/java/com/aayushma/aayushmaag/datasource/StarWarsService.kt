package com.aayushma.aayushmaag.datasource

import retrofit2.http.GET
import retrofit2.http.Path

interface StarWarsService {

    @GET("people")
     suspend fun getCharacters(): CharacterListResponse

     @GET("people/{people_id}")
     suspend fun getCharacterDetail(
         @Path("people_id") peopleId: String
     ) : CharacterListItemResponse
}