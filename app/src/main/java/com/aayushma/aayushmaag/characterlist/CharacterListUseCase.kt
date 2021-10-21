package com.aayushma.aayushmaag.characterlist

import com.aayushma.aayushmaag.datasource.CharacterRepository
import com.aayushma.aayushmaag.datasource.SwCharacter

class CharacterListUseCase {
    private val repository = CharacterRepository()

    suspend fun getSwCharacter(): List<SwCharacter> {
        return repository.getCharacters()
    }
}
