package com.aayushma.aayushmaag.characterlist

import com.aayushma.aayushmaag.datasource.SwCharacter
import com.aayushma.aayushmaag.datasource.SwCharacterDTO

class SwCharacterDtoToDomainMapper {
    fun map(data: SwCharacterDTO) : SwCharacter {
        return SwCharacter(
            name = data.name,
            height = data.height,
            gender = data.gender,
            url = data.url
        )
    }
}
