package org.kelcecil.globalgiving.model.wrappers;

import com.google.api.client.util.Key;
import org.kelcecil.globalgiving.model.Theme;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kelcecil on 10/21/15.
 */
public class ThemeWrapper {
    public InnerThemeWrapper getThemeCollection() {
        return this.themesCollection;
    }

    public void setThemeCollection(InnerThemeWrapper themeCollection) {
        this.themesCollection = themeCollection;
    }

    public List<Theme> getThemes() {
        return this.getThemeCollection().getThemes();
    }

    @Key("themes")
    private InnerThemeWrapper themesCollection;

    public static class InnerThemeWrapper {
        @Key
        private ArrayList<Theme> theme;

        public List<Theme> getThemes() {
            return this.theme;
        }
    }
}


