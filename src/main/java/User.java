public class User implements Comparable<User>{
    private final String firstName;
    private final String lastName;
    private final String occupation;
    private final String level;
    private final int value;

    public User(String firstName, String lastName, String occupation, String level, int value) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.level = level;
        this.value = value;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getLevel() {
        return level;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "User{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", occupation='" + occupation + '\'' + '}';
    }

    @Override
    public int compareTo(User user) {
        return Integer.compare(this.value, user.value);
    }
}
