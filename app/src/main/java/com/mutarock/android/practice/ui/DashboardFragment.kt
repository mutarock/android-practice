package com.mutarock.android.practice.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.mutarock.android.practice.R
import com.mutarock.android.practice.navigator.AppNavigator
import com.mutarock.android.practice.navigator.Screens
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Fragment that displays Dashboard.
 */
@AndroidEntryPoint
class DashboardFragment : Fragment() {

    @Inject
    lateinit var navigator: AppNavigator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.test_simple_room).setOnClickListener {
            navigator.navigateTo(Screens.BUTTONS)
        }

    }
}