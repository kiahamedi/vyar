package ir.kiahamedi.vyar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import tyrantgit.explosionfield.ExplosionField;

public class MainActivity extends AppCompatActivity {

    private Button exelent,good,notbad,verybad;
    private ExplosionField mExplosionField;
    private TextView mainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mExplosionField = ExplosionField.attach2Window(this);

        exelent = (Button) findViewById(R.id.btn_excelent);
        good = (Button) findViewById(R.id.btn_good);
        notbad = (Button) findViewById(R.id.btn_notbad);
        verybad = (Button) findViewById(R.id.btn_verybad);
        mainText = (TextView)findViewById(R.id.main_Text);



        mainText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiXAlls();
            }
        });

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

    private void reset(View root) {
        if (root instanceof ViewGroup) {
            ViewGroup parent = (ViewGroup) root;
            for (int i = 0; i < parent.getChildCount(); i++) {
                reset(parent.getChildAt(i));
            }
        } else {
            root.setScaleX(1);
            root.setScaleY(1);
            root.setAlpha(1);
        }
    }


    private void fiXAlls(){
        reset(exelent);
        reset(good);
        reset(notbad);
        reset(verybad);
    }


}
