package org.kelcecil.globalgiving.model.wrappers;

import com.google.api.client.util.Key;
import org.kelcecil.globalgiving.model.Theme;

import java.util.ArrayList;

/**
 * Easy JSON wrapper.
 * TODO: Find something better.
 */
public class ThemeWrapper {
    @Key("theme")
    private ArrayList<Theme> themes;

    public ArrayList<Theme> getThemes() {
        return themes;
    }
}
