import dao.Employee;
import dao.EmployeeDao;
import dao.EmployeeDaoJdbcImpl;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Окно для изменения информации об адресате.
 *
 * @author Marco Jakob
 */
public class EmployeeEditDialogController {

    public static final String NO_VALID_FIRST_NAME = "No valid first name!";
    public static final String NO_VALID_LAST_NAME = "No valid last name!";
    public static final String NO_VALID_AGE = "No valid age!";
    public static final String NO_VALID_SALARY = "No valid salary!";
    public static final String NO_VALID_POSITION = "No valid position!";
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField ageField;
    @FXML
    private TextField salaryField;
    @FXML
    private CheckBox isMarriedCheckBox;
    @FXML
    private TextField positionField;

    private EmployeeDao crud;
    private Integer selectedId;

    private Stage dialogStage;
    private Employee employee;
    private boolean okClicked = false;

    public EmployeeEditDialogController() {
        crud = new EmployeeDaoJdbcImpl();
        employee = new Employee();
    }

    /**
     * Инициализирует класс-контроллер. Этот метод вызывается автоматически
     * после того, как fxml-файл будет загружен.
     */

    @FXML
    private void initialize() {
    }

    /**
     * Устанавливает сцену для этого окна.
     *
     * @param dialogStage
     */
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    /**
     * Задаёт адресата, информацию о котором будем менять.
     *
     * @param employee
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;

        if (employee.idProperty() != null) {
            selectedId = employee.idProperty().getValue();
            firstNameField.setText(employee.firstNameProperty().getValue());
            lastNameField.setText(employee.lastNameProperty().getValue());
            ageField.setText(Integer.toString(employee.ageProperty().getValue()));
            salaryField.setText(Integer.toString(employee.salaryProperty().getValue()));
            isMarriedCheckBox.setSelected(employee.isMarriedProperty().getValue());
            positionField.setText(employee.positionProperty().getValue());
        }
    }

    /**
     * Returns true, если пользователь кликнул OK, в другом случае false.
     *
     * @return
     */
    public boolean isOkClicked() {
        return okClicked;
    }

    /**
     * Вызывается, когда пользователь кликнул по кнопке OK.
     */
    @FXML
    private void handleOk() {
        if (isInputValid()) {
            employee.setFirstName(firstNameField.getText());
            employee.setLastName(lastNameField.getText());
            employee.setAge(Integer.parseInt(ageField.getText()));
            employee.setSalary(Integer.parseInt(salaryField.getText()));
            employee.setIsMarried(isMarriedCheckBox.isSelected());
            employee.setPosition(positionField.getText());

            if (employee.idProperty() != null) {
                crud.update(employee);
            }

            okClicked = true;
            dialogStage.close();
        }
    }

 /*   private String getNameFromProperty(String text) {
        return text.substring(
                text.lastIndexOf(':') + 1, text.lastIndexOf(']')
        );
    }*/

    /**
     * Вызывается, когда пользователь кликнул по кнопке Cancel.
     */
    @FXML
    private void handleCancel() {
        dialogStage.close();
    }

    /**
     * Проверяет пользовательский ввод в текстовых полях.
     *
     * @return true, если пользовательский ввод корректен
     */
    private boolean isInputValid() {
        String errorMessage = "";

        if (firstNameField.getText() == null || firstNameField.getText().length() == 0) {
            errorMessage += NO_VALID_FIRST_NAME + "\n";
        }

        if (lastNameField.getText() == null || lastNameField.getText().length() == 0) {
            errorMessage += NO_VALID_LAST_NAME + "\n";
        }

        if (ageField.getText() == null || ageField.getText().length() == 0) {
            errorMessage += NO_VALID_AGE + "\n";
        } else {
            try {
                if (Integer.parseInt(ageField.getText()) <= 0) {
                    errorMessage += NO_VALID_AGE + "\n";
                }
            } catch (NumberFormatException e) {
                errorMessage += NO_VALID_AGE + "\n";
            }
        }

        if (salaryField.getText() == null || salaryField.getText().length() == 0) {
            errorMessage += NO_VALID_SALARY + "\n";
        } else {
            try {
                if (Integer.parseInt(salaryField.getText()) <= 0) {
                    errorMessage += NO_VALID_SALARY + "\n";
                }
            } catch (NumberFormatException e) {
                errorMessage += NO_VALID_SALARY + "\n";
            }
        }

        if (positionField.getText() == null || positionField.getText().length() == 0) {
            errorMessage += NO_VALID_POSITION + "\n";
        }

        if (errorMessage.length() == 0) {
            return true;
        } else {
            // Показываем сообщение об ошибке.
            Alert alert = new Alert(AlertType.ERROR);
            alert.initOwner(dialogStage);
            alert.setTitle("Invalid Fields");
            alert.setHeaderText("Please correct invalid fields");
            alert.setContentText(errorMessage);

            alert.showAndWait();

            return false;
        }
    }


}