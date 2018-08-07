import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UserEditWindowController {

    public TextField firstNameEditText;
    public TextField lastNameEditText;
    public TextField userNameEditText;
    public TextField passwordEditText;
    public TextField roleEditText;
    public Button okEditButton;
    public Button cancelEditButton;
    private UserDaoImpl userDaoImpl = new UserDaoImpl();
    private Stage dialogStage;
    private User user;
    private boolean okClicked = false;

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void setUser(User user) {
        this.user = user;

        firstNameEditText.setText(user.getFirst_name());
        lastNameEditText.setText(user.getLast_name());
        userNameEditText.setText(user.getUsername());
        passwordEditText.setText(user.getPassword());
        roleEditText.setText(user.getRole());
    }

    public boolean isOkClicked() {
        return okClicked;
    }

    @FXML
    private void handleOk() {
        user.setFirst_name(firstNameEditText.getText());
        user.setLast_name(lastNameEditText.getText());
        user.setUsername(userNameEditText.getText());
        user.setPassword(passwordEditText.getText());
        user.setRole(roleEditText.getText());
        userDaoImpl.update(user);

        okClicked = true;
        dialogStage.close();
    }

    @FXML
    private void handleCancel() {
        dialogStage.close();
    }
}
