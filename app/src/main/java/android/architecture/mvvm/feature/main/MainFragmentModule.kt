package android.architecture.mvvm.feature.main

import android.architecture.mvvm.R
import android.architecture.mvvm.databinding.FragmentMainBinding
import android.architecture.mvvm.di.FragmentScope
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import dagger.Module
import dagger.Provides

@Module
class MainFragmentModule {

    @Provides
    @FragmentScope
    fun provideFragmentMainBinding(activity: MainActivity) : FragmentMainBinding =
        DataBindingUtil.inflate(
            activity.layoutInflater,
            R.layout.fragment_main,
            null,
            false)

    @Provides
    @FragmentScope
    fun provideMainFragmentViewModel(fragment: MainFragment) : MainFragmentViewModel =
            ViewModelProviders.of(fragment).get(MainFragmentViewModel::class.java)

}