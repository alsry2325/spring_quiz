package com.quiz.lesson05.model;

import java.util.Date;

public class WeatherHistory {
					
	
			private	int	id;
			private Date date;
			private String	weather;
			private double	temperatures;
			private double	precipitation;
			private	String	microDust;
			private double	windSpeed;
			private	Date	createdAt;
			private	Date	updatedAt;
			
			
			public int getId() {
				return id;
			}
			public Date getDate() {
				return date;
			}
			public String getWeather() {
				return weather;
			}
			public double getTemperatures() {
				return temperatures;
			}
			public double getPrecipitation() {
				return precipitation;
			}
			public String getMicroDust() {
				return microDust;
			}
			public double getWindSpeed() {
				return windSpeed;
			}
			public Date getCreatedAt() {
				return createdAt;
			}
			public Date getUpdatedAt() {
				return updatedAt;
			}
			public void setId(int id) {
				this.id = id;
			}
			public void setDate(Date date) {
				this.date = date;
			}
			public void setWeather(String weather) {
				this.weather = weather;
			}
			public void setTemperatures(double temperatures) {
				this.temperatures = temperatures;
			}
			public void setPrecipitation(double precipitation) {
				this.precipitation = precipitation;
			}
			public void setMicroDust(String microDust) {
				this.microDust = microDust;
			}
			public void setWindSpeed(double windSpeed) {
				this.windSpeed = windSpeed;
			}
			public void setCreatedAt(Date createdAt) {
				this.createdAt = createdAt;
			}
			public void setUpdatedAt(Date updatedAt) {
				this.updatedAt = updatedAt;
			}
			
			
}
