/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Hospital.Data;

import Hospital.Entities.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fredr
 */
public class PacienteDataIT {
    
    public PacienteDataIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testInsertar() {
        PacienteData pacienteData = new PacienteData();
        Paciente paciente = new Paciente(/* Argumentos necesarios */);
        pacienteData.Insertar(paciente);
        assertEquals(1, pacienteData.lista.size());
    }

    @Test
    public void testActualizar() {
        PacienteData pacienteData = new PacienteData();
        Paciente paciente = new Paciente(/* Argumentos necesarios */);
        pacienteData.Insertar(paciente);

        String nuevosNombres = "NuevoNombre";
        String nuevosApellidos = "NuevoApellido";
        String nuevoTelefono = "NuevoTelefono";
        String nuevoDni = "NuevoDNI";

        pacienteData.Actualizar(paciente, nuevosNombres, nuevosApellidos, nuevoTelefono, nuevoDni);

        
        assertEquals(nuevosNombres, paciente.getDatosPersonales().getNombres());
        assertEquals(nuevosApellidos, paciente.getDatosPersonales().getApellidos());
        assertEquals(nuevoTelefono, paciente.getDatosPersonales().getTelefono());
        assertEquals(nuevoDni, paciente.getDatosPersonales().getDni());
    }

    @Test
    public void testEliminar() {
        PacienteData pacienteData = new PacienteData();
        Paciente paciente = new Paciente(/* Argumentos necesarios */);
        pacienteData.Insertar(paciente);

        assertEquals(1, pacienteData.lista.size());

        pacienteData.Eliminar(paciente);

        assertEquals(0, pacienteData.lista.size());
    }

    @Test
    public void testTraerNuevoCodigo() {
        PacienteData pacienteData = new PacienteData();

        // Agrega pacientes a la lista
        Paciente paciente1 = new Paciente(/* Agumentos necesarios */);
        pacienteData.Insertar(paciente1);

        Paciente paciente2 = new Paciente(/* Argumentos necesarios */);
        pacienteData.Insertar(paciente2);

       
        assertEquals(pacienteData.lista.size() + 1, pacienteData.TraerNuevoCodigo());
    }
}