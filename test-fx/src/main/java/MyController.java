import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MyController {
    @FXML
    public Button textBtn;

    @FXML
    public Text showText;

    public TextField firstNameInput;

    public TextField lastNameInput;

    public TableView<Person> dataTable;

    public TableColumn<Person, String> firstNameColumn;

    public TableColumn<Person, String> lastNameColumn;

    private ObservableList<Person> personData = FXCollections.observableArrayList();

    public void create(ActionEvent actionEvent) {

        if (personData.isEmpty()) {
            personData.addAll(
                    new Person("Tom", "Smith"),
                    new Person("John", "Doe"),
                    new Person("Sara", "Connor")
            );
            dataTable.setItems(personData);
        }

        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());

        String newFirstName = firstNameInput.getText();
        String newLastName = lastNameInput.getText();

        personData.add(new Person(newFirstName, newLastName));

        firstNameInput.clear();
        lastNameInput.clear();
    }
}
