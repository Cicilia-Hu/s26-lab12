package edu.cmu.Weather;



public class Weather {
    private WeatherService weatherService;
    private LengthScale scale;

    public enum LengthScale {
        INCHES,
        MILLIMETERS
    }   

    /**
     * Sets the length scale for rainfall.
     *
     * @param the length scale wanted
     */
    public void setLengthScale(LengthScale scale) {
        this.scale = scale;
    }

    /**
     * Retrieves the rainfall measurement over the last 24 hours from the weather service in the preferred scale.
     * 
     * @return the rainfall amount in the selected length scale.
     * The WeatherService provides rainfall in millimeters.
     * If the preferred scale is inches, the value is converted from millimeters.
     *         
     */
    public double getRainfall() {
        double wsRainfall = weatherService.getRainfall();
        if (scale == LengthScale.INCHES) {
            return wsRainfall / 25.4;
        } else {
            return wsRainfall;
        }
    }
}
