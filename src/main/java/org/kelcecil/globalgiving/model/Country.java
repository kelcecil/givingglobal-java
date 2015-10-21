package org.kelcecil.globalgiving.model;

import com.google.api.client.util.Key;

/**
 * Created by kelcecil on 10/21/15.
 */
public class Country {
    @Key("iso3166CountryCode")
    private String countryCode;

    @Key
    private String name;
}
