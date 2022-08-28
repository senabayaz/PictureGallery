package com.example.picturegallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.picturegallery.databinding.ActivityArtistGalleryBinding;
import com.example.picturegallery.databinding.ActivityMainBinding;

public class ArtistGallery extends AppCompatActivity {
    private ActivityArtistGalleryBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_gallery);

        bind = ActivityArtistGalleryBinding.inflate(getLayoutInflater());
        View view = bind.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        //Sınıfa çevrildi. Serializable => Constructor nesnelerini bütünüyle tutan yapı.
        Artist art = (Artist) intent.getSerializableExtra("Artists");

        bind.imageView.setImageResource(art.img);
        bind.textView.setText(art.artistName);
        bind.textView2.setText(art.imageName);

    }
}