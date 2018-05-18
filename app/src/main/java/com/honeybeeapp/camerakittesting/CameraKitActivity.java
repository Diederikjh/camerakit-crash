package com.honeybeeapp.camerakittesting;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import com.camerakit.CameraKitView;

public class CameraKitActivity extends AppCompatActivity {

    private CameraKitView mCameraView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_kit);
        mCameraView = findViewById(R.id.camera);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mCameraView.onResume();
    }

    @Override
    protected void onPause() {
        mCameraView.onPause();
        super.onPause();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        mCameraView.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
