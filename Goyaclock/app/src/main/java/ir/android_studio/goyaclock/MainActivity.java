package ir.android_studio.goyaclock;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;


public class MainActivity extends AppCompatActivity {
    int h = 0;
    int m = 0;
    int s = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer w = MediaPlayer.create(this, R.raw.saat);
        final MediaPlayer w1 = MediaPlayer.create(this, R.raw.daghigheh);
        final MediaPlayer w2 = MediaPlayer.create(this, R.raw.daghigheho);
        final MediaPlayer w3 = MediaPlayer.create(this, R.raw.q1);
        final MediaPlayer q1 = MediaPlayer.create(this, R.raw.q1o);
        final MediaPlayer w5 = MediaPlayer.create(this, R.raw.q2);
        final MediaPlayer q2 = MediaPlayer.create(this, R.raw.q2o);
        final MediaPlayer w7 = MediaPlayer.create(this, R.raw.q3);
        final MediaPlayer q3 = MediaPlayer.create(this, R.raw.q3o);
        final MediaPlayer w9 = MediaPlayer.create(this, R.raw.q4);
        final MediaPlayer q4 = MediaPlayer.create(this, R.raw.q4o);
        final MediaPlayer w11 = MediaPlayer.create(this, R.raw.q5);
        final MediaPlayer q5 = MediaPlayer.create(this, R.raw.q5o);
        final MediaPlayer w13 = MediaPlayer.create(this, R.raw.sd50o);
        final MediaPlayer w14 = MediaPlayer.create(this, R.raw.sd50);
        final MediaPlayer w15 = MediaPlayer.create(this, R.raw.sd40o);
        final MediaPlayer w16 = MediaPlayer.create(this, R.raw.sd40);
        final MediaPlayer w17 = MediaPlayer.create(this, R.raw.sanieh);
        final MediaPlayer w18 = MediaPlayer.create(this, R.raw.sd13o);
        final MediaPlayer w19 = MediaPlayer.create(this, R.raw.q8);
        final MediaPlayer q6 = MediaPlayer.create(this, R.raw.q8o);
        final MediaPlayer w21 = MediaPlayer.create(this, R.raw.q9);
        final MediaPlayer q7 = MediaPlayer.create(this, R.raw.q9o);
        final MediaPlayer w23 = MediaPlayer.create(this, R.raw.q12);
        final MediaPlayer q8 = MediaPlayer.create(this, R.raw.q12o);
        final MediaPlayer w25 = MediaPlayer.create(this, R.raw.q10);
        final MediaPlayer q9 = MediaPlayer.create(this, R.raw.q10o);
        final MediaPlayer w27 = MediaPlayer.create(this, R.raw.q13);
        final MediaPlayer w28 = MediaPlayer.create(this, R.raw.sd40o);
        final MediaPlayer w29 = MediaPlayer.create(this, R.raw.sd14);
        final MediaPlayer sa = MediaPlayer.create(this, R.raw.s21);
        final MediaPlayer sa2 = MediaPlayer.create(this, R.raw.s21o);
        final MediaPlayer sa3 = MediaPlayer.create(this, R.raw.s22);
        final MediaPlayer sa4 = MediaPlayer.create(this, R.raw.s22o);
        final MediaPlayer sa5 = MediaPlayer.create(this, R.raw.s23);
        final MediaPlayer sa6 = MediaPlayer.create(this, R.raw.s23o);
        final MediaPlayer w30 = MediaPlayer.create(this, R.raw.sd50);
        final MediaPlayer w31 = MediaPlayer.create(this, R.raw.sd15o);
        final MediaPlayer w32 = MediaPlayer.create(this, R.raw.sd17);
        final MediaPlayer w33 = MediaPlayer.create(this, R.raw.sd17o);
        final MediaPlayer w34 = MediaPlayer.create(this, R.raw.sd18);
        final MediaPlayer w35 = MediaPlayer.create(this, R.raw.sd18o);
        final MediaPlayer w36 = MediaPlayer.create(this, R.raw.sd19);
        final MediaPlayer w37 = MediaPlayer.create(this, R.raw.sd19o);
        final MediaPlayer w38 = MediaPlayer.create(this, R.raw.sd20);
        final MediaPlayer w39 = MediaPlayer.create(this, R.raw.sd20o);
        final MediaPlayer w40 = MediaPlayer.create(this, R.raw.sd40);
        final MediaPlayer w41 = MediaPlayer.create(this, R.raw.sd40o);
        final MediaPlayer w42 = MediaPlayer.create(this, R.raw.sd30);
        final MediaPlayer w43 = MediaPlayer.create(this, R.raw.sd30o);
        final MediaPlayer w44 = MediaPlayer.create(this, R.raw.sd16o);
        final MediaPlayer w45 = MediaPlayer.create(this, R.raw.sd16);
        final MediaPlayer w46 = MediaPlayer.create(this, R.raw.q12);
        final MediaPlayer q12 = MediaPlayer.create(this, R.raw.q12o);
        final MediaPlayer w48 = MediaPlayer.create(this, R.raw.sd18);
        final MediaPlayer w49 = MediaPlayer.create(this, R.raw.sd18o);
        final MediaPlayer w50 = MediaPlayer.create(this, R.raw.q6);
        final MediaPlayer q10 = MediaPlayer.create(this, R.raw.q6o);
        final MediaPlayer w52 = MediaPlayer.create(this, R.raw.q7);
        final MediaPlayer q11 = MediaPlayer.create(this, R.raw.q7o);


        TextView t = (TextView) findViewById(R.id.b1);
        Typeface tf = Typeface.createFromAsset(getAssets(), "digital7.otf");
        t.setTypeface(tf);
        TextView tt = (TextView) findViewById(R.id.b2);
        Typeface ty = Typeface.createFromAsset(getAssets(), "digital7.otf");
        tt.setTypeface(ty);
        TextView ttt = (TextView) findViewById(R.id.b3);
        Typeface tyy = Typeface.createFromAsset(getAssets(), "digital7.otf");
        ttt.setTypeface(tyy);
        TextView tttt = (TextView) findViewById(R.id.b4);
        Typeface tyyy = Typeface.createFromAsset(getAssets(), "digital7.otf");
        tttt.setTypeface(tyyy);
        ttt.setTypeface(tyy);
        TextView ttttt = (TextView) findViewById(R.id.b5);
        Typeface tyyyy = Typeface.createFromAsset(getAssets(), "digital7.otf");
        ttttt.setTypeface(tyyyy);
        ttt.setTypeface(tyy);
        TextView tttttt = (TextView) findViewById(R.id.b6);
        Typeface tyyyyy = Typeface.createFromAsset(getAssets(), "digital7.otf");
        tttttt.setTypeface(tyyyyy);
        TextView ttttttt = (TextView) findViewById(R.id.b7);
        Typeface tyyyyyy = Typeface.createFromAsset(getAssets(), "digital7.otf");
        ttttttt.setTypeface(tyyyyyy);

        Button b = (Button) findViewById(R.id.button);
        Date clk = new Date();
        final int h = clk.getHours();
        final int m = clk.getMinutes();
        final int s = clk.getSeconds();
        final TextView h1 = (TextView) findViewById(R.id.b3);
        final TextView m1 = (TextView) findViewById(R.id.b4);
        final TextView s1 = (TextView) findViewById(R.id.b7);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h1.setText(String.valueOf(h));
                m1.setText(String.valueOf(m));
                s1.setText(String.valueOf(s));
                w.start();
                if (h != 0 && m != 0) {

                    switch (h) {
                        case 1:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    q1.start();

                                }
                            });
                            break;
                        case 2:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    q2.start();

                                }
                            });
                            break;
                        case 3:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    q3.start();

                                }
                            });
                            break;
                        case 4:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                q4.start();

                            }
                        });
                            break;
                        case 5:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    q5.start();

                                }
                            });
                            break;
                        case 6:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    q6.start();

                                }
                            });
                            break;
                        case 7:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    q7.start();

                                }
                            });
                            break;
                        case 8:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    q8.start();

                                }
                            });
                            break;
                        case 9:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    q9.start();

                                }
                            });
                            break;
                        case 10:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    q10.start();

                                }
                            });
                            break;
                        case 11:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    q11.start();

                                }
                            });
                            break;
                        case 12:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    q12.start();

                                }
                            });
                            break;
                        case 13:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    w18.start();

                                }
                            });
                            break;
                        case 14:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    w28.start();

                                }
                            });
                            break;
                        case 15:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    w31.start();

                                }
                            });
                            break;
                        case 16:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    w44.start();

                                }
                            });
                            break;
                        case 17:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    w33.start();

                                }
                            });
                            break;
                        case 18:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    w49.start();

                                }
                            });
                            break;
                        case 19:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    w37.start();

                                }
                            });
                            break;
                        case 20:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    w39.start();

                                }
                            });
                            break;
                        case 21:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    sa2.start();

                                }
                            });
                            break;
                        case 22:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    sa4.start();

                                }
                            });
                            break;
                        case 23:
                            w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    sa6.start();

                                }
                            });
                            break;

                    }
            }
        }
        });
    }
}





