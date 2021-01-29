package echevasoft.fmsol.ui.slideshow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import echevasoft.fmsol.R;

public class Facebook extends Fragment {

        private SlideshowViewModel slideshowViewModel;

        public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            slideshowViewModel = ViewModelProviders.of(this).get(SlideshowViewModel.class);
            View root = inflater.inflate(R.layout.fragment_facebook, container, false);
            slideshowViewModel.getText().observe(this, new Observer<String>() {
                @Override
                public void onChanged(@Nullable String s) {
                    Uri uri = Uri.parse("https://www.facebook.com/FM-SOL-SANTA-ELENA-205497572958674/?__tn__=kC-R&eid=ARD2CO3R2uPIAA3pUR-5RjM3T0j6axVPlpg3qELPNUwM9Zhp1dX3Q-0GSi9OSPT2s6wBbVPVag6l1x0A&hc_ref=ARR9RESMapHBF1NZUvtM2BhFM0V1-_cuVFC3Jcgi_fhj4cuEypJsb9pRdcSzpQp5jhg&fref=nf&__xts__[0]=68.ARCv_x6gFi5tYhcvA6iszMwRSVI5ca_QfHwDZR80wZqbUJj3kbfkrnOlzc4SFTivhRii1FicLRLEO1Sbza5VAGVtkOHJE2MgTHiqBrEESnZG2jWpAXi5vlapmWAkDAof2ZbteDZf2vC6ivBu_9c8LkAGqJITy4e25rDuJulPOrtxWIoeClRnyK__NVfRcru6YAx2bjQfXAMXdpLGHev5TB85NtQc03aW9mV22m7HHLeEpc4eJWXSYIZ6g_dDD1Eh5EL7EsUST5X1aVa_6sXJUkReY4dMmrCesvMNut5rveKiHX0SzmEi5RTWLqDNrnv6dTUEYKkLkYZ_UoLD8daLXf3HUg");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            });
            return root;
        }
    }
