
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
    public static void CrearGuardarGrafica(String nombre, LinkedList<Double> notas, Boolean guardar){
        
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
            ChartUtilities.saveChartAsJPEG(new File("imagenes/Estudiante.jpg"), chart, 500, 300);
        } 
        catch (IOException e) {
            System.err.println("Hubo un problema al generar la grafica.");
            e.printStackTrace();
        }
        //actualicacion de imagen
        if (guardar) {
            String userHome = System.getProperty("user.home");
            SimpleDateFormat Formato = new SimpleDateFormat("yyyyMMdd_HHmmss");
            Date Datos = new Date();
            String strDate = Formato.format(Datos);
            String GuarNombre = userHome + "\\Pictures\\Historico de " + nombre + strDate + ".jpg";
            try {
                ChartUtilities.saveChartAsJPEG(new File(GuarNombre), chart, 500, 300);
                System.out.println("Gráfico guardado como: " + GuarNombre);
            } catch (IOException e) {
                System.err.println("Ocurrió un problema al crear el gráfico.");
                e.printStackTrace();
            }
        }

    }
    public static void torta(double paso, double reprobo, double total){
        double porPaso=0, porRepro=0;//porcentajes
        porPaso=(paso/total);//si necesita el numero en porcentajes multiplique por 100
        porRepro=(reprobo/total);
        System.out.println(porPaso);
        System.out.println(porRepro);
    }
}
