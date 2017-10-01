package homework.helper.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class AccountCreatingActivity extends AppCompatActivity {

    ListView Classes;
    ArrayAdapter<String> adapter;
    ArrayAdapter<String> classAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_creating);

        // create a spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.years, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        // create listener and add to spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // put code which recognize a selected element
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        Classes = (ListView)findViewById(R.id.Classes);
        ArrayList<String> clas = new ArrayList<>();
        clas.addAll(Arrays.asList(getResources().getStringArray(R.array.my_classes)));

        classAdapter = new ArrayAdapter<String>(
                AccountCreatingActivity.this,
                android.R.layout.simple_expandable_list_item_1,
                clas
        );

        Classes.setAdapter(adapter);

    }
}
