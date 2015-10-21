package org.kelcecil.globalgiving.action;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.gson.GsonFactory;
import org.kelcecil.globalgiving.apikey.EnvironmentApiKeyProvider;
import org.kelcecil.globalgiving.model.Theme;
import org.kelcecil.globalgiving.model.wrappers.ThemeWrapper;

import java.io.IOException;
import java.util.List;

/**
 * Created by kelcecil on 10/21/15.
 */
public class GetThemesWithProjects {
    static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    static final JsonFactory JSON_FACTORY = new GsonFactory();
    static final HttpRequestFactory REQUEST_FACTORY =
            HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {
                @Override
                public void initialize(HttpRequest request) {
                    request.setParser(new JsonObjectParser(JSON_FACTORY));
                }
            });

    public GetThemesWithProjects() {}

    public List<Theme> Call() {
        GenericUrl url = new GenericUrl("https://api.globalgiving.org/api/public/projectservice/themes/projects/ids");
        url.set("api_key", new EnvironmentApiKeyProvider().ObtainApiKey());

        List<Theme> themes = null;
        try {
            HttpRequest request = REQUEST_FACTORY.buildGetRequest(url);
            HttpHeaders headers = new HttpHeaders()
                    .setAccept("application/json")
                    .setContentType("application/json");
            request.setHeaders(headers);
            HttpResponse response = request.execute();
            ThemeWrapper parsedResponse = (ThemeWrapper)response.parseAs(ThemeWrapper.class);
            themes = parsedResponse.getThemes();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return themes;
    }
}
