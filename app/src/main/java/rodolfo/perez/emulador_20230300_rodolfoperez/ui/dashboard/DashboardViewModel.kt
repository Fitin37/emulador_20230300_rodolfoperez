package rodolfo.perez.emulador_20230300_rodolfoperez.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {

    }

    val text: LiveData<String> = _text
}