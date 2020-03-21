package image.color.git.lab22and3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//     Creating layouts programmatically
        LinearLayout verticalLayout = new LinearLayout(this);
        LinearLayout horizontalLayout = new LinearLayout(this);
//     Setting their orientations
        verticalLayout.setOrientation(LinearLayout.VERTICAL);
        horizontalLayout.setOrientation(LinearLayout.HORIZONTAL);
//     Creating buttons programmatically
        Button addBtn = new Button(this);
        Button editBtn = new Button(this);
        Button removeBtn = new Button(this);
//     Setting text to the buttons
        addBtn.setText("Add");
        editBtn.setText("Edit");
        removeBtn.setText("Remove");
//     Creating EditText programmatically
        EditText editText = new EditText(this);
//     Creating ListView programmatically
        ListView listView = new ListView(this);
//     Adding UI elements to the layouts
        verticalLayout.addView(horizontalLayout);
        horizontalLayout.addView(addBtn);
        horizontalLayout.addView(editBtn);
        horizontalLayout.addView(removeBtn);
        verticalLayout.addView(editText);
        verticalLayout.addView(listView);

        setContentView(verticalLayout);
    }



}
