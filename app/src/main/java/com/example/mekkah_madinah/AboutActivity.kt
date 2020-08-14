package com.example.mekkah_madinah

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toolbar

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val githubProfile: TextView = findViewById(R.id.tv_github_rofile)
        val linkedinProfile: TextView = findViewById(R.id.tv_linkedin_profile)
        val twitterProfile: TextView = findViewById(R.id.tv_twitter_profile)

//        val toolbars: Toolbar = findViewById(R.id.toolbars)
//        setSupportActionBar(toolbars)
        val actionbar = supportActionBar
        actionbar!!.title = "About Me"
        actionbar.setDisplayHomeAsUpEnabled(true)

        githubProfile.setOnClickListener {
            val githubLink = "http://github.com/rezadh"
            val githubIntent: Intent = Uri.parse(githubLink).let { webpage -> Intent(Intent.ACTION_VIEW, webpage)}
            startActivity(githubIntent)
        }
        linkedinProfile.setOnClickListener {
            val linkedinLink = "https://www.linkedin.com/in/reza-dwi-hendarno-99448613b/"
            val linkedinIntent: Intent = Uri.parse(linkedinLink).let { webpage -> Intent(Intent.ACTION_VIEW, webpage)}
            startActivity(linkedinIntent)
        }
        twitterProfile.setOnClickListener {
            val twitterLink = "https://twitter.com/RezaDwiHendarno"
            val twitterIntent: Intent = Uri.parse(twitterLink).let { webpage -> Intent(Intent.ACTION_VIEW, webpage)}
            startActivity(twitterIntent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}