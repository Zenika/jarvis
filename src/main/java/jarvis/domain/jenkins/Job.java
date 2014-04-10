package jarvis.domain.jenkins;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;
import jarvis.Views;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Job {

    public String name;
    public String url;
    public String color;

    @JsonIgnore
    public String actions;
    public String description;
    public String displayName;
    public String displayNameOrNull;
    public boolean buildable;
    public List<Build> builds;

    public Build firstBuild;
    @JsonIgnore
    public String healthReport;
    public boolean inQueue;
    public boolean keepDependencies;
    public Build lastBuild;
    public Build lastCompletedBuild;
    public Build lastFailedBuild;
    public Build lastStableBuild;
    public Build lastSuccessfulBuild;
    public Build lastUnstableBuild;
    public Build lastUnsuccessfulBuild;
    public int nextBuildNumber;
    @JsonIgnore
    public String property;
    public String queueItem;
    public boolean concurrentBuild;
    @JsonView(Views.Details.class)
    public List<Job>  downstreamProjects;
    @JsonIgnore
    public String  scm;
    public List<Job> upstreamProjects;

}
