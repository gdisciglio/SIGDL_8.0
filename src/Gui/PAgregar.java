package Gui;

import entidades.Autor;
import static entidades.Autor.buscarAutorId;
import entidades.Edicion;
import static entidades.Edicion.buscarEdicionId;
import entidades.Genero;
import static entidades.Genero.buscarGeneroId;
import entidades.Libros;
import static entidades.Libros.AgregarLibro;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class PAgregar extends javax.swing.JPanel {

    /**
     * Creates new form PAgregar
     */
    public PAgregar() {
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

        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        titulotxt = new javax.swing.JTextField();
        apellido = new javax.swing.JLabel();
        apellidotxt = new javax.swing.JTextField();
        autor = new javax.swing.JLabel();
        autortxt = new javax.swing.JTextField();
        editorial = new javax.swing.JLabel();
        editorialtxt = new javax.swing.JTextField();
        genero = new javax.swing.JLabel();
        generotxt = new javax.swing.JTextField();
        paginas = new javax.swing.JLabel();
        paginastxt = new javax.swing.JTextField();
        edicion = new javax.swing.JLabel();
        ediciontxt = new javax.swing.JTextField();
        stock = new javax.swing.JLabel();
        stocktxt = new javax.swing.JTextField();
        idioma = new javax.swing.JLabel();
        idiomalist = new javax.swing.JComboBox<>();
        precio = new javax.swing.JLabel();
        preciotxt = new javax.swing.JTextField();
        sinopsis = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        direccion = new javax.swing.JLabel();
        direcciontxt = new javax.swing.JTextField();
        tel = new javax.swing.JLabel();
        teltxt = new javax.swing.JTextField();
        mail = new javax.swing.JLabel();
        mailtxt = new javax.swing.JTextField();
        formato = new javax.swing.JLabel();
        formatotxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sinopsistxt = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(220, 220, 220));
        setPreferredSize(new java.awt.Dimension(870, 560));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Libro");

        titulo.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        titulo.setText("Título:");

        titulotxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        apellido.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        apellido.setText("Apellido Autor:");

        apellidotxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        autor.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        autor.setText("Nombre Autor:");

        autortxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        editorial.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        editorial.setText("Editorial:");

        editorialtxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        genero.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        genero.setText("Género:");

        generotxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        paginas.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        paginas.setText("Páginas:");

        paginastxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        edicion.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        edicion.setText("Edición:");

        ediciontxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        stock.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        stock.setText("Stock:");

        stocktxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        idioma.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        idioma.setText("Idioma:");

        idiomalist.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        idiomalist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "Francés", "Inglés", "Italiano" }));

        precio.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        precio.setText("Precio:");

        preciotxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        preciotxt.setForeground(new java.awt.Color(102, 102, 102));
        preciotxt.setText("0.00");
        preciotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                preciotxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                preciotxtMousePressed(evt);
            }
        });

        sinopsis.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        sinopsis.setText("Sinopsis");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        direccion.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        direccion.setText("Punto de venta (Dirección):");

        direcciontxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        tel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        tel.setText("Teléfono:");

        teltxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        mail.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        mail.setText("Email:");

        mailtxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        formato.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        formato.setText("Formato:");

        formatotxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sinopsistxt.setColumns(20);
        sinopsistxt.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        sinopsistxt.setForeground(new java.awt.Color(204, 204, 204));
        sinopsistxt.setLineWrap(true);
        sinopsistxt.setRows(5);
        jScrollPane1.setViewportView(sinopsistxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulotxt)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titulo)
                                    .addComponent(apellido)
                                    .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(editorial)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(paginas)
                                                    .addComponent(paginastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(edicion)
                                                    .addComponent(ediciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(stock)
                                                    .addComponent(stocktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                            .addComponent(editorialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(20, 20, 20)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(genero)
                                                            .addComponent(autor)
                                                            .addComponent(autortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(idioma)
                                                            .addComponent(idiomalist, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(precio)
                                                                .addGap(32, 32, 32))
                                                            .addComponent(preciotxt)))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(generotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(sinopsis))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mail)
                                        .addGap(176, 176, 176))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mailtxt)
                                        .addGap(48, 48, 48)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(formato)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(formatotxt)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(direcciontxt))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tel)
                                    .addComponent(teltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(stock)
                                            .addGap(3, 3, 3)
                                            .addComponent(stocktxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(titulo)
                                            .addGap(4, 4, 4)
                                            .addComponent(titulotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(apellido)
                                                    .addGap(4, 4, 4)
                                                    .addComponent(apellidotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(autor)
                                                    .addGap(4, 4, 4)
                                                    .addComponent(autortxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(editorial)
                                                            .addGap(4, 4, 4)
                                                            .addComponent(editorialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(genero)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(generotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(paginas)
                                                            .addGap(4, 4, 4)
                                                            .addComponent(paginastxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(edicion)
                                                            .addGap(4, 4, 4)
                                                            .addComponent(ediciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(idioma)
                                                                .addGap(26, 26, 26))
                                                            .addComponent(idiomalist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(precio)
                                                    .addGap(26, 26, 26))
                                                .addComponent(preciotxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(teltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(direcciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(direccion)
                                                .addComponent(tel)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(mail)
                                                .addGap(4, 4, 4)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(formatotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(formato))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sinopsis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))))
                .addGap(134, 134, 134))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void preciotxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preciotxtMousePressed
        //al hacer click borro campo y cambio color fuente
        if (preciotxt.getText().equals("0.00")) {
            preciotxt.setText("");
            preciotxt.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_preciotxtMousePressed

    private void preciotxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_preciotxtMouseExited
        // al salir, si esta vacio autocompleto y cambio color fuente
        if (preciotxt.getText().isEmpty()) {
            preciotxt.setText("0.00");
            preciotxt.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_preciotxtMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            int au = buscarAutorId(apellidotxt.getText()); 
            int edi = Integer.parseInt(ediciontxt.getText());
            int ed = buscarEdicionId(edi);
            int ge = buscarGeneroId(generotxt.getText());
            
            
            int pag = Integer.parseInt(paginastxt.getText());
            int st = Integer.parseInt(stocktxt.getText());
            int pr = Integer.parseInt(preciotxt.getText());
            
            
            
//           System.out.println(au);


            Libros libro = new Libros();

            
            libro.setTitulo(titulotxt.getText());
            libro.setPaginas(pag);
            libro.setStock(st);
            libro.setPrecio(pr);
            libro.setAutor_id(au);
            libro.setEdicion_id(ed);
            libro.setGenero_id(ge);

            int numero= 0;
            String idi = idiomalist.getSelectedItem().toString();
            
            if (idi.equals("Español")) {
                numero = 1;
            } else if (idi.equals("Francés")){
                numero = 2;
            } else if (idi.equals("Inglés")){
                numero = 3;
            } else if (idi.equals("Italiano")){
                numero = 4;
            }
               
            
            AgregarLibro(libro, numero);

        } catch (IllegalAccessException ex) {
            Logger.getLogger(PAgregar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PAgregar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PAgregar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(PAgregar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JTextField apellidotxt;
    private javax.swing.JLabel autor;
    private javax.swing.JTextField autortxt;
    private javax.swing.JLabel direccion;
    private javax.swing.JTextField direcciontxt;
    private javax.swing.JLabel edicion;
    private javax.swing.JTextField ediciontxt;
    private javax.swing.JLabel editorial;
    private javax.swing.JTextField editorialtxt;
    private javax.swing.JLabel formato;
    private javax.swing.JTextField formatotxt;
    private javax.swing.JLabel genero;
    private javax.swing.JTextField generotxt;
    private javax.swing.JLabel idioma;
    private javax.swing.JComboBox<String> idiomalist;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mail;
    private javax.swing.JTextField mailtxt;
    private javax.swing.JLabel paginas;
    private javax.swing.JTextField paginastxt;
    private javax.swing.JLabel precio;
    private javax.swing.JTextField preciotxt;
    private javax.swing.JLabel sinopsis;
    private javax.swing.JTextArea sinopsistxt;
    private javax.swing.JLabel stock;
    private javax.swing.JTextField stocktxt;
    private javax.swing.JLabel tel;
    private javax.swing.JTextField teltxt;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField titulotxt;
    // End of variables declaration//GEN-END:variables

}
