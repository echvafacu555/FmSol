package echevasoft.fmsol.ui.calificar;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import echevasoft.fmsol.R;

public class Calificar extends Fragment {

    private CalificarViewModel calificarViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        calificarViewModel = ViewModelProviders.of(this).get(CalificarViewModel.class);
        View root = inflater.inflate(R.layout.fragment_calificar, container, false);
        calificarViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=macbookpro.fmsol"));
                intent.setPackage("com.android.vending");
                startActivity(intent);
            }
        });
        return root;
    }
}