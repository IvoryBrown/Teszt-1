package application;

import javafx.beans.property.SimpleStringProperty;

public class AppPojo {
	private final SimpleStringProperty id;
	private final SimpleStringProperty userName;
	private final SimpleStringProperty lakcim;
	private final SimpleStringProperty telo;

	public AppPojo(String id, String userName, String lakcim, String telo) {
		this.id = new SimpleStringProperty(String.valueOf(id));
		this.userName = new SimpleStringProperty(userName);
		this.lakcim = new SimpleStringProperty(lakcim);
		this.telo = new SimpleStringProperty(telo);
	}

	public AppPojo(String userName, String lakcim, String telo) {
		this.id = new SimpleStringProperty("");
		this.userName = new SimpleStringProperty(userName);
		this.lakcim = new SimpleStringProperty(lakcim);
		this.telo = new SimpleStringProperty(telo);
	}

	public String getId() {
		return this.id.get();
	}

	public void setId(String id) {
		this.id.set(id);
	}

	public String getUserName() {
		return this.userName.get();
	}

	public void setUserName(String userName) {
		this.userName.set(userName);
	}

	public String getLakcim() {
		return this.lakcim.get();
	}

	public void setLakcim(String lakcim) {
		this.lakcim.set(lakcim);
	}

	public String getTelo() {
		return this.telo.get();
	}

	public void setTelo(String telo) {
		this.telo.set(telo);
	}
}