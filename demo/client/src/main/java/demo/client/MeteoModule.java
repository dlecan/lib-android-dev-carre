package demo.client;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

/**
 * Created by dlecan on 15/06/14.
 */
@Module(
        injects = MeteoApp.class
)
public class MeteoModule {

    @Provides
    public MeteoService provideMeteoService() {

        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint("http://localhost:9000")
                .build();

        return adapter.create(MeteoService.class);
    }

}
