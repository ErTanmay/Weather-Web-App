package com.tsl.weather_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.tsl.weather_app.model.WeatherDescription;
import com.tsl.weather_app.model.WeatherResponse;
import com.tsl.weather_app.service.WeatherService;

@Controller
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    // Page 1: City input form
    @GetMapping("/search")
    public String showCityForm() {
        return "cityForm"; // Thymeleaf template: cityForm.html
    }

    // Page 2: Display weather
    @PostMapping("/result")
    public String showWeather(@RequestParam("city") String city, Model model) {
        WeatherResponse geo = weatherService.getCityCoordinates(city);
        WeatherDescription weather = weatherService.getWeatherDesc(geo);

        model.addAttribute("city", city);
        model.addAttribute("weather", weather);

        return "weatherResult"; // Thymeleaf template: weatherResult.html
    }
}
