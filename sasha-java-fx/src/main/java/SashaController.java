import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.Arrays;
import java.util.List;

public class SashaController {

    public Button editButton;
    public TableView<User> tableView;

    public TextField firstNameInput;
    public TextField lastNameInput;
    public TextField userNameInput;
    public TextField passwordInput;
    public TextField roleInput;

    public Button createButton;
    public Button deleteButton;
    private UserDaoImpl userDaoImpl = new UserDaoImpl();
    private MainSasha mainSasha = new MainSasha();

    public TableColumn<User, Integer> columnUserId;
    public TableColumn<User, String> columnFirstName;
    public TableColumn<User, String> columnLastName;
    public TableColumn<User, String> columnUserName;
    public TableColumn<User, String> columnPassword;
    public TableColumn<User, String> columnRole;

    private ObservableList<User> userData = FXCollections.observableArrayList();

    public void clickCreate(ActionEvent actionEvent) {
        userDaoImpl.create(new User(
                firstNameInput.getText(),
                lastNameInput.getText(),
                userNameInput.getText(),
                passwordInput.getText(),
                roleInput.getText()
        ));

        cleanFields(
                firstNameInput,
                lastNameInput,
                userNameInput,
                passwordInput,
                roleInput
        );

        init();
    }

    public void clickDelete(ActionEvent actionEvent) {
        int selectedIndex = tableView.getSelectionModel().getSelectedIndex();
        userDaoImpl.delete(tableView.getItems().get(selectedIndex).getUser_id());
        init();
    }

    private void cleanFields(TextInputControl... fields) {
        Arrays.asList(fields).forEach(TextInputControl::clear);
    }

    public void init() {
        for (int i = 0; i < tableView.getItems().size(); i++) {
            tableView.getItems().clear();
        }
        List<User> userList = userDaoImpl.getAll();
        userData.addAll(userList);
        tableView.setItems(userData);
        columnUserId.setCellValueFactory(cellData -> cellData.getValue().user_idProperty().asObject());
        columnFirstName.setCellValueFactory(cellData -> cellData.getValue().first_nameProperty());
        columnLastName.setCellValueFactory(cellData -> cellData.getValue().last_nameProperty());
        columnUserName.setCellValueFactory(cellData -> cellData.getValue().usernameProperty());
        columnPassword.setCellValueFactory(cellData -> cellData.getValue().passwordProperty());
        columnRole.setCellValueFactory(cellData -> cellData.getValue().roleProperty());
    }

    public void editUser(ActionEvent actionEvent) {
        User selectedPerson = tableView.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            boolean okClicked = mainSasha.showUserEditWindow(selectedPerson);
            if (okClicked) {
                init();
            }

        } else {
            // Ничего не выбрано.
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("No Selection");
            alert.setHeaderText("No Person Selected");
            alert.setContentText("Please select a person in the table.");

            alert.showAndWait();
        }
    }
}
