package demo.client;

import dagger.ObjectGraph;

import javax.inject.Inject;

/**
 * Created by dlecan on 15/06/14.
 */
public class MeteoApp {

    @Inject MeteoService meteoService;

    public void executer() {

        Meteo meteo = meteoService.recupererMeteo("nantes");

        System.out.println(meteo);

    }

    public static void main(String[] args) {
        ObjectGraph.create(MeteoModule.class).get(MeteoApp.class).executer();
    }



}
