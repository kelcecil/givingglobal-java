package org.kelcecil.globalgiving.action;

import com.google.api.client.http.GenericUrl;
import org.kelcecil.globalgiving.apikey.EnvironmentApiKeyProvider;
import org.kelcecil.globalgiving.http.HttpClient;
import org.kelcecil.globalgiving.model.Theme;
import org.kelcecil.globalgiving.model.wrappers.ThemesWrapper;

import java.io.IOException;
import java.util.List;

/**
 * Constructs a GET request to pass on to the http client.
 */
public class GetThemes {

    private final String ENDPOINT = "https://api.globalgiving.org/api/public/projectservice/themes";

    public GetThemes() {}

    public List<Theme> Call() {
        GenericUrl url = new GenericUrl(ENDPOINT);
        url.set("api_key", new EnvironmentApiKeyProvider().ObtainApiKey());

        List<Theme> themes = null;
        try {
            ThemesWrapper response =
                    ((ThemesWrapper) new HttpClient()
                            .PerformGet(url, ThemesWrapper.class));
            themes = response.getThemes();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return themes;
    }
}
