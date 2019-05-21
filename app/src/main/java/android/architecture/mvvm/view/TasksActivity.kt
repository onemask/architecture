package android.architecture.mvvm.view

import android.architecture.mvvm.R
import android.architecture.mvvm.viewmodel.TasksViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout

class TasksActivity : AppCompatActivity() {

    private lateinit var drawerLayout : DrawerLayout

    private lateinit var viewModel : TasksViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
