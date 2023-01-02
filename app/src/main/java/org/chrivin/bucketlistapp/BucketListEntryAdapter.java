package org.chrivin.bucketlistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListEntryAdapter extends RecyclerView.Adapter<BucketListEntryAdapter.BucketListViewHolder> {

    BucketListEntry[] entries;

    public BucketListEntryAdapter(BucketListEntry[] entries) {
        this.entries = entries;
    }

    @Override
    public int getItemCount() {
        return entries.length;
    }

    @NonNull
    @Override
    public BucketListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucket_list_entry, parent, false);
        return new BucketListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListViewHolder holder, int position) {
        holder.bind(entries[position],position);

    }


    static class BucketListViewHolder extends RecyclerView.ViewHolder{
        private ImageView image;
        private TextView headertext;
        private TextView descriptionText;
        private RatingBar ratingBar;

        public BucketListViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageViewItem);
            headertext = itemView.findViewById(R.id.textViewHeading);
            descriptionText = itemView.findViewById(R.id.textViewDesciption);
            ratingBar = itemView.findViewById(R.id.ratingBar);
        }

        public void bind(BucketListEntry entry, int position){
            image.setImageResource(entry.image);
            String headerString = position + 1 + ". " + entry.heading;
            headertext.setText(headerString);
            descriptionText.setText(entry.description);
            ratingBar.setRating(entry.rating);

        }

    }

}
