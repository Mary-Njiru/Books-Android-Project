package com.example.mybooks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationBarItemView

class BooksAdapter(var booksList: List<Books>):
    RecyclerView.Adapter<BooksViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.mybooks_list_item, parent, false)
        return BooksViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        val book = booksList[position]
        holder.tvTitle.text = book.title
        holder.tvAuthor.text = book.author
        holder.tvDate.text = book.date
        holder.tvPreview.text = book.preview

    }

    override fun getItemCount(): Int {
       return booksList.size
    }
}

class BooksViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    var tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)
}