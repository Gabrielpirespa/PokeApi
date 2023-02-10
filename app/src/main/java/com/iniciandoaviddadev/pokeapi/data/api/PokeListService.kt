package com.iniciandoaviddadev.pokeapi.data.api

import com.iniciandoaviddadev.pokeapi.data.response.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeListService {
    @GET("pokemon/{name}")
    suspend fun callPokemons(@Path("name") name: String): PokemonResponse?
}