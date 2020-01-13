package com.informatika.wildanazmi.lindungimarkas;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.WindowManager;
import android.media.*;

public class GameActivity extends AppCompatActivity {

    MediaPlayer mysong;

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);

        gameView = new GameView(this, point.x, point.y);

        setContentView(gameView);


    }



    @Override
    protected void onResume() {
        super.onResume();
        gameView.resume();

    }
}
