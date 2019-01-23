package com.e.encryption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = findViewById(R.id.editText);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = ed.getText().toString();

                int shift = 1;
               // Editable msg = enteredEditText.getText();
                String s = "";
                int len = st.length();
                for (int x = 0; x < len; x++) {
                    char c = (char) (st.charAt(x) + shift);
                    if (c > 'z' || (c > 'Z' && c < 'b'))
                    {
                        c -= 26;
                    }

                    s =s + c;
                }
                tv.setText(s);
            }
        });
    }
}
