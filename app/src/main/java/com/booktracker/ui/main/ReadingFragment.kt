package com.booktracker.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.booktracker.R
import com.booktracker.models.Book

/**
 * A placeholder fragment containing a simple view.
 */
class ReadingFragment : Fragment() {

    private val TEST_BOOK = Book("Snow Flower and the Paper Fan", "Lisa See", 5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_reading, container, false)

        (root.findViewById(R.id.test_book) as BookItem).setBook(TEST_BOOK)
        return root
    }
}