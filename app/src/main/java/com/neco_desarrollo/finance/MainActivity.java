package com.neco_desarrollo.finance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        CharSequence text = " onCreare!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText( context, text,Toast.LENGTH_LONG );
        toast.show();
        Log.i(TAG, "Это мое информация для записи в журнале");
        Log.w(TAG, "Это мое предупреждения для записи в журнале");
        Log.d(TAG, "Это мое отладка для записи в журнале");
        Log.v(TAG, "Это мое подробности для записи в журнале");
        Log.e(TAG, "Это мое onCreate error для записи в журнале");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Context context = getApplicationContext();
        CharSequence text = "onStart!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Это мое информация для записи в журнале");
        Log.w(TAG, "Это мое предупреждения для записи в журнале");
        Log.d(TAG, "Это мое отладка для записи в журнале");
        Log.v(TAG, "Это мое подробности для записи в журнале");
        Log.e(TAG, "Это мое onStart error для записи в журнале");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Context context = getApplicationContext();
        CharSequence text = "onStop!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Это мое информация для записи в журнале");
        Log.w(TAG, "Это мое предупреждения для записи в журнале");
        Log.d(TAG, "Это мое отладка для записи в журнале");
        Log.v(TAG, "Это мое подробности для записи в журнале");
        Log.e(TAG, "Это мое onStop error для записи в журнале");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Context context = getApplicationContext();
        CharSequence text = "onDestroy!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Это мое информация для записи в журнале");
        Log.w(TAG, "Это мое предупреждения для записи в журнале");
        Log.d(TAG, "Это мое отладка для записи в журнале");
        Log.v(TAG, "Это мое подробности для записи в журнале");
        Log.e(TAG, "Это мое onDestroy error для записи в журнале");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Context context = getApplicationContext();
        CharSequence text = "onPause!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Это мое информация для записи в журнале");
        Log.w(TAG, "Это мое предупреждения для записи в журнале");
        Log.d(TAG, "Это мое отладка для записи в журнале");
        Log.v(TAG, "Это мое подробности для записи в журнале");
        Log.e(TAG, "Это мое onPause error для записи в журнале");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Context context = getApplicationContext();
        CharSequence text = "onResume!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Log.i(TAG, "Это мое информация для записи в журнале");
        Log.w(TAG, "Это мое предупреждения для записи в журнале");
        Log.d(TAG, "Это мое отладка для записи в журнале");
        Log.v(TAG, "Это мое подробности для записи в журнале");
        Log.e(TAG, "Это мое onResume error для записи в журнале");
    }
}