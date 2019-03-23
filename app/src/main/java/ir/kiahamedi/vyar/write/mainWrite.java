package ir.kiahamedi.vyar.write;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import ir.kiahamedi.vyar.R;

public class mainWrite extends AppCompatActivity {

    private static final String TAG = "writeActivity";

    DatabaseHelper mDatabaseHelper;


    private EditText textvorojak;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_write);

        textvorojak = (EditText)findViewById(R.id.vojotext);
        btnSubmit = (Button)findViewById(R.id.submitText);

        mDatabaseHelper = new DatabaseHelper(this);

        final Random rn = new Random();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newEntry = textvorojak.getText().toString();
                if(textvorojak.length() != 0){
                    int num = rn.nextInt(3 - 1 + 1) + 1;
                    if (num == 1){
                        toastMessage("وروجک یک لبخند هم بزن و دوباره رو قلب بزن");
                    }
                    if (num == 2){
                        AddData(newEntry);
                        textvorojak.setText("");
                        finish();
                    }
                    if (num == 3){
                        toastMessage("وروجک نمیخوای زیاد بخندی؟");
                    }



                }else {
                    toastMessage("وروجک برای کار کردن قلب شیطون باید چیزی بنویسی");
                }
            }
        });

    }


    public void AddData(String newEntry){
        boolean insertData = mDatabaseHelper.addData(newEntry);

        if (insertData){
            toastMessage("خب اینم اضافه شد");
        }else {
            toastMessage("اوپس نشد اضافه کنم!");
        }
    }


    /**
     * customizable toast
     * @param message
     */
    private void toastMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }






}
