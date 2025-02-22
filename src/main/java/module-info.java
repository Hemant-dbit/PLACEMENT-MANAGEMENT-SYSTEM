module com.example.pms {
    // JavaFX modules
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.base;
    requires javafx.graphics;

    // Third-party libraries
    requires de.jensd.fx.glyphs.fontawesome; // FontAwesomeFX
    requires org.controlsfx.controls;      // ControlsFX
    requires com.dlsc.formsfx;             // FormsFX
    requires net.synedra.validatorfx;      // ValidatorFX
    requires org.kordamp.ikonli.javafx;    // Ikonli JavaFX
    requires org.kordamp.bootstrapfx.core; // BootstrapFX
    requires eu.hansolo.tilesfx;           // TilesFX
    requires com.almasb.fxgl.all;          // FXGL (Game Engine)

    // Other dependencies
    requires java.sql;                     // SQL support
    requires org.xerial.sqlitejdbc;        // SQLite JDBC driver
    requires java.desktop;                 // Desktop integration
    requires java.mail;                    // JavaMail API

    // Open packages for JavaFX reflection
    opens com.example.pms.Models to javafx.base, javafx.fxml;
    opens com.example.pms to javafx.fxml, javafx.base;
    opens com.example.pms.Controllers to javafx.fxml, javafx.base;
    opens com.example.pms.Controllers.Admin to javafx.fxml, javafx.base;
    opens com.example.pms.Views to javafx.fxml, javafx.base;  // Add this if Views uses FXML or reflection

    // Export packages to make them available to other modules
    exports com.example.pms;
    exports com.example.pms.Controllers;
    exports com.example.pms.Controllers.Admin;
    exports com.example.pms.Models;
    exports com.example.pms.Views;
}