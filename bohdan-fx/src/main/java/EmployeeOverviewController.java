import dao.Employee;
import dao.EmployeeDao;
import dao.EmployeeDaoJdbcImpl;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class EmployeeOverviewController {

    @FXML
    private TableView<Employee> employeeTable;
    @FXML
    private TableColumn<Employee, Integer> idColumn;
    @FXML
    private TableColumn<Employee, String> firstNameColumn;
    @FXML
    private TableColumn<Employee, String> lastNameColumn;

    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label ageLabel;
    @FXML
    private Label salaryLabel;
    @FXML
    private CheckBox isMarriedCheckBox;
    @FXML
    private Label positionLabel;

    private EmpDBApplication application;

    private EmployeeDao crud;

    /**
     * Конструктор.
     * Конструктор вызывается раньше метода initialize().
     */
    public EmployeeOverviewController() {
        crud = new EmployeeDaoJdbcImpl();
    }

    @FXML
    private void initialize() {
        // Инициализация таблицы адресатов с тремя столбцами.
        idColumn.setCellValueFactory(cellData ->
                cellData.getValue().idProperty().asObject());
//        idColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(crud.get(1).idProperty().get()));
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());

        // Очистка дополнительной информации об адресате.
        showEmployeeDetails(null);

        // Слушаем изменения выбора, и при изменении отображаем
        // дополнительную информацию об адресате.
        employeeTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showEmployeeDetails(newValue));

        isMarriedCheckBox.setDisable(true);
    }

    public void setApp(EmpDBApplication application) {
        this.application = application;

        // Добавление в таблицу данных из наблюдаемого списка
        employeeTable.setItems(application.getEmployeeData());
    }

    /**
     * Заполняет все текстовые поля, отображая подробности об адресате.
     * Если указанный адресат = null, то все текстовые поля очищаются.
     *
     * @param employee — адресат типа Person или null
     */
    private void showEmployeeDetails(Employee employee) {
        if (employee != null) {
            // Заполняем метки информацией из объекта person.
            firstNameLabel.setText(employee.firstNameProperty().getValue());
            lastNameLabel.setText(employee.lastNameProperty().getValue());
            ageLabel.setText(Integer.toString(employee.ageProperty().getValue()));
            salaryLabel.setText(Integer.toString(employee.salaryProperty().getValue()));
            isMarriedCheckBox.setSelected(employee.isMarriedProperty().getValue());
            positionLabel.setText(employee.positionProperty().getValue());

            //dao.DateUtil usage if needed
            //birthdayLabel.setText(dao.DateUtil.format(person.getBirthday()));

        } else {
            // Если Person = null, то убираем весь текст.
            firstNameLabel.setText("");
            lastNameLabel.setText("");
            ageLabel.setText("");
            salaryLabel.setText("");
            isMarriedCheckBox.setSelected(false);
            positionLabel.setText("");
        }
    }

    /**
     * Вызывается, когда пользователь кликает по кнопке удаления.
     */
    @FXML
    private void handleDeleteEmployee() {
        int selectedIndex = employeeTable.getSelectionModel().getSelectedIndex();
        int selectedId = employeeTable.getSelectionModel().getSelectedItem().idProperty().get();
        if (selectedIndex >= 0) {
            crud.delete(selectedId);
            employeeTable.getItems().remove(selectedIndex);
        } else {
            getAlert().showAndWait();
        }
    }

    /**
     * Вызывается, когда пользователь кликает по кнопке New...
     * Открывает диалоговое окно с дополнительной информацией нового адресата.
     */
    @FXML
    private void handleNewEmployee() {
        Employee tempEmployee = new Employee();
        boolean okClicked = application.showEmployeeEditDialog(tempEmployee);
        if (okClicked) {
//            crud.create(tempEmployee);
            application.getEmployeeData().add(crud.create(tempEmployee));
        }
    }

    /**
     * Вызывается, когда пользователь кликает по кнопка Edit...
     * Открывает диалоговое окно для изменения выбранного адресата.
     */
    @FXML
    private void handleEditEmployee() {
        Employee selectedEmployee = employeeTable.getSelectionModel().getSelectedItem();
        if (selectedEmployee != null) {
            boolean okClicked = application.showEmployeeEditDialog(selectedEmployee);
            if (okClicked) {
                showEmployeeDetails(selectedEmployee);
            }

        } else {
            getAlert().showAndWait();
        }
    }

    private Alert getAlert() {
        // Ничего не выбрано.
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.initOwner(application.getPrimaryStage());
        alert.setTitle("No Selection");
        alert.setHeaderText("No employee Selected");
        alert.setContentText("Please select an employee in the table.");

        return alert;
    }
}
