package galon.mahimer.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void back(View v){
        Intent i;
        if (v.getId() == R.id.btn_back){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else  if (v.getId() == R.id.btn_Stat){
            i = new Intent(this, Stat2.class);
            startActivity(i);
        }
    }
}
