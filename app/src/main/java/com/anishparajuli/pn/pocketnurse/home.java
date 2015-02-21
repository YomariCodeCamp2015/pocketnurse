package com.anishparajuli.pn.pocketnurse;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewAnimator;

import java.text.DateFormat;
import java.util.Date;


public class home extends ActionBarActivity {

ImageView bg;
    FrameLayout f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);

        bg=(ImageView)findViewById(R.id.bg);
        f=(FrameLayout)findViewById(R.id.before);

        String str= DateFormat.getDateInstance().format(new Date());
        TextView hint = (TextView) findViewById(R.id.hint);

        String b=str.substring(4,6);
        int a=Integer.parseInt(b);

        String str1 = "TIP:Copy your kitty: Learn to do stretching exercises when you wake up. It boosts circulation and digestion, and eases back pain.";
        String str2 = "TIP:Don’t skip breakfast. Studies show that eating a proper breakfast is one of the most positive things you can do if you are trying to lose weight.";
        String str3 = "TIP:Brush up on hygiene.Improper brushing can cause as much damage to the teeth and gums as not brushing at all.";
        String str4 = "TIP:Neurobics for your mind. Get your brain fizzing with energy. American researchers coined the term ‘neurobics’ for tasks which activate the brain's own biochemical pathways and to bring new pathways online that can help to strengthen or preserve brain circuits. ";
        String str5 = "TIP:Get what you give! Always giving and never taking? This is the short road to compassion fatigue. ";
        String str6 = "TIP:Get spiritual. A study conducted by the formidably sober and scientific Harvard University found that patients who were prayed for recovered quicker than those who weren’t, even if they weren’t aware of the prayer.";
        String str7 = "TIP:Get smelly. Garlic, onions, spring onions and leeks all contain stuff that’s good for you. A study at the Child’s Health Institute in Cape Town found that eating raw garlic helped fight serious childhood infections.";
        String str8 = "TIP:Knock one back. A glass of red wine a day is good for you.";
        String str9 = "TIP:Bone up daily. Get your daily calcium by popping a tab, chugging milk or eating yoghurt";
        String str10 = "TIP:I say tomato. Tomato is a superstar in the fruit and veggie pantheon";
        int tip=a%10;



        switch (tip) {
            case 1:
                hint.setText(str1);
                break;
            case 2:
                hint.setText(str2);
                break;
            case 3:
                hint.setText(str3);
                break;
            case 4:
                hint.setText(str4);
                break;
            case 5:
                hint.setText(str5);
                break;
            case 6:
                hint.setText(str6);
                break;
            case 7:
                hint.setText(str7);
                break;
            case 8:
                hint.setText(str8);
                break;
            case 9:
                hint.setText(str9);
                break;
            case 0:
                hint.setText(str10);
                break;
            default:
                hint.setText(str1);
        }


        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {

                    f.setVisibility(View.INVISIBLE);
                    f.setClickable(false);
            }
        }, 5000);



    }



public void healthnews(View v){
    startActivity(new Intent(this,news.class));

}

    public void maps(View v){
      startActivity(new Intent(this,Maps.class));
    }

    public void about(View v){
        startActivity(new Intent(this,about.class));
    }


}

