package jarvis.domain.jenkins;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Build {

    public int number;
    public String url;

}
