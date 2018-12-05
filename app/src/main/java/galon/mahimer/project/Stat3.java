package galon.mahimer.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Stat3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat3);
    }
    public void back(View v){
        Intent i;
        if (v.getId() == R.id.btn_back){
            i = new Intent(this, Main3Activity.class);
            startActivity(i);
        }
    }
}
