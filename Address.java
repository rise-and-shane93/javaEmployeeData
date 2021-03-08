public class Address {
    private String street;
    private String city;
    private String stateCode;
    private int postalCode;

    public Address(String street, String city, String stateCode, int postalCode) {
        this.street = street;
        this.city = city;
        this.stateCode = stateCode;
        this.postalCode = postalCode;
    }

    public String toString() {
        return "\n\nAddress: \n" + street + "\n" + city + ", " + stateCode + " " + postalCode;
    }

}