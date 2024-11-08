package com.example.mydatadisplayer.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mydatadisplayer.CharDetailActivity
import com.example.mydatadisplayer.R
import com.example.mydatadisplayer.model.Character

class Adapter(private val dataset: List<Character>): RecyclerView.Adapter<Adapter.MyViewHolder>() {
    class MyViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private lateinit var info: Character
        val NameView : TextView= view.findViewById(R.id.justName)

        init{
            view.setOnClickListener{
                val intent= Intent(itemView.context, CharDetailActivity::class.java)
                intent.putExtra(CharDetailActivity.CHAR_NAME, info.name )
                intent.putExtra(CharDetailActivity.CHAR_ELIXIR, info.elixir)
                intent.putExtra(CharDetailActivity.CHAR_TYPE, info.type)
                intent.putExtra(CharDetailActivity.CHAR_RARITY, info.rarity)
                intent.putExtra(CharDetailActivity.CHAR_HP, info.hp)
                intent.putExtra(CharDetailActivity.CHAR_RANGE, info.range)

                itemView.context.startActivity(intent)
            }
        }
        fun bind(info: Character){
            this.info = info
            NameView.text = info.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}

