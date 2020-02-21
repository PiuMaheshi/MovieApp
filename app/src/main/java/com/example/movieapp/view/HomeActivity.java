package com.example.movieapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.movieapp.R;
import com.example.movieapp.model.Movie;
import com.example.movieapp.viewmodel.MovieDetails;

import java.util.List;

import butterknife.BindView;

public class HomeActivity extends AppCompatActivity {

    String[] movies;
    @BindView(R.id.movieList)
    ListView listView;

    MovieDetails movieDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       // ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_movie_details, movies);

      //  listView.setAdapter(adapter);
    }

    public void getMovies(){
        movies = movieDetails.getMovieNames();
    }
}
