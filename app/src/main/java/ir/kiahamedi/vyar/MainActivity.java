package ir.kiahamedi.vyar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import tyrantgit.explosionfield.ExplosionField;

public class MainActivity extends AppCompatActivity {

    private Button exelent,good,notbad,verybad;
    private ExplosionField mExplosionField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mExplosionField = ExplosionField.attach2Window(this);

        exelent = (Button) findViewById(R.id.btn_excelent);
        good = (Button) findViewById(R.id.btn_good);
        notbad = (Button) findViewById(R.id.btn_notbad);
        verybad = (Button) findViewById(R.id.btn_verybad);


        exelent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExplosionField.explode(v);

            }
        });


        good.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExplosionField.explode(v);
            }
        });


        notbad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExplosionField.explode(v);
            }
        });

        verybad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExplosionField.explode(v);
            }
        });
    }


}
