package com.trongdeptrai.demoactivityfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "ACTIVITY_LIFT_CYCLE";
    private Button btn_DemoFragment;
    private TextView tv_Status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Controlls();
        Log.i(TAG, TAG + " is created!");
    }

    private void Controlls() {
        btn_DemoFragment = findViewById(R.id.btn_DemoFragment);
        tv_Status = findViewById(R.id.tv_Status);
        onSetText( "is Created!");
        btn_DemoFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new Fragment_Demo())
                        .commit();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, TAG + " is start!");
        onSetText( " is Start!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, TAG + " is resume!");
        onSetText( " is Resume!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, TAG + " is pause!");
        onSetText( " is Pause!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, TAG + " is stop!");
        onSetText( " is Stop!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, TAG + " is restart!");
        onSetText( " is Restart!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, TAG + " is destroy!");
        onSetText( "is Destroy!");
    }

    private  void onSetText(String text){
        tv_Status.setText( TAG + text);
    }
}
