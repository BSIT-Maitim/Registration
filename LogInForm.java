package myPackage;

import javax.swing.JOptionPane;

public class LogInForm extends javax.swing.JFrame {

    public LogInForm() {
        initComponents();
    }

    public String getUsername() {
        return usernameTF.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logIn = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        accountCreationButton = new javax.swing.JButton();
        logInButton = new javax.swing.JButton();
        Message1Label = new javax.swing.JLabel();
        charLabel = new javax.swing.JLabel();
        forgotPasswordButton = new javax.swing.JButton();
        charLabel1 = new javax.swing.JLabel();
        passwordPF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SAMPLE_APPLICATION");
        setResizable(false);

        logIn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        logIn.setText("Log In");

        userNameLabel.setText("Username:");

        passwordLabel.setText("Password:");

        accountCreationButton.setText("Create Account");
        accountCreationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountCreationButtonActionPerformed(evt);
            }
        });

        logInButton.setText("Log In");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        Message1Label.setText("You don't have Account?");

        charLabel.setText("---------------------------------------------------");

        forgotPasswordButton.setText("Forgot Password");
        forgotPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPasswordButtonActionPerformed(evt);
            }
        });

        charLabel1.setText("---------------------------------------------------");

        passwordPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(charLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(userNameLabel)
                                            .addComponent(passwordLabel))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(logInButton)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(passwordPF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addComponent(forgotPasswordButton))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(charLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))))
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Message1Label)
                    .addComponent(accountCreationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(charLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forgotPasswordButton)
                    .addComponent(logInButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(charLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Message1Label)
                .addGap(18, 18, 18)
                .addComponent(accountCreationButton)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void accountCreationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountCreationButtonActionPerformed

        AccountCreation ac = new AccountCreation();
        ac.setVisible(true);

    }//GEN-LAST:event_accountCreationButtonActionPerformed

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        AccountManager manager = new AccountManager();
        String username = usernameTF.getText();
        String password = passwordPF.getText();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username or Password must not be empty.", "Message Error", JOptionPane.WARNING_MESSAGE);
        } else if (manager.checkAccount(username, password) == false) {
            JOptionPane.showMessageDialog(this, "There is no account named " + usernameTF.getText(), "Message Error", JOptionPane.WARNING_MESSAGE);
            usernameTF.setText("");
            passwordPF.setText("");
        } else {
            if (manager.crendentials(username, password) == true) {
                manager.setLoggedIn(username, password);
                this.setVisible(false);
                Dashboard dashboard = new Dashboard();
                dashboard.setUsername(username);
                dashboard.setVisible(true);
                this.setVisible(false);
            }

        }
    }//GEN-LAST:event_logInButtonActionPerformed

    private void forgotPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPasswordButtonActionPerformed
        ForgotPassword fp = new ForgotPassword();
        fp.setVisible(true);
    }//GEN-LAST:event_forgotPasswordButtonActionPerformed

    private void passwordPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordPFActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInForm().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Message1Label;
    private javax.swing.JButton accountCreationButton;
    private javax.swing.JLabel charLabel;
    private javax.swing.JLabel charLabel1;
    private javax.swing.JButton forgotPasswordButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel logIn;
    private javax.swing.JButton logInButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordPF;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
