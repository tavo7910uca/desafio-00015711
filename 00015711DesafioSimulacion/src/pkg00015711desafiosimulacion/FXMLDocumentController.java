package pkg00015711desafiosimulacion;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;


public class FXMLDocumentController implements Initializable {
    
   @FXML
    private ImageView imageView;
    
    private int angle;
    
   @FXML
    private Button salida;
    
   @FXML
    private void botonPreprocesoDominio(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/defDominio.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);
    }  
    
   @FXML
    private void botonPreprocesoCondicionesContorno(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/defContorno.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }      
    
   @FXML
    private void botonPreprocesoMalla(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/defmalla.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }      
    
   @FXML
    private void botonPreprocesoElementosMalla(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/elementosmalla.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);    
    }    
    
    @FXML
    private void botonPreprocesoTablaConectividades(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/tablaConectividades.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }  
        
    
    @FXML
    private void botonPaso1(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso1.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }

    @FXML
    private void botonPaso2(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso2.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }

    @FXML
    private void botonPaso3(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso3.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }

    @FXML
    private void botonPaso4(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso4.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }

    @FXML
    private void botonPaso5(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso5.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }
    
    @FXML
    private void botonPaso6(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso6.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }
    
    @FXML
    private void paso7Elemento1(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso7Elemento1.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }

    @FXML
    private void paso7Elemento2(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso7Elemento2.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }   

    @FXML
    private void paso7Elemento3(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso7Elemento3.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }       

    @FXML
    private void paso7Elemento4(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso7Elemento4.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }       

        @FXML
    private void paso7Elemento5(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso7Elemento5.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }   
    
    @FXML
    private void paso7Elemento6(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso7Elemento6.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }

    @FXML
    private void paso7EstructuraGlobal(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso7EstructuraGlobal.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }    
    
    @FXML
    private void paso7ParteAB(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso7ParteAB.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    } 
    
    @FXML
    private void paso7ParteCD(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso7ParteCD.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }

    @FXML
    private void paso7Operaciones1(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso7Operaciones1.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }

    @FXML
    private void paso8EstructuraCondiciones(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso8EstructuraCondiciones.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }
    

    @FXML
    private void paso8ParteFG(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso8ParteFG.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }

    @FXML
    private void paso8ParteHI(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso8ParteHI.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }

   @FXML
    private void paso8Operaciones2(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso8Operaciones2.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }    
    
   @FXML
    private void paso8EstructuraSistemaEcuaciones(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso8EstructuraSistemaEcuaciones.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }
    
   @FXML
    private void paso8ParteJK(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso8ParteJK.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }
    
    @FXML
    private void paso8ParteLM(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso8ParteLM.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }   
    
    @FXML
    private void paso8Operaciones3(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/paso8Operaciones3.JPG");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }   
    
    @FXML
    private void botonMatrizE(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/Ecomponentes.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }
    
    @FXML
    private void botonMatrizZ(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/Zcomponentes.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }
    
    @FXML
    private void botonMatrizK(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/Kcomponentes.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }
    
    @FXML
    private void botonMatrizM(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/Mcomponentes.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }
    
    @FXML
    private void botonMatrizF(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/Fcomponentes.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);        
    }          
 
   @FXML
    private void botonMatrizH(ActionEvent event) {
        URL rutaImagen = getClass().getResource("/capturasDePantalla/Hcomponentes.jpg");
        imageView.setImage(new Image(rutaImagen.toString()));
        efectoImagen(imageView);
    }   

   @FXML
    private void botonSalir(ActionEvent event) {
        pantallaSalir();
    }   
    
    private void efectoImagen(Node imageView2){
    Duration duration = Duration.millis(1500);
    RotateTransition rotateTransition = new RotateTransition(duration, imageView2);
    rotateTransition.setFromAngle(0);
    rotateTransition.setToAngle(360);    
    rotateTransition.play();
    
    }
    
    public void pantallaSalir(){
        URL rutaImagenSalir = getClass().getResource("/capturasDePantalla/endingScreen.jpg");
        ImageView imagenSalir = new ImageView();
        imagenSalir.setImage(new Image(rutaImagenSalir.toString()));
        Alert alert = new Alert(Alert.AlertType.INFORMATION,"",ButtonType.OK);
        alert.getDialogPane().setPrefSize(674,472);
        alert.setHeaderText(null);
        alert.setTitle("Saliendo...");
        alert.setContentText(null);
        alert.setGraphic(imagenSalir);
        
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            Stage stage = (Stage) salida.getScene().getWindow();
            stage.close(); 
        } else {           
        }      

    }    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}
