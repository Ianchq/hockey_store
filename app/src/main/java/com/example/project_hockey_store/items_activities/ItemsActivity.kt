package com.example.project_hockey_store.items_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project_hockey_store.R

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.items_list)
        val items = arrayListOf<Item>()

        items.add(
            Item(1, "sergachev_stick", "MIKHAIL SERGACHEV PRO STOCK - CCM RBZ REVOLUTION", "105 Flex / 168 cm",
            "This is a selection of pro stock hockey sticks sourced directly from NHL teams. " +
                    "These sticks were specially designed for these NHL players but were never used by them, " +
                    "which allows us to offer you a brand new top quality stick at an unbeatable price!", 200)
        )

        items.add(
            Item(2, "malkin_stick", "EVGENI MALKIN - CCM JETSPEED FT3 PRO", "105 Flex / 163 cm",
            "This is a selection of pro stock hockey sticks sourced directly from NHL teams. " +
                    "These sticks were specially designed for these NHL players but were never used by them, " +
                    "which allows us to offer you a brand new top quality stick at an unbeatable price!", 220)
        )

        items.add(
            Item(3, "mackinnon_stick", "NATHAN MACKINNON - CCM JETSPEED FT5 PRO", "95 Flex / 160 cm",
            "This is a selection of pro stock hockey sticks sourced directly from NHL teams. " +
                    "These sticks were specially designed for these NHL players but were never used by them, " +
                    "which allows us to offer you a brand new top quality stick at an unbeatable price!", 245)
        )

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}