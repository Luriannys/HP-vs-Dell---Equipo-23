package interfaces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luriannys Junco
 */
public class SettingsView extends javax.swing.JFrame {

    String day;
    String dead;
    String placa;
    String cpu;
    String ram;
    String fuente;
    String tarjeta;
    String ensambladores;

    /**
     * Creates new form principal
     */
    public SettingsView() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        leerDatos();
        dayDuration.setSize(70, 20);
        deadline.setSize(70, 20);
        dayDuration.setText(day);
        deadline.setText(dead);
        placaSettings.setText(placa);
        cpuSettings.setText(cpu);
        ramSettings.setText(ram);
        fuenteSettings.setText(fuente);
        tarjetaSettings.setText(tarjeta);
        ensambladoresSettings.setText(ensambladores);       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        companyWorkers = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        minusPlaca = new javax.swing.JButton();
        placaSettings = new javax.swing.JLabel();
        plusPlaca = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        minusCPU = new javax.swing.JButton();
        cpuSettings = new javax.swing.JLabel();
        plusCPU = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        minusRAM = new javax.swing.JButton();
        ramSettings = new javax.swing.JLabel();
        plusRAM = new javax.swing.JButton();
        minusFuente = new javax.swing.JButton();
        fuenteSettings = new javax.swing.JLabel();
        plusFuente = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        minusTarjeta = new javax.swing.JButton();
        tarjetaSettings = new javax.swing.JLabel();
        plusTarjeta = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        minusEnsambladores = new javax.swing.JButton();
        ensambladoresSettings = new javax.swing.JLabel();
        plusEnsambladores = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        deadline = new javax.swing.JTextField();
        dayDuration = new javax.swing.JTextField();
        saveChanges = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        mainTitle = new javax.swing.JLabel();
        mainBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Duración de un día: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setText("Deadline:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        companyWorkers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Placa");
        companyWorkers.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

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

        placaSettings.setText("0");
        companyWorkers.add(placaSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

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

        jLabel5.setText("CPU");
        companyWorkers.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, -1, -1));

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

        cpuSettings.setText("0");
        companyWorkers.add(cpuSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 55, -1, -1));

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

        jLabel6.setText("Fuente de poder");
        companyWorkers.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

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

        ramSettings.setText("0");
        companyWorkers.add(ramSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

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

        fuenteSettings.setText("0");
        companyWorkers.add(fuenteSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 125, -1, -1));

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

        tarjetaSettings.setText("0");
        companyWorkers.add(tarjetaSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

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

        ensambladoresSettings.setText("0");
        companyWorkers.add(ensambladoresSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 195, -1, -1));

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

        jPanel1.add(companyWorkers, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 240, 230));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Cantidad inicial de trabajadores");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        deadline.setFont(new java.awt.Font("Segoe UI", 2, 8)); // NOI18N
        deadline.setPreferredSize(new java.awt.Dimension(70, 20));
        deadline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deadlineActionPerformed(evt);
            }
        });
        jPanel1.add(deadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        dayDuration.setFont(new java.awt.Font("Segoe UI", 2, 8)); // NOI18N
        dayDuration.setPreferredSize(new java.awt.Dimension(70, 20));
        dayDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayDurationActionPerformed(evt);
            }
        });
        jPanel1.add(dayDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 55, -1, -1));

        saveChanges.setBackground(java.awt.Color.lightGray);
        saveChanges.setText("Guardar cambios");
        saveChanges.setBorderPainted(false);
        saveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesActionPerformed(evt);
            }
        });
        jPanel1.add(saveChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        exit.setBackground(java.awt.Color.lightGray);
        exit.setText("Cancelar");
        exit.setBorderPainted(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        mainPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 570, 280));

        mainTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mainTitle.setForeground(new java.awt.Color(255, 255, 255));
        mainTitle.setText("AJUSTES");
        mainPanel.add(mainTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        mainBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nasa-Q1p7bh3SHj8-unsplash.jpg"))); // NOI18N
        mainBackground.setText("jLabel1");
        mainBackground.setMaximumSize(new java.awt.Dimension(680, 425));
        mainBackground.setMinimumSize(new java.awt.Dimension(680, 425));
        mainBackground.setPreferredSize(new java.awt.Dimension(680, 425));
        mainPanel.add(mainBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minusPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusPlacaActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(placaSettings.getText()) > 1){
            int placaInt = Integer.parseInt(placaSettings.getText()) - 1;
            placaSettings.setText(String.valueOf(placaInt));
        }
    }//GEN-LAST:event_minusPlacaActionPerformed

    private void plusPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusPlacaActionPerformed
        // TODO add your handling code here:
        int placaInt = Integer.parseInt(placaSettings.getText()) + 1;
            placaSettings.setText(String.valueOf(placaInt));
    }//GEN-LAST:event_plusPlacaActionPerformed

    private void minusCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusCPUActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(cpuSettings.getText()) > 1){
            int cpuInt = Integer.parseInt(cpuSettings.getText()) - 1;
            cpuSettings.setText(String.valueOf(cpuInt));
        }
    }//GEN-LAST:event_minusCPUActionPerformed

    private void plusCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusCPUActionPerformed
        // TODO add your handling code here:
        int cpuInt = Integer.parseInt(cpuSettings.getText()) + 1;
            cpuSettings.setText(String.valueOf(cpuInt));
    }//GEN-LAST:event_plusCPUActionPerformed

    private void minusRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusRAMActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(ramSettings.getText()) > 1){
            int ramInt = Integer.parseInt(ramSettings.getText()) - 1;
            ramSettings.setText(String.valueOf(ramInt));
        }
    }//GEN-LAST:event_minusRAMActionPerformed

    private void plusRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusRAMActionPerformed
        // TODO add your handling code here:
        int ramInt = Integer.parseInt(ramSettings.getText()) + 1;
            ramSettings.setText(String.valueOf(ramInt));
    }//GEN-LAST:event_plusRAMActionPerformed

    private void minusFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusFuenteActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(fuenteSettings.getText()) > 1){
            int fuenteInt = Integer.parseInt(fuenteSettings.getText()) - 1;
            fuenteSettings.setText(String.valueOf(fuenteInt));
        }
    }//GEN-LAST:event_minusFuenteActionPerformed

    private void plusFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusFuenteActionPerformed
        // TODO add your handling code here:
        int fuenteInt = Integer.parseInt(fuenteSettings.getText()) + 1;
            fuenteSettings.setText(String.valueOf(fuenteInt));
    }//GEN-LAST:event_plusFuenteActionPerformed

    private void minusTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusTarjetaActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(tarjetaSettings.getText()) > 1){
            int tarjetaInt = Integer.parseInt(tarjetaSettings.getText()) - 1;
            tarjetaSettings.setText(String.valueOf(tarjetaInt));
        }
    }//GEN-LAST:event_minusTarjetaActionPerformed

    private void plusTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusTarjetaActionPerformed
        // TODO add your handling code here:
        int tarjetaInt = Integer.parseInt(tarjetaSettings.getText()) + 1;
            tarjetaSettings.setText(String.valueOf(tarjetaInt));
    }//GEN-LAST:event_plusTarjetaActionPerformed

    private void minusEnsambladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusEnsambladoresActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(ensambladoresSettings.getText()) > 1){
            int ensambladoresInt = Integer.parseInt(ensambladoresSettings.getText()) - 1;
            ensambladoresSettings.setText(String.valueOf(ensambladoresInt));
        }
    }//GEN-LAST:event_minusEnsambladoresActionPerformed

    private void plusEnsambladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusEnsambladoresActionPerformed
        // TODO add your handling code here:
        int ensambladoresInt = Integer.parseInt(ensambladoresSettings.getText()) + 1;
            ensambladoresSettings.setText(String.valueOf(ensambladoresInt));
    }//GEN-LAST:event_plusEnsambladoresActionPerformed

    private void deadlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deadlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deadlineActionPerformed

    private void dayDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayDurationActionPerformed

    private void saveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesActionPerformed
        // TODO add your handling code here:
        if (dayDuration.getText() != ""){
            day = dayDuration.getText();
        }
        if (deadline.getText() != ""){
            dead = deadline.getText();
        }
        if (placaSettings.getText() != ""){
            placa = placaSettings.getText();
        }
        if (cpuSettings.getText() != ""){
            cpu = cpuSettings.getText();
        }
        if (ramSettings.getText() != ""){
            ram = ramSettings.getText();
        }
        if (fuenteSettings.getText() != ""){
            fuente = fuenteSettings.getText();
        }
        if (tarjetaSettings.getText() != ""){
            tarjeta = tarjetaSettings.getText();
        }
        if (ensambladoresSettings.getText() != ""){
            ensambladores = ensambladoresSettings.getText();
        }
        saveData();

    
        
    }//GEN-LAST:event_saveChangesActionPerformed

    public void saveData() {
        try {
            FileWriter writer = new FileWriter("datos.txt");
            writer.write(day + "\n");
            writer.write(dead + "\n");
            writer.write(placa + "\n");
            writer.write(cpu + "\n");
            writer.write(ram + "\n");
            writer.write(fuente + "\n");
            writer.write(tarjeta + "\n");
            writer.write(ensambladores + "\n");
            writer.close();
            JOptionPane.showMessageDialog(null, "Archivo guardado con éxito", "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void leerDatos() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("datos.txt"));
            day = reader.readLine();
            dead = reader.readLine();
            placa = reader.readLine();
            cpu = reader.readLine();
            ram = reader.readLine();
            fuente = reader.readLine();
            tarjeta = reader.readLine();
            ensambladores = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        PrincipalView principalView = new PrincipalView();
        principalView.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(SettingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel companyWorkers;
    private javax.swing.JLabel cpuSettings;
    private javax.swing.JTextField dayDuration;
    private javax.swing.JTextField deadline;
    private javax.swing.JLabel ensambladoresSettings;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fuenteSettings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mainBackground;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JButton minusCPU;
    private javax.swing.JButton minusEnsambladores;
    private javax.swing.JButton minusFuente;
    private javax.swing.JButton minusPlaca;
    private javax.swing.JButton minusRAM;
    private javax.swing.JButton minusTarjeta;
    private javax.swing.JLabel placaSettings;
    private javax.swing.JButton plusCPU;
    private javax.swing.JButton plusEnsambladores;
    private javax.swing.JButton plusFuente;
    private javax.swing.JButton plusPlaca;
    private javax.swing.JButton plusRAM;
    private javax.swing.JButton plusTarjeta;
    private javax.swing.JLabel ramSettings;
    private javax.swing.JButton saveChanges;
    private javax.swing.JLabel tarjetaSettings;
    // End of variables declaration//GEN-END:variables
}
