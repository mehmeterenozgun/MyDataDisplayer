package com.example.mydatadisplayer

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.mydatadisplayer.databinding.ActivityCharDetailBinding

class CharDetailActivity : AppCompatActivity() {

    companion object{
        const val CHAR_NAME = "char_name"
        const val CHAR_ELIXIR = "char_elixir"
        const val CHAR_TYPE = "char_type"
        const val CHAR_RARITY = "char_raritie"
        const val CHAR_HP = "char_hp"
        const val CHAR_RANGE = "char_range"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding : ActivityCharDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_char_detail)

        val charName = intent.getStringExtra(CHAR_NAME)
        val charElixir = intent.getStringExtra(CHAR_ELIXIR)
        val charType = intent.getStringExtra(CHAR_TYPE)
        val charRarity = intent.getStringExtra(CHAR_RARITY)
        val charHP = intent.getStringExtra(CHAR_HP)
        val charRange = intent.getStringExtra(CHAR_RANGE)

        binding.name.text = charName
        binding.elixir.text = charElixir
        binding.type.text = charType
        binding.rarity.text = charRarity
        binding.hp.text = charHP
        binding.range.text = charRange

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}