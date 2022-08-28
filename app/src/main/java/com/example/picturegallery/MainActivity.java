package com.example.picturegallery;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.example.picturegallery.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding bind;
    ArrayList<Artist> artists;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bind = ActivityMainBinding.inflate(getLayoutInflater());
        View view = bind.getRoot();
        setContentView(view);


        artists = new ArrayList<Artist>();

        Artist hoca_ali = new Artist("Hoca Ali Efendi","Manzara",R.drawable.hoca_ali_riza);
        Artist ivan_fedorovich = new Artist("Ivan Fedorovich","Manzara",R.drawable.ivan_fedorovich);
        Artist turner = new Artist("Turner","Manzara",R.drawable.turner);
        Artist van_gogh = new Artist("Van Gogh","Manzara",R.drawable.van_gogh);
        Artist peter_joseph = new Artist("Peter Joseph","Manzara",R.drawable.peter_joseph);
        Artist thomas_cole = new Artist("Thomas Cole","Manzara",R.drawable.thomas_cole);
        Artist thomas_moran = new Artist("Thomas Moran","Manzara",R.drawable.thomas_moran);
        Artist william_fraser = new Artist("William Fraser","Manzara",R.drawable.william_fraser);
        Artist edward_wilkins = new Artist("Edward Wilkins","Manzara",R.drawable.edward_wilkins);
        Artist micheal_wutky = new Artist("Micheal Wutky","Manzara",R.drawable.micheal_wutky);




        artists.add(hoca_ali);
        artists.add(ivan_fedorovich);
        artists.add(turner);
        artists.add(van_gogh);
        artists.add(peter_joseph);
        artists.add(thomas_cole);
        artists.add(thomas_moran);
        artists.add(william_fraser);
        artists.add(edward_wilkins);
        artists.add(micheal_wutky);


        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,
                artists.stream().map(artist -> artist.artistName).collect(Collectors.toList())
                );
        bind.List.setAdapter(arrayAdapter);
        bind.List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent ınt = new Intent(MainActivity.this,ArtistGallery.class);
                ınt.putExtra("Artists",artists.get(i));
                startActivity(ınt);
            }
        });
    }
}