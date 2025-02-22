package com.example.pms;

import com.example.pms.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) {
        Model.getInstance().getViewFactory().showLoginWindow();
    }
}
