package com.example.mydialobox;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class NameDialog extends DialogFragment {
    TextView actionCancel;
    TextView actionOk;
    EditText editName;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.name_reciever_dialog,container,false);
        editName = view.findViewById(R.id.editName);
        actionCancel = view.findViewById(R.id.txtCancel);
        actionOk = view.findViewById(R.id.txtOk);
        actionCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               getDialog().dismiss();
            }
        });

        actionOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editName.getText().toString();
                ((MainActivity)getActivity()).txtName.setText(text);
                getDialog().dismiss();
            }
        });

        return view;
    }
}
