package image.color.git.lab22and3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        final ExerciseModel exerciseModel = new ExerciseModel();
        exerciseModel.addElements();

        ArrayList<String> listOfCountries = exerciseModel.getCountries();

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
        final EditText editText = new EditText(this);

//     Creating ListView programmatically
        ListView listView = new ListView(this);
//     Creating Array Adapter
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                listOfCountries
        );

//     Creating onClickListeners
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  editTextValue = editText.getText().toString();
                Log.d("onClick", "" + editTextValue);
                exerciseModel.addCountries(editTextValue);
                arrayAdapter.notifyDataSetChanged();
            }
        });

        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  editTextValue = editText.getText().toString();
                Log.d("onClick", "" + editTextValue);
                exerciseModel.removeCountries();
                arrayAdapter.notifyDataSetChanged();
            }
        });

//     Populating listView with data
        listView.setAdapter(arrayAdapter);
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
