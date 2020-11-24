package com.mutarock.android.practice.navigator

import androidx.fragment.app.FragmentActivity
import com.mutarock.android.practice.R
import com.mutarock.android.practice.ui.ButtonsFragment
import com.mutarock.android.practice.ui.DashboardFragment
import com.mutarock.android.practice.ui.LogsFragment
import javax.inject.Inject

/**
 * Navigator implementation.
 */
class AppNavigatorImpl @Inject constructor(
    private val activity: FragmentActivity
) : AppNavigator {

    override fun navigateTo(screen: Screens) {
        val fragment = when (screen) {
            Screens.DASHBOARD -> DashboardFragment()
            Screens.BUTTONS -> ButtonsFragment()
            Screens.LOGS -> LogsFragment()
        }

        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, fragment)
            .addToBackStack(fragment::class.java.canonicalName)
            .commit()
    }
}
