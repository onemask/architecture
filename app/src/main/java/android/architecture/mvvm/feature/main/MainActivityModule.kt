package android.architecture.mvvm.feature.main

import android.architecture.mvvm.di.ActivityScope
import android.architecture.mvvm.di.FragmentScope
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    /*@Module
    companion object{
        @JvmStatic
        @Provides
        @ActivityScope
        fun provideMainActivityBinding(activity: MainActivity) {

        }
    }*/

    @FragmentScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun getMainFragment() : MainFragment
}
