package echevasoft.fmsol.ui.Compartir;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class CompartirViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CompartirViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}