

import libreriapedirdatos.LibreriaPedirDatos;

import Transportes.Camiones;
import Transportes.ITransportes;
import Transportes.Bicicletas;


/**
 * Fabrica encargada de devolver el producto
 * que elegimos según el tipo
 */
public class Factoria {
    public static final int CAMION = 1;
    public static final int BICICLETA = 2;
    public static Integer cp = null;
    public static Float dimensionX = null;
    public static Float dimensionY = null;
    public static Float dimensionZ = null;
    public static Float peso = null;
    /**
     * Devuelve producto del tipo de la Interface
     * @param type 1: consola, 2:ventana
     * @return producto segun el tipo
     */
    public static ITransportes getProducto(int type) {
        cp = LibreriaPedirDatos.pedirint("Teclee tu Codigo Postal");
        dimensionX = LibreriaPedirDatos.pedirFloat("Teclee a dimensionX");
        dimensionY =LibreriaPedirDatos.pedirFloat("Teclee a dimensionY");
        dimensionZ = LibreriaPedirDatos.pedirFloat("Teclee a dimensionZ");
        peso = LibreriaPedirDatos.pedirFloat("Teclee o peso");
        switch (type) {
            // tipo consola
            case CAMION:
                return new Camiones(cp, dimensionX, dimensionY, dimensionZ, peso);
            // tipo ventana
            case BICICLETA:
                return new Bicicletas(cp, dimensionX, dimensionY, dimensionZ, peso);
            // otro tipo
            default:
                return null;
        }
    }

}
