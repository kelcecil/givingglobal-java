package org.kelcecil.globalgiving.model.wrappers;

import com.google.api.client.util.Key;

/**
 * Created by kelcecil on 10/22/15.
 */
public class ProjectsWrapper {
    @Key
    private ProjectWrapper projects;

    public ProjectWrapper getProjects() {
        return projects;
    }

    public void setProjects(ProjectWrapper projects) {
        this.projects = projects;
    }
}
