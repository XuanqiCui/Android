package com.starwar.yuanshenlanuch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btn_lancher;
    private SoundPool sp;
    private int music_yuanlanuch;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_lancher = (Button) findViewById(R.id.btn_lancher);


        sp = new SoundPool(2, AudioManager.STREAM_SYSTEM, 5);
       /*第一个参数为同时播放数据流的最大个数，第二数据流类型，第三为声音质量*/
        music_yuanlanuch = sp.load(this, R.raw.yuanshen, 1);
        /*第三个参数是播放次数*/



    }

    public void openYuanShen(View view) {

        yuanlanuchAudio();

        mwait();

        Intent intent = new Intent();
        intent.setClassName("com.miHoYo.Yuanshen","com.miHoYo.GetMobileInfo.MainActivity");
        startActivity(intent);
    }

    public void mwait(){

        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void yuanlanuchAudio(){
        sp.play(music_yuanlanuch,1,1,0,0,1);
        Toast.makeText(this, "ご主人様、お願いします", Toast.LENGTH_SHORT).show();
    }

}