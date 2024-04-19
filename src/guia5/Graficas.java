
package guia5;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat; //Libreria que use para actualizar las imagenes
import java.util.Date; //Igual forma esta libreria :p
import java.util.LinkedList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graficas {

    /**
     * @param args
     */
    public static void main (String [] args){
        
    }
    public static void CrearGuardarGrafica(String nombre, LinkedList<Double> notas, int guardar){
        
        // Create a simple Bar chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        int CantidadNotas = notas.size();
        for (int i = 0; i < CantidadNotas; i++) {
            Double ValorNota = notas.get(i);
            dataset.setValue(ValorNota, "Profit", "Nota"+i);
        }
        JFreeChart chart = ChartFactory.createBarChart( nombre, "Categoria", "Valor", dataset, PlotOrientation.VERTICAL,
        false, true, false);

        try {
            ChartUtilities.saveChartAsJPEG(new File("D:\\ALEJO\\Documents\\Estudiante.jpg"), chart, 500, 300);
        } 
        catch (IOException e) {
            System.err.println("Problem occurred creating chart.");
        }
        //actualicacion de imagen
        if (guardar==1){
            SimpleDateFormat Formato = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date Datos = new Date();
        String strDate = Formato.format(Datos);
        String GuarNombre = "D:\\ALEJO\\Documents\\Estudiante " + nombre + ".jpg";
        try {
            ChartUtilities.saveChartAsJPEG(new File(GuarNombre), chart, 500, 300);
            System.out.println("Gráfico guardado como: " + GuarNombre);
        } catch (IOException e) {
            System.err.println("Ocurrió un problema al crear el gráfico.");
            e.printStackTrace();
        }
        }
        else{
            //nada xd
        }

    }
  
}
