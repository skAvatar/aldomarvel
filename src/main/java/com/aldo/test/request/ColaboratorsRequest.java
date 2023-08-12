package com.aldo.test.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class ColaboratorsRequest {

    @JsonProperty("last_sync")
    public String lastSync;
    @JsonProperty("editors")
    public ArrayList<String> editors;
    @JsonProperty("writers")
    public ArrayList<String> writers;
    @JsonProperty("colorists")
    public ArrayList<String> colorists;

}
