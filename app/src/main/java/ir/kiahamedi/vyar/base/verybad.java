package ir.kiahamedi.vyar.base;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import ir.kiahamedi.vyar.R;
import tyrantgit.explosionfield.ExplosionField;

public class verybad extends AppCompatActivity {

    private Button write,read,draw,random;
    private ExplosionField mExplosionField;
    private TextView mainText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verybad);
        mExplosionField = ExplosionField.attach2Window(this);

        write = (Button) findViewById(R.id.btn_write);
        read = (Button) findViewById(R.id.btn_read);
        draw = (Button) findViewById(R.id.btn_draw);
        random = (Button) findViewById(R.id.btn_random);


        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExplosionField.explode(v);

                new CountDownTimer(1000, 1000) {
                    public void onTick(long millisUntilFinished) {

                    }

                    public void onFinish() {
                        //Intent i = new Intent(MainActivity.this, ir.kiahamedi.vyar.base.verybad.class);
                        //startActivity(i);
                    }
                }.start();
            }
        });

        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExplosionField.explode(v);

                new CountDownTimer(1000, 1000) {
                    public void onTick(long millisUntilFinished) {

                    }

                    public void onFinish() {
                        //Intent i = new Intent(MainActivity.this, ir.kiahamedi.vyar.base.verybad.class);
                        //startActivity(i);
                    }
                }.start();
            }
        });


        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExplosionField.explode(v);

                new CountDownTimer(1000, 1000) {
                    public void onTick(long millisUntilFinished) {

                    }

                    public void onFinish() {
                        //Intent i = new Intent(MainActivity.this, ir.kiahamedi.vyar.base.verybad.class);
                       // startActivity(i);
                    }
                }.start();
            }
        });


        draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mExplosionField.explode(v);

                new CountDownTimer(1000, 1000) {
                    public void onTick(long millisUntilFinished) {

                    }

                    public void onFinish() {
                        Intent i = new Intent(verybad.this, ir.kiahamedi.vyar.paint.mainPaint.class);
                        startActivity(i);
                    }
                }.start();
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
        reset(write);
        reset(read);
        reset(draw);
    }


    @Override
    protected void onResume() {
        super.onResume();
        fiXAlls();
    }
}
