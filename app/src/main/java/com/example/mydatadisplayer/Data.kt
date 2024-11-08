package com.example.mydatadisplayer

import android.content.Context

class Data (private val context: Context){
    private fun getName(): Array<String> {
        return context.resources.getStringArray(R.array.names)
    }
    private fun getElixir(): Array<String> {
        return context.resources.getStringArray(R.array.elixirs)
    }
    private fun getType(): Array<String> {
        return context.resources.getStringArray(R.array.types)
    }
    private fun getRarity(): Array<String>{
        return context.resources.getStringArray(R.array.rarities)
    }
    private fun getHP(): Array<String>{
        return context.resources.getStringArray(R.array.hps)
    }
    private fun getRange(): Array<String>{
        return context.resources.getStringArray(R.array.ranges)
    }

    fun loadAll(): List<Character> {
        val names = getName()
        val elixirs = getElixir()
        val types = getType()
        val rarities = getRarity()
        val hps= getHP()
        val ranges= getRange()
        val info = mutableListOf<Character>()

        for (i in 0..(names.size-1)) {
            val name = names[i]
            val elixir = elixirs[i]
            val type = types[i]
            val rarity = rarities[i]
            val hp = hps[i]
            val range = ranges[i]
            val addInfo = Character(name, elixir, type, rarity, hp, range)
            info.add(addInfo)
        }
        return info
    }





}