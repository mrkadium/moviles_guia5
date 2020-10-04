package com.uso.guia5.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.uso.guia5.R
import com.uso.guia5.models.Chat
import com.uso.guia5.viewholders.ChatViewHolder

class ChatAdapter(var data:List<Chat>) : RecyclerView.Adapter<ChatViewHolder>() {
    private lateinit var context:Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        context = parent.context
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        val chat = data.get(position)
        holder.vChatState.visibility = if(chat.state) View.VISIBLE else View.INVISIBLE
        holder.tvChatHour.text = chat.hour
        holder.tvChatNombre.text = chat.nombre
        if(chat.state) holder.tvChatNombre.setTextColor(context.resources.getColor(R.color.colorPrimaryDark))
        holder.tvChatMensaje.text = chat.mensaje
        holder.ivChatImage.setImageResource(chat.image)

        holder.cardviewChat.setOnClickListener{
            Toast.makeText(context, "Clicked on: ".plus(chat.nombre), Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}