package echevasoft.fmsol.ui.enivarmensaje;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.telephony.PhoneNumberUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import echevasoft.fmsol.R;

public class EnviarMensaje extends Fragment {

    private ToolsViewModel toolsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        toolsViewModel = ViewModelProviders.of(this).get(ToolsViewModel.class);
        View root = inflater.inflate(R.layout.enviar_mensaje, container, false);
        toolsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
                intent.putExtra("jid", PhoneNumberUtils.stripSeparators("5493437490588") + "@s.whatsapp.net");
                startActivity(intent);
            }
        });
        return root;
    }
}