package com.uso.guia5.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.uso.guia5.R
import kotlinx.android.synthetic.main.item_chat.view.*

class ChatViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var cardviewChat:CardView = itemView.findViewById(R.id.cardChat)
    var vChatState:View = itemView.findViewById(R.id.vChatState)
    var tvChatHour:TextView = itemView.findViewById(R.id.tvChatHour)
    var ivChatImage: ImageView = itemView.findViewById(R.id.ivChatImage)
    var tvChatNombre:TextView = itemView.findViewById(R.id.tvChatNombre)
    var tvChatMensaje:TextView = itemView.findViewById(R.id.tvChatMensaje)
}