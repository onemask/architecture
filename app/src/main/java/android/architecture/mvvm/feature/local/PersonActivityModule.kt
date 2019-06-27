package android.architecture.mvvm.feature.local

import android.architecture.mvvm.R
import android.architecture.mvvm.databinding.ActivityMainBinding
import android.architecture.mvvm.di.ActivityScope
import androidx.databinding.DataBindingUtil
import dagger.Module
import dagger.Provides

@Module
abstract class PersonActivityModule {
    @Module
    companion object{
        @JvmStatic
        @Provides
        @ActivityScope
        fun provideActivityBinding(activity : PersonActivity) : ActivityMainBinding {
            return DataBindingUtil.setContentView(activity, R.layout.activity_person)
        }
    }


}