package galon.mahimer.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Brand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brand);
    }

    public void image(View v){
        Intent i;
        if (v.getId() == R.id.imageMain2){
            i = new Intent(this, Main2Activity.class);
            startActivity(i);
        } else if (v.getId() == R.id.imageMain3){
            i = new Intent(this, Main3Activity.class);
            startActivity(i);
        } else if (v.getId() == R.id.imageMain4){
            i = new Intent(this, Main4Activity.class);
            startActivity(i);
        } else if (v.getId() == R.id.imageMain5){
            i = new Intent(this, Main5Activity.class);
            startActivity(i);
        } else if (v.getId() == R.id.imageMain6){
            i = new Intent(this, Main6Activity.class);
            startActivity(i);
        } else if (v.getId() == R.id.imageMain7){
            i = new Intent(this, Main7Activity.class);
            startActivity(i);
        } else if (v.getId() == R.id.imageMain8){
            i = new Intent(this, Main8Activity.class);
            startActivity(i);
        } else if (v.getId() == R.id.imageMain9){
            i = new Intent(this, Main9Activity.class);
            startActivity(i);
        } else if (v.getId() == R.id.imageMain10){
            i = new Intent(this, Main10Activity.class);
            startActivity(i);
        }
    }

    public void sort(View v){
        Intent i;
        if (v.getId() == R.id.btn_brand){
            i = new Intent(this, Brand.class);
            startActivity(i);
        } else if (v.getId() == R.id.btn_price){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.btn_avail){
            i = new Intent(this, Availability.class);
            startActivity(i);
        } else if (v.getId() == R.id.btn_purpose){
            i = new Intent(this, Purpose.class);
            startActivity(i);
        } else if (v.getId() == R.id.btn_exit){
            i = new Intent(this, START.class);
            startActivity(i);
        }
    }
}

