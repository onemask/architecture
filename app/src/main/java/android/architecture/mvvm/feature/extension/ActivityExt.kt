package android.architecture.mvvm.feature.extension

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.replaceFragment(@IdRes id: Int, supportFragment: Fragment){
    supportFragmentManager.beginTransaction()
        .replace(id,supportFragment)
        .commit()
}