package org.chrivin.bucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setupList();
    }

    private void setupList() {
        BucketListEntry[] thingsToDo = {
                new BucketListEntry("Became an Android Developer", "So I must Learn!!",R.drawable.androiddev,5),
                new BucketListEntry("Have a Girlfriend", "I want a girlfriend for this year!",R.drawable.dating,4),
                new BucketListEntry("Go to Gym", "I want to have a muscle!",R.drawable.gym,3.5f),
                new BucketListEntry("Swimming with friend", "Lets ask my friend to swim together!",R.drawable.swimming,2),
                new BucketListEntry("Karaoke with friend", "Lets ask my friend to karaoke together!",R.drawable.karaoke,3)
        };
        RecyclerView recyclerView = findViewById(R.id.recylerViewThings);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);
    }
}