package com.aldo.test.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Characters {
    @JsonProperty("character")
    public String character;

    @JsonProperty("comic")
    public ArrayList<String> comic;

}
