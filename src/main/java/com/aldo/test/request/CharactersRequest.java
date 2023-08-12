package com.aldo.test.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class CharactersRequest {

    @JsonProperty("last_sync")
    public String lastSync;

    @JsonProperty("characters")
    public ArrayList<Characters> characters;

}
