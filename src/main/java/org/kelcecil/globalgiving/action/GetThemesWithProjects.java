package org.kelcecil.globalgiving.action;

import com.google.api.client.http.GenericUrl;
import org.kelcecil.globalgiving.apikey.EnvironmentApiKeyProvider;
import org.kelcecil.globalgiving.http.HttpClient;
import org.kelcecil.globalgiving.model.Theme;
import org.kelcecil.globalgiving.model.wrappers.ThemeWrapper;

import java.io.IOException;
import java.util.List;

/**
 * Get themes with information about projects.
 */
public class GetThemesWithProjects {

    private final String ENDPOINT = "https://api.globalgiving.org/api/public/projectservice/themes/projects/ids";

    public GetThemesWithProjects() {}

    public List<Theme> Call() {
        GenericUrl url = new GenericUrl(ENDPOINT);
        url.set("api_key", new EnvironmentApiKeyProvider().ObtainApiKey());

        List<Theme> themes = null;
        try {
            ThemeWrapper response =
                    ((ThemeWrapper)new HttpClient()
                            .PerformGet(url, ThemeWrapper.class));
            themes = response.getThemes();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return themes;
    }
}
