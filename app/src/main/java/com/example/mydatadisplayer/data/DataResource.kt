package com.example.mydatadisplayer.data

import android.content.Context
import com.example.mydatadisplayer.model.Character
import com.example.mydatadisplayer.R

class DataResource (private val context: Context){
    private fun getNames(): Array<String> {
        return context.resources.getStringArray(R.array.names)
    }
    private fun getElixirs(): Array<String> {
        return context.resources.getStringArray(R.array.elixirs)
    }
    private fun getTypes(): Array<String> {
        return context.resources.getStringArray(R.array.types)
    }
    private fun getRarities(): Array<String>{
        return context.resources.getStringArray(R.array.rarities)
    }
    private fun getHPs(): Array<String>{
        return context.resources.getStringArray(R.array.hps)
    }
    private fun getRanges(): Array<String>{
        return context.resources.getStringArray(R.array.ranges)
    }

    fun loadAll(): List<Character> {
        val names = getNames()
        val elixirs = getElixirs()
        val types = getTypes()
        val rarities = getRarities()
        val hps= getHPs()
        val ranges= getRanges()

        val info = mutableListOf<Character>()

        for (i in names.indices) {
            val name = names[i]
            val elixir = elixirs[i]
            val type = types[i]
            val rarity = rarities[i]
            val hp = hps[i]
            val range = ranges[i]
            info.add(Character(name, elixir, type, rarity, hp, range))
        }
        return info
    }





}