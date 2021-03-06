package Practica.Practicum10.hotel.userinterface;

import Practica.Practicum10.hotel.model.Boeking;
import Practica.Practicum10.hotel.model.Hotel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.time.LocalDate;


public class HotelOverzichtController {
    @FXML
    private Label hotelnaamLabel;
    @FXML
    private ListView boekingenListView;
    @FXML
    private DatePicker overzichtDatePicker;

    private Hotel hotel = Hotel.getHotel();


    public void initialize() {
        hotelnaamLabel.setText("Boekingen hotel " + hotel.getNaam());
        overzichtDatePicker.setValue(LocalDate.now());
        toonBoekingen();
    }

    public void toonVorigeDag(ActionEvent actionEvent) {
        LocalDate dagEerder = overzichtDatePicker.getValue().minusDays(1);
        overzichtDatePicker.setValue(dagEerder);
    }

    public void toonVolgendeDag(ActionEvent actionEvent) {
        LocalDate dagLater = overzichtDatePicker.getValue().plusDays(1);
        overzichtDatePicker.setValue(dagLater);
    }

    public void nieuweBoeking(ActionEvent actionEvent)
            throws Exception {
        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("Boeking.fxml"));
        Parent root = loader.load();

        Stage newStage = new Stage();
        newStage.setScene(new Scene(root));
        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.showAndWait();
        initialize();
    }


    // Maak in je project een nieuwe FXML-pagina om boekingen te kunnen invoeren
    // Open de nieuwe pagina in deze methode
    // Zorg dat de gebruiker ondertussen geen gebruik kan maken van de HotelOverzicht-pagina
    // Update na sluiten van de nieuwe pagina het boekingen-overzicht


    public void toonBoekingen() {
        ObservableList<String> boekingen = FXCollections.observableArrayList();

        for (Boeking item : hotel.getBoekingen()) {
            if (overzichtDatePicker.getValue().isBefore(item.getVertrekDatum()) && overzichtDatePicker.getValue().isAfter(item.getAankomstDatum().minusDays(1)))
                boekingen.add(item.toString());
        }

        boekingenListView.setItems(boekingen);
    }
}