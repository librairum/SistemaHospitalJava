/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Hospital.Entities;

import java.time.LocalDate;
import java.time.LocalTime;
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
public class HospitalizacionIT {
    
    public HospitalizacionIT() {
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
    public void testhospitalizacion() {
        Hospitalizacion hospitalizacion = new Hospitalizacion();
        hospitalizacion.setCodigohospitalizacion(1);
        assertEquals(1, hospitalizacion.getCodigohospitalizacion());
    }

    @Test
    public void testpaciente() {
        Hospitalizacion hospitalizacion = new Hospitalizacion();
        hospitalizacion.setCodigopaciente(2);
        assertEquals(2, hospitalizacion.getCodigopaciente());
    }

    @Test
    public void testempleado() {
        Hospitalizacion hospitalizacion = new Hospitalizacion();
        hospitalizacion.setCodigoempleado(3);
        assertEquals(3, hospitalizacion.getCodigoempleado());
    }

    @Test
    public void testNumerocama() {
        Hospitalizacion hospitalizacion = new Hospitalizacion();
        hospitalizacion.setNumerocama(4);
        assertEquals(4, hospitalizacion.getNumerocama());
    }

    @Test
    public void testFechallegada() {
        Hospitalizacion hospitalizacion = new Hospitalizacion();
        LocalDate fechaLlegada = LocalDate.now();
        hospitalizacion.setFechallegada(fechaLlegada);
        assertEquals(fechaLlegada, hospitalizacion.getFechallegada());
    }

    @Test
    public void testHorallegada() {
        Hospitalizacion hospitalizacion = new Hospitalizacion();
        LocalTime horaLlegada = LocalTime.now();
        hospitalizacion.setHorallegada(horaLlegada);
        assertEquals(horaLlegada, hospitalizacion.getHorallegada());
    }

    @Test
    public void testFechasalida() {
        Hospitalizacion hospitalizacion = new Hospitalizacion();
        LocalDate fechaSalida = LocalDate.now().plusDays(1);
        hospitalizacion.setFechasalida(fechaSalida);
        assertEquals(fechaSalida, hospitalizacion.getFechasalida());
    }

    @Test
    public void testHorasalida() {
        Hospitalizacion hospitalizacion = new Hospitalizacion();
        LocalTime horaSalida = LocalTime.now().plusHours(1);
        hospitalizacion.setHorasalida(horaSalida);
        assertEquals(horaSalida, hospitalizacion.getHorasalida());
    }

    @Test
    public void testEstaod() {
        Hospitalizacion hospitalizacion = new Hospitalizacion();
        hospitalizacion.setEstaod(5);
        assertEquals(5, hospitalizacion.getEstaod());
    }
}

