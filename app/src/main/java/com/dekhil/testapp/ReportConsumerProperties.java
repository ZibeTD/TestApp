package com.dekhil.testapp;

        import android.net.Uri;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Spinner;
        import android.widget.TextView;

        import com.dekhil.testapp.dummy.DummyContent;

public class ReportConsumerProperties extends AppCompatActivity implements TUFragment.OnTUListFragmentInteractionListener, PlantFragment.OnPlantListFragmentInteractionListener, TUList.OnFragmentInteractionListener, PlantList.OnFragmentInteractionListener, AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report__consumer_properties);

        Spinner spinner = (Spinner) findViewById(R.id.tu_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onTUListFragmentInteraction(DummyContent.DummyItem item) {
        TextView text = (TextView)findViewById(R.id.tu_list_item_selected);
        text.setText(item.toString());
    }

    @Override
    public void OnPlantListFragmentInteractionListener(DummyContent.DummyItem item) {
        TextView text = (TextView)findViewById(R.id.plant_list_item_selected);
        text.setText(item.toString());
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (parent.getId() == R.id.tu_spinner) {
            TextView text = (TextView) findViewById(R.id.tu_list_item_selected);
            text.setText((String) parent.getItemAtPosition(position));
        }
        else {
            TextView text = (TextView)findViewById(R.id.plant_list_item_selected);
            text.setText((String) parent.getItemAtPosition(position));
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
