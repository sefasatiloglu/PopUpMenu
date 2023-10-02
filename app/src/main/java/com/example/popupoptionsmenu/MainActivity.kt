package com.example.popupoptionsmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var buttonMenuAc:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonMenuAc = findViewById(R.id.buttonMenuAc)

        buttonMenuAc.setOnClickListener {

            val popup = PopupMenu(applicationContext,buttonMenuAc)

            popup.menuInflater.inflate(R.menu.popupmenu,popup.menu)

            popup.setOnMenuItemClickListener { item ->

                when(item.itemId) {
                    R.id.action_sil -> {
                        Toast.makeText(applicationContext,"Sil Secildi.",Toast.LENGTH_SHORT).show()
                        true
                    }

                    R.id.action_duzenle -> {
                        Toast.makeText(applicationContext,"Düzenle Secildi.",Toast.LENGTH_SHORT).show()
                        true

                    }
                    else -> false

                }

            }

            popup.show()


        }



    }
}