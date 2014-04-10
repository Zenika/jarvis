package jarvis.domain.jenkins;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Objects;

import java.util.ArrayList;
import java.util.Collection;

public class Jobs {

    @JsonIgnore
    private Collection<String> assignedLabels;
    private String mode;
    private String nodeDescription;
    private String nodeName;
    private int numExecutors;
    private String description;
    @JsonIgnore
    private String overallLoad;
    @JsonIgnore
    private String primaryView;
    private boolean quietingDown;
    private int slaveAgentPort;
    @JsonIgnore
    private String unlabeledLoad;
    private boolean useCrumbs;
    private boolean useSecurity;
    @JsonIgnore
    private String views;

    private Collection<Job> jobs;

    public Jobs() {
        this.assignedLabels = new ArrayList<>();
        this.jobs = new ArrayList<>();
    }


    public Collection<Job> getJobs() {
        return jobs;
    }

    public void setJobs(Collection<Job> jobs) {
        this.jobs = jobs;
    }


    public Collection<String> getAssignedLabels() {
        return assignedLabels;
    }

    public void setAssignedLabels(Collection<String> assignedLabels) {
        this.assignedLabels = assignedLabels;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getNodeDescription() {
        return nodeDescription;
    }

    public void setNodeDescription(String nodeDescription) {
        this.nodeDescription = nodeDescription;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public int getNumExecutors() {
        return numExecutors;
    }

    public void setNumExecutors(int numExecutors) {
        this.numExecutors = numExecutors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOverallLoad() {
        return overallLoad;
    }

    public void setOverallLoad(String overallLoad) {
        this.overallLoad = overallLoad;
    }

    public String getPrimaryView() {
        return primaryView;
    }

    public void setPrimaryView(String primaryView) {
        this.primaryView = primaryView;
    }

    public boolean isQuietingDown() {
        return quietingDown;
    }

    public void setQuietingDown(boolean quietingDown) {
        this.quietingDown = quietingDown;
    }

    public int getSlaveAgentPort() {
        return slaveAgentPort;
    }

    public void setSlaveAgentPort(int slaveAgentPort) {
        this.slaveAgentPort = slaveAgentPort;
    }

    public String getUnlabeledLoad() {
        return unlabeledLoad;
    }

    public void setUnlabeledLoad(String unlabeledLoad) {
        this.unlabeledLoad = unlabeledLoad;
    }

    public boolean isUseCrumbs() {
        return useCrumbs;
    }

    public void setUseCrumbs(boolean useCrumbs) {
        this.useCrumbs = useCrumbs;
    }

    public boolean isUseSecurity() {
        return useSecurity;
    }

    public void setUseSecurity(boolean useSecurity) {
        this.useSecurity = useSecurity;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("jobs", jobs)
                .toString();
    }
}
