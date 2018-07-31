import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.util.Callback;

public class Controller {

    @FXML
    public TableView<Employee> table;
    @FXML
    public TableColumn<Employee, String> firstNameColumn;
    @FXML
    public TableColumn<Employee, String> lastNameColumn;
    @FXML
    public Button loadDataBtn;
    public TextField firstNameInput;
    public TextField lastNameInput;

    private ObservableList<Employee> personData = FXCollections.observableArrayList();

    public void loadData() {

        personData.add(new Employee("Hans", "Muster"));
        personData.add(new Employee("Ruth", "Mueller"));
        personData.add(new Employee("Heinz", "Kurz"));
        personData.add(new Employee("Cornelia", "Meier"));

        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());

        table.setItems(personData);
    }

    public void addEmployee(ActionEvent actionEvent) {
        final String firstName = firstNameInput.getText();
        final String lastName = lastNameInput.getText();

        personData.add(new Employee(firstName, lastName));

        firstNameInput.clear();
        lastNameInput.clear();
    }
}
