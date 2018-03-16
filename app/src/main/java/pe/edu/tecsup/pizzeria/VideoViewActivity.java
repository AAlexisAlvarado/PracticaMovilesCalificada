package pe.edu.tecsup.pizzeria;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        videoView = (VideoView) findViewById(R.id.videoview);
        videoView.setMediaController(new MediaController(this));
//        videoView.setVideoURI(Uri.parse("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"));
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.publicidad));
        videoView.start();

    }

    public void controlador() {

        Button btn = (Button) findViewById(R.id.botonact1);

//hago clic y se abre el 2
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent Principal = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Principal);
            }
        });
    }
}



