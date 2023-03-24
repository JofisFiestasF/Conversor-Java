package ventanas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import procesosDeConversion.Distancia;
import procesosDeConversion.Peso;
import procesosDeConversion.Temperatura;
import procesosDeConversion.Tiempo;
import procesosDeConversion.Moneda;

/**
 *
 * @author JOSE
 */
public class Conversor extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();

    private final String[] unidades_distancia = {"KILOMETRO", "METRO", "CENTIMETRO", "MILIMETRO", "PULGADA", "PIE", "MILLA"};
    private final String[] unidades_peso = {"TONELADA", "KILOGRAMO", "GRAMO", "MILIGRAMO", "LIBRA", "ONZA"};
    private final String[] unidades_temperatura = {"CELSIUS", "KELVIN", "FAHRENHEIT"};
    private final String[] unidades_tiempo = {"DIA", "HORA", "MINUTO", "SEGUNDO"};
    private final String[] unidades_moneda = {"SOL", "DOLAR", "EURO", "LIBRA", "YEN", "WON"};


    private boolean focus_1 = true;

    // True: 1 a 2
    // False: 2 a 1

    public Conversor() {
        this.setContentPane(fondo);

        initComponents();

        setLocationRelativeTo(null);
        this.setResizable(false);

        SetImageLabel(jLabelIcono, "src/imagenes/Icono.png");
        jButton1.setIcon(setIcono("/imagenes/BotonSalir.png", jButton1));

        setSize(700, 450);
        jPaneles1.setVisible(false);
    }

    private void Convertir() {
        //Reemplazar caracteres do admitidos
        txtValorInicial.setText(txtValorInicial.getText().replaceAll((","), "."));
        txtValorConvertido.setText(txtValorConvertido.getText().replaceAll((","), "."));
        //txtValorInicial.setText(txtValorInicial.getText().replaceAll(("[^0-9.]"), ""));
        //txtValorConvertido.setText(txtValorConvertido.getText().replaceAll(("[^0-9.]"), ""));
        //----------------------------
        
        if (txtValorInicial.getText().equals("") && focus_1) {
            return;
        }
        if (txtValorConvertido.getText().equals("") && !focus_1) {
            return;
        }
        
        if (tipoConversion.getSelectedItem().equals("Moneda")) {
            Moneda num;
            if (focus_1) {
                num = new Moneda(Long.parseLong(txtValorInicial.getText()), (String) unidadInicial.getSelectedItem());
                txtValorConvertido.setText(String.valueOf(num.Cambiar((String) unidadConvertir.getSelectedItem())));   
            } else {
                num = new Moneda(Long.parseLong(txtValorConvertido.getText()), (String) unidadConvertir.getSelectedItem());
                txtValorInicial.setText(String.valueOf(num.Cambiar((String) unidadInicial.getSelectedItem())));

            }
        } else if (tipoConversion.getSelectedItem().equals("Distancia")) {
            Distancia num;
            if (focus_1) {
                num = new Distancia(Double.parseDouble(txtValorInicial.getText()), (String) unidadInicial.getSelectedItem());
                txtValorConvertido.setText(String.valueOf(num.Cambiar((String) unidadConvertir.getSelectedItem())));
            } else {
                num = new Distancia(Double.parseDouble(txtValorConvertido.getText()), (String) unidadConvertir.getSelectedItem());
                txtValorInicial.setText(String.valueOf(num.Cambiar((String) unidadInicial.getSelectedItem())));
            }
        } else if (tipoConversion.getSelectedItem().equals("Peso")) {
            Peso num;
            if (focus_1) {
                num = new Peso(Double.parseDouble(txtValorInicial.getText()), (String) unidadInicial.getSelectedItem());
                txtValorConvertido.setText(String.valueOf(num.Cambiar((String) unidadConvertir.getSelectedItem())));
            } else {
                num = new Peso(Double.parseDouble(txtValorConvertido.getText()), (String) unidadConvertir.getSelectedItem());
                txtValorInicial.setText(String.valueOf(num.Cambiar((String) unidadInicial.getSelectedItem())));
            }
        } else if (tipoConversion.getSelectedItem().equals("Temperatura")) {
            Temperatura num;
            if (focus_1) {
                num = new Temperatura(Double.parseDouble(txtValorInicial.getText()), (String) unidadInicial.getSelectedItem());
                txtValorConvertido.setText(String.valueOf(num.Cambiar((String) unidadConvertir.getSelectedItem())));
            } else {
                num = new Temperatura(Double.parseDouble(txtValorConvertido.getText()), (String) unidadConvertir.getSelectedItem());
                txtValorInicial.setText(String.valueOf(num.Cambiar((String) unidadInicial.getSelectedItem())));
            }
        } else if (tipoConversion.getSelectedItem().equals("Tiempo")) {
            Tiempo num;
            if (focus_1) {
                num = new Tiempo(Double.parseDouble(txtValorInicial.getText()), (String) unidadInicial.getSelectedItem());
                txtValorConvertido.setText(String.valueOf(num.Cambiar((String) unidadConvertir.getSelectedItem())));
            } else {
                num = new Tiempo(Double.parseDouble(txtValorConvertido.getText()), (String) unidadConvertir.getSelectedItem());
                txtValorInicial.setText(String.valueOf(num.Cambiar((String) unidadInicial.getSelectedItem())));
                
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jPanelConImagen1 = new ventanas.JPanelConImagen();
        jLabelIcono = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tipoConversion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPaneles1 = new ventanas.JPaneles();
        tituloPanel2 = new javax.swing.JLabel();
        txtValorInicial = new javax.swing.JTextField();
        txtValorConvertido = new javax.swing.JTextField();
        unidadInicial = new javax.swing.JComboBox<>();
        unidadConvertir = new javax.swing.JComboBox<>();
        btnConvertir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convesor");

        jPanel1.setPreferredSize(new java.awt.Dimension(320, 450));

        jPanelConImagen1.setPreferredSize(new java.awt.Dimension(308, 438));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tipoConversion.setBackground(new java.awt.Color(204, 204, 255));
        tipoConversion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tipoConversion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Moneda", "Distancia", "Peso", "Temperatura", "Tiempo" }));
        tipoConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoConversionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Conversor");

        javax.swing.GroupLayout jPanelConImagen1Layout = new javax.swing.GroupLayout(jPanelConImagen1);
        jPanelConImagen1.setLayout(jPanelConImagen1Layout);
        jPanelConImagen1Layout.setHorizontalGroup(
            jPanelConImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConImagen1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanelConImagen1Layout.createSequentialGroup()
                .addGroup(jPanelConImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConImagen1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanelConImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelConImagen1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(tipoConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanelConImagen1Layout.setVerticalGroup(
            jPanelConImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConImagen1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tipoConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        tituloPanel2.setBackground(new java.awt.Color(255, 255, 255));
        tituloPanel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloPanel2.setForeground(new java.awt.Color(255, 255, 255));

        txtValorInicial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtValorInicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorInicialFocusGained(evt);
            }
        });
        txtValorInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorInicialKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorInicialKeyTyped(evt);
            }
        });

        txtValorConvertido.setEditable(false);
        txtValorConvertido.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtValorConvertido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorConvertidoFocusGained(evt);
            }
        });
        txtValorConvertido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorConvertidoKeyReleased(evt);
            }
        });

        btnConvertir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnConvertir.setText("Convertir");
        btnConvertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConvertirMouseClicked(evt);
            }
        });
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaneles1Layout = new javax.swing.GroupLayout(jPaneles1);
        jPaneles1.setLayout(jPaneles1Layout);
        jPaneles1Layout.setHorizontalGroup(
            jPaneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneles1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPaneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtValorConvertido)
                    .addGroup(jPaneles1Layout.createSequentialGroup()
                        .addComponent(txtValorInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(unidadInicial, 0, 83, Short.MAX_VALUE)
                            .addComponent(unidadConvertir, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPaneles1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tituloPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaneles1Layout.createSequentialGroup()
                        .addComponent(btnConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar)))
                .addGap(19, 19, 19))
        );
        jPaneles1Layout.setVerticalGroup(
            jPaneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneles1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPaneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPaneles1Layout.createSequentialGroup()
                        .addComponent(unidadInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unidadConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtValorInicial))
                .addGap(29, 29, 29)
                .addComponent(txtValorConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPaneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelConImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneles1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelConImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPaneles1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoConversionActionPerformed
        // TODO add your handling code here:

        unidadInicial.removeAllItems();
        unidadConvertir.removeAllItems();

        if (tipoConversion.getSelectedItem().equals("Distancia")) {
            jPaneles1.setVisible(true);
            tituloPanel2.setText("De " + (String) tipoConversion.getSelectedItem());
            for (String unidades_distancia1 : unidades_distancia) {
                unidadInicial.addItem(unidades_distancia1);
                unidadConvertir.addItem(unidades_distancia1);
            }
        } else if (tipoConversion.getSelectedItem().equals("Moneda")) {
            jPaneles1.setVisible(true);
            tituloPanel2.setText("De " + (String) tipoConversion.getSelectedItem());
            for (String unidades_monedal : unidades_moneda) {
                unidadInicial.addItem(unidades_monedal);
                unidadConvertir.addItem(unidades_monedal);
            }
        } else if (tipoConversion.getSelectedItem().equals("Peso")) {
            jPaneles1.setVisible(true);
            tituloPanel2.setText("De " + (String) tipoConversion.getSelectedItem());
            for (String unidades_pesol : unidades_peso) {
                unidadInicial.addItem(unidades_pesol);
                unidadConvertir.addItem(unidades_pesol);
            }
        } else if (tipoConversion.getSelectedItem().equals("Temperatura")) {
            jPaneles1.setVisible(true);
            tituloPanel2.setText("De " + (String) tipoConversion.getSelectedItem());
            for (String unidades_temperatural : unidades_temperatura) {
                unidadInicial.addItem(unidades_temperatural);
                unidadConvertir.addItem(unidades_temperatural);
            }
        } else if (tipoConversion.getSelectedItem().equals("Tiempo")) {
            jPaneles1.setVisible(true);
            tituloPanel2.setText("De " + (String) tipoConversion.getSelectedItem());
            for (String unidades_tiempo1 : unidades_tiempo) {
                unidadInicial.addItem(unidades_tiempo1);
                unidadConvertir.addItem(unidades_tiempo1);
            }
        }else{
            jPaneles1.setVisible(false);
        }
    }//GEN-LAST:event_tipoConversionActionPerformed

    private void btnConvertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertirMouseClicked
        // TODO add your handling code here:

        Convertir();
    }//GEN-LAST:event_btnConvertirMouseClicked

    private void txtValorInicialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorInicialFocusGained
        // TODO add your handling code here:

        focus_1 = true;
    }//GEN-LAST:event_txtValorInicialFocusGained

    private void txtValorConvertidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorConvertidoFocusGained
        // TODO add your handling code here:

        focus_1 = false;
    }//GEN-LAST:event_txtValorConvertidoFocusGained

    private void txtValorInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorInicialKeyReleased
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Convertir();
        }
    }//GEN-LAST:event_txtValorInicialKeyReleased

    private void txtValorConvertidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorConvertidoKeyReleased
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Convertir();
        }
    }//GEN-LAST:event_txtValorConvertidoKeyReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        JTextField txt_ValorI = txtValorInicial;
        JTextField txt_ValorC = txtValorConvertido;
        
        txt_ValorI.setText("");
        txt_ValorC.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        jPaneles1.setVisible(false);
        tipoConversion.setSelectedIndex(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed

    }//GEN-LAST:event_btnConvertirActionPerformed

    private void txtValorInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorInicialKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        boolean caracteres_especiales = false ;
        
        if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){
             
            caracteres_especiales = true;
        }
        
        
            if (Character.isLetter(validar) || caracteres_especiales == true) {
                getToolkit().beep();
                evt.consume();

                JOptionPane.showMessageDialog(null, "INGRESA SOLO NUMEROS");
            }
    }//GEN-LAST:event_txtValorInicialKeyTyped

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
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JPanel jPanel1;
    private ventanas.JPanelConImagen jPanelConImagen1;
    private ventanas.JPaneles jPaneles1;
    private javax.swing.JComboBox<String> tipoConversion;
    private javax.swing.JLabel tituloPanel2;
    private javax.swing.JTextField txtValorConvertido;
    private javax.swing.JTextField txtValorInicial;
    private javax.swing.JComboBox<String> unidadConvertir;
    private javax.swing.JComboBox<String> unidadInicial;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/Fondo.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
}
