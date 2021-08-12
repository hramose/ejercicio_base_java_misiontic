/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Clases.Car;
import Model.CarModel;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellStyle;

/**
 *
 * @author mario
 */
public class CarController {

    CarModel modelo = new CarModel();
    ArrayList<Car> lista_carros = modelo.Read();

    public void exportData() {

        HSSFWorkbook book = new HSSFWorkbook();
        HSSFSheet sheet = book.createSheet();
        book.setSheetName(0, "Lista de carros");
        String[] headers = new String[]{
            "Color",
            "Marca",
            "Modelo",
            "Kilometraje",
            "Placa"
        };
        
        CellStyle headerStyle = book.createCellStyle();
        HSSFFont font = book.createFont();
        font.setBold(true);
        headerStyle.setFont(font);
        
        HSSFRow headersRow = sheet.createRow(0);
        for (int i = 0; i < headers.length; i++) {
            String header = headers[i];
            HSSFCell cell = headersRow.createCell(i);
            cell.setCellStyle(headerStyle);
            cell.setCellValue(header);
        }
        
        for (int i = 0; i < lista_carros.size(); i++) {
            HSSFRow row = sheet.createRow(i+1);
            String color = lista_carros.get(i).getColor();
            String marca = lista_carros.get(i).getMarca();
            int modelo = lista_carros.get(i).getModelo();
            int kilometraje = lista_carros.get(i).getKilometraje();
            String placa = lista_carros.get(i).getPlaca();
            
            row.createCell(0).setCellValue(color);
            row.createCell(1).setCellValue(marca);
            row.createCell(2).setCellValue(modelo);
            row.createCell(3).setCellValue(kilometraje);
            row.createCell(4).setCellValue(placa);
        }        
        
        try{
            FileOutputStream file = new FileOutputStream("Datos_carros.xls");
            book.write(file);
            file.close();
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
        
    }
}
