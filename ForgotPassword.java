package myPackage;

import javax.swing.JOptionPane;

public class ForgotPassword extends javax.swing.JFrame {

    public ForgotPassword() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changePasswordLabel = new javax.swing.JLabel();
        passwordTF = new javax.swing.JTextField();
        emailAddressLabel = new javax.swing.JLabel();
        emailAddressTF = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        newPasswordTF = new javax.swing.JTextField();
        updatePasswordButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        changePasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        changePasswordLabel.setText("Change Password");

        emailAddressLabel.setText("Email Address:");

        usernameLabel.setText("Username:");

        passwordLabel.setText("Password:");

        newPasswordLabel.setText("New Password:");

        updatePasswordButton.setText("Update Password");
        updatePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePasswordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePasswordLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(updatePasswordButton)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(newPasswordLabel)
                                .addComponent(passwordLabel)
                                .addComponent(emailAddressLabel)
                                .addComponent(usernameLabel))
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(newPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(changePasswordLabel)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAddressLabel)
                    .addComponent(emailAddressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordLabel)
                    .addComponent(newPasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(updatePasswordButton)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updatePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePasswordButtonActionPerformed
        AccountManager am = new AccountManager();
        String username = usernameTF.getText();
        String email = emailAddressTF.getText();
        String password = passwordTF.getText();
        String newPassword = newPasswordTF.getText();
        if (username.isEmpty() || password.isEmpty() || email.isEmpty() || newPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Credentials must not be empty.", "Message Error", JOptionPane.WARNING_MESSAGE);
        } else if (am.check(username, email, password) == false) {
            JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (password.length() < 10) {
            JOptionPane.showMessageDialog(this, "Password must have 10 characters up", "Password Error", JOptionPane.WARNING_MESSAGE);
        } else {
            am.changePass(username, email, password, newPassword);
            JOptionPane.showMessageDialog(this, "New Password Set.", "Setting New Password Success", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
        }

    }//GEN-LAST:event_updatePasswordButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel changePasswordLabel;
    private javax.swing.JLabel emailAddressLabel;
    private javax.swing.JTextField emailAddressTF;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JTextField newPasswordTF;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JButton updatePasswordButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
