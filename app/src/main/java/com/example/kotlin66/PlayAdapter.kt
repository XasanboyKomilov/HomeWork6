package com.example.kotlin66

import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.kotlin66.databinding.ItemPlayBinding

class PlayAdapter(val list: ArrayList<PlayModel>) :
    RecyclerView.Adapter<PlayAdapter.PokemonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val binding = ItemPlayBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PokemonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class PokemonViewHolder(val binding: ItemPlayBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: PlayModel) {
            binding.textView.text = model.name
            binding.text.text = model.number
            when (model.name) {
                pikachu -> {
                    val color = itemView.context.getColor(R.color.img_one)
                    updateColor(color)
                    binding.img.load(R.drawable.img_one)
                }
                charmander -> {
                    val color = itemView.context.getColor(R.color.img_two)
                    updateColor(color)
                    binding.img.load(R.drawable.img_two)
                }
                mew -> {
                    val color = itemView.context.getColor(R.color.img_three)
                    updateColor(color)
                    binding.img.load(R.drawable.img_three)
                }
                squirtle -> {
                    val color = itemView.context.getColor(R.color.img_four)
                    updateColor(color)
                    binding.img.load(R.drawable.img_four)
                }
                bulbasaur -> {
                    val color = itemView.context.getColor(R.color.img_five)
                    updateColor(color)
                    binding.img.load(R.drawable.img_five)
                }
                aron -> {
                    val color = itemView.context.getColor(R.color.img_six)
                    updateColor(color)
                    binding.img.load(R.drawable.img_six)
                }
                ditto -> {
                    val color = itemView.context.getColor(R.color.img_seven)
                    updateColor(color)
                    binding.img.load(R.drawable.img_seven)
                }
                butterfree -> {
                    val color = itemView.context.getColor(R.color.img_ieght)
                    updateColor(color)
                    binding.img.load(R.drawable.img_ieght)
                }
                gastly -> {
                    val color = itemView.context.getColor(R.color.img_nine)
                    updateColor(color)
                    binding.img.load(R.drawable.img_nine)
                }
            }
        }

        private fun updateColor(@ColorInt color: Int) {
            val drawable = itemView.background as GradientDrawable
            drawable.mutate()
            drawable.setStroke(2, color)

            val textDrawable = binding.textView.background as GradientDrawable
            textDrawable.mutate()
            textDrawable.setTint(color)

            val textNumber = binding.text
            textNumber.setTextColor(color)
        }
    }
}


