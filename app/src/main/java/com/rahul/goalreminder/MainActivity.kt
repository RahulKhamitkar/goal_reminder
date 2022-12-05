package com.rahul.goalreminder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.rahul.goalreminder.databinding.ActivityMainBinding
import com.rahul.goalreminder.utils.Util


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //To hide the Title from toolbar
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        //This is to set the Day, Month and date
        binding.tvCurrentTime.text = Util.getCurrentDayMonthDate()

        val navController: NavController =
            Navigation.findNavController(this, R.id.activity_main_nav_host_fragment)

        val bottomNavigationView =
            findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }
}