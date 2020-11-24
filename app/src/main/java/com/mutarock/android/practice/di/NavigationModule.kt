package com.mutarock.android.practice.di

import com.mutarock.android.practice.navigator.AppNavigator
import com.mutarock.android.practice.navigator.AppNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/**
 * NavigationModule for providing AppNavigator
 */
@InstallIn(ActivityComponent::class)
@Module
abstract class NavigationModule {

    @Binds
    abstract fun bindNavigator(impl: AppNavigatorImpl): AppNavigator
}
