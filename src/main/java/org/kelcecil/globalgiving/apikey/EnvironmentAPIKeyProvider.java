package org.kelcecil.globalgiving.apikey;

/**
 * Retrieve the Global Giving API key from the environment.
 * Helpful for 12-Factor apps and containers.
 */
public class EnvironmentApiKeyProvider implements ApiKeyProvider {
    @Override
    public String ObtainApiKey() {
          return System.getenv("GLOBALGIVING_APIKEY");
    }
}
