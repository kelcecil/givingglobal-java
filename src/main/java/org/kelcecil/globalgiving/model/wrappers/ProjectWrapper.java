package org.kelcecil.globalgiving.model.wrappers;

import com.google.api.client.util.Key;
import org.kelcecil.globalgiving.model.Project;

import java.util.List;

/**
 * Created by kelcecil on 10/21/15.
 */
public class ProjectWrapper {
    @Key
    private List<Project> project;

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }
}
