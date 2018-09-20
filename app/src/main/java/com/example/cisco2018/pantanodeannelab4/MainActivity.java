package com.example.cisco2018.pantanodeannelab4;

        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITE", "onCreate () has exexcuted");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITE", "onStart() has executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITE", "onResume() has executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITE", "onPause() has executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITE", "onStop() has executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITE", "onDestroy() has executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITE", "onRestart() hass executed");
    }

    public void showMessage1 (View view){
        Snackbar.make(view, " 4ITE is the best", Toast.LENGTH_LONG).show();
    }

    public void showMessage(View view){
        Toast.makeText(this, "4ITE is the best", Toast.LENGTH_LONG).show();
    }
}
