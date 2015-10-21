package org.kelcecil.globalgiving;

import org.kelcecil.globalgiving.action.GetThemes;
import org.kelcecil.globalgiving.model.Theme;

import java.util.List;

/**
 *
 */
public class GlobalGivingClient {

    /**
     * Constructor that uses all defaults including
     * api key from environment.
     */
    public GlobalGivingClient() {}

    /**
     *
     * @return Array of available themes.
     */
    public List<Theme> GetThemes() {
        return new GetThemes().Call();
    }
}
