package two.one.showcase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
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