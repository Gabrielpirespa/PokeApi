package com.iniciandoaviddadev.pokeapi.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.iniciandoaviddadev.pokeapi.R
import com.iniciandoaviddadev.pokeapi.databinding.ActivityPokeListBinding
import com.iniciandoaviddadev.pokeapi.presentation.viewmodel.PokeListViewModel
import com.squareup.picasso.Picasso
import org.koin.androidx.viewmodel.ext.android.viewModel

class PokeListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        val binding = ActivityPokeListBinding.inflate(layoutInflater)
        val viewModel: PokeListViewModel by viewModel()

        binding.imageSearch.setOnClickListener {
            val name = binding.editSearch.text.toString().lowercase()
            viewModel.pokemonPasser(name)
        }

        viewModel.pokemon.observe(this) {
            it?.let {
                binding.textName.text = it.name.toString().replaceFirstChar { it.uppercase() }
                binding.textNumber.text = "N° ${it.id.toString()}"

                Picasso.get()
                    .load(it.sprites?.other?.official_artwork?.front_default)
                    .into(binding.imagePokemon)



                if (it.types?.size == 1) {
                    binding.textType1.text =
                        it.types?.get(0)?.type?.name.toString().replaceFirstChar { it.uppercase() }
                    binding.cardType2.visibility = View.GONE

                    //Muda cor do tipo 1

                    when {
                        it.types?.get(0)?.type?.name.toString() == "bug" -> {
                            binding.textType1.setBackgroundColor(ContextCompat.getColor(this,
                                R.color.bug
                            ))
                        }
                        it.types?.get(0)?.type?.name.toString() == "dark" -> {
                            binding.textType1.setBackgroundColor(ContextCompat.getColor(this,
                                R.color.dark
                            ))
                        }
                        it.types?.get(0)?.type?.name.toString() == "dragon" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.dragon
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "electric" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.electric
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "fairy" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.fairy
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "fighting" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.fighting
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "fire" -> {
                            binding.textType1.setBackgroundColor(ContextCompat.getColor(this,
                                R.color.fire
                            ))
                        }
                        it.types?.get(0)?.type?.name.toString() == "flying" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.flying
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "ghost" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.ghost
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "grass" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.grass
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "ground" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.grass
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "ice" -> {
                            binding.textType1.setBackgroundColor(ContextCompat.getColor(this,
                                R.color.ice
                            ))
                        }
                        it.types?.get(0)?.type?.name.toString() == "normal" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.normal
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "poison" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.poison
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "psychic" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.psychic
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "rock" -> {
                            binding.textType1.setBackgroundColor(ContextCompat.getColor(this,
                                R.color.rock
                            ))
                        }
                        it.types?.get(0)?.type?.name.toString() == "steel" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.steel
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "water" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.water
                                )
                            )
                        }
                    }

                } else {
                    binding.cardType2.visibility = View.VISIBLE
                    binding.textType1.text =
                        it.types?.get(0)?.type?.name.toString().replaceFirstChar { it.uppercase() }
                    binding.textType2.text =
                        it.types?.get(1)?.type?.name.toString().replaceFirstChar { it.uppercase() }

                    //Muda cor do tipo 1

                    when {
                        it.types?.get(0)?.type?.name.toString() == "bug" -> {
                            binding.textType1.setBackgroundColor(ContextCompat.getColor(this,
                                R.color.bug
                            ))
                        }
                        it.types?.get(0)?.type?.name.toString() == "dark" -> {
                            binding.textType1.setBackgroundColor(ContextCompat.getColor(this,
                                R.color.dark
                            ))
                        }
                        it.types?.get(0)?.type?.name.toString() == "dragon" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.dragon
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "electric" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.electric
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "fairy" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.fairy
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "fighting" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.fighting
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "fire" -> {
                            binding.textType1.setBackgroundColor(ContextCompat.getColor(this,
                                R.color.fire
                            ))
                        }
                        it.types?.get(0)?.type?.name.toString() == "flying" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.flying
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "ghost" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.ghost
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "grass" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.grass
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "ground" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.grass
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "ice" -> {
                            binding.textType1.setBackgroundColor(ContextCompat.getColor(this,
                                R.color.ice
                            ))
                        }
                        it.types?.get(0)?.type?.name.toString() == "normal" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.normal
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "poison" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.poison
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "psychic" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.psychic
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "rock" -> {
                            binding.textType1.setBackgroundColor(ContextCompat.getColor(this,
                                R.color.rock
                            ))
                        }
                        it.types?.get(0)?.type?.name.toString() == "steel" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.steel
                                )
                            )
                        }
                        it.types?.get(0)?.type?.name.toString() == "water" -> {
                            binding.textType1.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.water
                                )
                            )
                        }
                    }

                    //Muda a cor do tipo 2

                    when {
                        it.types?.get(1)?.type?.name.toString() == "bug" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.bug
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "dark" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.dark
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "dragon" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.dragon
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "electric" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.electric
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "fairy" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.fairy
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "fighting" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.fighting
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "fire" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.fire
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "flying" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.flying
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "ghost" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.ghost
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "grass" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.grass
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "ground" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.ground
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "ice" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.ice
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "normal" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.normal
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "poison" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.poison
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "psychic" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.psychic
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "rock" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.rock
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "steel" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.steel
                                )
                            )
                        }
                        it.types?.get(1)?.type?.name.toString() == "water" -> {
                            binding.textType2.setBackgroundColor(
                                ContextCompat.getColor(
                                    this,
                                    R.color.water
                                )
                            )
                        }
                    }
                }
            }
        }

        viewModel.vision.observe(this) {
            binding.cardPokemon.isVisible = it
        }

        setContentView(binding.root)
    }
}