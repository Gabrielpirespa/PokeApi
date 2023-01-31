package com.iniciandoaviddadev.pokeapi

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