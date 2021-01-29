package echevasoft.fmsol.ui.calificar;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class CalificarViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CalificarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is send fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}