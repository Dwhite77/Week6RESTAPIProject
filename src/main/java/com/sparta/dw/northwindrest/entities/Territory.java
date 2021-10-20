package com.sparta.dw.northwindrest.entities;

import javax.persistence.*;

@Table(name = "territories")
@Entity
public class Territory {
    @Id
    @Column(name = "TerritoryID", nullable = false, length = 20)
    private String id;

    @Column(name = "TerritoryDescription", nullable = false, length = 50)
    private String territoryDescription;

    @ManyToOne(optional = false)
    @JoinColumn(name = "RegionID", nullable = false)
    private Region regionID;

    public Region getRegionID() {
        return regionID;
    }

    public void setRegionID(Region regionID) {
        this.regionID = regionID;
    }

    public String getTerritoryDescription() {
        return territoryDescription;
    }

    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}