package file_CRUD_task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CrudImpl {
    private File file;
    private FileOutputStream output;
    private FileInputStream input;

    public CrudImpl(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void create() {

    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }
}
