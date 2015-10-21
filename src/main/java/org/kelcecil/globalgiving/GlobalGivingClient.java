package org.kelcecil.globalgiving;

import org.kelcecil.globalgiving.action.GetThemes;
import org.kelcecil.globalgiving.action.GetThemesWithProjects;
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
    public List<Theme> getThemes() {
        return new GetThemes().Call();
    }

    public List<Theme> getThemesWithProjects() {
        return new GetThemesWithProjects().Call();
    }
}
