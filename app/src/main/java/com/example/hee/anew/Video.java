package com.example.hee.anew;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by hee on 2017-12-16.
 */

public class Video extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);



        //비디오뷰 선언
        VideoView videoView = (VideoView)findViewById(R.id.videoView1);
        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(videoView);
        Uri video = Uri.parse("android.resource://com.example.hee.anew/" + getPackageName() + "/" +R.raw.shelter);

        videoView.setMediaController(mediaController);

        videoView.setVideoURI(video);

        videoView.requestFocus();

        videoView.start();




    }



}
