package org.kelcecil.globalgiving.action;

import com.google.api.client.http.GenericUrl;
import org.kelcecil.globalgiving.apikey.EnvironmentApiKeyProvider;
import org.kelcecil.globalgiving.http.HttpClient;
import org.kelcecil.globalgiving.model.wrappers.ProjectsWrapper;

import java.io.IOException;

/**
 * Created by kelcecil on 10/22/15.
 */
public class GetAllProjects {
    private final String ENDPOINT = "https://api.globalgiving.org/api/public/projectservice/all/projects";

    public GetAllProjects() {}

    public ProjectsWrapper Call() {
        GenericUrl url = new GenericUrl(ENDPOINT);
        url.set("api_key", new EnvironmentApiKeyProvider().ObtainApiKey());

        ProjectsWrapper projects = null;
        try {
            projects =
                    ((ProjectsWrapper)new HttpClient()
                            .PerformGet(url, ProjectsWrapper.class));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return projects;
    }
}
