package com.aayushma.aayushmaag.datasource

class CharacterRepository(private val service: StarWarsService) {

    private val mapper = CharacterListResponseToDTOMapper()

    suspend fun getCharacters(): List<SwCharacterDTO> {
        return service.getCharacters().results.map(mapper::map)
        //return service.getCharacters().results.map { item -> mapper.map(item) }
    }
}