package android.architecture.mvvm.di

import android.architecture.mvvm.feature.main.MainActivity
import android.architecture.mvvm.feature.main.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun getMainActivitu() : MainActivity


}