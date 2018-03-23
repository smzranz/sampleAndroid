package com.example.shamshir.myapplication;


import com.example.shamshir.models.PersonData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Muhammed Rasheed on 11/23/2017.
 */

public interface ApiInterface {

   /* @GET("movie/top_rated")
    Call<LocationUpdates> getTopRatedMovies(@Query("api_key") String apiKey);


    @GET(AppConstants.APP_SETTINGS_URL+"{sessionID}" + AppConstants.JSON_EXTENSION)
    Call<AppSettingsResponse> getDefaultSettings(@Path("sessionID") int id);

    //Post raw json in Body with content type as json
    @Headers("Content-Type: text/plain")
    @POST(AppConstants.LOGIN_URL)
    Call<LoginResponse> appLogin(@Body RequestBody task);

    @Headers("Content-Type: text/plain")
    @POST(AppConstants.TRIP_SYNC)
    Call<TripSyncResponse> tripSync(@Body RequestBody body);

    @Headers("Content-Type: application/json")
    @POST(AppConstants.NEARBY_LOCATIONS)
    Call<NearbyLocationResponse> getNearbyLocations(@Body RequestBody task);*/



    @GET("https://randomuser.me/api/")
    Call<PersonData> getDefaultSettings();

}
