package Lab_4;

import javax.swing.*;

public class NestedIf {
    public static void main(String[] args) {
        String name, output, day, weather, day_con = "", weather_con = "", sun = "Bring a Hat or Umbrella", rain = "Bring an Umbrella or Raincoat", gloom = "Ride a taxi";
        name = "Nathaniel P. Rijndorp";
        day = JOptionPane.showInputDialog(null, new JTextArea("Input day: "));
        weather = JOptionPane.showInputDialog(null, new JTextArea("Input weather: "));

        // Logic
        if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Thursday")){
            day_con = "going to School";
            if (weather.equalsIgnoreCase("Sunny")){
                weather_con = sun;
            } else if (weather.equalsIgnoreCase("Rainy")) {
                weather_con = rain;
            } else if (weather.equalsIgnoreCase("Gloomy")) {
                weather_con = gloom;
            }
        } else if (day.equalsIgnoreCase("Wednesday")) {
            day_con = "going on a Date";
            if (weather.equalsIgnoreCase("Sunny")){
                weather_con = sun;
            } else if (weather.equalsIgnoreCase("Rainy")) {
                weather_con = rain;
            } else if (weather.equalsIgnoreCase("Gloomy")) {
                weather_con = gloom;
            }
        } else if (day.equalsIgnoreCase("Friday")) {
            day_con = "going to a Party";
            if (weather.equalsIgnoreCase("Sunny")){
                weather_con = sun;
            } else if (weather.equalsIgnoreCase("Rainy")) {
                weather_con = rain;
            } else if (weather.equalsIgnoreCase("Gloomy")) {
                weather_con = gloom;
            }
        } else if (day.equalsIgnoreCase("Saturday")) {
            day_con = "Bonding with Friends";
            if (weather.equalsIgnoreCase("Sunny")){
                weather_con = sun;
            } else if (weather.equalsIgnoreCase("Rainy")) {
                weather_con = rain;
            } else if (weather.equalsIgnoreCase("Gloomy")) {
                weather_con = gloom;
            }
        } else if (day.equalsIgnoreCase("Sunday")) {
            day_con = "going to Church + Family Bonding";
            if (weather.equalsIgnoreCase("Sunny")){
                weather_con = sun;
            } else if (weather.equalsIgnoreCase("Rainy")) {
                weather_con = rain;
            } else if (weather.equalsIgnoreCase("Gloomy")) {
                weather_con = gloom;
            }
        }
        output = String.format("%s %s %s %s\n %s", "Today is", day, "and you will be", day_con, weather_con);
        JOptionPane.showMessageDialog(null, output, name, 1);
    }
}
