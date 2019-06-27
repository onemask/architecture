package android.architecture.mvvm.feature.local

import android.architecture.mvvm.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PersonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_person)
    }
}
