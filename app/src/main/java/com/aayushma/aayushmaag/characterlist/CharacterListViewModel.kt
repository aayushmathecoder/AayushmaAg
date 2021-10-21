package com.aayushma.aayushmaag.characterlist

import com.aayushma.aayushmaag.datasource.SwCharacter

class CharacterListViewModel(
    private val characterListUseCase: CharacterListUseCase
) {

    suspend fun getCharacters(): List<SwCharacter> {
        return characterListUseCase.getSwCharacter()
    }
}
