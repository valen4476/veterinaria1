/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void datosCompletos() {
        LOG.info("Iniciando test datosCompletos");
        Mascota mascota = new Mascota("Max", "Perro", "Mestizo",(byte)3, "Macho", "Dorado", (Double)20.5);

        assertEquals("Max", mascota.nombre());
        assertEquals("Perro", mascota.especie());
        assertEquals("Mestizo", mascota.raza());
        assertEquals((byte)3, mascota.edad());
        assertEquals("Macho", mascota.genero());
        assertEquals("Dorado", mascota.color());
        assertEquals((Double)20.5, mascota.peso());
        
        LOG.info("Finalizando test de datosCompletos");


    }


@Test
    public void datosNulos() {
        LOG.info("Iniciando test datosNulos");
        
        assertThrows(Throwable.class, ()-> new Mascota(null,null,null,(byte)3,null,null,(Double) 20.5));

        LOG.info("Finalizando test de datosNulos");
    }


@Test

    public void edadNegativa () {
        LOG.info("Iniciando test edadNegativa");


        assertThrows(Throwable.class, ()-> new Mascota("Max", "Perro", "Mestizo",(byte)-3, "Macho", "Dorado", (Double)20.5));
        



        LOG.info("Finalizando test edadNegativa");


    }


@Test

    public void datosVacios (){
        LOG.info("Iniciando test datosVacias");

        assertThrows(Throwable.class, ()-> new Mascota("","Perro","", (byte)3,"Macho","Dorado",(Double) 20.5));
        
        
        LOG.info("Finalizando test datosVacias");






    }

@Test

     public void pesoInvalido(){
        LOG.info("Iniciando test pesoInvalido");

        assertThrows(Throwable.class, ()-> new Mascota("Max","Perro","Mestizo",(byte)3,"Macho","Dorado",(double)0));

        LOG.info("Finalizando test pesoInvalido");
     }

}