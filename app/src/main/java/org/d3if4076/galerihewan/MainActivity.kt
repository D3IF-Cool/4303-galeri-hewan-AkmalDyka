package org.d3if4076.galerihewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if4076.galerihewan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("MainActivity", "Jumlah data: " + getData().size)
    }

    private fun getData(): List<Hewan> {
        return listOf(
            Hewan("Angsa", "Cygnus olor"),
            Hewan("Ayam", "Gallus gallus"),
            Hewan("Bebek", "Cairina moschata"),
            Hewan("Domba", "Ovis ammon"),
            Hewan("Kalkun", "Meleagris gallopavo"),
            Hewan("Kambing", "Capricornis sumatrensis"),
            Hewan("Kelinci", "Oryctolagus cuniculus"),
            Hewan("Kerbau", "Bubalus bubalis"),
            Hewan("Kuda", "Equus caballus"),
            Hewan("Sapi", "Bos taurus"),
        )
    }

}