package com.example.mekkah_madinah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvMekkahMadinah: RecyclerView
    private var list: ArrayList<MekkahMadinah> = arrayListOf()
    private lateinit var listMekkahMadinahAdapter: ListMekkahMadinahAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMekkahMadinah = findViewById(R.id.rv_mekkah_madinah)
        rvMekkahMadinah.setHasFixedSize(true)

        list.addAll(MekkahMadinahData.listData)
        showRecyclerList()
        setListClickAction()
    }

    private fun showRecyclerList() {
        rvMekkahMadinah.layoutManager = LinearLayoutManager(this)
        listMekkahMadinahAdapter = ListMekkahMadinahAdapter(list)
        rvMekkahMadinah.adapter = listMekkahMadinahAdapter
    }

    private fun setListClickAction(){
        listMekkahMadinahAdapter.setOnItemClickCallback(
            object : ListMekkahMadinahAdapter.OnItemClickCallback{
                override fun onItemClick(data: MekkahMadinah) {
                    val intent = Intent(this@MainActivity, DetailActivity::class.java).apply {
                        putExtra(DetailActivity.EXTRA_NAME, data.name)
                        putExtra(DetailActivity.EXTRA_LOCATION, data.lokasi)
                        putExtra(DetailActivity.EXTRA_DESCRIPTION, data.detail)
                        putExtra(DetailActivity.EXTRA_IMAGE, data.photo.toString())
                    }
                    startActivity(intent)
                    Toast.makeText(this@MainActivity, "Anda memilih ${data.name}", Toast.LENGTH_SHORT).show()
                }
            }
        )
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.about -> {
                val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(aboutIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
//    fun onAboutAction(view: View){
//        Toast.makeText(this, "ABOUT SCREEN", Toast.LENGTH_SHORT).show()
//    }
}