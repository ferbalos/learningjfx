module learningjfx {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.logging;
	requires javafx.web;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
}
