package demo.client;

import retrofit.http.GET;
import retrofit.http.Query;

interface MeteoService {

    @GET("/api/meteo")
    public Meteo recupererMeteo(@Query("ville") String ville);

}