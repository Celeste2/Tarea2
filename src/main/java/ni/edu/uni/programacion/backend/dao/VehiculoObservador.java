/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion.backend.dao;

/**
 *
 * @author jahp0
 */
import java.util.Observer;
import java.util.Observable;
import java.util.logging.Logger;

public class VehiculoObservador implements Observer{
    private static final Logger logger = Logger.getLogger(VehiculoObservador.class.getName());
       private VehiculoObservable vo = null;
       public void VehiculoObservador() {
           
       }
    public void TextoObservador( VehiculoObservable vo ) {
        logger.info("Estoy en el objeto vehiculo observador");
        logger.info(vo.toString());
        this.vo = vo;
        }

    public void update( Observable obs,Object obj ) {
        if( obs == vo )
           logger.info( String.valueOf( vo.getValor() ) );
        }
    
}
