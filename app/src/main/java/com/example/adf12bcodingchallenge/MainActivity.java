package com.example.adf12bcodingchallenge;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView showCount;
    private Button zeroButton;
    private Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = (TextView) findViewById(R.id.show_count);
        zeroButton = (Button) findViewById(R.id.button_zero);
        countButton = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(MainActivity.this, R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        count++;
        if (showCount != null)
            showCount.setText(Integer.toString(count));

        if (count != 0) {
            countButton.setBackgroundColor(Color.parseColor("#00FF00"));
            zeroButton.setBackgroundColor(Color.parseColor("#FFC0CB"));
        } else {
            countButton.setBackgroundColor(Color.parseColor("00574B"));
            zeroButton.setBackgroundColor(Color.parseColor("#FFC0CB"));
        }
    }

    public void setZero(View view) {
        count = 0;
        showCount.setText("0");
        countButton.setBackgroundColor(Color.parseColor("#00574B"));
        zeroButton.setBackgroundColor(Color.parseColor("#A9A9A9"));
    }
}
