package com.iniciandoaviddadev.pokeapi

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PokeListRemoteDataSource (private val pokeListService: PokeListService) {

    fun pokemonCatcher(name: String): Flow<PokemonResponse?> {
        return flow {
            emit(pokeListService.callPokemons(name))
        }
    }
}