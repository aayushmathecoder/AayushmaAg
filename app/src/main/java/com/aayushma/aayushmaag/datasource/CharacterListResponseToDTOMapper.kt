package com.aayushma.aayushmaag.datasource

class CharacterListResponseToDTOMapper {

    fun map(response: CharacterListItemResponse) : SwCharacterDTO {
        return SwCharacterDTO(
            name = response.name,
            height = response.height,
            gender = response.gender,
            url = response.url
        )
    }
}
