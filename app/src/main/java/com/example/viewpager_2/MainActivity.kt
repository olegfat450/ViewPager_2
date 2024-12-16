package com.example.viewpager_2

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.marginLeft
import androidx.core.view.marginStart
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager2.widget.ViewPager2

class MainActivity :FragmentActivity() {

      private lateinit var toolbar: Toolbar
      private lateinit var viewpager: ViewPager2


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        toolbar.title = "Картинная галлерея"
        toolbar.setBackgroundColor(Color.BLUE)
        toolbar.setTitleTextColor(Color.WHITE)
       // setSupportActionBar(toolbar)

//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .add(R.id.fragment_container, Fragment_1())
//                .commit()

                val list = Painting().picture
               val adapter = ViewPagerAdapter(this,list)
                 viewpager = findViewById(R.id.viewpager)

                 viewpager.adapter = adapter

        }
    }


//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.menu_exit,menu)
//        return super.onCreateOptionsMenu(menu) }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//         val builder = AlertDialog.Builder(this)
//            builder.setTitle("Выход из программы").setMessage("Действительно выйти?")
//                .setPositiveButton("Да") { _,_, -> finishAffinity()}
//                .setNegativeButton("Нет") {s,_ -> s.cancel()}
//            builder.create().show()
//        return super.onOptionsItemSelected(item) }
//}