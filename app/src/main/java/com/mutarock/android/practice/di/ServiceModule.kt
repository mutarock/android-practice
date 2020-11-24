package com.mutarock.android.practice.di

import com.mutarock.android.practice.service.LoggerDataService
import com.mutarock.android.practice.service.LoggerDataServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
abstract class ServiceModule {
    @Singleton
    @Binds
    abstract fun bindLoggerDataService(impl: LoggerDataServiceImpl): LoggerDataService
}