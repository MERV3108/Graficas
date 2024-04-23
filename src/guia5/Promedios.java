/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guia5;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import static java.lang.Integer.parseInt;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

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
    double aprobo=0,reprobo=0;//contadores de la gente que paso o reprobo
    double totEst;//total de estudiantes en la tabla
    /**
     * Creates new form NewJFrame
     */
    public Promedios() {
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        GraficoTorta = new javax.swing.JButton();
        numeroNot = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        crearTabla = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDefinitivas = new javax.swing.JTable();
        importExc = new javax.swing.JButton();
        numeroEst = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        borrTab = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        calcularDefinitivas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        nombreEst = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        mostrarHistorico = new javax.swing.JButton();
        export = new javax.swing.JButton();
        guardarGrafico = new javax.swing.JCheckBox();
        Salir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        datosTabla.setBackground(java.awt.Color.lightGray);
        try {
            // Establecer el Look and Feel del sistema
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        FileFilter filter = new FileFilter() {
            public boolean accept(File file) {
                // Aceptar todos los directorios y archivos .csv
                return file.isDirectory() || file.getName().toLowerCase().endsWith(".csv");
            }

            public String getDescription() {
                // Descripción del filtro
                return "Archivos CSV (*.csv)";
            }
        };

        // Aplicar el filtro al JFileChooser
        datosTabla.setFileFilter(filter);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setOpaque(false);

        jLabel2.setText("Cantidad de notas: ");

        GraficoTorta.setText("Mostrar taza de mortalidad");
        GraficoTorta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GraficoTorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficoTortaActionPerformed(evt);
            }
        });

        numeroNot.setColumns(20);
        numeroNot.setRows(5);

        jLabel1.setText("Cantidad de estudiantes: ");

        crearTabla.setText("Crear Tabla");
        crearTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTablaActionPerformed(evt);
            }
        });
        crearTabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                crearTablaKeyPressed(evt);
            }
        });

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
        tablaDefinitivas.setShowHorizontalLines(true);
        jScrollPane2.setViewportView(tablaDefinitivas);

        importExc.setText("Importar tabla");
        importExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importExcActionPerformed(evt);
            }
        });

        numeroEst.setColumns(20);
        numeroEst.setRows(5);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setToolTipText("");
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        borrTab.setText("Borrar tablas");
        borrTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrTabActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Hack Nerd Font Propo", 0, 18)); // NOI18N
        jLabel4.setText("Calculos Notas");

        calcularDefinitivas.setText("Calcular Definitivas");
        calcularDefinitivas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcularDefinitivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularDefinitivasActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));
        jPanel1.setOpaque(false);

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

        export.setText("Exportar Tablas");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });

        guardarGrafico.setText("Guardar imagen");
        guardarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarGraficoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(nombreEst, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrarHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(export, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(guardarGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreEst, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mostrarHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(export, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(guardarGrafico)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(crearTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(numeroEst, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(importExc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(borrTab, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeroNot, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(calcularDefinitivas, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(GraficoTorta, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroEst, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroNot, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearTabla)
                    .addComponent(importExc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrTab))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GraficoTorta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularDefinitivas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel5.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel6.setPreferredSize(new java.awt.Dimension(500, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(721, 721, 721)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarGraficoActionPerformed

    }//GEN-LAST:event_guardarGraficoActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        String userHome = System.getProperty("user.home");//obtiene direccion para guardar lo datos
        SimpleDateFormat Formato = new SimpleDateFormat("yyyyMMdd_HHmmss");//formato de hora
        Date Datos = new Date();//obtiene la hora
        String strDate = Formato.format(Datos);//mete la hora en un string
        String GuarNombre = userHome + "\\Documents\\Tabla_Resultados_ " + strDate + ".csv";//crea la direccion
        DefaultTableModel definitivas = (DefaultTableModel) tablaDefinitivas.getModel();//instancia el modelo de la tabla de definitivas
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            FileWriter writer = new FileWriter(GuarNombre);//objeto para escribir
            //guarda la primera tabla
            // Escribir los encabezados del CSV
            for (int i = 0; i < model.getColumnCount(); i++) {
                writer.write(model.getColumnName(i) + ",");
            }
            writer.write("\n");
            // Escribir los datos de la tabla en el CSV
            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    writer.write(model.getValueAt(i, j).toString() + ",");
                }
                writer.write("\n");
            }
            writer.write("\n");
            //guarda los datos de la segunda tabla
            // Escribir los encabezados del CSV
            for (int i = 0; i < definitivas.getColumnCount(); i++) {
                writer.write(definitivas.getColumnName(i) + ",");
            }
            writer.write("\n");
            // Escribir los datos de la tabla en el CSV
            for (int i = 0; i < definitivas.getRowCount(); i++) {
                for (int j = 0; j < definitivas.getColumnCount(); j++) {
                    writer.write(definitivas.getValueAt(i, j).toString() + ",");
                }
                writer.write("\n");
            }
            writer.close();
            System.out.println("Datos exportados exitosamente en " + GuarNombre);
        } catch (Exception e) {
            System.out.println("No se pudo exportar la tabla");
            e.printStackTrace();
        }
    }//GEN-LAST:event_exportActionPerformed

    private void mostrarHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarHistoricoActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int noes=0;
        notas.removeAll(notas);
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equals(nombreEst.getText())) {
                nombre=model.getValueAt(i, 0).toString();
                for (int j = 1; j < model.getColumnCount(); j++) {//cambie el for para poder pasar notas de string a double
                    try{
                        Double valor = Double.valueOf(model.getValueAt(i, j).toString());
                        notas.add(valor);
                    }
                    catch(NumberFormatException e){
                        System.err.println("Error al pasar datos");
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
        Graficas.CrearGuardarGrafica(nombre, notas,guardarGrafico.isSelected()); //los datos viajan al main para generar la imagen
        ImageIcon ImagenEstudiante = new ImageIcon("D:\\ALEJO\\Documents\\Estudiante.jpg");
//        ImageIcon ImagenEstudiante = new ImageIcon("");
//ponga su direccion para guardar las imagenes y pone mi direccion en comentarios
        ImagenEstudiante.getImage().flush();
        this.jLabel6.setIcon(ImagenEstudiante);
    }//GEN-LAST:event_mostrarHistoricoActionPerformed

    private void calcularDefinitivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularDefinitivasActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel definitivas = (DefaultTableModel) tablaDefinitivas.getModel();
        try{
            for (int i = 0; i < model.getRowCount(); i++) {
                double suma=0;
                String nombre = model.getValueAt(i, 0).toString();
                //obtiene los datos y calcula la definitiva para ponerla en la tabla
                for (int j = 1; j < model.getColumnCount(); j++) {
                    double nota;
                    nota = Double.parseDouble(model.getValueAt(i, j).toString());
                    if(nota<=5)
                    suma += nota;
                    else
                    throw new Exception("La nota ingresada es invalida");
                }
                double definitiva = suma / (model.getColumnCount()-1);
                String paso;
                if (definitiva >= 3.0) {
                    paso="APROBO";
                    aprobo++;
                }else{
                    paso="REPROBO";
                    reprobo++;
                }
                definitivas.addRow(new Object[]{nombre, definitiva, paso});
                totEst=model.getRowCount();
            }
        }catch(Exception e){
            System.err.println("Hubo un problema al calcular definitivas");
            e.printStackTrace();
            borrTabActionPerformed(evt);
        }
    }//GEN-LAST:event_calcularDefinitivasActionPerformed

    private void borrTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrTabActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel definitivas = (DefaultTableModel) tablaDefinitivas.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        definitivas.setRowCount(0);
        aprobo=0;
        reprobo=0;
        numeroEst.setText("");
        numeroNot.setText("");
    }//GEN-LAST:event_borrTabActionPerformed

    private void importExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importExcActionPerformed
        JFileChooser escogerArchivo = new JFileChooser();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String linea;
        String[] estudiantes = null;
        Boolean primera = false;
        int returnValue = escogerArchivo.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File archivo = escogerArchivo.getSelectedFile();
            try {
                //ingresa archivo a tabla
                Scanner entrada = new Scanner(archivo);
                // objeto para procesar información
                entrada.nextLine();//salta la primera linea de etiquetas
                while (entrada.hasNext()) {
                    linea = entrada.nextLine();
                    if(linea.contains(";")){
                        estudiantes = linea.split(";");
                        System.out.println(";");
                    }else if(linea.contains(","))
                    estudiantes = linea.split(",");
                    if (!primera) {
                        model.addColumn("Nombre:");
                        for (int i = 1; i < estudiantes.length; i++) {
                            model.addColumn("Nota " + i);
                        }
                        primera = true;
                    }
                    model.addRow(estudiantes);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Promedios.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_importExcActionPerformed

    private void crearTablaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crearTablaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearTablaKeyPressed

    private void crearTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTablaActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try{
            int est, not;
            est = parseInt(numeroEst.getText());
            not = parseInt(numeroNot.getText());
            model.addColumn("Nombre");
            model.setRowCount(est);
            for (int i = 1; i < not+1; i++) {
                model.addColumn("Nota:" + i);
            }
        }catch(Exception e){
            System.err.println("Hubo un problema al crear la tabla");
            numeroEst.setText("");
            numeroNot.setText("");
            e.printStackTrace();
        }
    }//GEN-LAST:event_crearTablaActionPerformed

    private void GraficoTortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficoTortaActionPerformed
        Graficas.torta(aprobo, reprobo, totEst);
        ImageIcon ImagenTorta = new ImageIcon("D:\\ALEJO\\Documents\\TORTA.jpg");
//        ImageIcon ImagenTorta = new ImageIcon("");
//ponga su direccion para guardar las imagenes y pone mi direccion en comentarios
        ImagenTorta.getImage().flush();
        this.jLabel5.setIcon(ImagenTorta);
    }//GEN-LAST:event_GraficoTortaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        boolean nimbusSet = false;
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
            if (!nimbusSet) {
                try {
                    UIManager.setLookAndFeel(new AcrylLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Promedios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            new Promedios().setVisible(true);
        }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GraficoTorta;
    private javax.swing.JButton Salir;
    private javax.swing.JButton borrTab;
    private javax.swing.JButton calcularDefinitivas;
    private javax.swing.JButton crearTabla;
    private javax.swing.JFileChooser datosTabla;
    private javax.swing.JButton export;
    private javax.swing.JCheckBox guardarGrafico;
    private javax.swing.JButton importExc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mostrarHistorico;
    private javax.swing.JTextArea nombreEst;
    private javax.swing.JTextArea numeroEst;
    private javax.swing.JTextArea numeroNot;
    private javax.swing.JTable tablaDefinitivas;
    // End of variables declaration//GEN-END:variables

    private static class JLabel5 {

        public JLabel5() {
        }
    }
}
