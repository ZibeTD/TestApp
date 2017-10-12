package com.dekhil.testapp;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

        import com.dekhil.testapp.dummy.DummyContent;

public class ReportConsumerProperties extends AppCompatActivity implements TUFragment.OnTUListFragmentInteractionListener, PlantFragment.OnPlantListFragmentInteractionListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report__consumer_properties);
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
}
