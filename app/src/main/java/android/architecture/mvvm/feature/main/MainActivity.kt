package android.architecture.mvvm.feature.main

import android.architecture.mvvm.R
import android.architecture.mvvm.databinding.ActivityMainBinding
import android.architecture.mvvm.feature.extension.replaceFragment
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        replaceFragment(R.id.container, MainFragment())
    }

}
