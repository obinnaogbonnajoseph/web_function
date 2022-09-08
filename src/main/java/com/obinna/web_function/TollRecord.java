package com.obinna.web_function;

import java.util.Objects;

/**
 * @author @obinnaogbonnajoseph
 * @date 08/09/22
 */
public class TollRecord {

    private String stationId;
    private String licencePlate;
    private String timestamp;

    public TollRecord() {
    }

    public TollRecord(String stationId, String licencePlate, String timestamp) {
        this.stationId = stationId;
        this.licencePlate = licencePlate;
        this.timestamp = timestamp;
    }

    public String getStationId() {
        return this.stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getLicencePlate() {
        return this.licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public TollRecord stationId(String stationId) {
        setStationId(stationId);
        return this;
    }

    public TollRecord licencePlate(String licencePlate) {
        setLicencePlate(licencePlate);
        return this;
    }

    public TollRecord timestamp(String timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TollRecord)) {
            return false;
        }
        TollRecord tollRecord = (TollRecord) o;
        return Objects.equals(stationId, tollRecord.stationId) && Objects.equals(licencePlate, tollRecord.licencePlate)
                && Objects.equals(timestamp, tollRecord.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stationId, licencePlate, timestamp);
    }

    @Override
    public String toString() {
        return "{" +
                " stationId='" + getStationId() + "'" +
                ", licencePlate='" + getLicencePlate() + "'" +
                ", timestamp='" + getTimestamp() + "'" +
                "}";
    }

}