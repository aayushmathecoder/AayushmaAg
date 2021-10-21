package com.aayushma.aayushmaag.characterlist

import com.aayushma.aayushmaag.datasource.CharacterRepository
import com.aayushma.aayushmaag.datasource.StarWarsService
import com.aayushma.aayushmaag.datasource.SwCharacter
import retrofit2.Retrofit

class CharacterListUseCase(retrofit: Retrofit) {
    private val repository = CharacterRepository(retrofit.create(StarWarsService::class.java))
    private val mapper = SwCharacterDtoToDomainMapper()

    suspend fun getSwCharacter(): List<SwCharacter> {
        return repository.getCharacters().map(mapper::map)
    }
}
