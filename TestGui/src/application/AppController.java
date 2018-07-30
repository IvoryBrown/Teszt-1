package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.database.AppDataBase;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AppController implements Initializable {
	@FXML
	private TextField nameTxt, adressTxt;
	@FXML
	private TextArea bakkerTAe;
	@FXML
	private AnchorPane anchorPane;
	@FXML
	private ComboBox<String> cmb;
	private final String COUNTRYCOUNTIES[] = { "Bács-Kiskun", "Baranya", "Békés", " Borsod-Abaúj-Zemplén", "Csongrád",
			" Fejér", " Győr-Moson-Sopron", "Hajdú-Bihar", "Heves", "Jász-Nagykun-Szolnok", " Komárom-Esztergom ",
			"Nógrád", "Pest", "Somogy", "Szabolcs-Szatmár-Bereg", "Tolna", "Vas", " Veszprém", "Zala" };

	private boolean checkName() {
		if (nameTxt.getText().trim().isEmpty() || adressTxt.getText().trim().isEmpty()) {
			
			return false;
		} else {
			return true;
		}

	}
	
	@FXML
	private void addUser() {
		if (checkName()) {
			AppPojo pojo = new AppPojo(nameTxt.getText(), adressTxt.getText(), bakkerTAe.getText());
			AppDataBase.addOperatingSystem(pojo);
			System.out.println("Siker");
		}else {
			System.out.println("Sikertelen Üres");
		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		bakkerTAe.setWrapText(true);
		cmb.getItems().addAll(COUNTRYCOUNTIES);

	}

}
