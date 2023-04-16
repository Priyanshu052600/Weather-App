package com.WeatherApp.WeatherApp.Entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class CurrentWeather implements Serializable {

    private String description;
    private BigDecimal temperature;
    private BigDecimal feelsLike;
    private BigDecimal windSpeed;

    private String City;
    private String Country;

// boilerplate getters, constructors, equals, and hashcode omitted

    public CurrentWeather(String description, BigDecimal temperature, BigDecimal feelsLike, BigDecimal windSpeed, String city, String country) {
        this.description = description;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.windSpeed = windSpeed;
        this.City = city;
        this.Country = country;
    }

    public CurrentWeather() {
    }

    public CurrentWeather(String description, BigDecimal temperature, BigDecimal feelsLike, BigDecimal windSpeed) {
        this.description = description;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.windSpeed = windSpeed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public BigDecimal getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(BigDecimal feelsLike) {
        this.feelsLike = feelsLike;
    }

    public BigDecimal getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(BigDecimal windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "CurrentWeather{" +
                "description='" + description + '\'' +
                ", temperature=" + temperature +
                ", feelsLike=" + feelsLike +
                ", windSpeed=" + windSpeed +
                ", City='" + City + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
