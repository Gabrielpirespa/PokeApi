package com.iniciandoaviddadev.pokeapi.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iniciandoaviddadev.pokeapi.data.response.PokemonResponse
import com.iniciandoaviddadev.pokeapi.domain.usecase.PokeListUseCase
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

class PokeListViewModel(private val pokeListUseCase: PokeListUseCase) : ViewModel() {
    val pokemon = MutableLiveData<PokemonResponse?>(null)
    val vision = MutableLiveData(false)

    fun pokemonPasser(name: String) {
        viewModelScope.launch {
            vision.value = false
            pokemon.value = pokeListUseCase.pokemonCatcher(name)
            vision.value = true
        }

    }
}