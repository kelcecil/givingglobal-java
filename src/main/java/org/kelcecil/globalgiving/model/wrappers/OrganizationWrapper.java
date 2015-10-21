package org.kelcecil.globalgiving.model.wrappers;

import com.google.api.client.util.Key;
import org.kelcecil.globalgiving.model.Organization;

/**
 * Created by kelcecil on 10/21/15.
 */
public class OrganizationWrapper {
    @Key
    private Organization organization;

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
