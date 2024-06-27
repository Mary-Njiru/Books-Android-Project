package com.example.mybooks

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mybooks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBooks.layoutManager = LinearLayoutManager(this)
        displayBooks()

    }

    fun displayBooks(){

        val book1 = Books("","Things Fall Apart","Chinua Achebe","2006","This book talks about the struggles of an africanman","","Read More...")
        val book2 = Books("","Cry The Beloved Country","Alan Paton","1948","This book talks about the struggles of an africanman","","Read More...")
        val book3 = Books("","Homegoing","Yaa Gyasi","2016","This book talks about the struggles of an africanman","","Read More...")
        val book4 = Books("","Americanah","Chimamanda Ngozi","2006","This book talks about the struggles of an africanman","","Read More...")
        val book5 = Books("","So Long a Letter","Mariama Ba","1979","This book talks about the struggles of an africanman","","Read More...")
        val book6 = Books("","A Grain of Wheat","Ngugi wa Thiong'o","1967","This book talks about the struggles of an africanman","","Read More...")
        val book7 = Books("","Purple Hibiscus","Chimamanda Ngozi","2006","This book talks about the struggles of an africanman","","Read More...")
        val book8 = Books("","The Middle Daughter","Chika Unigwe","2023","This book talks about the struggles of an africanman","","Read More...")
        val book9 = Books("","River Spirit","Leila Aboulela","2023","This book talks about the struggles of an africanman","","Read More...")
        val book10= Books("","Kintu","Jeniffer Nansubuga","2022","This book talks about the struggles of an africanman","","Read More...")

        val myBooks = listOf(book1,book2,book3,book4,book5,book6,book7,book8,book9,book10)

        val booksAdapter = BooksAdapter(myBooks)
        binding.rvBooks.adapter = booksAdapter
    }
}