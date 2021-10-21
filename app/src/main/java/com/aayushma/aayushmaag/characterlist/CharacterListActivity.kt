package com.aayushma.aayushmaag.characterlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aayushma.aayushmaag.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class CharacterListActivity : AppCompatActivity() {

    private val viewModel = CharacterListViewModel(CharacterListUseCase())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_list)
        GlobalScope.launch {
            viewModel.getCharacters()
        }
    }
}