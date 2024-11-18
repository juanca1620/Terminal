/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import Controlador.BucesController;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.AdminFlota;
import modelo.Caseta;
import modelo.Empresa;
import singleton.Singleton;
import util.IList;

/**
 *
 * @author usuario
 */
public class VentanaGestionBuses extends javax.swing.JFrame {

    private Caseta caseta;
    private BucesController controller;
    
    public VentanaGestionBuses(Caseta caseta) {
        initComponents();
        this.caseta = caseta;
        setLocationRelativeTo(this);
        setTitle("Ventana Buses");
        controller = new BucesController(caseta);

        llenarComboBoxBuses();
    }

   private void llenarComboBoxBuses() {
    /*DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
    IList<Bus> buses = admin.getEmpresa().getListaBuses();
    
    if (buses != null ) {
        for (int i = 0; i < buses.size(); i++) {
            Bus bus = buses.get(i);
            model.addElement(bus.getPlaca() + " - Asientos: " + bus.getPuestosDisponibles());
            System.out.println("Bus agregado al ComboBox: " + bus.getPlaca() + " con " + bus.getPuestosDisponibles() + " asientos."); // Para depurar
        }
    } else {
        System.out.println("La lista de buses está vacía o no se cargó correctamente.");
    }
    
    cboBuses.setModel(model);
    cboBuses.revalidate(); 
       */
}

     
//     private void llenarComboBoxPuestos() {
//        cboPuestos.removeAllItems(); 
//        for (int i = 1; i <= 15; i++) {
//        cboPuestos.addItem(String.valueOf(i)); 
//       }
//     }
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        cboPuestos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboBuses = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de  Buses"));

        jLabel1.setText("Placa");

        jLabel2.setText("Puestos disponibles");

        cboPuestos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        jLabel4.setText("Buses Agregados");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPlaca)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(cboPuestos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(cboBuses, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboBuses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboPuestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(jButton1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      /* try {
        String placa = txtPlaca.getText().trim();
        int puestosDisponibles = Integer.parseInt(cboPuestos.getSelectedItem().toString());
        Bus bus = new Bus(placa, puestosDisponibles);

        if (controlador.guardarBus(bus)) {
            Singleton.getInstancia().escribirListaBuses(); // Guarda la lista actualizada en persistencia
            llenarComboBoxBuses(); // Actualiza el ComboBox con la lista actualizada
            JOptionPane.showMessageDialog(this, "Bus guardado exitosamente con asientos.");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un número válido de puestos.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (RuntimeException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage());
    }
        
        */
        
        
        
        
        
        
        /*try {
            String placa = txtPlaca.getText().trim();
            int puestosDisponibles = Integer.parseInt(cboPuestos.getSelectedItem().toString());
            Bus bus = new Bus(placa, puestosDisponibles);

            System.out.println("Intentando guardar el bus: " + bus.getPlaca());
            controlador.guardarBus(bus); // Guarda el bus en el controlador (y en Singleton)
            
            llenarComboBoxBuses(); // Actualiza el ComboBox con la lista de buses del Singleton
            JOptionPane.showMessageDialog(this, "Bus guardado exitosamente.");
        } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }*/
    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new VentanaMenuAdminFlota(caseta).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cboBuses;
    private javax.swing.JComboBox<String> cboPuestos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
