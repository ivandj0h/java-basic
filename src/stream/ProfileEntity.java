package stream;

import java.util.List;

public class ProfileEntity {

    private String firstName;
    private String lastName;
    private String email;
    private List<String> skills;

    public ProfileEntity(String firstName, String lastName, String email, List<String> skills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.skills = skills;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "ProfileEntity [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", skills="
                + skills + "]";
    }

}
