package max2;

import Animacion.Animacion;
import java.awt.Dimension;
import static java.lang.System.exit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Icon;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tonyj
 */
public class midi extends javax.swing.JFrame {
    public String fondo="1";
    public int pan2x;
    public int pan1x;
    
    public midi() {
        initComponents();
        pan2x = panel2.getX();
        pan1x = jPanel1.getX();
        this.setExtendedState(midi.MAXIMIZED_BOTH);
        this.setTitle("Sistema de Hotel");
        menuBar.setVisible(false);
        jPanel1.setBackground(new java.awt.Color(0,0,0,160));
      txtini.setOpaque(false);
      panlog.setBackground(new java.awt.Color(0,0,0,0));
      btnclose.setBackground(new java.awt.Color(0,0,0,0));
      panel2.setBackground(new java.awt.Color(0,0,0,160));
      txtpas.setOpaque(false);
      lblerr.setOpaque(false);
      panerr.setBackground(new java.awt.Color(0,0,0,0));
      panerr.setVisible(false);
      lbluser.setBackground(new java.awt.Color(0,0,0,0));
      txtini.requestFocus();
    }
    public void setAtributo(String atributo) {
    fondo = atributo;
    
    System.out.print("cam");
    Icon icono;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        txtini = new javax.swing.JTextField();
        lblpass = new javax.swing.JLabel();
        txtpas = new javax.swing.JPasswordField();
        panlog = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panerr = new javax.swing.JPanel();
        lblerr = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnclose = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Cerrar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inicio De Sesion");

        lbluser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbluser.setForeground(new java.awt.Color(255, 255, 255));
        lbluser.setText("Usuario :");

        txtini.setBackground(new java.awt.Color(204, 204, 204));
        txtini.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtini.setForeground(new java.awt.Color(255, 255, 255));
        txtini.setAutoscrolls(false);
        txtini.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtini.setCaretColor(new java.awt.Color(255, 255, 255));
        txtini.setSelectionColor(new java.awt.Color(0,0,0,0));
        txtini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtiniMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtiniMouseExited(evt);
            }
        });
        txtini.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtiniKeyPressed(evt);
            }
        });

        lblpass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblpass.setForeground(new java.awt.Color(255, 255, 255));
        lblpass.setText("Contraseña :");

        txtpas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtpas.setForeground(new java.awt.Color(255, 255, 255));
        txtpas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtpas.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasActionPerformed(evt);
            }
        });

        panlog.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panlog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panlogMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panlogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panlogMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panlogMouseReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar-sesion.png"))); // NOI18N

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Iniciar");

        javax.swing.GroupLayout panlogLayout = new javax.swing.GroupLayout(panlog);
        panlog.setLayout(panlogLayout);
        panlogLayout.setHorizontalGroup(
            panlogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panlogLayout.createSequentialGroup()
                .addGroup(panlogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panlogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panlogLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panlogLayout.setVerticalGroup(
            panlogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panlogLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        lblerr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblerr.setForeground(new java.awt.Color(204, 0, 0));
        lblerr.setText("Ha ingresado datos incorrectos");

        javax.swing.GroupLayout panerrLayout = new javax.swing.GroupLayout(panerr);
        panerr.setLayout(panerrLayout);
        panerrLayout.setHorizontalGroup(
            panerrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panerrLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblerr)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panerrLayout.setVerticalGroup(
            panerrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblerr)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(404, 404, 404)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(panerr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(lbluser)
                .addGap(4, 4, 4)
                .addComponent(txtini, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(lblpass)
                .addGap(4, 4, 4)
                .addComponent(txtpas, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(panlog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(panerr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbluser))
                    .addComponent(txtini, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblpass))
                    .addComponent(txtpas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(panlog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        escritorio.add(jPanel1);
        jPanel1.setBounds(170, 130, 1070, 580);

        panel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("El hotel Barceló San José, elegido como el mejor hotel de negocios de la capital");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("\" Bienvenido A Hotel Barceló \"");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("de Costa Rica, posee un Centro de convenciones propio con cabida para más de ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("1.000 personas en el que podrá celebrar todo tipo de reuniones y congresos.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Este hotel de 5 estrellas se encuentra en una excelente ubicación, a tan solo ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("San José, la capital costarricense.El Barceló San José Palacio dispone de ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("amplias y cómodas habitaciones y ofrece una interesante oferta gastronómica ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("San José ha recibido el certificado de Sostenibilidad.");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("cuenta con 3 restaurantes, instalaciones deportivas. Además, el hotel Barceló ");

        btnclose.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncloseMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btncloseMouseReleased(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logout_37127.png"))); // NOI18N

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cerrar Sesion");

        javax.swing.GroupLayout btncloseLayout = new javax.swing.GroupLayout(btnclose);
        btnclose.setLayout(btncloseLayout);
        btncloseLayout.setHorizontalGroup(
            btncloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btncloseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btncloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btncloseLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel18))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        btncloseLayout.setVerticalGroup(
            btncloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btncloseLayout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel18))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(236, 236, 236)
                                    .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(264, 264, 264))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)))
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(205, 205, 205)
                    .addComponent(jLabel6)
                    .addContainerGap(228, Short.MAX_VALUE)))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel8))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jLabel6)
                    .addContainerGap(461, Short.MAX_VALUE)))
        );

        escritorio.add(panel2);
        panel2.setBounds(1490, 140, 1070, 580);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        escritorio.add(jLabel1);
        jLabel1.setBounds(0, -210, 1920, 1300);

        menuBar.setForeground(new java.awt.Color(255, 255, 255));

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-archivo-30.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-cuarto-de-hospital-30 (3).png"))); // NOI18N
        jMenuItem1.setText("Habitacion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-cesta-de-compras-roja-30.png"))); // NOI18N
        jMenuItem2.setText("Productos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem2);

        menuBar.add(editMenu);

        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-carrito-de-compras-30.png"))); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("Reservas");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-cama-individual-30.png"))); // NOI18N
        jMenuItem3.setText("Reservas ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-grupos-de-usuarios-30.png"))); // NOI18N
        jMenuItem4.setText("Clientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-dólar-estadounidense-30.png"))); // NOI18N
        jMenuItem5.setText("Pagos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem5);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-tienda-30.png"))); // NOI18N
        jMenuItem8.setText("Venta De Productos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem8);

        menuBar.add(helpMenu);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-consulta-30.png"))); // NOI18N
        jMenu1.setText("Consultas");
        menuBar.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-servicios-30.png"))); // NOI18N
        jMenu2.setText("Configuraciones");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-gestión-de-clientes-30.png"))); // NOI18N
        jMenuItem6.setText("Usuarios y Accesos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        menuBar.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-herramientas-de-ventana-30.png"))); // NOI18N
        jMenu3.setText("Herramientas");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1icon.jpg"))); // NOI18N
        jMenuItem7.setText("Cambiar Fondo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        menuBar.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-ayuda-30.png"))); // NOI18N
        jMenu4.setText("ayuda");
        menuBar.add(jMenu4);

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-panel-cerrado-40.png"))); // NOI18N
        Cerrar.setText("Cerrar");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        menuBar.add(Cerrar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Hotel1 fors = new Hotel1();
        escritorio.add(fors);
        fors.toFront();
        fors.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Producto fors = new Producto();
        escritorio.add(fors);
        fors.toFront();
        fors.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Clientes fors = new Clientes();
        escritorio.add(fors);
        fors.toFront();
        fors.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Trabajadores fors = new Trabajadores();
        escritorio.add(fors);
        fors.toFront();
        fors.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void txtiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtiniMouseClicked
        // TODO add your handling code here:}
        
    }//GEN-LAST:event_txtiniMouseClicked

    private void txtiniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtiniMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtiniMouseExited

    private void txtiniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtiniKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtiniKeyPressed

    private void panlogMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panlogMouseReleased

    }//GEN-LAST:event_panlogMouseReleased

    private void panlogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panlogMouseExited
        panlog.setBackground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_panlogMouseExited

    private void panlogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panlogMouseEntered
        // TODO add your handling code here:
        panlog.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_panlogMouseEntered
    public void ini(){
         String us,pas;
       Max2 ok = new Max2();
        us=txtini.getText();
        pas=txtpas.getText();
        Object [] res=new Object[12]; 
        if(us.equals("")&&pas.equals("")){
              JOptionPane.showMessageDialog(null, "No Ingreso Datos");
        }else{
            try {
                res = (Object[]) ok.log(us, pas);
                if(res[0]==null){
                JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                }else{
                    if(res[8].toString().equalsIgnoreCase("Administrador")){
                        if(res[11].toString().equalsIgnoreCase("Activo")){
                          menuBar.setVisible(true);
                          jMenu2.setEnabled(true);
                          mostrar() ;
                        }else{
                          JOptionPane.showMessageDialog(null, "Tu Usuario Esta Inactivo");
                        }
                    }else{
                        if(res[11].toString().equalsIgnoreCase("Activo")){
                         menuBar.setVisible(true);
                         jMenu2.setEnabled(false);
                         mostrar();
                        }else{
                         JOptionPane.showMessageDialog(null, "Tu Usuario Esta Inactivo");
                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(midi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void mostrar(){
    Animacion.mover_derecha( pan1x,pan2x, 5,5, jPanel1);
    Animacion.mover_izquierda( pan2x,pan1x, 5,5, panel2);
    }
    public void ocultar(){
    Animacion.mover_izquierda( pan2x,pan1x, 5,5, jPanel1);
    Animacion.mover_derecha( pan1x,pan2x, 5,5, panel2);
    }
    private void panlogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panlogMouseClicked
        // TODO add your handling code here:
        ini();
   
    }//GEN-LAST:event_panlogMouseClicked

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseClicked
        // TODO add your handling code here:
        ocultar();
        menuBar.setVisible(false);
        txtini.setText("");
        txtpas.setText("");
    }//GEN-LAST:event_btncloseMouseClicked

    private void btncloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseEntered
        // TODO add your handling code here:
        btnclose.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_btncloseMouseEntered

    private void btncloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseExited
        btnclose.setBackground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btncloseMouseExited

    private void btncloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btncloseMouseReleased

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        Fondo1 fors = new Fondo1();
        escritorio.add(fors);
        fors.toFront();
        fors.res(jLabel1);
        fors.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Comprar fors = new Comprar();
        escritorio.add(fors);
        fors.toFront();
        fors.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        reserva fors = new reserva();
        escritorio.add(fors);
        fors.toFront();
        fors.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void txtpasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasActionPerformed
        // TODO add your handling code here
        ini();
    }//GEN-LAST:event_txtpasActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CerrarActionPerformed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:
            System.exit( 0 );
    }//GEN-LAST:event_CerrarMouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Pago fors = new Pago();
        escritorio.add(fors);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = fors.getSize();
        fors.setLocation((desktopSize.width - FrameSize.width)/3, (desktopSize.height- FrameSize.height)/2);
        fors.show();
        
        /*fors.toFront();
        fors.setVisible(true);*/
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(midi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(midi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(midi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(midi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new midi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cerrar;
    private javax.swing.JPanel btnclose;
    private javax.swing.JMenu editMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblerr;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lbluser;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panerr;
    private javax.swing.JPanel panlog;
    private javax.swing.JTextField txtini;
    private javax.swing.JPasswordField txtpas;
    // End of variables declaration//GEN-END:variables

}
