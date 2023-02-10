package com.iniciandoaviddadev.pokeapi.domain.usecase

import com.iniciandoaviddadev.pokeapi.data.repository.PokeListRepository
import com.iniciandoaviddadev.pokeapi.data.response.PokemonResponse
import kotlinx.coroutines.flow.Flow

class PokeListUseCase(private val pokeListRepository: PokeListRepository) {

    suspend fun pokemonCatcher(name: String): PokemonResponse? {
        return pokeListRepository.pokemonCatcher(name)
    }
}