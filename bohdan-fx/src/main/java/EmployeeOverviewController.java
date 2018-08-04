import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
    private Label age;
    @FXML
    private Label salary;
    @FXML
    private Label isMarried;
    @FXML
    private Label position;

    private EmpDBApplication application;

    private EmployeeDaoImpl crud;

    /**
     * Конструктор.
     * Конструктор вызывается раньше метода initialize().
     */
    public EmployeeOverviewController() {
        crud = new EmployeeDaoImpl();
    }

    @FXML
    private void initialize() {
        // Инициализация таблицы адресатов с тремя столбцами.
//        idColumn.setCellValueFactory(cellData ->
//                cellData.getValue().idProperty().asObject());
        idColumn.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper<>(crud.get(1).idProperty().get()));
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().first_nameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().last_nameProperty());
    }

    public void setApp(EmpDBApplication application) {
        this.application = application;

        // Добавление в таблицу данных из наблюдаемого списка
        employeeTable.setItems(application.getPersonData());
    }


}
