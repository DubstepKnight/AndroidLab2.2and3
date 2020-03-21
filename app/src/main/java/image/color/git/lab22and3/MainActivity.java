package image.color.git.lab22and3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        LinearLayout btnLayout = new LinearLayout(this);
        Button addBtn = new Button(this);
        addBtn.setText("Add");
//    addBtn.setText("Nothing");
        btnLayout.addView(addBtn);

        setContentView(addBtn);
    }



}
