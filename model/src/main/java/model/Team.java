package model;

import lombok.Data;

@Data
public class Team {

    private final String teamID;
    private final String coachID;

    private List<Pokemon> teamMembers;


}
