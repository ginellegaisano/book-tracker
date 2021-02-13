package com.booktracker.ui.main

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView
import com.booktracker.R
import com.booktracker.models.Book

class BookItem(context: Context, attrs: AttributeSet) : LinearLayout(context, attrs) {
    private val title: TextView
    private val author: TextView

    init {
        inflate(context, R.layout.book_item, this)

        title = findViewById(R.id.title)
        author = findViewById(R.id.author)
    }

    public fun setBook(book: Book) {
        title.text = book.title
        author.text = book.author
    }
}