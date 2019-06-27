package android.architecture.mvvm.feature.local

import android.architecture.mvvm.R
import android.architecture.mvvm.databinding.FragmentMainBinding
import android.architecture.mvvm.di.FragmentScope
import androidx.databinding.DataBindingUtil
import dagger.Module
import dagger.Provides

@Module
class PersonFragmentModule {

    @Provides
    @FragmentScope
    fun provideFragmentPersonBinding(activity: PersonActivity) : FragmentMainBinding =
            DataBindingUtil.inflate(
                activity.layoutInflater,
                R.layout.fragment_person,
                null,
                false)


    

}