import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {
    private StringProperty firstName;
    private StringProperty lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
    }

    public Employee() {
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }
}
