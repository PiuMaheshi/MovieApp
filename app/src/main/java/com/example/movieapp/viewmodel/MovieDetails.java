package com.example.movieapp.viewmodel;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.movieapp.model.Movie;
import com.example.movieapp.util.AppConstant;

import org.json.JSONArray;
import org.json.JSONObject;

public class MovieDetails extends AppCompatActivity {

    private Movie movie;

    public String[] getMovieNames() {

        String[] movieNames = null;
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, AppConstant.URL, null,

                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        try {
                            for(int i=0;i<response.length();i++){
                                JSONObject movieDetails = response.getJSONObject(i);
                                movie.setName(movieDetails.getString("Title"));
                                movieNames[i] = movieDetails.getString("Title");
                            }
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),"Error!!" , Toast.LENGTH_SHORT).show();
            }
        }
        );
        requestQueue.add(jsonArrayRequest);
        return null;
    }
}