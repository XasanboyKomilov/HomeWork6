package com.example.kotlin66

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin66.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var gameAdapter: PlayAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAdapter();
    }

    private fun initAdapter() {
        val list = arrayListOf<PlayModel>()
        list.add(PlayModel("#004", charmander))
        list.add(PlayModel("#025", pikachu))
        list.add(PlayModel("#004", mew))
        list.add(PlayModel("#001", bulbasaur))
        list.add(PlayModel("#012", butterfree))
        list.add(PlayModel("#007", squirtle))
        list.add(PlayModel("#004", aron))
        list.add(PlayModel("#132", ditto))
        list.add(PlayModel("#092", gastly))

        gameAdapter = PlayAdapter(list)
        binding.recyclerView.adapter = gameAdapter
    }
}