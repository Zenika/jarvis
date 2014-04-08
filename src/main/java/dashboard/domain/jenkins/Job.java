package dashboard.domain.jenkins;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.google.common.base.Objects;
import dashboard.Views;

import java.util.List;

public class Job {

    private String name;
    private String url;
    private String color;

    @JsonIgnore
    private String actions;
    private String description;
    private String displayName;
    private String displayNameOrNull;
    private boolean buildable;
    @JsonIgnore
    private String builds;
    @JsonIgnore
    private String firstBuild;
    @JsonIgnore
    private String healthReport;
    private boolean inQueue;
    private boolean keepDependencies;
    @JsonIgnore
    private String lastBuild;
    @JsonIgnore
    private String lastCompletedBuild;
    @JsonIgnore
    private String lastFailedBuild;
    @JsonIgnore
    private String lastStableBuild;
    @JsonIgnore
    private String lastSuccessfulBuild;
    @JsonIgnore
    private String lastUnstableBuild;
    @JsonIgnore
    private String lastUnsuccessfulBuild;
    private int nextBuildNumber;
    @JsonIgnore
    private String property;
    @JsonIgnore
    private String queueItem;
    private boolean concurrentBuild;
    @JsonView(Views.Details.class)
    private List<Job>  downstreamProjects;
    @JsonIgnore
    private String  scm;
    private List<Job> upstreamProjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayNameOrNull() {
        return displayNameOrNull;
    }

    public void setDisplayNameOrNull(String displayNameOrNull) {
        this.displayNameOrNull = displayNameOrNull;
    }

    public boolean isBuildable() {
        return buildable;
    }

    public void setBuildable(boolean buildable) {
        this.buildable = buildable;
    }

    public String getBuilds() {
        return builds;
    }

    public void setBuilds(String builds) {
        this.builds = builds;
    }

    public String getFirstBuild() {
        return firstBuild;
    }

    public void setFirstBuild(String firstBuild) {
        this.firstBuild = firstBuild;
    }

    public String getHealthReport() {
        return healthReport;
    }

    public void setHealthReport(String healthReport) {
        this.healthReport = healthReport;
    }

    public boolean isInQueue() {
        return inQueue;
    }

    public void setInQueue(boolean inQueue) {
        this.inQueue = inQueue;
    }

    public boolean isKeepDependencies() {
        return keepDependencies;
    }

    public void setKeepDependencies(boolean keepDependencies) {
        this.keepDependencies = keepDependencies;
    }

    public String getLastBuild() {
        return lastBuild;
    }

    public void setLastBuild(String lastBuild) {
        this.lastBuild = lastBuild;
    }

    public String getLastCompletedBuild() {
        return lastCompletedBuild;
    }

    public void setLastCompletedBuild(String lastCompletedBuild) {
        this.lastCompletedBuild = lastCompletedBuild;
    }

    public String getLastFailedBuild() {
        return lastFailedBuild;
    }

    public void setLastFailedBuild(String lastFailedBuild) {
        this.lastFailedBuild = lastFailedBuild;
    }

    public String getLastStableBuild() {
        return lastStableBuild;
    }

    public void setLastStableBuild(String lastStableBuild) {
        this.lastStableBuild = lastStableBuild;
    }

    public String getLastSuccessfulBuild() {
        return lastSuccessfulBuild;
    }

    public void setLastSuccessfulBuild(String lastSuccessfulBuild) {
        this.lastSuccessfulBuild = lastSuccessfulBuild;
    }

    public String getLastUnstableBuild() {
        return lastUnstableBuild;
    }

    public void setLastUnstableBuild(String lastUnstableBuild) {
        this.lastUnstableBuild = lastUnstableBuild;
    }

    public String getLastUnsuccessfulBuild() {
        return lastUnsuccessfulBuild;
    }

    public void setLastUnsuccessfulBuild(String lastUnsuccessfulBuild) {
        this.lastUnsuccessfulBuild = lastUnsuccessfulBuild;
    }

    public int getNextBuildNumber() {
        return nextBuildNumber;
    }

    public void setNextBuildNumber(int nextBuildNumber) {
        this.nextBuildNumber = nextBuildNumber;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getQueueItem() {
        return queueItem;
    }

    public void setQueueItem(String queueItem) {
        this.queueItem = queueItem;
    }

    public boolean isConcurrentBuild() {
        return concurrentBuild;
    }

    public void setConcurrentBuild(boolean concurrentBuild) {
        this.concurrentBuild = concurrentBuild;
    }

    public List<Job> getDownstreamProjects() {
        return downstreamProjects;
    }

    public void setDownstreamProjects(List<Job> downstreamProjects) {
        this.downstreamProjects = downstreamProjects;
    }

    public String getScm() {
        return scm;
    }

    public void setScm(String scm) {
        this.scm = scm;
    }

    public List<Job> getUpstreamProjects() {
        return upstreamProjects;
    }

    public void setUpstreamProjects(List<Job> upstreamProjects) {
        this.upstreamProjects = upstreamProjects;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("name", name)
                .add("url", url)
                .add("color", color)
                .add("actions", actions)
                .add("description", description)
                .add("displayName", displayName)
                .add("displayNameOrNull", displayNameOrNull)
                .add("buildable", buildable)
                .add("builds", builds)
                .add("firstBuild", firstBuild)
                .add("healthReport", healthReport)
                .add("inQueue", inQueue)
                .add("keepDependencies", keepDependencies)
                .add("lastBuild", lastBuild)
                .add("lastCompletedBuild", lastCompletedBuild)
                .add("lastFailedBuild", lastFailedBuild)
                .add("lastStableBuild", lastStableBuild)
                .add("lastSuccessfulBuild", lastSuccessfulBuild)
                .add("lastUnstableBuild", lastUnstableBuild)
                .add("lastUnsuccessfulBuild", lastUnsuccessfulBuild)
                .add("nextBuildNumber", nextBuildNumber)
                .add("property", property)
                .add("queueItem", queueItem)
                .add("concurrentBuild", concurrentBuild)
                .add("downstreamProjects", downstreamProjects)
                .add("scm", scm)
                .add("upstreamProjects", upstreamProjects)
                .toString();
    }
}
