package com.tanmayshree.githubbuddy

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(): ViewModel() {


    fun returnSomeText(): String = "Hello this text is from the viewmodel"
}