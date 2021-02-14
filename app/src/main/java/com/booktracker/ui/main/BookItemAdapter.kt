package com.booktracker.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.booktracker.R
import com.booktracker.models.Book

/** Adapter for displaying list of books. */
// TODO: Needs update function (or switch to LiveModel).
// TODO: do some styling (border, book cover icon, stars for ratings.
class BookItemAdapter(private val books: List<Book>) :
    RecyclerView.Adapter<BookItemAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val bookItem: BookItem = view.findViewById(R.id.book_item)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.layout_book_item, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.bookItem.setBook(books.get(position))
    }

    override fun getItemCount() = books.size
}