package e.nekozawa.a1l1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int currentTime= Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        TextView textView=findViewById(R.id.greetings);
        textView.setText(getString(R.string.hello)+" "+currentTime);
    }
}
