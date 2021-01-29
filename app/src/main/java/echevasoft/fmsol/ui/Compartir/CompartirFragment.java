package echevasoft.fmsol.ui.Compartir;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import echevasoft.fmsol.R;

public class CompartirFragment extends Fragment {

    private CompartirViewModel compartirViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        compartirViewModel = ViewModelProviders.of(this).get(CompartirViewModel.class);
        View root = inflater.inflate(R.layout.fragment_compartir, container, false);
        compartirViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {



                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "¡Descarga la App de Fm Sol 105.3 Santa Elena y lleva la Radio a donde vayas! https://play.google.com/store/apps/details?id=macbookpro.fmsol");
                startActivity(Intent.createChooser(intent, "Compartir con"));
            }
        });
        return root;
    }
}