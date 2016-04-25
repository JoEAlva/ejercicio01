/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_MenuPrincipal;

/**
 *
 * @author tecnologiamultimedia
 */
public class FRM_MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FRM_MenuPrincipal
     */
    
    Controlador_FRM_MenuPrincipal controlador_FRM_MenuPrincipal;
    
    public FRM_MenuPrincipal() {
        initComponents();
        this.setLocation(100, 100);
        controlador_FRM_MenuPrincipal = new Controlador_FRM_MenuPrincipal();
               
        agregarEventos();
    }  
    public void agregarEventos()
    {
        this.jm_Salir.addActionListener(controlador_FRM_MenuPrincipal);
        this.jm_Estudiantes.addActionListener(controlador_FRM_MenuPrincipal);
        this.jm_Cursos.addActionListener(controlador_FRM_MenuPrincipal);
        this.jm_Matricula.addActionListener(controlador_FRM_MenuPrincipal);
        this.jM_Usuarios.addActionListener(controlador_FRM_MenuPrincipal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jl_FondoMenuPrincipal = new javax.swing.JLabel();
        jm_MenuPrincipal = new javax.swing.JMenuBar();
        jm_Archivo = new javax.swing.JMenu();
        jm_Salir = new javax.swing.JMenuItem();
        jm_Mantenimientos = new javax.swing.JMenu();
        jm_Estudiantes = new javax.swing.JMenuItem();
        jm_Cursos = new javax.swing.JMenuItem();
        jm_Matricula = new javax.swing.JMenuItem();
        jM_Usuarios = new javax.swing.JMenuItem();
        jM_Reportes = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jl_FondoMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N

        jm_Archivo.setText("Archivo");

        jm_Salir.setText("Salir");
        jm_Archivo.add(jm_Salir);

        jm_MenuPrincipal.add(jm_Archivo);

        jm_Mantenimientos.setText("Mantenimientos");

        jm_Estudiantes.setText("Estudiantes");
        jm_Mantenimientos.add(jm_Estudiantes);

        jm_Cursos.setText("Cursos");
        jm_Mantenimientos.add(jm_Cursos);

        jm_Matricula.setText("Matrícula");
        jm_Matricula.setActionCommand("Matricula");
        jm_Mantenimientos.add(jm_Matricula);

        jM_Usuarios.setText("Usuarios");
        jm_Mantenimientos.add(jM_Usuarios);

        jm_MenuPrincipal.add(jm_Mantenimientos);

        jM_Reportes.setText("Reportes");
        jm_MenuPrincipal.add(jM_Reportes);

        setJMenuBar(jm_MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_FondoMenuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_FondoMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                boolean a=true;
                
                if(a)
                {
                    new FRM_MenuPrincipal().setVisible(true);
                }
                else
                {
                    System.out.println("Hola");
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jM_Reportes;
    private javax.swing.JMenuItem jM_Usuarios;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel jl_FondoMenuPrincipal;
    private javax.swing.JMenu jm_Archivo;
    private javax.swing.JMenuItem jm_Cursos;
    private javax.swing.JMenuItem jm_Estudiantes;
    private javax.swing.JMenu jm_Mantenimientos;
    private javax.swing.JMenuItem jm_Matricula;
    private javax.swing.JMenuBar jm_MenuPrincipal;
    private javax.swing.JMenuItem jm_Salir;
    // End of variables declaration//GEN-END:variables
}
