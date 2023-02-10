package com.iniciandoaviddadev.pokeapi.data.datasource

import com.iniciandoaviddadev.pokeapi.data.response.PokemonResponse
import com.iniciandoaviddadev.pokeapi.data.api.PokeListService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PokeListRemoteDataSource(private val pokeListService: PokeListService) {

    suspend fun pokemonCatcher(name: String): PokemonResponse? {
        return pokeListService.callPokemons(name)
    }
}