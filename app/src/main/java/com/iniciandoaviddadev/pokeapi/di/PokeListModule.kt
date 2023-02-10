package com.iniciandoaviddadev.pokeapi

import com.iniciandoaviddadev.pokeapi.data.datasource.PokeListRemoteDataSource
import com.iniciandoaviddadev.pokeapi.data.repository.PokeListRepository
import com.iniciandoaviddadev.pokeapi.data.api.PokeListService
import com.iniciandoaviddadev.pokeapi.domain.usecase.PokeListUseCase
import com.iniciandoaviddadev.pokeapi.presentation.viewmodel.PokeListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val pokeListModule = module {

    factory {
        PokeListRemoteDataSource(get<Retrofit>().create(PokeListService::class.java))
    }

    viewModel {
        PokeListViewModel(
            PokeListUseCase(
                PokeListRepository(get())
            )
        )
    }
}