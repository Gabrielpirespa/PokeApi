package com.iniciandoaviddadev.pokeapi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

class PokeListViewModel(private val pokeListUseCase: PokeListUseCase) : ViewModel() {
    val pokemon = MutableLiveData<PokemonResponse?> (null)
    val vision = MutableLiveData(false)

    fun pokemonPasser(name: String) {
        viewModelScope.launch {
            pokeListUseCase.pokemonCatcher(name)
                .onStart {
                    vision.value = false
                }
                .collect {
                    pokemon.value = it
                    vision.value = true
                }

        }
    }
}