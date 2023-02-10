package com.iniciandoaviddadev.pokeapi

import com.iniciandoaviddadev.pokeapi.data.api.PokeListService
import com.iniciandoaviddadev.pokeapi.data.datasource.PokeListRemoteDataSource
import com.iniciandoaviddadev.pokeapi.data.response.PokemonResponse
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class PokeListServiceTest {
    @Test
    fun `should call PokeApi when receive a name`()= runTest {
        //Arrange - Config Geral
        val pokeApi = mockk<PokeListService>()
        val pokeListRemoteDataSource = PokeListRemoteDataSource(pokeApi)
        val name = "Pikachu"

        coEvery {
            pokeApi.callPokemons(name)
        } returns (PokemonResponse())

        //Act
        pokeListRemoteDataSource.pokemonCatcher(name)

        //Assert
        coVerify {
            pokeApi.callPokemons(name)
        }
    } //funciona mas apenas sem o flow
}