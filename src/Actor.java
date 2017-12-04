public class Actor {

    private String firstName;
    private String lastName;
    private String citizenship;


    public Actor(String firstName, String lastName, String citizenship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.citizenship = citizenship;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }
}
