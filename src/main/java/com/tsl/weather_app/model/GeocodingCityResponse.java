package com.tsl.weather_app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeocodingCityResponse {
	
	private Result[] results;
    private double generationtime_ms;

    public Result[] getResults() {
        return results;
    }

    public void setResults(Result[] results) {
        this.results = results;
    }

    public double getGenerationtime_ms() {
        return generationtime_ms;
    }

    public void setGenerationtime_ms(double generationtime_ms) {
        this.generationtime_ms = generationtime_ms;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {
        private int id;
        private String name;
        private double latitude;
        private double longitude;
        private int elevation;
        private String feature_code;
        private String country_code;
        private long admin1_id;
        private String timezone;
        private long population;
        private long country_id;
        private String country;
        private String admin1;

        // Getters and Setters

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public double getLatitude() {
            return latitude;
        }
        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public double getLongitude() {
            return longitude;
        }
        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public int getElevation() {
            return elevation;
        }
        public void setElevation(int elevation) {
            this.elevation = elevation;
        }

        public String getFeature_code() {
            return feature_code;
        }
        public void setFeature_code(String feature_code) {
            this.feature_code = feature_code;
        }

        public String getCountry_code() {
            return country_code;
        }
        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }

        public long getAdmin1_id() {
            return admin1_id;
        }
        public void setAdmin1_id(long admin1_id) {
            this.admin1_id = admin1_id;
        }

        public String getTimezone() {
            return timezone;
        }
        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public long getPopulation() {
            return population;
        }
        public void setPopulation(long population) {
            this.population = population;
        }

        public long getCountry_id() {
            return country_id;
        }
        public void setCountry_id(long country_id) {
            this.country_id = country_id;
        }

        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }

        public String getAdmin1() {
            return admin1;
        }
        public void setAdmin1(String admin1) {
            this.admin1 = admin1;
        }
    }
	
}
