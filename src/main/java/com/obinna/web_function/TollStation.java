package com.obinna.web_function;

/**
 * @author @obinnaogbonnajoseph
 * @date 08/09/22
 */
public class TollStation {

    public TollStation(String stationId, Float mileMarker, Integer stallCount) {
        this.stationId = stationId;
        this.mileMarker = mileMarker;
        this.stallCount = stallCount;
    }

    private String stationId;
    private Float mileMarker;
    private Integer stallCount;

    /**
     * @return String return the stationId
     */
    public String getStationId() {
        return stationId;
    }

    /**
     * @param stationId the stationId to set
     */
    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    /**
     * @return Float return the mileMarker
     */
    public Float getMileMarker() {
        return mileMarker;
    }

    /**
     * @param mileMarker the mileMarker to set
     */
    public void setMileMarker(Float mileMarker) {
        this.mileMarker = mileMarker;
    }

    /**
     * @return Integer return the stallCount
     */
    public Integer getStallCount() {
        return stallCount;
    }

    /**
     * @param stallCount the stallCount to set
     */
    public void setStallCount(Integer stallCount) {
        this.stallCount = stallCount;
    }

}