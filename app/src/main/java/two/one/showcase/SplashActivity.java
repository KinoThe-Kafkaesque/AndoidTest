package two.one.showcase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    private ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        logo = findViewById(R.id.logo);
        Animation aniRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
        logo.startAnimation(aniRotate);
        t1.start();
    }
    Thread t1 = new Thread(){
        @Override
        public void run() {
            try {
                sleep(2000);
                Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
                startActivity(intent);
                SplashActivity.this.finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
}