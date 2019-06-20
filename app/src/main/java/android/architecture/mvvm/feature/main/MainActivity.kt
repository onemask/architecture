package android.architecture.mvvm.feature.main

import android.architecture.mvvm.R
import android.architecture.mvvm.databinding.ActivityMainBinding
import android.architecture.mvvm.feature.extension.replaceFragment
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //kotlin null 처리로 refactoring
        /* if (savedInstanceState==null){
            replaceFragment(R.id.container,MainFragment())
        }*/
        savedInstanceState?:run {
            replaceFragment(R.id.container,MainFragment())
        }
    }

}
