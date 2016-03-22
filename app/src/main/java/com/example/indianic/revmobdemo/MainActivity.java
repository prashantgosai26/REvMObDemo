package com.example.indianic.revmobdemo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private AdView adView,adView1,adView2,adView3,adView4,adView5,adView6,adView7,adView8,adView9;
    private AdRequest adRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adView = (AdView) findViewById(R.id.ad_view);
        adView1 = (AdView) findViewById(R.id.ad_view1);
        adView2= (AdView) findViewById(R.id.ad_view2);
        adView3 = (AdView) findViewById(R.id.ad_view3);
        adView4 = (AdView) findViewById(R.id.ad_view4);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2390061552861981/5215866351");
        adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                mInterstitialAd.show();
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                finish();
            }
        },30000);
//        adView.loadAd(adRequest);
//        adView1.loadAd(adRequest);
//        adView2.loadAd(adRequest);
//        adView3.loadAd(adRequest);
//        adView4.loadAd(adRequest);
        adView5 = (AdView) findViewById(R.id.ad_view5);
        adView6 = (AdView) findViewById(R.id.ad_view6);
        adView7 = (AdView) findViewById(R.id.ad_view7);
        adView8 = (AdView) findViewById(R.id.ad_view8);
        adView9 = (AdView) findViewById(R.id.ad_view9);
//        adView5.loadAd(adRequest);
//        adView6.loadAd(adRequest);
//        adView7.loadAd(adRequest);
//        adView8.loadAd(adRequest);
//        adView9.loadAd(adRequest);

    }
}
