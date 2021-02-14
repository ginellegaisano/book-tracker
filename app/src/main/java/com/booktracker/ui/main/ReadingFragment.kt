package com.booktracker.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.booktracker.R
import com.booktracker.models.Book

/** Displays current reading list. */
class ReadingFragment : Fragment() {

    // TODO: replace with reading list from SQL Lite DB.
    private val TEST_BOOKS = listOf(
        Book("Snow Flower and the Paper Fan", "Lisa See", 5),
        Book("Winter", "Marissa Meyer", 4)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_reading, container, false)

        val adapter = BookItemAdapter(TEST_BOOKS)
        val bookList: RecyclerView = root.findViewById(R.id.book_list)
        bookList.apply {
            layoutManager = LinearLayoutManager(activity)
            this.adapter = adapter
        }

        return root
    }
}