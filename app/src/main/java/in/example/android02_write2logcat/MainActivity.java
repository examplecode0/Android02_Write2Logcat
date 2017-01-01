package in.example.android02_write2logcat;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Writing to Logcat using System.out.println");
        Log.i("SomeTag", "Writing to Logcat I");
    }
}
