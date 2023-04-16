package com.WeatherApp.WeatherApp.RestController;

import com.WeatherApp.WeatherApp.Entity.CurrentWeather;
import com.WeatherApp.WeatherApp.Services.LiveWeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.HttpClientErrorException;

@Controller
public class CurrentWeatherController {

    /*
    @GetMapping("/current-weather")
    public String getCurrentWeather(Model model) {
        CurrentWeather currentWeather = new CurrentWeather("Clear", BigDecimal.ONE, BigDecimal.ZERO, BigDecimal.TEN);
        model.addAttribute("currentWeather", currentWeather);
        return "current-weather";
    }
    */


    private final LiveWeatherService liveWeatherService;

    public CurrentWeatherController(LiveWeatherService liveWeatherService) {
        this.liveWeatherService = liveWeatherService;
    }

    @PostMapping("/current-weather")
    public String getCurrentWeather(@ModelAttribute CurrentWeather currentWeather, Model model) {
        try{
            model.addAttribute("currentWeather", liveWeatherService.getCurrentWeather(currentWeather.getCity(),currentWeather.getCountry()));
            return "current-weather";
        }
        catch (HttpClientErrorException e){
            System.out.println(e.getMessage());
        }
        return "error";
    }

    @GetMapping("/search")
    public String searchCurrWeather(Model theModel){
        theModel.addAttribute("currentWeather", new CurrentWeather());
        return "search-form";
    }

}
