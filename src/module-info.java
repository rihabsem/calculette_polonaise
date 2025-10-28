module calculatorfx {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens controler to javafx.fxml; 
	opens view to javafx.fxml;        
    exports view;
}
