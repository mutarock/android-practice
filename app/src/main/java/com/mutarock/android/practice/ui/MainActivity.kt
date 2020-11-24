package com.mutarock.android.practice.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mutarock.android.practice.R
import com.mutarock.android.practice.navigator.AppNavigator
import com.mutarock.android.practice.navigator.Screens
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Main activity of the application.
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

   @Inject
   lateinit var navigator: AppNavigator

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)

      if (savedInstanceState == null) {
         navigator.navigateTo(Screens.DASHBOARD)
      }
   }

   override fun onBackPressed() {
      super.onBackPressed()

      if (supportFragmentManager.backStackEntryCount == 0) {
         finish()
      }
   }
}
