package android.example.codingchallenge01_1;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TAG", "On Create() is being executed!");
        Log.i("MainActivity", "MainActivity layout is complete");
    }

    private static final String TAG = "CREATION";
}
