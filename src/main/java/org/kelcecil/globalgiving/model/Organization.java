package org.kelcecil.globalgiving.model;

import com.google.api.client.util.Key;
import org.kelcecil.globalgiving.model.wrappers.CountryWrapper;
import org.kelcecil.globalgiving.model.wrappers.ThemeWrapper;

import java.util.List;

/**
 * Created by kelcecil on 10/21/15.
 */
public class Organization {
    @Key
    private int activeProjects;

    @Key
    private String addressLine1;

    @Key
    private String addressLine2;

    @Key
    private String city;

    @Key
    private String country;

    @Key
    private String ein;

    @Key
    private int id;

    @Key("iso3166CountryCode")
    private String countryCode;

    @Key
    private String logoUrl;

    @Key
    private String mission;

    @Key
    private String name;

    @Key("postal")
    private String postalCode;

    @Key
    private String state;

    @Key
    private int totalProjects;

    @Key
    private String url;

    @Key
    private ThemeWrapper themes;

    @Key
    private CountryWrapper countries;

    public int getActiveProjects() {
        return activeProjects;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getEin() {
        return ein;
    }

    public int getId() {
        return id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public String getMission() {
        return mission;
    }

    public String getName() {
        return name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getState() {
        return state;
    }

    public int getTotalProjects() {
        return totalProjects;
    }

    public String getUrl() {
        return url;
    }

    public List<Theme> getThemes() {
        return themes.getThemes();
    }

    public List<Country> getCountries() {
        return countries.getCountry();
    }
}
