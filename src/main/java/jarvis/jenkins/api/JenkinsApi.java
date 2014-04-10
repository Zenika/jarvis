package jarvis.jenkins.api;

import jarvis.domain.jenkins.Job;
import jarvis.domain.jenkins.Jobs;
import org.springframework.web.client.RestTemplate;
import restx.factory.Component;

import javax.inject.Named;

@Component
public class JenkinsApi {

    private static final String API_JSON = "api/json";
    private final RestTemplate restTemplate;
    private final String url;

    public JenkinsApi(RestTemplate restTemplate, @Named("jenkins.url") String jenkinsUrl) {
        this.restTemplate = restTemplate;
        this.url = jenkinsUrl;
    }

    public Jobs getJobs() {
        return restTemplate.getForObject(url + API_JSON, Jobs.class);
    }

    public Job getJob(String jobName) {
        return restTemplate.getForObject(url + "job/{jobName}/"+ API_JSON, Job.class, jobName);
    }
}
