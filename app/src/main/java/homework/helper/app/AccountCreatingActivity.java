package homework.helper.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AccountCreatingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_creating);

        // create a adapter
        String[] country = {"Canada", "Mexico", "USA"};
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, country);

        // create a spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // add adapter to spinner
        spinner.setAdapter(stringArrayAdapter);
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
    }
}
