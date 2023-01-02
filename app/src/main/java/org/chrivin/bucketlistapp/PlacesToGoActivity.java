package org.chrivin.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] placesToGo = {
                new BucketListEntry("Japan", "Akihabara, Shibuya, Bamboo Forest and Hot Springs!",R.drawable.japan,5),
                new BucketListEntry("England", "London,Big Ben, Botanic Gardens and St. Paul's Catherdal",R.drawable.london,3),
                new BucketListEntry("Raja Ampat", "Take a dive Course, go to Batanta Island Waterfall",R.drawable.rajaampat,4.5f),
                new BucketListEntry("Singapore", "Marina Bay Sands, Universal Studio Singapore, Singapore Flyer",R.drawable.singapore_2_11zon,4),
                new BucketListEntry("Jerusalem", "Dome of the rock, Yehuda Market, The Wailing Wall, Golgotha Hill",R.drawable.yerusalem,3.5f)
        };
        RecyclerView recyclerView = findViewById(R.id.recylerViewPlaces);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);
    }
}