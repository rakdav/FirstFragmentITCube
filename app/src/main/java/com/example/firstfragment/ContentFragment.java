package com.example.firstfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class ContentFragment extends Fragment {
    private Button update;
    private TextView text;
    private static final String TAG="life";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
    }

    //CREATED
        //INITITIALIZED
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            Log.d(TAG,"onCreateView");
            return inflater.inflate(R.layout.fragment_content, container, false);
        }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);
            update=view.findViewById(R.id.update);
            text=view.findViewById(R.id.dateText);
            update.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String curDate=new Date().toString();
                    text.setText(curDate);
                }
            });
            Log.d(TAG,"onViewCreated");
        }
        //CREATED
        @Override
        public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
            super.onViewStateRestored(savedInstanceState);
            Log.d(TAG,"onViewStateRestored");
        }
    //STARTED
        @Override
        public void onStart() {
            super.onStart();
            Log.d(TAG,"onStart");
        }
    //RESUMED
        @Override
        public void onResume() {
            super.onResume();
            Log.d(TAG,"onResume");
        }
    //STARTED
        @Override
        public void onPause() {
            super.onPause();
            Log.d(TAG,"onPause");
        }
    //CREATED
        //CREATED
        @Override
        public void onStop() {
            super.onStop();
            Log.d(TAG,"onStop");
        }

        @Override
        public void onSaveInstanceState(@NonNull Bundle outState) {
            super.onSaveInstanceState(outState);
            Log.d(TAG,"onSaveInstanceState");
        }
        //DESTROYED
        @Override
        public void onDestroyView() {
            super.onDestroyView();
            Log.d(TAG,"onDestroyView");
        }
    //DESTROYED
        @Override
        public void onDestroy() {
            super.onDestroy();
            Log.d(TAG,"onDestroy");
        }
}