package android.architecture.mvvm.di

import android.app.Application
import android.architecture.mvvm.App
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideAppContext(app : App) : Context{
        return app
    }

    @Provides
    @Singleton
    fun provideApplication(app : App) : Application{
        return app
    }

}