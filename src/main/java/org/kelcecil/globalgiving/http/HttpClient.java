package org.kelcecil.globalgiving.http;

import com.google.api.client.http.*;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.gson.GsonFactory;
import org.kelcecil.globalgiving.model.wrappers.ThemeWrapper;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Created by kelcecil on 10/21/15.
 */
public class HttpClient {

    static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    static final JsonFactory JSON_FACTORY = new GsonFactory();
    static final HttpRequestFactory REQUEST_FACTORY =
            HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {
                @Override
                public void initialize(HttpRequest request) {
                    request.setParser(new JsonObjectParser(JSON_FACTORY));
                }
            });

    public Object PerformGet(GenericUrl url, Type type) throws IOException {
        HttpResponse response = null;

        try {
            HttpRequest request = REQUEST_FACTORY.buildGetRequest(url);
            request = this.setHttpHeadersOnRequest(request);
            response = request.execute();
        } catch (IOException e) {
            throw e;
        } finally {
            response.disconnect();
        }

        return response.parseAs(ThemeWrapper.class);
    }

    public HttpRequest setHttpHeadersOnRequest(HttpRequest request) {
        HttpHeaders headers = new HttpHeaders()
                .setAccept("application/json")
                .setContentType("application/json");
        request.setHeaders(headers);
        return request;
    }

}
