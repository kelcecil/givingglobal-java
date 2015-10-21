package org.kelcecil.globalgiving.apikey;

/**
 * Retrieve the Global Giving API key from the environment.
 * Helpful for 12-Factor apps and containers.
 */
public class EnvironmentAPIKeyProvider implements ApiKeyProvider {
    @Override
    public String ObtainAPIKey() {
          return System.getenv("GLOBALGIVING_APIKEY");
    }
}
