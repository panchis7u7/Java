package prii_u206_pedidospizza;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ventana extends javax.swing.JFrame {
    private final DefaultComboBoxModel tiposPizzas;
    private final ImageIcon icHawaiana;
    private final ImageIcon icItaliana;
    private final ImageIcon icQuesos;
    private final ImageIcon icPepperoni;
    private final ImageIcon icLogo;
    private final double precioAdicionalChica = 10;
    private final double precioAdicionalMediana = 17.50;
    private final double precioAdicionalGrande = 23.50;
    private final double precioAdicionalGigante = 28;
    private final double precioAdicionalQueso = 5;
    private final double precioAdicionalAceitunas = 7.50;
    private final double precioAdicionalChampiñones = 10;
    private final double precioAdicionalOrilla = 15;
    private final double precioAdicionalOrillaRellena = 10;
    private final double precioAdicionalHawaiana = 20;
    private final double precioAdicionalPepperoni = 15;
    private final double precioAdicionalItaliana = 20;
    private final double precioAdicional4Quesos = 25;
    Creditos acerca;
    private static int contadorFilas = 0;
    
    public Ventana() {
        initComponents();
        acerca = new Creditos(this, true);
        String pizzas[] = {"Hawaiana", "Pepperoni","italiana", "4 Quesos"};
        tiposPizzas = new DefaultComboBoxModel(pizzas);
        cbTiposPizza.setModel(tiposPizzas);
        /*Icono para el logo*/
        rbChica.setSelected(true);
        ImageIcon imgLogo = new ImageIcon(getClass().getResource("PizzaMonsterSticker.png"));
        Image imgEscaladaLogo = imgLogo.getImage().getScaledInstance(119, 119, Image.SCALE_SMOOTH);
        icLogo = new ImageIcon(imgEscaladaLogo);
        lblLogo.setIcon(icLogo);
        
        /*Icono para pizza hawaiana*/
        ImageIcon imgPizzaHw = new ImageIcon(getClass().getResource("pizza_hawaiana.png"));
        Image imgEscaladaHawaiana = imgPizzaHw.getImage().getScaledInstance(159, 159, Image.SCALE_SMOOTH);
        icHawaiana = new ImageIcon(imgEscaladaHawaiana);
        
        /*Icono para pizza Italiana*/
        ImageIcon imgPizzaIt = new ImageIcon(getClass().getResource("pizza_italiana.png"));
        Image imgEscaladaItaliana = imgPizzaIt.getImage().getScaledInstance(159, 159, Image.SCALE_SMOOTH);
        icItaliana = new ImageIcon(imgEscaladaItaliana);
        
        /*Icono para pizza 4 Quesos*/
        ImageIcon imgPizzaQuesos = new ImageIcon(getClass().getResource("pizza_4Quesos.png"));
        Image imgEscaladaQuesos = imgPizzaQuesos.getImage().getScaledInstance(159, 159, Image.SCALE_SMOOTH);
        icQuesos = new ImageIcon(imgEscaladaQuesos);
        
        /*Icono para pizza Pepperoni*/
        ImageIcon imgPizzaPepp = new ImageIcon(getClass().getResource("pizza_pepperoni.png"));
        Image imgEscaladaPepperoni = imgPizzaPepp.getImage().getScaledInstance(159, 159, Image.SCALE_SMOOTH);
        icPepperoni = new ImageIcon(imgEscaladaPepperoni);
        calcularPrecio();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTamaño = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rbChica = new javax.swing.JRadioButton();
        rbMediana = new javax.swing.JRadioButton();
        rbGrande = new javax.swing.JRadioButton();
        rbGigante = new javax.swing.JRadioButton();
        cbTiposPizza = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        cbQueso = new javax.swing.JCheckBox();
        cbAceitunas = new javax.swing.JCheckBox();
        cbChampiñones = new javax.swing.JCheckBox();
        cbOrilla = new javax.swing.JCheckBox();
        cbOrillaRellena = new javax.swing.JCheckBox();
        jpImgPizzas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taRecibo = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        lblFotosPizzas = new javax.swing.JLabel();
        btnAcercaDe = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPedidos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        taFacturas = new javax.swing.JTextArea();
        btnImprimirPedidos = new javax.swing.JButton();
        btnGuardarPedidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tamaño de la pizza"));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        rbChica.setBackground(new java.awt.Color(255, 204, 0));
        bgTamaño.add(rbChica);
        rbChica.setForeground(new java.awt.Color(0, 0, 0));
        rbChica.setText("Chica");
        rbChica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoHandler(evt);
            }
        });

        rbMediana.setBackground(new java.awt.Color(255, 204, 0));
        bgTamaño.add(rbMediana);
        rbMediana.setForeground(new java.awt.Color(0, 0, 0));
        rbMediana.setText("Mediana");
        rbMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoHandler(evt);
            }
        });

        rbGrande.setBackground(new java.awt.Color(255, 204, 0));
        bgTamaño.add(rbGrande);
        rbGrande.setForeground(new java.awt.Color(0, 0, 0));
        rbGrande.setText("Grande");
        rbGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoHandler(evt);
            }
        });

        rbGigante.setBackground(new java.awt.Color(255, 204, 0));
        bgTamaño.add(rbGigante);
        rbGigante.setForeground(new java.awt.Color(0, 0, 0));
        rbGigante.setText("Gigante");
        rbGigante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbChica, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMediana, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbGigante, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbChica)
                    .addComponent(rbGrande)
                    .addComponent(rbGigante)
                    .addComponent(rbMediana))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cbTiposPizza.setBackground(new java.awt.Color(255, 204, 0));
        cbTiposPizza.setForeground(new java.awt.Color(0, 0, 0));
        cbTiposPizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTiposPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoHandler(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 204, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Extras"));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        cbQueso.setBackground(new java.awt.Color(255, 204, 0));
        cbQueso.setForeground(new java.awt.Color(0, 0, 0));
        cbQueso.setText("Queso");
        cbQueso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraHandler(evt);
            }
        });

        cbAceitunas.setBackground(new java.awt.Color(255, 204, 0));
        cbAceitunas.setForeground(new java.awt.Color(0, 0, 0));
        cbAceitunas.setText("Aceitunas");
        cbAceitunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraHandler(evt);
            }
        });

        cbChampiñones.setBackground(new java.awt.Color(255, 204, 0));
        cbChampiñones.setForeground(new java.awt.Color(0, 0, 0));
        cbChampiñones.setText("Champiñones");
        cbChampiñones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraHandler(evt);
            }
        });

        cbOrilla.setBackground(new java.awt.Color(255, 204, 0));
        cbOrilla.setForeground(new java.awt.Color(0, 0, 0));
        cbOrilla.setText("Orilla");
        cbOrilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraHandler(evt);
            }
        });

        cbOrillaRellena.setBackground(new java.awt.Color(255, 204, 0));
        cbOrillaRellena.setForeground(new java.awt.Color(0, 0, 0));
        cbOrillaRellena.setText("Orilla rellena");
        cbOrillaRellena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraHandler(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbQueso)
                    .addComponent(cbAceitunas)
                    .addComponent(cbChampiñones)
                    .addComponent(cbOrilla)
                    .addComponent(cbOrillaRellena))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbQueso)
                .addGap(18, 18, 18)
                .addComponent(cbAceitunas)
                .addGap(18, 18, 18)
                .addComponent(cbChampiñones)
                .addGap(18, 18, 18)
                .addComponent(cbOrilla)
                .addGap(18, 18, 18)
                .addComponent(cbOrillaRellena)
                .addContainerGap())
        );

        jpImgPizzas.setBackground(new java.awt.Color(255, 204, 0));
        jpImgPizzas.setBorder(javax.swing.BorderFactory.createTitledBorder("Pizza"));
        jpImgPizzas.setForeground(new java.awt.Color(0, 0, 0));

        taRecibo.setColumns(20);
        taRecibo.setRows(5);
        jScrollPane1.setViewportView(taRecibo);

        btnGuardar.setText("Gaurdar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnAcercaDe.setText("Acerca de...");
        btnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpImgPizzasLayout = new javax.swing.GroupLayout(jpImgPizzas);
        jpImgPizzas.setLayout(jpImgPizzasLayout);
        jpImgPizzasLayout.setHorizontalGroup(
            jpImgPizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpImgPizzasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpImgPizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jpImgPizzasLayout.createSequentialGroup()
                        .addComponent(lblFotosPizzas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpImgPizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpImgPizzasLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jpImgPizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAñadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jpImgPizzasLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnAcercaDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(26, 26, 26))
        );
        jpImgPizzasLayout.setVerticalGroup(
            jpImgPizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpImgPizzasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpImgPizzasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpImgPizzasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblFotosPizzas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpImgPizzasLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        lblCosto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCosto.setForeground(new java.awt.Color(255, 51, 51));
        lblCosto.setText(" Costo: ");
        lblCosto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 2, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpImgPizzas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbTiposPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCosto)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTiposPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpImgPizzas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
        );

        jTabbedPane1.addTab("Preparacion de un pedido", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jScrollPane3.setBackground(new java.awt.Color(255, 153, 0));

        tbPedidos.setForeground(new java.awt.Color(0, 0, 0));
        tbPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Tamaño", "Queso", "Aceitunas", "Champiñones", "Orilla", "Orilla Rellena"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPedidosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbPedidos);

        taFacturas.setColumns(20);
        taFacturas.setRows(5);
        jScrollPane2.setViewportView(taFacturas);

        btnImprimirPedidos.setText("Imprimir");
        btnImprimirPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirPedidosActionPerformed(evt);
            }
        });

        btnGuardarPedidos.setText("Gaurdar");
        btnGuardarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnGuardarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnImprimirPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimirPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista Pedidos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        try {
            // TODO add your handling code here:
            taRecibo.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        JFileChooser browser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", ".txt");
        browser.setFileFilter(filtro);
        int resultado = browser.showSaveDialog(null);
        if(resultado == JFileChooser.APPROVE_OPTION){
            String arch = browser.getSelectedFile().getAbsolutePath() + ".txt";
            String nota = taRecibo.getText();
            String mensaje = "grabado exitoso!";
            FileWriter writer = null;
            try {
                writer = new FileWriter(arch);
                BufferedWriter buffer = new BufferedWriter(writer);
                buffer.write(nota);
                buffer.close();
            } catch(IOException ex){
                mensaje = "Error al grabar!";
                JOptionPane.showMessageDialog(rootPane, mensaje);
            } finally {
                try {
                    writer.close();
                    JOptionPane.showMessageDialog(rootPane, mensaje);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Error al cerrar archivo!");
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void generarNota(double total){
        taRecibo.setText("-----------Pizzeria Juanito----------\n");
        switch(cbTiposPizza.getSelectedIndex()){
            case 0: taRecibo.append("PÍZZA HAWAIANA"); lblFotosPizzas.setIcon(icHawaiana); break;
            case 1: taRecibo.append("PÍZZA PEPPERONI"); lblFotosPizzas.setIcon(icPepperoni); break;
            case 2: taRecibo.append("PÍZZA ITALIANA"); lblFotosPizzas.setIcon(icItaliana); break;
            case 3: taRecibo.append("PÍZZA 4 QUESOS"); lblFotosPizzas.setIcon(icQuesos); break;
        }
        if(rbChica.isSelected()) taRecibo.append("\nTamaño: Chica");
        if(rbMediana.isSelected()) taRecibo.append("\nTamaño: Mediana");
        if(rbGrande.isSelected()) taRecibo.append("\nTamaño: Grande");
        if(rbGigante.isSelected()) taRecibo.append("\nTamaño: Gigante");
        
        if(cbQueso.isSelected()) taRecibo.append("\n  -Con Extra Queso");
        if(cbAceitunas.isSelected()) taRecibo.append("\n  -Con Aceitunas");
        if(cbChampiñones.isSelected()) taRecibo.append("\n  -Con Champiñones");
        if(cbOrilla.isSelected()) taRecibo.append("\n  -Con Extra Orilla");
        if(cbOrillaRellena.isSelected()) taRecibo.append("\n  -Con Orilla Rellena");
        taRecibo.append("\nPrecio: $" + total + " MXN");
    }
    
    private void calcularPrecio(){
        double total = 40;
        if(rbChica.isSelected()) total += precioAdicionalChica;
        if(rbMediana.isSelected()) total += precioAdicionalMediana;
        if(rbGrande.isSelected()) total += precioAdicionalGrande;
        if(rbGigante.isSelected()) total += precioAdicionalGigante;
        switch(cbTiposPizza.getSelectedIndex()){
            case 0: total += precioAdicionalHawaiana; break;
            case 1: total += precioAdicionalPepperoni; break;
            case 2: total += precioAdicionalItaliana; break;
            case 3: total += precioAdicional4Quesos; break;
        }
        if(cbQueso.isSelected()) total += precioAdicionalQueso;
        if(cbAceitunas.isSelected()) total += precioAdicionalAceitunas;
        if(cbChampiñones.isSelected()) total += precioAdicionalChampiñones;
        if(cbOrilla.isSelected()) total += precioAdicionalOrilla;
        if(cbOrillaRellena.isSelected()) total += precioAdicionalOrillaRellena;
        lblCosto.setText(" Costo: " + total + " ");
        generarNota(total);
    }
    private void tamañoHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañoHandler
        calcularPrecio();
    }//GEN-LAST:event_tamañoHandler

    private void extraHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraHandler
        // TODO add your handling code here:
        calcularPrecio();
    }//GEN-LAST:event_extraHandler

    private void tipoHandler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoHandler
        // TODO add your handling code here:
        calcularPrecio();
    }//GEN-LAST:event_tipoHandler

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
        switch(cbTiposPizza.getSelectedIndex()){
            case 0: tbPedidos.setValueAt("Hawaiana", contadorFilas, 0); break;
            case 1: tbPedidos.setValueAt("Pepperoni", contadorFilas, 0); break;
            case 2: tbPedidos.setValueAt("Italiana", contadorFilas, 0); break;
            case 3: tbPedidos.setValueAt("4 Quesos", contadorFilas, 0); break;
        }
        if(rbChica.isSelected()) tbPedidos.setValueAt("Chica", contadorFilas, 1);
        if(rbMediana.isSelected()) tbPedidos.setValueAt("Mediana", contadorFilas, 1);
        if(rbGrande.isSelected()) tbPedidos.setValueAt("Grande", contadorFilas, 1);
        if(rbGigante.isSelected()) tbPedidos.setValueAt("Gigante", contadorFilas, 1);
        
        if(cbQueso.isSelected()) tbPedidos.setValueAt("Extra Queso", contadorFilas, 2);
        if(cbAceitunas.isSelected()) tbPedidos.setValueAt("Aceitunas", contadorFilas, 3);
        if(cbChampiñones.isSelected()) tbPedidos.setValueAt("Champiñones", contadorFilas, 4);
        if(cbOrilla.isSelected()) tbPedidos.setValueAt("Extra Orilla", contadorFilas, 5);
        if(cbOrillaRellena.isSelected()) tbPedidos.setValueAt("Orilla Rellena", contadorFilas, 6);
        contadorFilas++;
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void tbPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPedidosMouseClicked
        // TODO add your handling code here:
        double precio = 40;
        int r = tbPedidos.getSelectedRow();
        String tipo =(String) tbPedidos.getValueAt(r, 0);
        String tam =(String) tbPedidos.getValueAt(r, 1);
        
        if(tipo == "Hawaiana") precio += precioAdicionalHawaiana;
        if(tipo == "Pepperoni") precio += precioAdicionalPepperoni;
        if(tipo == "Italiana") precio += precioAdicionalItaliana;
        if(tipo == "4 Quesos") precio += precioAdicional4Quesos;
        
        if(tam == "Chica") precio += precioAdicionalChica;
        if(tam == "Mediana") precio += precioAdicionalMediana;
        if(tam == "Grande") precio += precioAdicionalGrande;
        if(tam == "Gigante") precio += precioAdicionalGigante;
        
        String extraQ =(String) tbPedidos.getValueAt(r, 2);
        String aceitunas =(String) tbPedidos.getValueAt(r, 3);
        String champi =(String) tbPedidos.getValueAt(r, 4);
        String orillaExtra =(String) tbPedidos.getValueAt(r, 5);
        String orillaRellena =(String) tbPedidos.getValueAt(r, 6);
        
        taFacturas.setText("-----------Pizzeria Juanito----------");
        taFacturas.append("\nPIZZA " + tipo);
        taFacturas.append("\nTamaño:  " + tam);
        if(tbPedidos.getValueAt(r,2) != null){ taFacturas.append("\n  -Con " + extraQ); precio += precioAdicionalQueso;}
        if(tbPedidos.getValueAt(r,3) != null){ taFacturas.append("\n  -Con " + aceitunas); precio += precioAdicionalAceitunas;}
        if(tbPedidos.getValueAt(r,4) != null){ taFacturas.append("\n  -Con " + champi); precio += precioAdicionalChampiñones;}
        if(tbPedidos.getValueAt(r,5) != null){ taFacturas.append("\n  -Con " + orillaExtra); precio += precioAdicionalOrilla;} 
        if(tbPedidos.getValueAt(r,6) != null){ taFacturas.append("\n  -Con " + orillaRellena); precio += precioAdicionalOrillaRellena;}
        taFacturas.append("\nPrecio: $" + precio + " MXN");
    }//GEN-LAST:event_tbPedidosMouseClicked

    private void btnImprimirPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirPedidosActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            taFacturas.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImprimirPedidosActionPerformed

    private void btnGuardarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPedidosActionPerformed
        // TODO add your handling code here:
         JFileChooser browser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", ".txt");
        browser.setFileFilter(filtro);
        int resultado = browser.showSaveDialog(null);
        if(resultado == JFileChooser.APPROVE_OPTION){
            String arch = browser.getSelectedFile().getAbsolutePath() + ".txt";
            String nota = taFacturas.getText();
            String mensaje = "grabado exitoso!";
            FileWriter writer = null;
            try {
                writer = new FileWriter(arch);
                try (BufferedWriter buffer = new BufferedWriter(writer)) {
                    buffer.write(nota);
                }
            } catch(IOException ex){
                mensaje = "Error al grabar!";
                JOptionPane.showMessageDialog(rootPane, mensaje);
            } finally {
                try {
                    writer.close();
                    JOptionPane.showMessageDialog(rootPane, mensaje);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Error al cerrar archivo!");
                }
            }
        }
    }//GEN-LAST:event_btnGuardarPedidosActionPerformed

    private void btnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaDeActionPerformed
        // TODO add your handling code here:
        acerca.setTitle("Acerca de...");
        acerca.setLocationRelativeTo(null);
        acerca.setVisible(true);
    }//GEN-LAST:event_btnAcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTamaño;
    private javax.swing.JButton btnAcercaDe;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarPedidos;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimirPedidos;
    private javax.swing.JCheckBox cbAceitunas;
    private javax.swing.JCheckBox cbChampiñones;
    private javax.swing.JCheckBox cbOrilla;
    private javax.swing.JCheckBox cbOrillaRellena;
    private javax.swing.JCheckBox cbQueso;
    private javax.swing.JComboBox<String> cbTiposPizza;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpImgPizzas;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblFotosPizzas;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JRadioButton rbChica;
    private javax.swing.JRadioButton rbGigante;
    private javax.swing.JRadioButton rbGrande;
    private javax.swing.JRadioButton rbMediana;
    private javax.swing.JTextArea taFacturas;
    private javax.swing.JTextArea taRecibo;
    private javax.swing.JTable tbPedidos;
    // End of variables declaration//GEN-END:variables
}
