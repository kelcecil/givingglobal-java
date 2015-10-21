package org.kelcecil.globalgiving.action;

import com.google.api.client.http.GenericUrl;
import com.google.common.base.Preconditions;
import org.kelcecil.globalgiving.apikey.EnvironmentApiKeyProvider;
import org.kelcecil.globalgiving.http.HttpClient;
import org.kelcecil.globalgiving.model.Organization;
import org.kelcecil.globalgiving.model.wrappers.OrganizationWrapper;

import java.io.IOException;

/**
 * Created by kelcecil on 10/21/15.
 */
public class GetOrganization {
    private final String ENDPOINT = "https://api.globalgiving.org/api/public/orgservice/organization/:organizationid";

    public GetOrganization() {}

    public Organization Call(int organizationId) {
        Preconditions.checkArgument(organizationId > 0);

        String uri = ENDPOINT.replace(":organizationid",
                Integer.toString(organizationId));

        GenericUrl url = new GenericUrl(uri);
        url.set("api_key", new EnvironmentApiKeyProvider().ObtainApiKey());

        Organization organization = null;
        try {
            OrganizationWrapper response =
                    ((OrganizationWrapper)new HttpClient()
                            .PerformGet(url, OrganizationWrapper.class));
            organization = response.getOrganization();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return organization;
    }
}
