/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_angel_capa;

import javax.swing.JOptionPane;

/**
 *
 * @author Capa Brothers
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
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

        jPanelDocentes = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblHorasClase = new javax.swing.JLabel();
        lblCarrera = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtHorasClase = new javax.swing.JTextField();
        txtCarrera = new javax.swing.JTextField();
        btnAgregarDocente = new javax.swing.JButton();
        lblTipoDocente = new javax.swing.JLabel();
        txtTipoDocente = new javax.swing.JTextField();
        lblProfesorTiempoCompleto = new javax.swing.JLabel();
        lblProfesorMedioTiempo = new javax.swing.JLabel();
        lblProfesorTiempoParcial = new javax.swing.JLabel();
        lblHorasSemanales = new javax.swing.JLabel();
        txtHorasSemanales = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaVizualizar = new javax.swing.JTextArea();
        btnLeerArchivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Docentes");

        lblCedula.setText("cedula");

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblHorasClase.setText("Horas Clase");

        lblCarrera.setText("Carrera");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        btnAgregarDocente.setText("Agregar Docente");
        btnAgregarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarDocenteActionPerformed(evt);
            }
        });

        lblTipoDocente.setText("Tipo Docente");

        txtTipoDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoDocenteActionPerformed(evt);
            }
        });

        lblProfesorTiempoCompleto.setText("Ingrese tipo de Docente 0 = Tiempo Completo");

        lblProfesorMedioTiempo.setText("Ingrese tipo de Docente 1 = Profesor Medio Tiempo");

        lblProfesorTiempoParcial.setText("Ingrese tipo de Docente 2 = Profesor Tiempo Parcial");

        lblHorasSemanales.setText("Horas Semanales");

        javax.swing.GroupLayout jPanelDocentesLayout = new javax.swing.GroupLayout(jPanelDocentes);
        jPanelDocentes.setLayout(jPanelDocentesLayout);
        jPanelDocentesLayout.setHorizontalGroup(
            jPanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDocentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDocentesLayout.createSequentialGroup()
                        .addGroup(jPanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHorasClase)
                            .addComponent(lblApellido)
                            .addComponent(lblNombre)
                            .addComponent(lblCedula)
                            .addComponent(lblCarrera))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCedula)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtHorasClase)
                            .addComponent(txtCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarDocente))
                    .addComponent(lblProfesorTiempoCompleto)
                    .addComponent(lblProfesorMedioTiempo)
                    .addComponent(lblProfesorTiempoParcial)
                    .addGroup(jPanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDocentesLayout.createSequentialGroup()
                            .addComponent(lblHorasSemanales)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtHorasSemanales))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDocentesLayout.createSequentialGroup()
                            .addComponent(lblTipoDocente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTipoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDocentesLayout.setVerticalGroup(
            jPanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDocentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarDocente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorasClase)
                    .addComponent(txtHorasClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarrera)
                    .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProfesorTiempoCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProfesorMedioTiempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProfesorTiempoParcial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoDocente)
                    .addComponent(txtTipoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorasSemanales)
                    .addComponent(txtHorasSemanales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txtaVizualizar.setColumns(20);
        txtaVizualizar.setRows(5);
        jScrollPane1.setViewportView(txtaVizualizar);

        btnLeerArchivo.setText("Leer");
        btnLeerArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeerArchivo))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnLeerArchivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarDocenteActionPerformed
        // TODO add your handling code here:
        ListaProfesores lista = new ListaProfesores();
        String nombres = txtNombre.getText();
        String apellidos = txtApellido.getText();
        String cedula = txtCedula.getText();
        String carrera = txtCarrera.getText();
        int tipo = Integer.parseInt(txtTipoDocente.getText());
        if (tipo == 0) {
            int horasClase = Integer.parseInt(txtHorasClase.getText());
            if (horasClase > 2 & horasClase < 17) {
                lista.agregar(new ProfesorTiempoCompleto(cedula, nombres, apellidos, horasClase, carrera));
            } else {
                JOptionPane.showMessageDialog(null, "El docente de tiempo completo debe impartir desde 3 horas hasta 16 horas clase", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (tipo == 1) {
            int horasClase = Integer.parseInt(txtHorasClase.getText());
            if (horasClase == 10) {
                lista.agregar(new ProfesorMedioTiempo(cedula, nombres, apellidos, horasClase, carrera));
            } else {
                JOptionPane.showMessageDialog(null, "El docente de medio tiempo debe impartir 10 horas clase", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (tipo == 2) {
            int horasSemanales = Integer.parseInt(txtHorasSemanales.getText());
            int horasClase = Integer.parseInt(txtHorasClase.getText());
            if ((horasClase > 1 & horasClase < 10) & horasSemanales < 20) {
                lista.agregar(new ProfesorTiempoParcial(cedula, nombres, apellidos, horasClase, carrera, horasSemanales));
            } else {
                JOptionPane.showMessageDialog(null, "El docente de tiempo parcial trabaja menos de 20 horas a la semana y debe impartir de 2 a 9 horas clase.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        ListaProfesores.grabar();
        txtApellido.setText("");
        txtCarrera.setText("");
        txtCedula.setText("");
        txtNombre.setText("");
        txtTipoDocente.setText("");
        txtHorasClase.setText("");
        txtHorasSemanales.setText("");
    }//GEN-LAST:event_btnAgregarDocenteActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btnLeerArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerArchivoActionPerformed
        // TODO add your handling code here:
        String datos = ListaProfesores.leerPofesores();
        txtaVizualizar.append(datos);
    }//GEN-LAST:event_btnLeerArchivoActionPerformed

    private void txtTipoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoDocenteActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarDocente;
    private javax.swing.JButton btnLeerArchivo;
    private javax.swing.JPanel jPanelDocentes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblHorasClase;
    private javax.swing.JLabel lblHorasSemanales;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProfesorMedioTiempo;
    private javax.swing.JLabel lblProfesorTiempoCompleto;
    private javax.swing.JLabel lblProfesorTiempoParcial;
    private javax.swing.JLabel lblTipoDocente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtHorasClase;
    private javax.swing.JTextField txtHorasSemanales;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipoDocente;
    private javax.swing.JTextArea txtaVizualizar;
    // End of variables declaration//GEN-END:variables
}
