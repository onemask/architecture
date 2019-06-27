package android.architecture.mvvm.feature.main.vm

import android.app.Application
import android.architecture.mvvm.feature.main.model.MainMenu
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MainFragmentViewModel(val app : Application) : AndroidViewModel(app){
    val clickEvent = MutableLiveData<MainMenu>()
    fun onClick(mainMenu: MainMenu){
        clickEvent.value=mainMenu
    }
}