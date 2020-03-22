package Practica.Practicum10.hotel.userinterface;

import Practica.Practicum10.hotel.model.Hotel;
import Practica.Practicum10.hotel.model.KamerType;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class BoekingenController {

    public TextField adresTextField;
    public DatePicker aankomstDatePicker;
    public DatePicker vertrekDatePicker;
    public ComboBox<String> kamertypeComboBox;
    public Button ResetButton;
    public Button boekButton;
    public Label topLabel;

    public void initialize() {
        List<String> kamerTypes = new ArrayList<>();

        for (KamerType kamerType : Hotel.getHotel().getKamerTypen()) {
            kamerTypes.add(kamerType.toString());
        }
        kamertypeComboBox.setItems(FXCollections.observableArrayList(kamerTypes));
    }

    @FXML
    private TextField naamTextField;

    @FXML
    private Button boekOK;

    @FXML
    private Button resetBoeking;

    @FXML
    void boekOK(ActionEvent event) {
    }

    @FXML
    void resetBoeking(ActionEvent event) {
    }

    public void boekOK(javafx.event.ActionEvent actionEvent) {
        if (!naamTextField.getText().equals("") && !adresTextField.getText().equals("") &&
                aankomstDatePicker.getValue() != null &&
                vertrekDatePicker.getValue() != null && kamertypeComboBox.getItems() != null) {

            if (aankomstDatePicker.getValue().isAfter(LocalDate.now().minusDays(1))) {

                if (aankomstDatePicker.getValue().isBefore(vertrekDatePicker.getValue())) {

                    try {

                        List<String> kamertypescombo = kamertypeComboBox.getItems();
                        List<KamerType> kamertypes = Hotel.getHotel().getKamerTypen();
                        KamerType found = null;

                        for (int i = 0; i < kamertypes.size(); i++) {
                            if (kamertypes.get(i).toString().equals(kamertypescombo.get(i))) {
                                found = kamertypes.get(i);
                                break;
                            }
                        }

                        Hotel.getHotel().voegBoekingToe(aankomstDatePicker.getValue(), vertrekDatePicker.getValue(),
                                naamTextField.getText(), adresTextField.getText(), found);
                        topLabel.setText("Boeking is gelukt!");

                    } catch (Exception e) {
                        topLabel.setText(e.getMessage());
                    }
                } else {
                    topLabel.setText("FOUT: De aankomstdatum is na de vertrek datum.");
                }
            } else {
                topLabel.setText("FOUT: Aankomst datum is voor vandaag.");
            }
        } else {
            topLabel.setText("Niet alle velden zijn ingevuld!");
        }
    }

    public void ResetFields(javafx.event.ActionEvent actionEvent) {
        naamTextField.clear();
        adresTextField.clear();
        aankomstDatePicker.setValue(null);
        vertrekDatePicker.setValue(null);
        kamertypeComboBox.setValue("Selecteer kamertype");
    }
}
