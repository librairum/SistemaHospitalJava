/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Hospital.Data;

import Hospital.Entities.Empleado;
import java.util.List;
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
public class EmpleadoDataIT {
    
    private EmpleadoData empleadoData;
    
    public EmpleadoDataIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        empleadoData = new EmpleadoData();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testTraerCodigoEmpleado() {
        int codigo = empleadoData.TraerCodigoEmpleado();
        assertEquals(1, codigo);
    }

    @Test
    public void testInsertarAgregaEmpleadoLista() {
        Empleado empleado = new Empleado(/* Agregar parámetros del constructor aquí */);
        empleadoData.Insertar(empleado);

        List<Empleado> empleados = empleadoData.TraerEmpleados();
        assertEquals(1, empleados.size());
        assertEquals(empleado, empleados.get(0));
    }

    @Test
    public void testEliminaEmpleadoLista() {
        Empleado empleado = new Empleado(/* Agregar parámetros del constructor aquí */);
        empleadoData.Insertar(empleado);

        empleadoData.Eliminar(empleado);

        List<Empleado> empleados = empleadoData.TraerEmpleados();
        assertEquals(0, empleados.size());
    }

    @Test
    public void testEliminaTodosEmpleadosLista() {
        Empleado empleado1 = new Empleado(/* Agregar parámetros del constructor aquí */);
        Empleado empleado2 = new Empleado(/* Agregar parámetros del constructor aquí */);
        empleadoData.Insertar(empleado1);
        empleadoData.Insertar(empleado2);

        empleadoData.EliminarTodo();

        List<Empleado> empleados = empleadoData.TraerEmpleados();
        assertEquals(0, empleados.size());
    }

    @Test
    public void testActualizaEmpleadoLista() {
        Empleado empleado = new Empleado(/* Agregar parámetros del constructor aquí */);
        empleadoData.Insertar(empleado);

        Empleado empleadoActualizado = new Empleado(/* Agregar valores actualizados aquí */);
        empleadoData.Actualizar(empleadoActualizado);

        List<Empleado> empleados = empleadoData.TraerEmpleados();
        assertEquals(1, empleados.size());
        assertEquals(empleadoActualizado, empleados.get(0));
    }

    @Test
    public void testBuscarEmpleadoCorrecto() {
        Empleado empleado = new Empleado(/* Agregar parámetros del constructor aquí */);
        empleadoData.Insertar(empleado);

        int tipo = 0;
        String valor = "valorDePrueba";  // Reemplaza "valorDePrueba" con el valor que estás buscando

        Empleado empleadoEncontrado = empleadoData.Buscar(tipo, valor);
        assertNotNull(empleadoEncontrado);
        assertEquals(empleado, empleadoEncontrado);
    }

    @Test
    public void testCuandoNoSeEncuentra() {
        int tipo = 0;
        String valor = "valorQueNoExiste";  // Reemplaza "valorQueNoExiste" con un valor que no exista

        Empleado empleadoEncontrado = empleadoData.Buscar(tipo, valor);
        assertNull(empleadoEncontrado);
    }

    @Test
    public void testTraerEmpleadosLista() {
        List<Empleado> empleados = empleadoData.TraerEmpleados();
        assertNotNull(empleados);
        assertEquals(0, empleados.size());
    }
}
