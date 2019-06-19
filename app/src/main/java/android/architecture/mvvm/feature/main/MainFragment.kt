package android.architecture.mvvm.feature.main


import android.architecture.mvvm.databinding.FragmentMainBinding
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import dagger.android.support.DaggerFragment
import javax.inject.Inject


class MainFragment : DaggerFragment() {

    @Inject
    lateinit var binding : FragmentMainBinding

    @Inject
    lateinit var viewModel: MainFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)  = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner=this
        binding.viewmodel=viewModel
        viewModel.clickEvent.observe(this, Observer {
            when(it){
                MainMenu.PERSON_ACTIVITY->Log.d("1","PERSON_ACTIVITY")
                MainMenu.POST_ACTIVITY->Log.d("2","POST_ACTIVITY")
                MainMenu.PREFERENCE_ACTIVITY->Log.d("3","POST_ACTIVITY")
                MainMenu.PHOTO_ACTIVITY->Log.d("4","PHOTO_ACTIVITY")
            }
        })

    }
}
