package ir.kiahamedi.vyar.core;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import ir.kiahamedi.vyar.R;
import ir.kiahamedi.vyar.base.verybad;
import tyrantgit.explosionfield.ExplosionField;

public class SplachScreen extends AppCompatActivity {

    private ImageView imgSplash;
    private ExplosionField mExplosionField;

    private int count = 0;
    private long startMillis=0;
    private Random rn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);
        imgSplash = (ImageView) findViewById(R.id.imageSplash);
        mExplosionField = ExplosionField.attach2Window(this);

         rn = new Random();


        new CountDownTimer(2000, 1000) {
            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {

                mExplosionField.explode(imgSplash);
                new CountDownTimer(1000, 1000) {
                    public void onTick(long millisUntilFinished) {

                    }

                    public void onFinish() {
                        Intent i = new Intent(SplachScreen.this, MainActivity.class);
                        startActivity(i);
                        finish();

                    }
                }.start();

            }
        }.start();



    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int eventaction = event.getAction();
        if (eventaction == MotionEvent.ACTION_UP) {

            //get system current milliseconds
            long time= System.currentTimeMillis();


            //if it is the first time, or if it has been more than 3 seconds since the first tap ( so it is like a new try), we reset everything
            if (startMillis==0 || (time-startMillis> 3000) ) {
                startMillis=time;
                count=1;
            }
            //it is not the first, and it has been  less than 3 seconds since the first
            else{ //  time-startMillis< 3000
                count++;
            }

            if (count>=2) {
                int num = rn.nextInt(6 - 1 + 1) + 1;
                if (num == 1){
                    Toast.makeText(getApplicationContext(),"بزرگ فکر کن \" تقدیر”\n" +
                            "\n" +
                            "تقویم افراد عادی است …\n" +
                            "\n" +
                            "و\n" +
                            "\n" +
                            "\"تغییر”\n" +
                            "\n" +
                            "تدبیر افراد عالی",Toast.LENGTH_LONG).show();

                }
                if (num == 2){
                    Toast.makeText(getApplicationContext(),"تا وقتی\n" +
                            "\n" +
                            "به\u200C این فکر چسبیده\u200Cاید که\n" +
                            "\n" +
                            "دلیل خوب زندگی نکردنتان،\n" +
                            "\n" +
                            "بیرون از وجودتان است،\n" +
                            "\n" +
                            "هیچ تغییر مثبتی رخ نمی\u200Cدهد.\n" +
                            "\n" +
                            "تنها و تنها\n" +
                            "\n" +
                            "خودِ شما\n" +
                            "\n" +
                            "مسئول جنبه\u200Cهای قطعیِ موقعیتِ زندگیِ\n" +
                            "\n" +
                            "خود هستید\n" +
                            "\n" +
                            "و فقط و فقط خودتان\n" +
                            "\n" +
                            "قدرت تغییر آن را دارید.",Toast.LENGTH_LONG).show();

                }
                if (num == 3){
                    Toast.makeText(getApplicationContext(),"ﻟﺤﻈـﻪﻫــﺎ ﻧﻪ ﺩﯾــﺮ ﻣﯽﺁﯾﻨـــﺪ ﻭ ﻧـﻪ ﺯﻭﺩ\n" +
                            "\n" +
                            "ﺁﻥﻫــﺎ ﺩﺭﺳﺖ ﺳــﺮ ﻭﻗﺖ ﻣﯽﺁﯾـﻨـــﺪ\n" +
                            "\n" +
                            "ﺍﯾﻦ ﻣـــﺎ ﺁﺩﻡﻫــﺎﯾﯿﻢ ﮐﻪ ﺩﯾــﺮ ﯾــﺎ ﺯﻭﺩ، ﻣﯽﺭﺳﯿـــﻢ",Toast.LENGTH_LONG).show();

                }

                if (num == 4){
                    Toast.makeText(getApplicationContext(),"امروزت را زندگی کن\n" +
                            "\n" +
                            "فردا را فکر نکن\n" +
                            "\n" +
                            "شادی امروزت را از دست نده\n" +
                            "\n" +
                            "آنقدر بخند که آسمان دلت\n" +
                            "\n" +
                            "از ستاره بارور شود\n" +
                            "\n" +
                            "این بار تو…\n" +
                            "\n" +
                            "دنیا رو به بازی بگیر.",Toast.LENGTH_LONG).show();

                }

                if (num == 5){
                    Toast.makeText(getApplicationContext(),"زندگی تکرار فرداهای ماست\n" +
                            "\n" +
                            "می\u200Cرسد روزی که فردا نیستیم\n" +
                            "\n" +
                            "آنچه می\u200Cماند فقط نقش نکوست\n" +
                            "\n" +
                            "نقش\u200Cها می\u200Cماند و ما نیستیم",Toast.LENGTH_LONG).show();

                }

                if (num == 6){
                    Toast.makeText(getApplicationContext(),"خوشبخت\u200Cترین\n" +
                            "\n" +
                            "مخلوق خواهی بود\n" +
                            "\n" +
                            "اگر امروزت را\n" +
                            "\n" +
                            "آنچنان زندگی کنی\n" +
                            "\n" +
                            "که گویی نه فردایی\n" +
                            "\n" +
                            "وجود دارد برای دلهره\n" +
                            "\n" +
                            "و نه گذشته\u200Cای برای حسرت.",Toast.LENGTH_LONG).show();

                }
            }
            return true;
        }
        return false;
    }

}


