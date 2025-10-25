package com.tsl.weather_app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {

    private double latitude;
    private double longitude;
    private double generationtime_ms;
    private int utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private double elevation;

    private CurrentWeatherUnits current_weather_units;
    private CurrentWeather current_weather;

    // Getters and Setters
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

    public double getGenerationtime_ms() {
        return generationtime_ms;
    }
    public void setGenerationtime_ms(double generationtime_ms) {
        this.generationtime_ms = generationtime_ms;
    }

    public int getUtc_offset_seconds() {
        return utc_offset_seconds;
    }
    public void setUtc_offset_seconds(int utc_offset_seconds) {
        this.utc_offset_seconds = utc_offset_seconds;
    }

    public String getTimezone() {
        return timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezone_abbreviation() {
        return timezone_abbreviation;
    }
    public void setTimezone_abbreviation(String timezone_abbreviation) {
        this.timezone_abbreviation = timezone_abbreviation;
    }

    public double getElevation() {
        return elevation;
    }
    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public CurrentWeatherUnits getCurrent_weather_units() {
        return current_weather_units;
    }
    public void setCurrent_weather_units(CurrentWeatherUnits current_weather_units) {
        this.current_weather_units = current_weather_units;
    }

    public CurrentWeather getCurrent_weather() {
        return current_weather;
    }
    public void setCurrent_weather(CurrentWeather current_weather) {
        this.current_weather = current_weather;
    }

    // Nested Class 1: CurrentWeatherUnits
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CurrentWeatherUnits {
        private String time;
        private String interval;
        private String temperature;
        private String windspeed;
        private String winddirection;
        private String is_day;
        private String weathercode;

        // Getters and Setters
        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }

        public String getInterval() {
            return interval;
        }
        public void setInterval(String interval) {
            this.interval = interval;
        }

        public String getTemperature() {
            return temperature;
        }
        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getWindspeed() {
            return windspeed;
        }
        public void setWindspeed(String windspeed) {
            this.windspeed = windspeed;
        }

        public String getWinddirection() {
            return winddirection;
        }
        public void setWinddirection(String winddirection) {
            this.winddirection = winddirection;
        }

        public String getIs_day() {
            return is_day;
        }
        public void setIs_day(String is_day) {
            this.is_day = is_day;
        }

        public String getWeathercode() {
            return weathercode;
        }
        public void setWeathercode(String weathercode) {
            this.weathercode = weathercode;
        }
    }

    // Nested Class 2: CurrentWeather
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CurrentWeather {
        private String time;
        private int interval;
        private double temperature;
        private double windspeed;
        private double winddirection;
        private int is_day;
        private int weathercode;

        // Getters and Setters
        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }

        public int getInterval() {
            return interval;
        }
        public void setInterval(int interval) {
            this.interval = interval;
        }

        public double getTemperature() {
            return temperature;
        }
        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        public double getWindspeed() {
            return windspeed;
        }
        public void setWindspeed(double windspeed) {
            this.windspeed = windspeed;
        }

        public double getWinddirection() {
            return winddirection;
        }
        public void setWinddirection(double winddirection) {
            this.winddirection = winddirection;
        }

        public int getIs_day() {
            return is_day;
        }
        public void setIs_day(int is_day) {
            this.is_day = is_day;
        }

        public int getWeathercode() {
            return weathercode;
        }
        public void setWeathercode(int weathercode) {
            this.weathercode = weathercode;
        }
    }
}
