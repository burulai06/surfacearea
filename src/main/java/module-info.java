module com.example.surfaceareaandvolumeof3dshapes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.surfaceareaandvolumeof3dshapes to javafx.fxml;
    exports com.example.surfaceareaandvolumeof3dshapes;
}