package android.architecture.mvvm.viewmodel

import android.architecture.mvvm.model.data.Task
import android.architecture.mvvm.util.Event
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//TasksViewModel에 constructor에 추가해줘야함.
class TasksViewModel() : ViewModel() {

    private val items = MutableLiveData<List<Task>>().apply { value = emptyList() }

    private val _openTaskEvent = MutableLiveData<Event<Unit>>()
    val openTaskEvent : LiveData<Event<Unit>>
        get() =_openTaskEvent

    private val _newTaskEvent = MutableLiveData<Event<Unit>>()
    val newTaskEvent : LiveData<Event<Unit>>
    get() = newTaskEvent

}