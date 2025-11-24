package myPackage;

import javax.swing.JOptionPane;

public class AccountCreation extends javax.swing.JFrame {

    public AccountCreation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cUsernameLabel = new javax.swing.JLabel();
        createUsernameTF = new javax.swing.JTextField();
        cPasswordLabel = new javax.swing.JLabel();
        createPasswordTF = new javax.swing.JTextField();
        emailAddressLabel = new javax.swing.JLabel();
        emailAddressTF = new javax.swing.JTextField();
        cellphoneNoLabel = new javax.swing.JLabel();
        cellphoneNoTF = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        charLabel1 = new javax.swing.JLabel();
        charLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Create Account");

        cUsernameLabel.setText("Username:");

        cPasswordLabel.setText("Password:");

        emailAddressLabel.setText("Email Address:");

        cellphoneNoLabel.setText("Cellphone No.:");

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        charLabel1.setText("--------------------------------------------------------------------------------");

        charLabel2.setText("--------------------------------------------------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createButton)
                .addGap(205, 205, 205))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(charLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(charLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cUsernameLabel)
                                    .addComponent(cPasswordLabel))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createUsernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailAddressLabel)
                                    .addComponent(cellphoneNoLabel))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cellphoneNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(charLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cUsernameLabel)
                    .addComponent(createUsernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPasswordLabel)
                    .addComponent(createPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAddressLabel)
                    .addComponent(emailAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cellphoneNoLabel)
                    .addComponent(cellphoneNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(charLabel2)
                .addGap(22, 22, 22)
                .addComponent(createButton)
                .addGap(55, 55, 55))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        
        String username = createUsernameTF.getText();
        String password = createPasswordTF.getText();
        String emailAddress = emailAddressTF.getText();
        String cellphoneNumber = cellphoneNoTF.getText();

        if (username.isEmpty() || password.isEmpty() || emailAddress.isEmpty() || cellphoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All credentials is empty. \nPlease fill up.", "Not Filled", JOptionPane.WARNING_MESSAGE);
        } else if (username.length() < 11) {
            JOptionPane.showMessageDialog(this, "Username must have 11 characters up", "Username Error", JOptionPane.WARNING_MESSAGE);
        } else if (password.length() < 10) {
            JOptionPane.showMessageDialog(this, "Password must have 10 characters up", "Password Error", JOptionPane.WARNING_MESSAGE);
        } else if (emailAddress.length() < 11) {
            JOptionPane.showMessageDialog(this, "Email account not identified.", "Email No. Error", JOptionPane.WARNING_MESSAGE);
        } else if (isLetter(cellphoneNumber) || cellphoneNumber.length() > 11 || cellphoneNumber.length() < 11) {
            JOptionPane.showMessageDialog(this, "Cellphone number must numbers only and has 11 digits", "Cellphone No. Error", JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Account Creation Successful", "Successful", JOptionPane.DEFAULT_OPTION);
            AccountManager manager = new AccountManager();
            manager.addAccountToDataBase(new Account(username, password, emailAddress, cellphoneNumber));
            this.setVisible(false);
        }

    }//GEN-LAST:event_createButtonActionPerformed

    public boolean isLetter(String line) {
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountCreation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cPasswordLabel;
    private javax.swing.JLabel cUsernameLabel;
    private javax.swing.JLabel cellphoneNoLabel;
    private javax.swing.JTextField cellphoneNoTF;
    private javax.swing.JLabel charLabel1;
    private javax.swing.JLabel charLabel2;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField createPasswordTF;
    private javax.swing.JTextField createUsernameTF;
    private javax.swing.JLabel emailAddressLabel;
    private javax.swing.JTextField emailAddressTF;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
