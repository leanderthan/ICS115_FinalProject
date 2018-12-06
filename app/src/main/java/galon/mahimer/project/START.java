package galon.mahimer.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class START extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void welcome(View v){
        Intent i;
        if (v.getId() == R.id.btn_flash){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
