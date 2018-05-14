package abstraction.abs_interface_link;

import java.io.Serializable;

public interface Rotable extends Syncable, Serializable {
    public abstract void rotate();

    void fullRotate();
}
