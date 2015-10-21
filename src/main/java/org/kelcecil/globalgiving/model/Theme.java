package org.kelcecil.globalgiving.model;

import com.google.api.client.util.Key;

/**
 * Created by kelcecil on 10/21/15.
 */
public class Theme {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Key
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Key
    private String name;
}
