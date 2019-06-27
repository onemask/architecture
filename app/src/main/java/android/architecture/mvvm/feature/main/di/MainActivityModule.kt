package android.architecture.mvvm.feature.main.di

import android.architecture.mvvm.R
import android.architecture.mvvm.databinding.ActivityMainBinding
import android.architecture.mvvm.di.ActivityScope
import android.architecture.mvvm.di.FragmentScope
import android.architecture.mvvm.feature.main.MainActivity
import android.architecture.mvvm.feature.main.MainFragment
import androidx.databinding.DataBindingUtil
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @Module
    companion object{
        @JvmStatic
        @Provides
        @ActivityScope
        fun provideMainActivityBinding(activity: MainActivity) : ActivityMainBinding {
            return DataBindingUtil.setContentView(activity, R.layout.activity_main)

        }
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun getMainFragment() : MainFragment

}
