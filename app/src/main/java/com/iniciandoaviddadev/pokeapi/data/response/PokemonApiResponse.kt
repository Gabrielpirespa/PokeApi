package com.iniciandoaviddadev.pokeapi.data.response

import com.google.gson.annotations.SerializedName

//Listagem

/*data class PokeApiResponse(
    //val count: Int? = null,
    //val next: String? = null,
    //val previous: String? = null,
    val results: List<PokeResults>? = null
)

data class PokeResults(
    val name: String? = null,
    val url: String? = null
)*/

//Pokemons

data class PokemonResponse(
    val height: Int? = null,
    val id: Int? = null,
    val name: String? = null,
    val sprites: PokeImages? = null,
    val types: List<PokemonTypeSlot>? = null,
    val weight: Int? = null,
)

data class PokeImages(
    val other: PokeSprites? = null
)

data class PokeSprites(
    @SerializedName ("official-artwork") val official_artwork: PokeFronts? = null
)

data class PokeFronts(
    val front_default: String? = null,
    val front_shiny: String? = null
)

data class PokemonTypeSlot(
    val slot: Int? = null,
    val type: PokemonType? = null
)

data class PokemonType(
    val name: String? = null,
    val url: String? = null
)