/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.motorph.cp2;

import main.java.motorph_employee.EmployeeInformation;
import main.java.motorph_model.Employee;
import com.opencsv.exceptions.CsvValidationException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


class SearchEmployee extends javax.swing.JFrame implements EmployeeInformationPopulator {

    // Constants for button coloring changes
    private static final java.awt.Color WHITE = new java.awt.Color(255, 255, 255);

    private boolean toggleOnButtonClicked = false;
    private int clickCount = 0;

    /**
     * Creates new SearchEmployeeFrame.
     */
    public SearchEmployee() {
        initComponents();
        populateEmployeeTable();
        setupTableMouseListener();
        handleToggleOn();  // Automatically enable the table on initialization
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneMain = new javax.swing.JScrollPane();
        pnlMain = new javax.swing.JPanel();
        lblEmployeeSearchHeader = new javax.swing.JLabel();
        lblBottomSeparator = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBasicEmployeeInformation = new javax.swing.JTable();
        tglOn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Employee Search");
        setResizable(false);

        scrollPaneMain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        lblEmployeeSearchHeader.setBackground(new java.awt.Color(55, 55, 255));
        lblEmployeeSearchHeader.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmployeeSearchHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmployeeSearchHeader.setText("Search Employee");
        lblEmployeeSearchHeader.setOpaque(true);

        lblBottomSeparator.setBackground(new java.awt.Color(51, 51, 51));
        lblBottomSeparator.setFont(new java.awt.Font("Leelawadee", 1, 16)); // NOI18N
        lblBottomSeparator.setForeground(new java.awt.Color(255, 255, 255));
        lblBottomSeparator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBottomSeparator.setOpaque(true);

        btnExit.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusable(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setFocusable(false);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblBasicEmployeeInformation.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        tblBasicEmployeeInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Number", "Last Name", "First Name", "SSS #", "PhilHealth #", "TIN", "Pag-IBIG #"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBasicEmployeeInformation.setEnabled(false);
        tblBasicEmployeeInformation.setFocusable(false);
        tblBasicEmployeeInformation.setRowHeight(24);
        tblBasicEmployeeInformation.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblBasicEmployeeInformation);
        if (tblBasicEmployeeInformation.getColumnModel().getColumnCount() > 0) {
            tblBasicEmployeeInformation.getColumnModel().getColumn(0).setResizable(false);
            tblBasicEmployeeInformation.getColumnModel().getColumn(1).setResizable(false);
            tblBasicEmployeeInformation.getColumnModel().getColumn(3).setResizable(false);
            tblBasicEmployeeInformation.getColumnModel().getColumn(4).setResizable(false);
            tblBasicEmployeeInformation.getColumnModel().getColumn(5).setResizable(false);
        }

        tglOn.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        tglOn.setBorder(null);
        tglOn.setBorderPainted(false);
        tglOn.setContentAreaFilled(false);
        tglOn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tglOn.setFocusable(false);
        tglOn.setMaximumSize(new java.awt.Dimension(105, 17));
        tglOn.setMinimumSize(new java.awt.Dimension(105, 17));
        tglOn.setPreferredSize(new java.awt.Dimension(105, 17));
        tglOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tglOnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tglOnMouseExited(evt);
            }
        });
        tglOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglOnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBottomSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblEmployeeSearchHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(tglOn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(lblEmployeeSearchHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblBottomSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(tglOn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        scrollPaneMain.setViewportView(pnlMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneMain, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setupTableMouseListener() {
        // Add mouse listener to handle table row clicks
        tblBasicEmployeeInformation.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowIndex = tblBasicEmployeeInformation.getSelectedRow();
                // If a row is selected and toggle button is on
                if (rowIndex != -1 && toggleOnButtonClicked) {
                    // Show employee information
                    showEmployeeInformation(rowIndex);
                }
            }
        });
    }

    /**
     * Handles the action event of the back button to close the current page.
     */
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Close the current page
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * Handles mouse hover event on the back button by changing its background
     * color.
     */
    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setBackground(WHITE);
    }//GEN-LAST:event_btnBackMouseEntered

    /**
     * Handles mouse exit event on the back button by resetting its background
     * color.
     */
    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setBackground(WHITE);
    }//GEN-LAST:event_btnBackMouseExited

    /**
     * Handles the action event of the exit button to exit the application.
     */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Exit the application
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * Handles mouse hover event on the exit button by changing its background
     * color.
     */
    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(WHITE);
    }//GEN-LAST:event_btnExitMouseEntered

    /**
     * Handles mouse exit event on the exit button by resetting its background
     * color.
     */
    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(WHITE);
    }//GEN-LAST:event_btnExitMouseExited

    /**
     * Handles the action event of the "Toggle On" button to handle its clicks.
     */
    private void tglOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglOnActionPerformed
        handleToggleOn();
    }//GEN-LAST:event_tglOnActionPerformed

    /**
     * Handles mouse hover event on the "Toggle On" button by changing its
     * background color.
     */
    private void tglOnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tglOnMouseEntered
        tglOn.setBackground(WHITE);
    }//GEN-LAST:event_tglOnMouseEntered

    /**
     * Handles mouse exit event on the "Toggle On" button by resetting its
     * background color.
     */
    private void tglOnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tglOnMouseExited
        tglOn.setBackground(WHITE);
    }//GEN-LAST:event_tglOnMouseExited

    /**
     * Displays an error dialog with the provided error message.
     *
     * @param errorMessage The error message to display in the dialog.
     */
    @Override
    public void showErrorDialog(String errorMessage) {
        // Show a dialog with the error message
        JOptionPane.showMessageDialog(pnlMain, "Error updating employee information: " + errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Handles the action event of the toggle on button to enable selection of
     * employee and show its information.
     */
    private void handleToggleOn() {
    // Set initial click count to 1 if being called during initialization
    if (clickCount == 0) {
        clickCount = 1;
    } else {
        // Increment the click count
        clickCount++;
    }

    // Determine if toggle is on or off
    toggleOnButtonClicked = (clickCount % 2 != 0);

    // Enable or disable table and set toggle button states
    tblBasicEmployeeInformation.setEnabled(toggleOnButtonClicked);
    tglOn.setSelected(toggleOnButtonClicked);
   
}

    /**
     * Populates the employee table with all of the employee's basic information.
     * Populates employee table based on the provided employee number. Gets data
     * from the EmployeeInformation class and fills the appropriate rows.
     */
    private void populateEmployeeTable() {
        try {
            // Get employee data
            EmployeeInformation employeeInformation = new EmployeeInformation();
            List<Employee> employees = employeeInformation.getAllEmployees();

            // Populate table with employee data
            DefaultTableModel model = (DefaultTableModel) tblBasicEmployeeInformation.getModel();
            for (Employee employee : employees) {
                model.addRow(new Object[]{
                    employee.getEmployeeNumber(),
                    employee.getLastName(),
                    employee.getFirstName(),
                    employee.getSssNumber(),
                    employee.getPhilHealthNumber(),
                    employee.getTin(),
                    employee.getPagIbigNumber()
                });
            }
        } catch (IOException | ParseException | CsvValidationException e) {
            showErrorDialog(e.getMessage());
        }
    }

    /**
     * Displays employee information in a new frame.
     *
     * @param rowIndex The index of the selected row in the table
     */
    private void showEmployeeInformation(int rowIndex) {
        try {
            // Get selected employee's information
            DefaultTableModel model = (DefaultTableModel) tblBasicEmployeeInformation.getModel();

            int employeeNumber = (int) model.getValueAt(rowIndex, 0);

            EmployeeInformation employeeInformation = new EmployeeInformation();

            List<String> employeeDetails = employeeInformation.showEmployeeInformation(employeeNumber);

            // Display information in a new frame
            new EmployeeDetailsFrame(employeeDetails).setVisible(true);
        } catch (IOException | ParseException | CsvValidationException e) {
            // Show error dialog with the exception message
            showErrorDialog(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For information see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SearchEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBottomSeparator;
    private javax.swing.JLabel lblEmployeeSearchHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JScrollPane scrollPaneMain;
    private javax.swing.JTable tblBasicEmployeeInformation;
    private javax.swing.JToggleButton tglOn;
    // End of variables declaration//GEN-END:variables

}
