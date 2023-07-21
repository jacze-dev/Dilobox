package com.example.mydialobox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.displayName);
    }

    public void answer(View view) {
        NameDialog nameDialog= new NameDialog();
        nameDialog.show(getSupportFragmentManager(),"my dialog");
    }
}
