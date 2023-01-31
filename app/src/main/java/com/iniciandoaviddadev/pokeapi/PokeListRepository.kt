package com.iniciandoaviddadev.pokeapi

import kotlinx.coroutines.flow.Flow

class PokeListRepository(private val pokeListRemoteDataSource: PokeListRemoteDataSource) {

    fun pokemonCatcher(name: String): Flow<PokemonResponse?> {
        return pokeListRemoteDataSource.pokemonCatcher(name)
    }

}