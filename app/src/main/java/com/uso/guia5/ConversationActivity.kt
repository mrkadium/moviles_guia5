package com.uso.guia5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uso.guia5.adapters.ChatAdapter
import com.uso.guia5.models.Chat

class ConversationActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: ChatAdapter
    lateinit var layout: LinearLayoutManager
    lateinit var list: MutableList<Chat>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversation)

        list = mutableListOf()

        init()
        adapter = ChatAdapter(list)
        layout = LinearLayoutManager(this)
        recyclerView = findViewById(R.id.recyclerChat)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = layout
        recyclerView.setHasFixedSize(true)
    }

    private fun init(){
        list.add(Chat("9:45 AM", R.drawable.img6, "Scarlett Olsen", "Hi, girl! What's been up?"))
        list.add(Chat("9:23 AM", R.drawable.img7, "Nia Manarino", "She's been flirting with him! What am I supposed to do?", true))
        list.add(Chat("11:09 PM", R.drawable.img8, "Anne Marie Colleman", "No, I didn't feel like it", true))
        list.add(Chat("8:11 PM", R.drawable.img9, "Lupita Nyongo", "Nevermind, bitch! I'll do it myself, as always"))
        list.add(Chat("1:55 PM", R.drawable.img10, "Elizabeth Hathaway", "Oh, girl, that top with does shoes?"))
        list.add(Chat("9:45 AM", R.drawable.img6, "Scarlett Olsen", "Hi, girl! What's been up?"))
        list.add(Chat("9:23 AM", R.drawable.img7, "Nia Manarino", "She's been flirting with him! What am I supposed to do?", true))
        list.add(Chat("11:09 PM", R.drawable.img8, "Anne Marie Colleman", "No, I didn't feel like it", true))
        list.add(Chat("8:11 PM", R.drawable.img9, "Lupita Nyongo", "Nevermind, bitch! I'll do it myself, as always"))
        list.add(Chat("1:55 PM", R.drawable.img10, "Elizabeth Hathaway", "Oh, girl, that top with does shoes?"))
    }
}