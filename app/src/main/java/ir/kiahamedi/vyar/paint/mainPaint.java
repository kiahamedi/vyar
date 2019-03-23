package ir.kiahamedi.vyar.paint;

import android.graphics.Bitmap;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileOutputStream;

import ir.kiahamedi.vyar.R;

public class mainPaint extends AppCompatActivity {

    private CanvasView canvasView;
    private Button clearCan,shot;
    private View main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_paint);
        main = findViewById(R.id.pMain);
        canvasView = (CanvasView) findViewById(R.id.canvas);

        clearCan = (Button)findViewById(R.id.clearCan);
        shot = (Button)findViewById(R.id.screenshot);

        shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap b = screenshot.takescreenshotOfRootView(main);
                //long unixTime = System.currentTimeMillis() / 1000L;
                //saveImage(b,"save");
            }
        });




    }

    private void saveImage(Bitmap finalBitmap, String image_name) {

        String root = Environment.getExternalStorageDirectory().toString();
        File myDir = new File(root);
        myDir.mkdirs();
        String fname = "Image-" + image_name+ ".jpg";
        File file = new File(myDir, fname);
        if (file.exists()) file.delete();
        Log.i("LOAD", root + fname);
        try {
            FileOutputStream out = new FileOutputStream(file);
            finalBitmap.compress(Bitmap.CompressFormat.JPEG, 90, out);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearCanvas(View v){
        canvasView.clearCanvas();
    }
}
