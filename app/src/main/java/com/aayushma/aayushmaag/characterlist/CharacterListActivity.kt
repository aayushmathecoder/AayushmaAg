package com.aayushma.aayushmaag.characterlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.aayushma.aayushmaag.R
import com.aayushma.aayushmaag.StarWarsApp
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CharacterListActivity : AppCompatActivity() {

    private val viewModel: CharacterListViewModel by lazy {
        CharacterListViewModel((application as StarWarsApp).listUseCase)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_list)
        GlobalScope.launch {
            val characters = viewModel.getCharacters()
        }
    }
}
