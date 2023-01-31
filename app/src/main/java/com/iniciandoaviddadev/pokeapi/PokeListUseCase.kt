package com.iniciandoaviddadev.pokeapi

import kotlinx.coroutines.flow.Flow

class PokeListUseCase(private val pokeListRepository: PokeListRepository) {

    fun pokemonCatcher(name: String): Flow<PokemonResponse?> {
        return pokeListRepository.pokemonCatcher(name)
    }
}