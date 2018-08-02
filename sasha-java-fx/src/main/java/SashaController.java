import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.List;

public class SashaController {

    public TextField userIdInput;
    public TextField firstNameInput;
    public TextField lastNameInput;
    public TextField userNameInput;
    public TextField passwordInput;
    public TextField roleInput;
    public TextField userIdForDelete;

    public Button createButton;
    public Button deleteButton;
    public Button showAllButton;

    public TableView tableView;

    public TableColumn<User, Integer> columnUserId;
    public TableColumn<User, String> columnFirstName;
    public TableColumn<User, String> columnLastName;
    public TableColumn<User, String> columnUserName;
    public TableColumn<User, String> columnPassword;
    public TableColumn<User, String> columnRole;

    private ObservableList<User> userData = FXCollections.observableArrayList();

    public void clickCreate(ActionEvent actionEvent) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        userDaoImpl.create(new User(
                Integer.parseInt(userIdInput.getText()),
                firstNameInput.getText(),
                lastNameInput.getText(),
                userNameInput.getText(),
                passwordInput.getText(),
                roleInput.getText()
        ));

        userIdInput.clear();
        firstNameInput.clear();
        lastNameInput.clear();
        userNameInput.clear();
        passwordInput.clear();
        roleInput.clear();
    }

    public void clickDelete(ActionEvent actionEvent) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        userDaoImpl.delete(Integer.parseInt(userIdForDelete.getText()));
        userIdForDelete.clear();
    }

    public void clickShowAll(ActionEvent actionEvent) {
        for (int i = 0; i < tableView.getItems().size(); i++) {
            tableView.getItems().clear();
        }
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        List<User> userList = userDaoImpl.getAll();
        for (User user : userList) {
            userData.add(user);
        }
        tableView.setItems(userData);
// TODO: 2018-08-02 problem with integer type 
//        columnUserId.setCellValueFactory(cellData -> cellData.getValue().user_idProperty());
        columnFirstName.setCellValueFactory(cellData -> cellData.getValue().first_nameProperty());
        columnLastName.setCellValueFactory(cellData -> cellData.getValue().last_nameProperty());
        columnUserName.setCellValueFactory(cellData -> cellData.getValue().usernameProperty());
        columnPassword.setCellValueFactory(cellData -> cellData.getValue().passwordProperty());
        columnRole.setCellValueFactory(cellData -> cellData.getValue().roleProperty());
    }
}
