package com.example.project_hockey_store.items_activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.project_hockey_store.R

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val title: TextView = findViewById(R.id.item_title)
        val desc: TextView = findViewById(R.id.item_desc)
        val text: TextView = findViewById(R.id.item_text)
        val image: ImageView = findViewById(R.id.item_image)
        val imageId: Int = intent.getIntExtra("itemImage", 0)
        val backbtn: TextView = findViewById(R.id.back_button)

        image.setImageResource(imageId)
        title.text = intent.getStringExtra("itemTitle")
        desc.text = intent.getStringExtra("itemDesc")
        text.text = intent.getStringExtra("itemText")

        backbtn.setOnClickListener {
            val intent = Intent(this, ItemsActivity::class.java)
            startActivity(intent)
        }
    }
}