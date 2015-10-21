package org.kelcecil.globalgiving.model.api;

import com.google.api.client.util.Key;
import org.kelcecil.globalgiving.model.Theme;

import java.util.ArrayList;

/**
 * Created by kelcecil on 10/21/15.
 */
public class GetThemesResponse {
    public Themes getThemes() {
        return themes;
    }

    public void setThemes(Themes themes) {
        this.themes = themes;
    }

    @Key
    private Themes themes;

    public static class Themes {
        public ArrayList<Theme> getThemeCollection() {
            return themeCollection;
        }

        public void setThemeCollection(ArrayList<Theme> themeCollection) {
            this.themeCollection = themeCollection;
        }

        @Key("theme")
        private ArrayList<Theme> themeCollection;

    }
}


