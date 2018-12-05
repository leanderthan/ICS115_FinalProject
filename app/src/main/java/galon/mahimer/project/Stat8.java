package galon.mahimer.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Stat8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat8);
    }
    public void back(View v){
        Intent i;
        if (v.getId() == R.id.btn_back){
            i = new Intent(this, Main8Activity.class);
            startActivity(i);
        }
    }
}
