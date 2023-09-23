package Gui;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import conector.Conexion;
import entidades.Borrar;
import entidades.Libros;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PHome extends javax.swing.JPanel {

    /**
     * Creates new form pHome
     */
    public PHome() {
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

        busqueda = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        rbTitulo = new javax.swing.JRadioButton();
        rbAutor = new javax.swing.JRadioButton();
        rbGenero = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(220, 220, 220));

        bg.setBackground(new java.awt.Color(220, 220, 220));

        tabla.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Autor", "Género", "Idioma", "Páginas", "Edición", "Stock", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionBackground(new java.awt.Color(225, 225, 225));
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(220);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(20);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(10);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(10);
            tabla.getColumnModel().getColumn(7).setPreferredWidth(10);
            tabla.getColumnModel().getColumn(8).setPreferredWidth(30);
        }

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Home");

        txtBuscar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscar.setText("Buscar");
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBuscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(51, 102, 0));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 102, 204));
        btnEditar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");

        btnBorrar.setBackground(new java.awt.Color(204, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        busqueda.add(rbTitulo);
        rbTitulo.setText("Título");

        busqueda.add(rbAutor);
        rbAutor.setText("Autor (Apellido)");

        busqueda.add(rbGenero);
        rbGenero.setText("Género");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(rbTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbGenero))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(628, 628, 628)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTitulo)
                    .addComponent(rbAutor)
                    .addComponent(rbGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnBorrar))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
        //al hacer click borro campo y cambio color fuente
        if (txtBuscar.getText().equals("Buscar")) {
            txtBuscar.setText("");
            txtBuscar.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_txtBuscarMousePressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseExited
        // al salir, si esta vacio autocompleto y cambio color fuente
        if (txtBuscar.getText().isEmpty()) {
            txtBuscar.setText("Buscar");
            txtBuscar.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtBuscarMouseExited

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        
        
        if (rbTitulo.isSelected()) {

            try {
               
               
               ResultSet resSet = Libros.ConsultarTitulo(txtBuscar.getText());
               

               DefaultTableModel modelo = new DefaultTableModel();
               modelo.addColumn("ID");
               modelo.addColumn("Título");
               modelo.addColumn("Autor");
               modelo.addColumn("Género");
               modelo.addColumn("Idioma");
               modelo.addColumn("Páginas");
               modelo.addColumn("Edición");
               modelo.addColumn("Stock");
               modelo.addColumn("Precio");
               
               tabla.setModel(modelo);
               //Ajusto tamaño de la 1er y 2da columna
               tabla.getColumnModel().getColumn(0).setPreferredWidth(10);
               tabla.getColumnModel().getColumn(1).setPreferredWidth(220);
               tabla.getColumnModel().getColumn(2).setPreferredWidth(80);
               tabla.getColumnModel().getColumn(3).setPreferredWidth(40);
               tabla.getColumnModel().getColumn(4).setPreferredWidth(20);
               tabla.getColumnModel().getColumn(5).setPreferredWidth(10);
               tabla.getColumnModel().getColumn(6).setPreferredWidth(10);
               tabla.getColumnModel().getColumn(7).setPreferredWidth(10);
               tabla.getColumnModel().getColumn(8).setPreferredWidth(30);
               //Deshabilito la opcion de edicion de la tabla en tiempo de ejecucion.
               //tabla.setEnabled(false);
               
               java.sql.ResultSetMetaData metaData = resSet.getMetaData();
               int columnCount = metaData.getColumnCount();
               //Pruebas de consola:NO BORRAR!.
               System.out.println("Table name: "+metaData.getTableName(1));
               System.out.println("Column name: "+metaData.getColumnName(1));
               System.out.println("Column type: "+metaData.getColumnTypeName(1));
               System.out.println();
               
                //recorro el resultado y lo coloco en el jTable
                while (resSet.next()) {

                    Object[] filas = new Object[columnCount]; //numeroColumnas es el número de columnas de la tabla y del ResultSet
                    for (int i = 0; i < columnCount; i++) {
                        filas[i] = resSet.getObject(i + 1); // El ResultSet comienza en 1 en vez de en 0
                    }
                    modelo.addRow(filas);
                    
                    
                    
                }
                //resSet.close();
                
                
            } catch (IllegalAccessException ex) {
                Logger.getLogger(PHome.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(PHome.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PHome.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(PHome.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (rbAutor.isSelected()) {
            try {
               
               
               ResultSet resSet = Libros.ConsultarAutor(txtBuscar.getText());
               

               DefaultTableModel modelo = new DefaultTableModel();
               modelo.addColumn("ID");
               modelo.addColumn("Título");
               modelo.addColumn("Autor");
               modelo.addColumn("Género");
               modelo.addColumn("Idioma");
               modelo.addColumn("Páginas");
               modelo.addColumn("Edición");
               modelo.addColumn("Stock");
               modelo.addColumn("Precio");
               
               tabla.setModel(modelo);
               //Ajusto tamaño de las1er y 2da columna
               tabla.getColumnModel().getColumn(0).setPreferredWidth(10);
               tabla.getColumnModel().getColumn(1).setPreferredWidth(220);
               tabla.getColumnModel().getColumn(2).setPreferredWidth(80);
               tabla.getColumnModel().getColumn(3).setPreferredWidth(40);
               tabla.getColumnModel().getColumn(4).setPreferredWidth(20);
               tabla.getColumnModel().getColumn(5).setPreferredWidth(10);
               tabla.getColumnModel().getColumn(6).setPreferredWidth(10);
               tabla.getColumnModel().getColumn(7).setPreferredWidth(10);
               tabla.getColumnModel().getColumn(8).setPreferredWidth(30);
               //Deshabilito la opcion de edicion de la tabla en tiempo de ejecucion.
               //tabla.setEnabled(false);
               
               java.sql.ResultSetMetaData metaData = resSet.getMetaData();
               int columnCount = metaData.getColumnCount();
               //Pruebas de consola:NO BORRAR!.
               System.out.println("Table name: "+metaData.getTableName(1));
               System.out.println("Column name: "+metaData.getColumnName(1));
               System.out.println("Column type: "+metaData.getColumnTypeName(1));
               System.out.println();
               
                //recorro el resultado y lo coloco en el jTable
                while (resSet.next()) {

                    Object[] filas = new Object[columnCount]; //numeroColumnas es el número de columnas de la tabla y del ResultSet
                    for (int i = 0; i < columnCount; i++) {
                        filas[i] = resSet.getObject(i + 1); // El ResultSet comienza en 1 en vez de en 0
                    }
                    modelo.addRow(filas);
                    
                    
                    
                }
                //resSet.close();
                
                
            } catch (IllegalAccessException ex) {
                Logger.getLogger(PHome.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(PHome.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PHome.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(PHome.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (rbGenero.isSelected()) {
            
            try {
               
               
               ResultSet resSet = Libros.ConsultarGenero(txtBuscar.getText());
               

               DefaultTableModel modelo = new DefaultTableModel();
               modelo.addColumn("ID");
               modelo.addColumn("Título");
               modelo.addColumn("Autor");
               modelo.addColumn("Género");
               modelo.addColumn("Idioma");
               modelo.addColumn("Páginas");
               modelo.addColumn("Edición");
               modelo.addColumn("Stock");
               modelo.addColumn("Precio");
               
               tabla.setModel(modelo);
               //Ajusto tamaño de las1er y 2da columna
               tabla.getColumnModel().getColumn(0).setPreferredWidth(10);
               tabla.getColumnModel().getColumn(1).setPreferredWidth(220);
               tabla.getColumnModel().getColumn(2).setPreferredWidth(80);
               tabla.getColumnModel().getColumn(3).setPreferredWidth(40);
               tabla.getColumnModel().getColumn(4).setPreferredWidth(20);
               tabla.getColumnModel().getColumn(5).setPreferredWidth(10);
               tabla.getColumnModel().getColumn(6).setPreferredWidth(10);
               tabla.getColumnModel().getColumn(7).setPreferredWidth(10);
               tabla.getColumnModel().getColumn(8).setPreferredWidth(30);
               //Deshabilito la opcion de edicion de la tabla en tiempo de ejecucion.
               //tabla.setEnabled(false);
               
               java.sql.ResultSetMetaData metaData = resSet.getMetaData();
               int columnCount = metaData.getColumnCount();
               //Pruebas de consola:NO BORRAR!.
               System.out.println("Table name: "+metaData.getTableName(1));
               System.out.println("Column name: "+metaData.getColumnName(1));
               System.out.println("Column type: "+metaData.getColumnTypeName(1));
               System.out.println();
               
                //recorro el resultado y lo coloco en el jTable
                while (resSet.next()) {

                    Object[] filas = new Object[columnCount]; //numeroColumnas es el número de columnas de la tabla y del ResultSet
                    for (int i = 0; i < columnCount; i++) {
                        filas[i] = resSet.getObject(i + 1); // El ResultSet comienza en 1 en vez de en 0
                    }
                    modelo.addRow(filas);
                    
                    
                    
                }
                //resSet.close();
                
                
            } catch (IllegalAccessException ex) {
                Logger.getLogger(PHome.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(PHome.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PHome.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(PHome.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (!rbTitulo.isSelected() && !rbAutor.isSelected() && !rbGenero.isSelected()){
        
            JOptionPane.showMessageDialog(jScrollPane1, "Debe seleccionar un metodo de busqueda", "Error", 0);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
          // Solicitar el ID a borrar mediante un JOptionPane
    String idString = JOptionPane.showInputDialog("Ingrese el ID a borrar:");
    int id = Integer.parseInt(idString);

    // Llamar al método de borrado y manejar las excepciones
    try {
        Borrar.deleteData(id);

        // Obtener el índice de la fila seleccionada
        int rowIndex = tabla.getSelectedRow();

        // Verificar si hay una fila seleccionada antes de eliminarla
        if (rowIndex != -1) {
            // Eliminar la fila correspondiente de la tabla
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.removeRow(rowIndex);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila en la tabla antes de eliminar.");
        }

    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.ButtonGroup busqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbAutor;
    private javax.swing.JRadioButton rbGenero;
    private javax.swing.JRadioButton rbTitulo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
