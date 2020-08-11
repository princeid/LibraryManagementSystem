public class User implements Comparable<User>{
    private String firstName;
    private String lastName;
    private String occupation;
    private String level;
    private int value;

    public User(String firstName, String lastName, String occupation, String level, int value) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.level = level;
        this.value = value;
    }

    public void setValue(int value) {
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
        if (this.value < user.value) {
            return -1;
        }
        else if (this.value > user.value) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
