package com.example.viewpager_2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class Fragment_1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false) }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

                        val nameText = view.findViewById<TextView>(R.id.nameText)
                        val authorText = view.findViewById<TextView>(R.id.authorText)
                        val imageTv = view.findViewById<ImageView>(R.id.imageTv)

                      val picture = arguments?.getSerializable("key1") as Picture

                     nameText.setText(picture.name)
                     authorText.setText("Автор: ${picture.author}")
                     imageTv.setImageResource(picture.picture)





    }




}