package interfaces;
import clases.Compania;
import clases.*;

/**
 *
 * @author Luriannys Junco
 */
public class CompanyViewDELL extends javax.swing.JFrame {
    
    Compania company;

    /**
     * Creates new form principal
     */
    public CompanyViewDELL() {
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        SettingsView settings = new SettingsView();
        
        
        placaNumber.setText(settings.getPlaca());
        cpuNumber.setText(settings.getCpu());
        ramNumber.setText(settings.getRam());
        fuenteNumber.setText(settings.getFuente());
        tarjetaNumber.setText(settings.getTarjeta());
        ensambladoresNumber.setText(settings.getEnsambladores());
        
        String dead = settings.getDay();
        
        System.out.println(this.getCompany().getNombre()); // AQUI NO FUNCIONA
        
        // Falta actualizar esto constantemente
        
    }

    public Compania getCompany() {
        return company;
    }

    public void setCompany(Compania company) {
        this.company = company;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        companyNumbers = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pmActions = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        faltasNumber = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pmDescuentos = new javax.swing.JLabel();
        directorActions = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        dayDeadline = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        companyWorkers = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minusPlaca = new javax.swing.JButton();
        placaNumber = new javax.swing.JLabel();
        plusPlaca = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        minusCPU = new javax.swing.JButton();
        cpuNumber = new javax.swing.JLabel();
        plusCPU = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        minusRAM = new javax.swing.JButton();
        ramNumber = new javax.swing.JLabel();
        plusRAM = new javax.swing.JButton();
        minusFuente = new javax.swing.JButton();
        fuenteNumber = new javax.swing.JLabel();
        plusFuente = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        minusTarjeta = new javax.swing.JButton();
        tarjetaNumber = new javax.swing.JLabel();
        plusTarjeta = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        minusEnsambladores = new javax.swing.JButton();
        ensambladoresNumber = new javax.swing.JLabel();
        plusEnsambladores = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        companyStorage1 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        placaStorage = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cpuStorage = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        ramStorage = new javax.swing.JLabel();
        fuenteStorage = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        tarjetaStorage = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        returnPrincipalView = new javax.swing.JButton();
        utility = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        costs = new javax.swing.JLabel();
        profits = new javax.swing.JLabel();
        companyName = new javax.swing.JLabel();
        mainBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        companyNumbers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Project Manager");
        companyNumbers.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        pmActions.setText("0/0");
        companyNumbers.add(pmActions, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel8.setText("Faltas");
        companyNumbers.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        faltasNumber.setText("0/0");
        companyNumbers.add(faltasNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jLabel9.setText("Director");
        companyNumbers.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        pmDescuentos.setText("0/0");
        companyNumbers.add(pmDescuentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        directorActions.setText("0/0");
        companyNumbers.add(directorActions, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel25.setText("DÍAS DE ENTREGA");
        companyNumbers.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        dayDeadline.setText("0/0");
        companyNumbers.add(dayDeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        jLabel13.setText("Dinero descontado");
        companyNumbers.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        getContentPane().add(companyNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 220, 230));

        companyWorkers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Placa");
        companyWorkers.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        minusPlaca.setBackground(new java.awt.Color(242, 242, 242));
        minusPlaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-menos-30 (2).png"))); // NOI18N
        minusPlaca.setBorderPainted(false);
        minusPlaca.setMaximumSize(new java.awt.Dimension(40, 40));
        minusPlaca.setMinimumSize(new java.awt.Dimension(40, 40));
        minusPlaca.setPreferredSize(new java.awt.Dimension(25, 25));
        minusPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusPlacaActionPerformed(evt);
            }
        });
        companyWorkers.add(minusPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 15, -1, -1));
        minusPlaca.getAccessibleContext().setAccessibleDescription("");

        placaNumber.setText("0");
        companyWorkers.add(placaNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        plusPlaca.setBackground(new java.awt.Color(242, 242, 242));
        plusPlaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-más-30 (1).png"))); // NOI18N
        plusPlaca.setBorderPainted(false);
        plusPlaca.setMaximumSize(new java.awt.Dimension(40, 40));
        plusPlaca.setMinimumSize(new java.awt.Dimension(40, 40));
        plusPlaca.setPreferredSize(new java.awt.Dimension(25, 25));
        plusPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusPlacaActionPerformed(evt);
            }
        });
        companyWorkers.add(plusPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 15, -1, -1));

        jLabel2.setText("CPU");
        companyWorkers.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, -1));

        minusCPU.setBackground(new java.awt.Color(242, 242, 242));
        minusCPU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-menos-30 (2).png"))); // NOI18N
        minusCPU.setBorderPainted(false);
        minusCPU.setMaximumSize(new java.awt.Dimension(40, 40));
        minusCPU.setMinimumSize(new java.awt.Dimension(40, 40));
        minusCPU.setPreferredSize(new java.awt.Dimension(25, 25));
        minusCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusCPUActionPerformed(evt);
            }
        });
        companyWorkers.add(minusCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        cpuNumber.setText("0");
        companyWorkers.add(cpuNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 55, -1, -1));

        plusCPU.setBackground(new java.awt.Color(242, 242, 242));
        plusCPU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-más-30 (1).png"))); // NOI18N
        plusCPU.setBorderPainted(false);
        plusCPU.setMaximumSize(new java.awt.Dimension(40, 40));
        plusCPU.setMinimumSize(new java.awt.Dimension(40, 40));
        plusCPU.setPreferredSize(new java.awt.Dimension(25, 25));
        plusCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusCPUActionPerformed(evt);
            }
        });
        companyWorkers.add(plusCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel3.setText("Fuente de poder");
        companyWorkers.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        minusRAM.setBackground(new java.awt.Color(242, 242, 242));
        minusRAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-menos-30 (2).png"))); // NOI18N
        minusRAM.setBorderPainted(false);
        minusRAM.setMaximumSize(new java.awt.Dimension(40, 40));
        minusRAM.setMinimumSize(new java.awt.Dimension(40, 40));
        minusRAM.setPreferredSize(new java.awt.Dimension(25, 25));
        minusRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusRAMActionPerformed(evt);
            }
        });
        companyWorkers.add(minusRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 85, -1, -1));

        ramNumber.setText("0");
        companyWorkers.add(ramNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        plusRAM.setBackground(new java.awt.Color(242, 242, 242));
        plusRAM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-más-30 (1).png"))); // NOI18N
        plusRAM.setBorderPainted(false);
        plusRAM.setMaximumSize(new java.awt.Dimension(40, 40));
        plusRAM.setMinimumSize(new java.awt.Dimension(40, 40));
        plusRAM.setPreferredSize(new java.awt.Dimension(25, 25));
        plusRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusRAMActionPerformed(evt);
            }
        });
        companyWorkers.add(plusRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 85, -1, -1));

        minusFuente.setBackground(new java.awt.Color(242, 242, 242));
        minusFuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-menos-30 (2).png"))); // NOI18N
        minusFuente.setBorderPainted(false);
        minusFuente.setMaximumSize(new java.awt.Dimension(40, 40));
        minusFuente.setMinimumSize(new java.awt.Dimension(40, 40));
        minusFuente.setPreferredSize(new java.awt.Dimension(25, 25));
        minusFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusFuenteActionPerformed(evt);
            }
        });
        companyWorkers.add(minusFuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        fuenteNumber.setText("0");
        companyWorkers.add(fuenteNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 125, -1, -1));

        plusFuente.setBackground(new java.awt.Color(242, 242, 242));
        plusFuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-más-30 (1).png"))); // NOI18N
        plusFuente.setBorderPainted(false);
        plusFuente.setMaximumSize(new java.awt.Dimension(40, 40));
        plusFuente.setMinimumSize(new java.awt.Dimension(40, 40));
        plusFuente.setPreferredSize(new java.awt.Dimension(25, 25));
        plusFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusFuenteActionPerformed(evt);
            }
        });
        companyWorkers.add(plusFuente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        jLabel15.setText("Tarjeta gráfica");
        companyWorkers.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        minusTarjeta.setBackground(new java.awt.Color(242, 242, 242));
        minusTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-menos-30 (2).png"))); // NOI18N
        minusTarjeta.setBorderPainted(false);
        minusTarjeta.setMaximumSize(new java.awt.Dimension(40, 40));
        minusTarjeta.setMinimumSize(new java.awt.Dimension(40, 40));
        minusTarjeta.setPreferredSize(new java.awt.Dimension(25, 25));
        minusTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusTarjetaActionPerformed(evt);
            }
        });
        companyWorkers.add(minusTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 155, -1, -1));

        tarjetaNumber.setText("0");
        companyWorkers.add(tarjetaNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        plusTarjeta.setBackground(new java.awt.Color(242, 242, 242));
        plusTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-más-30 (1).png"))); // NOI18N
        plusTarjeta.setBorderPainted(false);
        plusTarjeta.setMaximumSize(new java.awt.Dimension(40, 40));
        plusTarjeta.setMinimumSize(new java.awt.Dimension(40, 40));
        plusTarjeta.setPreferredSize(new java.awt.Dimension(25, 25));
        plusTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusTarjetaActionPerformed(evt);
            }
        });
        companyWorkers.add(plusTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 155, -1, -1));

        jLabel17.setText("Ensambladores");
        companyWorkers.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, -1, -1));

        minusEnsambladores.setBackground(new java.awt.Color(242, 242, 242));
        minusEnsambladores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-menos-30 (2).png"))); // NOI18N
        minusEnsambladores.setBorderPainted(false);
        minusEnsambladores.setMaximumSize(new java.awt.Dimension(40, 40));
        minusEnsambladores.setMinimumSize(new java.awt.Dimension(40, 40));
        minusEnsambladores.setPreferredSize(new java.awt.Dimension(25, 25));
        minusEnsambladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusEnsambladoresActionPerformed(evt);
            }
        });
        companyWorkers.add(minusEnsambladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        ensambladoresNumber.setText("0");
        companyWorkers.add(ensambladoresNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 195, -1, -1));

        plusEnsambladores.setBackground(new java.awt.Color(242, 242, 242));
        plusEnsambladores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-más-30 (1).png"))); // NOI18N
        plusEnsambladores.setBorderPainted(false);
        plusEnsambladores.setMaximumSize(new java.awt.Dimension(40, 40));
        plusEnsambladores.setMinimumSize(new java.awt.Dimension(40, 40));
        plusEnsambladores.setPreferredSize(new java.awt.Dimension(25, 25));
        plusEnsambladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusEnsambladoresActionPerformed(evt);
            }
        });
        companyWorkers.add(plusEnsambladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        jLabel10.setText("RAM");
        companyWorkers.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        getContentPane().add(companyWorkers, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 240, 230));

        companyStorage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setText("Placa");
        companyStorage1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        placaStorage.setText("0/0");
        companyStorage1.add(placaStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel30.setText("CPU");
        companyStorage1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        cpuStorage.setText("0/0");
        companyStorage1.add(cpuStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel32.setText("Fuente de poder");
        companyStorage1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        ramStorage.setText("0/0");
        companyStorage1.add(ramStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        fuenteStorage.setText("0/0");
        companyStorage1.add(fuenteStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel35.setText("Tarjeta gráfica");
        companyStorage1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        tarjetaStorage.setText("0/0");
        companyStorage1.add(tarjetaStorage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel39.setText("RAM");
        companyStorage1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        getContentPane().add(companyStorage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 140, 230));

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnPrincipalView.setBackground(java.awt.Color.lightGray);
        returnPrincipalView.setText("Volver");
        returnPrincipalView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnPrincipalViewActionPerformed(evt);
            }
        });
        mainPanel.add(returnPrincipalView, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        utility.setForeground(new java.awt.Color(255, 255, 255));
        utility.setText("UTILIDAD: $ 0");
        mainPanel.add(utility, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ALMACÉN");
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("TRABAJADORES");
        mainPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        costs.setForeground(new java.awt.Color(255, 255, 255));
        costs.setText("COSTOS: $ 0");
        mainPanel.add(costs, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        profits.setForeground(new java.awt.Color(255, 255, 255));
        profits.setText("GANANCIAS: $ 0");
        mainPanel.add(profits, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        companyName.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        companyName.setForeground(new java.awt.Color(255, 255, 255));
        companyName.setText("companyName");
        mainPanel.add(companyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        mainBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nasa-Q1p7bh3SHj8-unsplash.jpg"))); // NOI18N
        mainBackground.setText("jLabel1");
        mainBackground.setMaximumSize(new java.awt.Dimension(680, 425));
        mainBackground.setMinimumSize(new java.awt.Dimension(680, 425));
        mainBackground.setPreferredSize(new java.awt.Dimension(680, 425));
        mainPanel.add(mainBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void plusPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusPlacaActionPerformed
        // TODO add your handling code here:
        int placas = Integer.parseInt(placaNumber.getText()) + 1;
            placaNumber.setText(String.valueOf(placas));
    }//GEN-LAST:event_plusPlacaActionPerformed

    private void minusPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusPlacaActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(placaNumber.getText()) > 1){
            int placas = Integer.parseInt(placaNumber.getText()) - 1;
            placaNumber.setText(String.valueOf(placas));
        }
    }//GEN-LAST:event_minusPlacaActionPerformed

    private void minusCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusCPUActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(cpuNumber.getText()) > 1){
            int cpu = Integer.parseInt(cpuNumber.getText()) - 1;
            cpuNumber.setText(String.valueOf(cpu));
        }
    }//GEN-LAST:event_minusCPUActionPerformed

    private void plusCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusCPUActionPerformed
        // TODO add your handling code here:
        int cpu = Integer.parseInt(cpuNumber.getText()) + 1;
            cpuNumber.setText(String.valueOf(cpu));
    }//GEN-LAST:event_plusCPUActionPerformed

    private void minusRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusRAMActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(ramNumber.getText()) > 1){
            int ram = Integer.parseInt(ramNumber.getText()) - 1;
            ramNumber.setText(String.valueOf(ram));
        }
    }//GEN-LAST:event_minusRAMActionPerformed

    private void plusRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusRAMActionPerformed
        // TODO add your handling code here:
        int ram = Integer.parseInt(ramNumber.getText()) + 1;
            ramNumber.setText(String.valueOf(ram));
    }//GEN-LAST:event_plusRAMActionPerformed

    private void minusFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusFuenteActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(fuenteNumber.getText()) > 1){
            int fuentes = Integer.parseInt(fuenteNumber.getText()) - 1;
            fuenteNumber.setText(String.valueOf(fuentes));
        }
    }//GEN-LAST:event_minusFuenteActionPerformed

    private void plusFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusFuenteActionPerformed
        // TODO add your handling code here:
        int fuentes = Integer.parseInt(fuenteNumber.getText()) + 1;
            fuenteNumber.setText(String.valueOf(fuentes));
    }//GEN-LAST:event_plusFuenteActionPerformed

    private void minusTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusTarjetaActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(tarjetaNumber.getText()) > 1){
            int tarjetas = Integer.parseInt(tarjetaNumber.getText()) - 1;
            tarjetaNumber.setText(String.valueOf(tarjetas));
        }
    }//GEN-LAST:event_minusTarjetaActionPerformed

    private void plusTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusTarjetaActionPerformed
        // TODO add your handling code here:
        int tarjetas = Integer.parseInt(tarjetaNumber.getText()) + 1;
        tarjetaNumber.setText(String.valueOf(tarjetas));
    }//GEN-LAST:event_plusTarjetaActionPerformed

    private void minusEnsambladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusEnsambladoresActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(ensambladoresNumber.getText()) > 1){
            int ensambladores = Integer.parseInt(ensambladoresNumber.getText()) - 1;
            ensambladoresNumber.setText(String.valueOf(ensambladores));
        }
    }//GEN-LAST:event_minusEnsambladoresActionPerformed

    private void plusEnsambladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusEnsambladoresActionPerformed
        // TODO add your handling code here:
        int ensambladores = Integer.parseInt(ensambladoresNumber.getText()) + 1;
        ensambladoresNumber.setText(String.valueOf(ensambladores));
    }//GEN-LAST:event_plusEnsambladoresActionPerformed

    private void returnPrincipalViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnPrincipalViewActionPerformed
        // TODO add your handling code here:
        PrincipalView principalView = new PrincipalView();
        principalView.setVisible(true);
        dispose();
    }//GEN-LAST:event_returnPrincipalViewActionPerformed

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
            java.util.logging.Logger.getLogger(CompanyViewDELL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompanyViewDELL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompanyViewDELL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompanyViewDELL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new CompanyViewDELL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel companyName;
    private javax.swing.JPanel companyNumbers;
    private javax.swing.JPanel companyStorage1;
    private javax.swing.JPanel companyWorkers;
    private javax.swing.JLabel costs;
    private javax.swing.JLabel cpuNumber;
    private javax.swing.JLabel cpuStorage;
    private javax.swing.JLabel dayDeadline;
    private javax.swing.JLabel directorActions;
    private javax.swing.JLabel ensambladoresNumber;
    private javax.swing.JLabel faltasNumber;
    private javax.swing.JLabel fuenteNumber;
    private javax.swing.JLabel fuenteStorage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mainBackground;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton minusCPU;
    private javax.swing.JButton minusEnsambladores;
    private javax.swing.JButton minusFuente;
    private javax.swing.JButton minusPlaca;
    private javax.swing.JButton minusRAM;
    private javax.swing.JButton minusTarjeta;
    private javax.swing.JLabel placaNumber;
    private javax.swing.JLabel placaStorage;
    private javax.swing.JButton plusCPU;
    private javax.swing.JButton plusEnsambladores;
    private javax.swing.JButton plusFuente;
    private javax.swing.JButton plusPlaca;
    private javax.swing.JButton plusRAM;
    private javax.swing.JButton plusTarjeta;
    private javax.swing.JLabel pmActions;
    private javax.swing.JLabel pmDescuentos;
    private javax.swing.JLabel profits;
    private javax.swing.JLabel ramNumber;
    private javax.swing.JLabel ramStorage;
    private javax.swing.JButton returnPrincipalView;
    private javax.swing.JLabel tarjetaNumber;
    private javax.swing.JLabel tarjetaStorage;
    private javax.swing.JLabel utility;
    // End of variables declaration//GEN-END:variables
}
