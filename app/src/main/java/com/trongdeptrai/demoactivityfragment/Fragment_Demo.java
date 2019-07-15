package com.trongdeptrai.demoactivityfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_Demo extends Fragment {
    private static final String TAG = "FRAGMENT_LIFE_CYCLE  ";
    private View mView;
    private TextView tv_Status_Fragment;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG, "is Attach!");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, " is Created!");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_demo, container, false);
        Log.i(TAG, " is Create View!");
        return mView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Controlls();
        Log.i(TAG, " is Activity Created!");
        onSetText(" is Activity Created!");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, " is Start!");
        onSetText(" is Start!");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, " is Resume!");
        onSetText(" is Resume!");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, " is Pause!");
        onSetText(" is Pause!");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, " is Stop!");
        onSetText(" is Stop!");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, " is Destroy View!");
        onSetText(" is Destroy View!");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, " is Destroy!");
        onSetText(" is Destroy!");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, " is Detach!");
        onSetText(" is Detach!");
    }

    private void Controlls() {
        tv_Status_Fragment = mView.findViewById(R.id.tv_status_fragment);
    }
    private void onSetText(String text){
        tv_Status_Fragment.setText(TAG + text);
    }
}
