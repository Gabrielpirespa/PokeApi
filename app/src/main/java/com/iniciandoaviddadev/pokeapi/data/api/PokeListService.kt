package com.iniciandoaviddadev.pokeapi

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeListService {
    @GET("pokemon/{name}")
    suspend fun callPokemons(@Path("name") name: String): PokemonResponse?
}