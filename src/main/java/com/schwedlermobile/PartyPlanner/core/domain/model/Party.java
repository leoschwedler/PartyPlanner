package com.schwedlermobile.PartyPlanner.core.domain.model;

import com.schwedlermobile.PartyPlanner.core.domain.enums.TypeParty;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Party implements Serializable {

    private Long id;
    private String name;
    private String description;
    private String location;
    private LocalDateTime date_party;
    private Integer capacity;
    private TypeParty typeParty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getDate_party() {
        return date_party;
    }

    public void setDate_party(LocalDateTime date_party) {
        this.date_party = date_party;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public TypeParty getTypeParty() {
        return typeParty;
    }

    public void setTypeParty(TypeParty typeParty) {
        this.typeParty = typeParty;
    }
}


