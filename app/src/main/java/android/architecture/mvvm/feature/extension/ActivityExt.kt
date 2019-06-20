package android.architecture.mvvm.feature.extension

import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

//Activity에서 Fragment를 불러오기 위한 Extension
fun AppCompatActivity.replaceFragment(@IdRes id: Int, supportFragment: Fragment){
    supportFragmentManager.beginTransaction()
        .replace(id,supportFragment)
        .commit()
}