package org.kelcecil.globalgiving.model;

import org.kelcecil.globalgiving.model.wrappers.ProjectWrapper;

/**
 * Created by kelcecil on 10/21/15.
 */
public class Project {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Possible included project information
    private ProjectWrapper projects;
}

