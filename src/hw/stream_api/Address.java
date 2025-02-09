package hw.stream_api;

/// Represent address.
public class Address {
    /// City name.
    private final String city;

    /// Street name.
    private final String street;

    /// Class constructor.
    ///
    /// @param city   The city name.
    /// @param street The street name.
    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    /// Returns the city name.
    public String getCity() {
        return city;
    }

    /// Returns the street name.
    public String getStreet() {
        return street;
    }
}
