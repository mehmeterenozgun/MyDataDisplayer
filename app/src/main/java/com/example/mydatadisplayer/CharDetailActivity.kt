package com.example.mydatadisplayer

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CharDetailActivity : AppCompatActivity() {

    companion object{
        const val CHAR_NAME = "char_name"
        const val CHAR_ELIXIR = "char_elixir"
        const val CHAR_TYPE = "char_type"
        const val CHAR_RARITY = "char_rarity"
        const val CHAR_HP = "char_hp"
        const val CHAR_RANGE = "char_range"
    }

    private lateinit var charNameTextView: TextView
    private lateinit var charElixirTextView: TextView
    private lateinit var charTypeTextView: TextView
    private lateinit var charRarityTextView: TextView
    private lateinit var charHPTextView: TextView
    private lateinit var charRangeTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_char_detail)


        charNameTextView = findViewById(R.id.name)
        charElixirTextView = findViewById(R.id.elixir)
        charTypeTextView = findViewById(R.id.type)
        charRarityTextView = findViewById(R.id.rarity)
        charHPTextView = findViewById(R.id.hp)
        charRangeTextView = findViewById(R.id.range)

        val charName = intent.getStringExtra(CHAR_NAME)
        val charElixir = intent.getStringExtra(CHAR_ELIXIR)
        val charType = intent.getStringExtra(CHAR_TYPE)
        val charRarity = intent.getStringExtra(CHAR_RARITY)
        val charHP = intent.getStringExtra(CHAR_HP)
        val charRange = intent.getStringExtra(CHAR_RANGE)

        charNameTextView.text = charName
        charElixirTextView.text = charElixir
        charTypeTextView.text = charType
        charRarityTextView.text = charRarity
        charHPTextView.text = charHP
        charRangeTextView.text = charRange




/*        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }

 */
    }
}