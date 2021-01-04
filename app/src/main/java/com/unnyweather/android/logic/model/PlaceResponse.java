package com.unnyweather.android.logic.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlaceResponse {
    String status;
    List<Place> places;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

}

class Location {
    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    String lng;
    String lat;
}
