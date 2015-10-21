package org.kelcecil.globalgiving.apikey;

/**
 * Interface to provide impl for obtaining API key
 * from the environment or whatever store the user
 * would like.
 */
public interface ApiKeyProvider {
    public String ObtainApiKey();
}
