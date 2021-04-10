
package ni.edu.uni.programacion.controllers;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import ni.edu.uni.programacion.backend.dao.implementation.JsonVehicleDaoImpl;
import ni.edu.uni.programacion.backend.pojo.Vehicle;
import ni.edu.uni.programacion.backend.pojo.VehicleSubModel;
import ni.edu.uni.programacion.views.panels.PnlVehicle;
import  java.util.Observable;
import java.util.Observer;

/**
 *
 * @author jahp0
 */
public class PnlObservableVehicleController implements Observer {

    public void observe(Observable Vehicle) 
    {
    Vehicle.addObserver(this);
    }

    public PnlObservableVehicleController() {
    }
    public void update (Observable o, Object arg)
    {
    
    }
    
}
