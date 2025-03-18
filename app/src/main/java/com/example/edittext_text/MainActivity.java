package com.example.edittext_text;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //아이디 eText;
    //비밀번호 eTextNP;
    //전화번호 eTextP;
    //버튼 eButton;
    //텍스트뷰 eTextView;
    //텍스트뷰 eTextView2;
    //텍스트뷰 eTextView3;

    private EditText eText;
    private EditText eTextNP;
    private EditText eTextP;
    private Button eButton;
    private TextView eTextView;
    private TextView eTextView2;
    private TextView eTextView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        eText = (EditText) findViewById(R.id.edittext);
        eTextNP = (EditText) findViewById(R.id.editTextNumberPassword);
        eTextP = (EditText) findViewById(R.id.editTextPhone);
        eButton = (Button) findViewById(R.id.button);
        eTextView = (TextView) findViewById(R.id.textView);
        eTextView2 = (TextView) findViewById(R.id.textView2);
        eTextView3 = (TextView) findViewById(R.id.textView3);



    }

    public void onClicked(View view) {
        String str = eText.getText().toString();
        eTextView.setText(str);
        String str2 = eTextNP.getText().toString();
        eTextView2.setText(str2);
        String str3 = eTextP.getText().toString();
        eTextView3.setText(str3);
    }
}