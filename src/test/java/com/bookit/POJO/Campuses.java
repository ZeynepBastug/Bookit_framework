package com.bookit.POJO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Campuses {
    private int id;
    private String location;
    private Clusters clusters;
}
