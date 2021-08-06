/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Clases.Client;
import Model.ClientModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mario
 */
public class TestClientModel {

    public TestClientModel() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Antes de la clase");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Al fnal de la clase");
    }

    @Before
    public void setUp() {
        System.out.println("Antes del metodo");
    }

    @After
    public void tearDown() {
        System.out.println("Despues del metodo");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
//     @Test
//     public void hello() {}
    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    @Test
    public void testSuma() {
        int num1 = 10;
        int num2 = 5;
        assertEquals(15, suma(num1, num2));
    }

//    @Test
//    public void testCreate(){    
//        ClientModel cliente_modelo = new ClientModel();
//        Client cliente = new Client("anastacia@correom.com", "31475895", "Anastasia", "Suarez", "89898945");
//        assertEquals(1, cliente_modelo.create(cliente));        
//    }
    @Test
    public void testCreateException() {
        ClientModel cliente_modelo = new ClientModel();
        Client cliente = new Client("michael@correo.com", "31475895", "Anastasia", "Suarez", "1236589");
        assertEquals(0, cliente_modelo.create(cliente));
    }

    @Test
    public void testUpdate() {
        ClientModel cliente_modelo = new ClientModel();
        String identificacion = "89898945";
        Client cliente = new Client("anastacia_suarez@correo.com", "85412454", "Lucila", "Perez", identificacion);
        assertEquals(1, cliente_modelo.update(cliente, identificacion));
    }

    @Test
    public void testUpdateException() {
        ClientModel cliente_modelo = new ClientModel();
        String identificacion = "89898945";
        Client cliente = new Client("michael@correo.com", "85412454", "Lucila", "Perez", identificacion);
        assertEquals(0, cliente_modelo.update(cliente, identificacion));
    }

    @Test
    public void testDelete() {
        ClientModel cliente_modelo = new ClientModel();
        String identificacion = "89898945";
        assertEquals(1, cliente_modelo.delete(identificacion));
    }

    @Test
    public void testDeleteEception() {
        ClientModel cliente_modelo = new ClientModel();
        String identificacion = "45451212";
        assertEquals(0, cliente_modelo.delete(identificacion));
    }

    public int division(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (Exception e) {
            throw e;
        }
    }

    @Test
    public void testDivision() {
        int num1 = 10;
        int num2 = 5;
        assertEquals(2, division(num1, num2));
    }
    
    @Test (expected = Exception.class)
    public void testDivisionException() {
        int num1 = 10;
        int num2 = 0;
        assertEquals(Exception.class, division(num1, num2));
    }
}
