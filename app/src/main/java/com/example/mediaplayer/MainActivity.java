package org.nmit.mediaplayer;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button forward;
    Button rewind;
    Button pause;
    Button stop;
    Button reset;
    Button play;
    int starttime = 0 ; // startime is 0s
    int stopttime = 0; // stoptime is 0s by default
    int forwardtime = 5000 ; // 5s for forward
    int backwardtime = 5000 ; // 5s for backwardtime
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=findViewById(R.id.play);
        forward=findViewById(R.id.forward);
        reset=findViewById(R.id.reset);
        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,
                R.raw.first) ;
        play.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Playing Media now",
                        Toast.LENGTH_SHORT).show();
                //MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.first);
                mediaPlayer.start();
            }
        });
        reset.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.seekTo(starttime);
                mediaPlayer.start();
            }
        });
    }
}