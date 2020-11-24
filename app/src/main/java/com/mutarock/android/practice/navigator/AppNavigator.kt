package com.mutarock.android.practice.navigator

/**
 * Available screens.
 */
enum class Screens {
    DASHBOARD,
    BUTTONS,
    LOGS,
//    SIREN_SERVICE
}

/**
 * Interfaces that defines an app navigator.
 */
interface AppNavigator {
    // Navigate to a given screen.
    fun navigateTo(screen: Screens)
}
