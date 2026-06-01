package Vista;

import Controlador.ControladorInteraccion;

public class Interaccion extends javax.swing.JFrame {

    private ControladorInteraccion ctrlChavo;
    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(Interaccion.class.getName());

    public Interaccion() {
        initComponents();
        ctrlChavo = new ControladorInteraccion(
                cmbPersonaje1, cmbPersonaje2, txtAreaResultados);
    }

    private void initComponents() {

        pnlPrincipal      = new javax.swing.JPanel();
        pnlSeleccion      = new javax.swing.JPanel();
        lblPersonaje1     = new javax.swing.JLabel();
        cmbPersonaje1     = new javax.swing.JComboBox<>();
        lblPersonaje2     = new javax.swing.JLabel();
        cmbPersonaje2     = new javax.swing.JComboBox<>();
        pnlAcciones       = new javax.swing.JPanel();
        btnInteractuar    = new javax.swing.JButton();
        btnDialogar       = new javax.swing.JButton();
        btnMover          = new javax.swing.JButton();
        btnReiniciar      = new javax.swing.JButton();
        pnlResultados     = new javax.swing.JPanel();
        jScrollPane1      = new javax.swing.JScrollPane();
        txtAreaResultados = new javax.swing.JTextArea();
        lblTitulo         = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Interacción - La Vecindad");
        setResizable(false);

        // Panel principal
        pnlPrincipal.setBackground(new java.awt.Color(245, 245, 245));
        pnlPrincipal.setBorder(
                javax.swing.BorderFactory.createEmptyBorder(12, 12, 12, 12));
        pnlPrincipal.setLayout(new java.awt.BorderLayout(0, 10));

        // Título
        lblTitulo.setText("La Vecindad del Chavo del 8");
        lblTitulo.setFont(new java.awt.Font("Georgia", java.awt.Font.BOLD, 20));
        lblTitulo.setForeground(new java.awt.Color(50, 50, 50));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setBorder(
                javax.swing.BorderFactory.createEmptyBorder(4, 0, 8, 0));
        pnlPrincipal.add(lblTitulo, java.awt.BorderLayout.NORTH);

        // Panel centro
        javax.swing.JPanel pnlCentro = new javax.swing.JPanel();
        pnlCentro.setBackground(new java.awt.Color(245, 245, 245));
        pnlCentro.setLayout(new java.awt.GridLayout(1, 2, 10, 0));

        // Panel Selección
        pnlSeleccion.setBackground(java.awt.Color.WHITE);
        pnlSeleccion.setBorder(javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createLineBorder(
                        new java.awt.Color(180, 180, 180)),
                "Selección de Personajes",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Georgia", java.awt.Font.BOLD, 13)));
        pnlSeleccion.setLayout(new java.awt.GridBagLayout());

        java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints();
        gbc.insets  = new java.awt.Insets(8, 10, 8, 10);
        gbc.fill    = java.awt.GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        lblPersonaje1.setText("Personaje 1:");
        lblPersonaje1.setFont(new java.awt.Font("Georgia", java.awt.Font.PLAIN, 13));
        gbc.gridx = 0; gbc.gridy = 0;
        pnlSeleccion.add(lblPersonaje1, gbc);

        cmbPersonaje1.setFont(new java.awt.Font("Georgia", java.awt.Font.PLAIN, 13));
        gbc.gridx = 0; gbc.gridy = 1;
        pnlSeleccion.add(cmbPersonaje1, gbc);

        lblPersonaje2.setText("Personaje 2:");
        lblPersonaje2.setFont(new java.awt.Font("Georgia", java.awt.Font.PLAIN, 13));
        gbc.gridx = 0; gbc.gridy = 2;
        pnlSeleccion.add(lblPersonaje2, gbc);

        cmbPersonaje2.setFont(new java.awt.Font("Georgia", java.awt.Font.PLAIN, 13));
        gbc.gridx = 0; gbc.gridy = 3;
        pnlSeleccion.add(cmbPersonaje2, gbc);

        // Panel Acciones
        pnlAcciones.setBackground(java.awt.Color.WHITE);
        pnlAcciones.setLayout(new java.awt.GridLayout(4, 1, 0, 8));
        pnlAcciones.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createTitledBorder(
                        javax.swing.BorderFactory.createLineBorder(
                                new java.awt.Color(180, 180, 180)),
                        "Acciones",
                        javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.DEFAULT_POSITION,
                        new java.awt.Font("Georgia", java.awt.Font.BOLD, 13)),
                javax.swing.BorderFactory.createEmptyBorder(6, 14, 14, 14)));

        java.awt.Color colorBoton  = new java.awt.Color(60, 80, 110);
        java.awt.Font  fuenteBoton = new java.awt.Font("Georgia", java.awt.Font.PLAIN, 13);

        btnInteractuar.setText("Interactuar");
        estilizarBoton(btnInteractuar, colorBoton, fuenteBoton);
        btnInteractuar.addActionListener(evt -> ctrlChavo.accionInteractuar());

        btnDialogar.setText("Dialogar");
        estilizarBoton(btnDialogar, colorBoton, fuenteBoton);
        btnDialogar.addActionListener(evt -> ctrlChavo.accionDialogar());

        btnMover.setText("Mover");
        estilizarBoton(btnMover, colorBoton, fuenteBoton);
        btnMover.addActionListener(evt -> ctrlChavo.accionMover());

        btnReiniciar.setText("Reiniciar");
        estilizarBoton(btnReiniciar, new java.awt.Color(120, 60, 60), fuenteBoton);
        btnReiniciar.addActionListener(evt -> ctrlChavo.accionFinalizar());

        pnlAcciones.add(btnInteractuar);
        pnlAcciones.add(btnDialogar);
        pnlAcciones.add(btnMover);
        pnlAcciones.add(btnReiniciar);

        pnlCentro.add(pnlSeleccion);
        pnlCentro.add(pnlAcciones);
        pnlPrincipal.add(pnlCentro, java.awt.BorderLayout.CENTER);

        // Panel Resultados
        pnlResultados.setBackground(java.awt.Color.WHITE);
        pnlResultados.setBorder(javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createLineBorder(
                        new java.awt.Color(180, 180, 180)),
                "Registro de Eventos",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Georgia", java.awt.Font.BOLD, 13)));
        pnlResultados.setLayout(new java.awt.BorderLayout());

        txtAreaResultados.setColumns(20);
        txtAreaResultados.setRows(7);
        txtAreaResultados.setEditable(false);
        txtAreaResultados.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12));
        txtAreaResultados.setBackground(new java.awt.Color(252, 252, 252));
        txtAreaResultados.setForeground(new java.awt.Color(40, 40, 40));
        txtAreaResultados.setLineWrap(true);
        txtAreaResultados.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtAreaResultados);
        pnlResultados.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnlPrincipal.add(pnlResultados, java.awt.BorderLayout.SOUTH);

        // Layout raíz
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlPrincipal,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                520, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlPrincipal,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                480, Short.MAX_VALUE));
        pack();
        setLocationRelativeTo(null);
    }

    private void estilizarBoton(javax.swing.JButton btn,
                                 java.awt.Color fondo,
                                 java.awt.Font fuente) {
        btn.setBackground(fondo);
        btn.setForeground(java.awt.Color.WHITE);
        btn.setFont(fuente);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setOpaque(true);
        btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException |
                 javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new Interaccion().setVisible(true));
    }

    // Variables
    public  javax.swing.JButton      btnInteractuar;
    public  javax.swing.JButton      btnDialogar;
    public  javax.swing.JButton      btnMover;
    public  javax.swing.JButton      btnReiniciar;
    public  javax.swing.JComboBox<String> cmbPersonaje1;
    public  javax.swing.JComboBox<String> cmbPersonaje2;
    public  javax.swing.JTextArea    txtAreaResultados;
    private javax.swing.JLabel       lblPersonaje1;
    private javax.swing.JLabel       lblPersonaje2;
    private javax.swing.JLabel       lblTitulo;
    private javax.swing.JPanel       pnlPrincipal;
    private javax.swing.JPanel       pnlSeleccion;
    private javax.swing.JPanel       pnlAcciones;
    private javax.swing.JPanel       pnlResultados;
    private javax.swing.JScrollPane  jScrollPane1;
}