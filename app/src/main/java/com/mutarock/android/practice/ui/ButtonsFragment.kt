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
import com.mutarock.android.practice.service.LoggerDataService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 *
 */
@AndroidEntryPoint
class ButtonsFragment : Fragment() {

    @Inject
    lateinit var navigator: AppNavigator

    @Inject
    lateinit var loggerService: LoggerDataService

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_buttons, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.findViewById<Button>(R.id.button1).setOnClickListener {
            loggerService.addLog("Interaction with 'Button 1'")
        }

        view.findViewById<Button>(R.id.button2).setOnClickListener {
            loggerService.addLog("Interaction with 'Button 2'")
        }

        view.findViewById<Button>(R.id.button3).setOnClickListener {
            loggerService.addLog("Interaction with 'Button 3'")
        }

        view.findViewById<Button>(R.id.all_logs).setOnClickListener {
            navigator.navigateTo(Screens.LOGS)
        }

        view.findViewById<Button>(R.id.delete_logs).setOnClickListener {
            loggerService.removeLogs()
        }

    }
}
