package com.example.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val bear = Word(R.drawable.bear, "くま")

        val chicken = Word(R.drawable.chicken,"にわとり")

        val cow = Word(R.drawable.cow,"うし")

        val fox = Word(R.drawable.fox,"にわとり")

        addword(bear)
        addword(chicken)
        addword(cow)
        addword(fox)

    }
    private fun addword(word:Word){
        val nameTextView = TextView(applicationContext)
        nameTextView.text = word.name
        //container.addView(nameTextView)
        val layout = LinearLayout(this.applicationContext)
        layout.orientation= LinearLayout.HORIZONTAL
        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)
        layout.addView(imageView)
        layout.addView(nameTextView)
        container.addView(layout)
    }
}