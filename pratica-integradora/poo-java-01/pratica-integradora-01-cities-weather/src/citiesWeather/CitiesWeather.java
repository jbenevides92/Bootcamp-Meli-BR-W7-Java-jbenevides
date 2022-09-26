package citiesWeather;

public class CitiesWeather {
    public static void main(String[] args) {
        String[] cities = {"London", "Madrid", "New York", "Buenos Aires", "Asuncion", "Sao Paulo", "Lima", "Santiago", "Lisbon", "Tokio"};
        int[][] temperatures = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int minTemperature = temperatures[0][0];
        int maxTemperature = 0;

        String minCity = cities[0];
        String maxCity = cities[0];

        for (int line = 0; line < cities.length; line++) {
            String city = cities[line];
            for (int column = 0; column < 2; column++) {
                int temperature = temperatures[line][column];
                if (temperature < minTemperature) {
                    minTemperature = temperature;
                    minCity = city;
                }
                if (maxTemperature < temperature) {
                    maxTemperature = temperature;
                    maxCity = city;
                }
            }
        }
        System.out.printf("The hottest city was %s with %sºC%n", maxCity, maxTemperature);
        System.out.printf("The coldest city was %s with %sºC%n", minCity, minTemperature);
    }
}
