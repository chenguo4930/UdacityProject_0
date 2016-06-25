package com.example.chengguo.udacityproject_0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mPopularMoviesBtn;
    private Button mStockHawkBtn;
    private Button mBuildItBiggerBtn;
    private Button mMakeYourAppMaterialBtn;
    private Button mGoUbiquitousBtn;
    private Button mCapstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPopularMoviesBtn = (Button) findViewById(R.id.btn_popular_movies);
        mStockHawkBtn = (Button) findViewById(R.id.btn_stock_hawk);
        mBuildItBiggerBtn = (Button) findViewById(R.id.btn_build_it_bugger);
        mMakeYourAppMaterialBtn = (Button) findViewById(R.id.btn_make_your_app_material);
        mGoUbiquitousBtn = (Button) findViewById(R.id.btn_go_ubuquitous);
        mCapstoneBtn = (Button) findViewById(R.id.btn_capstone);

        mPopularMoviesBtn.setOnClickListener(this);
        mStockHawkBtn.setOnClickListener(this);
        mBuildItBiggerBtn.setOnClickListener(this);
        mMakeYourAppMaterialBtn.setOnClickListener(this);
        mGoUbiquitousBtn.setOnClickListener(this);
        mCapstoneBtn.setOnClickListener(this);
    }

    /**
     * Do you know any easy steps
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_popular_movies:
                toast(mPopularMoviesBtn.getText().toString());
                break;
            case R.id.btn_stock_hawk:
                toast(mStockHawkBtn.getText().toString());
                break;
            case R.id.btn_build_it_bugger:
                toast(mBuildItBiggerBtn.getText().toString());
                break;
            case R.id.btn_make_your_app_material:
                toast(mMakeYourAppMaterialBtn.getText().toString());
                break;
            case R.id.btn_go_ubuquitous:
                toast(mGoUbiquitousBtn.getText().toString());
                break;
            case R.id.btn_capstone:
                toast(mCapstoneBtn.getText().toString());
                break;
        }
    }

    /**
     * show message
     *
     * @param s
     */
    private void toast(String s) {
        Toast.makeText(MainActivity.this, "This button will do " + s, Toast.LENGTH_SHORT).show();
    }
}
