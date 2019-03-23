package ir.kiahamedi.vyar.write;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import ir.kiahamedi.vyar.R;

public class mainWrite extends AppCompatActivity {

    private EditText textvorojak;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_write);

        textvorojak = (EditText)findViewById(R.id.vojotext);
        btnSubmit = (Button)findViewById(R.id.submitText);


    }
}
