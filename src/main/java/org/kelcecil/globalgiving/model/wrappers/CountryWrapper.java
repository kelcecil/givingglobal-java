package org.kelcecil.globalgiving.model.wrappers;

import com.google.api.client.util.Key;
import org.kelcecil.globalgiving.model.Country;

import java.util.List;

/**
 * Created by kelcecil on 10/21/15.
 */
public class CountryWrapper {
    @Key
    private List<Country> country;

    public List<Country> getCountry() {
        return country;
    }

    public void setCountry(List<Country> country) {
        this.country = country;
    }
}
