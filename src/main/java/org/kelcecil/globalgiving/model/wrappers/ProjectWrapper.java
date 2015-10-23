package org.kelcecil.globalgiving.model.wrappers;

import com.google.api.client.util.Key;
import org.kelcecil.globalgiving.model.Project;

import java.util.List;

/**
 * Created by kelcecil on 10/21/15.
 */
public class ProjectWrapper {

    @Key
    private boolean hasNext;

    public boolean getHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    @Key
    private int nextProjectId;

    public int getNextProjectId() {
        return nextProjectId;
    }

    public void setNextProjectId(int nextProjectId) {
        this.nextProjectId = nextProjectId;
    }

    @Key
    private List<Project> project;

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }
}
