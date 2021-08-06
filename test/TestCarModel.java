/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Clases.Car;
import Model.CarModel;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class TestCarModel {

    public TestCarModel() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TestCreate() {
        CarModel carro_modelo = new CarModel();
        Car carro = new Car("Magenta", "Renault", 2012, 200000, "RTY891");
        assertEquals(1, carro_modelo.Create(carro));
    }

    @Test
    public void TestCreateException() {
        CarModel carro_modelo = new CarModel();
        Car carro = new Car("Magenta", "Renault", 2012, 200000, "RTY891");
        assertEquals(0, carro_modelo.Create(carro));
    }

    @Test
    public void TestUpdate() {
        String placa = "POP460";
        Car carro = new Car("Azul cielo", "Subaru", 1996, 240000, placa);
        CarModel carro_modelo = new CarModel();
        assertEquals(1, carro_modelo.Update(carro, placa));
    }

    @Test
    public void TestUpdateException() {
        String placa = "POP460";
        Car carro = new Car("Azul cielo", "Subaru", 1996, 240000, placa);
        CarModel carro_modelo = new CarModel();
        assertEquals(0, carro_modelo.Update(carro, placa));
    }
    @Test
    public void TestDelete() {
        String placa = "RTY891";
        CarModel carro_modelo = new CarModel();
        assertEquals("No se pudo eliminar", 1, carro_modelo.Delete(placa));
    }

    @Test
    public void TestDeleteException() {
        String placa = "OIP789";
        CarModel carro_modelo = new CarModel();
        assertEquals("Si se pudo eliminar", 0, carro_modelo.Delete(placa));
    }
    
    @Test
//    public void TestRead(){
//        CarModel carro_modelo = new CarModel();
//        ArrayList<Car> lista_comparacion = new ArrayList<>();
//        Car carro1 = new Car("Verde", "Audi", 2019, 150000, "OIP789");
//        lista_comparacion.add(carro1);
//        Car carro2 = new Car("Amarillo", "MAzda", 2020, 125000, "OIP788");
//        lista_comparacion.add(carro2);
//        assertArrayEquals(lista_comparacion.toArray(), carro_modelo.Read().toArray());
//    }

    public int division(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            throw e;
        }
    }

    @Test
    public void testDivision() {
        int num1 = 10;
        int num2 = 5;
        assertEquals(2, division(num1, num2));
    }
    
    @Test (expected = ArithmeticException.class)
    public void testDivisionException() {
        int num1 = 10;
        int num2 = 0;
        assertEquals(ArithmeticException.class, division(num1, num2));
    }

//    @Test
//    public void TestRead() {
//        CarModel carro_modelo = new CarModel();
//        ArrayList<Car>  lista = new ArrayList();
//        assertArrayEquals(lista.toArray(), carro_modelo.Read().toArray());
//    }
}
