package a4040e071.a4040e071_ex21;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etname;
    private EditText etpassword;
    private EditText etphone;
    private EditText etage;
    private Button clear;
    private TextView message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }


    private void findViews() {
        etname = (EditText) findViewById(R.id.etname);
        etpassword = (EditText) findViewById(R.id.etpassword);
        etphone = (EditText) findViewById(R.id.etphone);
        etage = (EditText) findViewById(R.id.etage);
        clear = (Button) findViewById(R.id.clear);
        message = (TextView) findViewById(R.id.message);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etname.setText(null);
                etpassword.setText(null);
                etphone.setText(null);
                etage.setText(null);
                message.setText(null);
                Toast.makeText(
                        MainActivity.this,
                        R.string.ClearAllFields,
                        Toast.LENGTH_SHORT

                ).show();
            }
        });
    }

    public void onSubmitClick(View view) {
        String name = etname.getText().toString().trim();
        String password = etpassword.getText().toString().trim();
        String phone = etphone.getText().toString().trim();
        String age = etage.getText().toString().trim();
        String text = "";
        text += "user name =  " + name + "\n";
        text += "password =  " + password + "\n";
        text += "phone number = " + phone + "\n";
        text += "age = " + age + "\n";
        message.setText(text);
    }
}


