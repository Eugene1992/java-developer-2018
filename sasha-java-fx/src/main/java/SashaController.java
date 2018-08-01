import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import jdbc_package.dao_task.UserDaoImpl;


public class SashaController {

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

    public TableColumn<User, String> columnUserId;
    public TableColumn<User, String> columnFirstName;
    public TableColumn<User, String> columnLastName;
    public TableColumn<User, String> columnUserName;
    public TableColumn<User, String> columnPassword;
    public TableColumn<User, String> columnRole;

    private ObservableList<User> userData = FXCollections.observableArrayList();

    public void clickCreate(ActionEvent actionEvent) {
        System.out.println(firstNameInput.getText());
        System.out.println(lastNameInput.getText());
        System.out.println(userNameInput.getText());
        System.out.println(passwordInput.getText());
        System.out.println(roleInput.getText());
    }

    public void clickDelete(ActionEvent actionEvent) {
    }

    public void clickShowAll(ActionEvent actionEvent) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        userData.addAll((User) userDaoImpl.getAll());

        columnFirstName.setCellValueFactory(cellData -> cellData.getValue().first_nameProperty());
        columnFirstName.setCellValueFactory(cellData -> cellData.getValue().last_nameProperty());
        columnFirstName.setCellValueFactory(cellData -> cellData.getValue().usernameProperty());
        columnFirstName.setCellValueFactory(cellData -> cellData.getValue().passwordProperty());
        columnFirstName.setCellValueFactory(cellData -> cellData.getValue().roleProperty());


    }
}
