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
    private Label Age;
    @FXML
    private Label Salary;
    @FXML
    private Label isMarried;
    @FXML
    private Label Position;

    private EmpDBApplication application;

    private EmployeeDaoImpl crud;

    /**
     * Конструктор.
     * Конструктор вызывается раньше метода initialize().
     */
    public EmployeeOverviewController() {
        crud = new EmployeeDaoImpl();
    }

    // TODO: 8/3/2018
    @FXML
    private void initialize() {
        // Инициализация таблицы адресатов с тремя столбцами.
//        idColumn.setCellValueFactory(cellData -> new crud.get(1).idProperty());
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().first_nameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().last_nameProperty());
    }
}
