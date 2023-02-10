package com.iniciandoaviddadev.pokeapi.data.repository

import com.iniciandoaviddadev.pokeapi.data.response.PokemonResponse
import com.iniciandoaviddadev.pokeapi.data.datasource.PokeListRemoteDataSource
import kotlinx.coroutines.flow.Flow

class PokeListRepository(private val pokeListRemoteDataSource: PokeListRemoteDataSource) {

    suspend fun pokemonCatcher(name: String): PokemonResponse? {
        return pokeListRemoteDataSource.pokemonCatcher(name)
    }

}