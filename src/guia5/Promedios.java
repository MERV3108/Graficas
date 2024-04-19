/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guia5;

import static java.lang.Integer.parseInt;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author manuel
 * TO DO:
 * -agregar las graficas del historico
 * -agregar la importacion de excel
 */
public class Promedios extends javax.swing.JFrame {
    LinkedList notas = new LinkedList<>();  
    String nombre="";
    int est, not;
    int aceptar = 1;
    int guardar = 0;
    /**
     * Creates new form NewJFrame
     */
    public Promedios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datosTabla = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        crearTabla = new javax.swing.JButton();
        numeroEst = new javax.swing.JTextArea();
        numeroNot = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDefinitivas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        nombreEst = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        mostrarHistorico = new javax.swing.JButton();
        export = new javax.swing.JButton();
        importExc = new javax.swing.JButton();
        calcularDefinitivas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setText("Cantidad de estudiantes: ");

        jLabel2.setText("Cantidad de notas: ");

        crearTabla.setText("Crear Tabla");
        crearTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTablaActionPerformed(evt);
            }
        });

        numeroEst.setColumns(20);
        numeroEst.setRows(5);

        numeroNot.setColumns(20);
        numeroNot.setRows(5);

        tablaDefinitivas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Definitiva", "Resultado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaDefinitivas);

        nombreEst.setColumns(20);
        nombreEst.setRows(5);
        nombreEst.setToolTipText("Nombre estudiante");

        jLabel3.setText("Nombre estudiante:");

        mostrarHistorico.setText("Mostrar Historico");
        mostrarHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarHistoricoActionPerformed(evt);
            }
        });

        export.setText("Exportar Tabla");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nombreEst, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarHistorico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(export, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreEst, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mostrarHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(export, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        importExc.setText("Importar tabla");
        importExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importExcActionPerformed(evt);
            }
        });

        calcularDefinitivas.setText("Calcular Definitivas");
        calcularDefinitivas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcularDefinitivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularDefinitivasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(calcularDefinitivas, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(0, 435, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroEst, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroNot, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(crearTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(importExc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroEst, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroNot, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearTabla)
                    .addComponent(importExc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(calcularDefinitivas)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTablaActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try{
        est = parseInt(numeroEst.getText());
        not = parseInt(numeroNot.getText());
        model.addColumn("Nombre");
        model.setRowCount(est);
        for (int i = 1; i < not+1; i++) {
            model.addColumn("Nota:" + i);
        }
        }catch(Exception e){
            System.out.println("Hubo un problema al crear la tabla");
            numeroEst.setText("");
            numeroNot.setText("");
        }
    }//GEN-LAST:event_crearTablaActionPerformed

    private void calcularDefinitivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularDefinitivasActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel definitivas = (DefaultTableModel) tablaDefinitivas.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            double suma=0;
            String nombre = model.getValueAt(i, 0).toString();
            //obtiene los datos y calcula la definitiva para ponerla en la tabla
            for (int j = 1; j < model.getColumnCount(); j++) {
                double nota = Double.parseDouble(model.getValueAt(i, j).toString());
                suma += nota;
            }
            double definitiva = suma / (model.getColumnCount()-1);
            String paso = (definitiva >= 3.0) ? "APROBO" : "REPROBO";
            definitivas.addRow(new Object[]{nombre, definitiva, paso});
            System.out.println(definitivas.getValueAt(0, 0));
        }
    }//GEN-LAST:event_calcularDefinitivasActionPerformed

    private void mostrarHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarHistoricoActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int noes=0;
        
        notas.removeAll(notas);
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equals(nombreEst.getText())) {
                nombre=model.getValueAt(i, 0).toString();
                for (int j = 1; j < model.getColumnCount(); j++) {//cambie el for para poder pasar notas de string a double
                    try{
                        Double valor = Double.parseDouble(model.getValueAt(i, j).toString());
                        notas.add(valor);
                    }
                    catch(NumberFormatException e){
                         e.printStackTrace();
                    }
                }
            }else
                noes++;
            if (noes==model.getRowCount()) {
                MensajeError menErr = new MensajeError(this, true);
                menErr.setVisible(true);
                nombreEst.setText("");
            }
        }
       Graficas.CrearGuardarGrafica(nombre, notas,guardar); //los datos viajan al main para generar la imagen
        //System.out.println(notas);
        //System.out.println(nombre)
        
    }//GEN-LAST:event_mostrarHistoricoActionPerformed

    private void importExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importExcActionPerformed
        JFileChooser escogerArchivo = new JFileChooser();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String Direccion="";
        String linea;
        String[] estudiantes;
        Boolean primera = false;
        int returnValue = escogerArchivo.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File archivoDir = escogerArchivo.getSelectedFile();
            System.out.println(archivoDir.getAbsolutePath());
            Direccion = archivoDir.getAbsolutePath();
        }
        File archivo = new File(Direccion);
        try {
            Scanner entrada= new Scanner(archivo); // objeto para procesar información
            while(entrada.hasNext()){
            linea=entrada.nextLine();
            estudiantes=linea.split(";");
            if(!primera){
                model.addColumn("Nombre:");
                for (int i = 1; i < estudiantes.length; i++) {
                    model.addColumn("Nota " + i);
                }
                primera=true;
            }
            model.addRow(estudiantes);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Promedios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_importExcActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
    guardar = aceptar;
    Graficas.CrearGuardarGrafica(nombre, notas,guardar);// TODO add your handling code here:
    }//GEN-LAST:event_exportActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Promedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Promedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Promedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Promedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Promedios().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcularDefinitivas;
    private javax.swing.JButton crearTabla;
    private javax.swing.JFileChooser datosTabla;
    private javax.swing.JButton export;
    private javax.swing.JButton importExc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mostrarHistorico;
    private javax.swing.JTextArea nombreEst;
    private javax.swing.JTextArea numeroEst;
    private javax.swing.JTextArea numeroNot;
    private javax.swing.JTable tablaDefinitivas;
    // End of variables declaration//GEN-END:variables
}
