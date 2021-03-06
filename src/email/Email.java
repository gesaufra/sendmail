/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JanelaEmail.java
 *
 * Created on 19/05/2016, 13:00:18
 */
package email;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Giovane
 */
public class Email extends javax.swing.JFrame {

    File[] Anexo;

    /** Creates new form JanelaEmail */
    public Email() {
        initComponents();
        EnderecoAnexo.setEditable(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Remetente = new javax.swing.JTextField();
        Destinatario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mensagem = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        Assunto = new javax.swing.JTextField();
        EnderecoAnexo = new javax.swing.JTextField();
        NomeRemetente = new javax.swing.JTextField();
        BotaoEnviar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ServidorSMTP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Porta = new javax.swing.JTextField();
        BotaoExcluir = new javax.swing.JButton();
        BotaoAnexo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Senha = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 4, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(786, 543));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("E-mail");

        Remetente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Destinatario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Destinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinatarioActionPerformed(evt);
            }
        });

        Mensagem.setColumns(20);
        Mensagem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Mensagem.setLineWrap(true);
        Mensagem.setRows(5);
        Mensagem.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Mensagem);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Assunto");

        Assunto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        EnderecoAnexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        NomeRemetente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NomeRemetente.setText("GESA - Grupo de Estudos Socioambientais na Amazônia");

        BotaoEnviar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotaoEnviar.setForeground(new java.awt.Color(0, 153, 0));
        BotaoEnviar.setText("Enviar");
        BotaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEnviarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Organizador");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(688, 66));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Endereço do servidor SMTP");

        ServidorSMTP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ServidorSMTP.setText("smtp.gmail.com");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Porta");

        Porta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Porta.setText("465");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ServidorSMTP, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Porta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Porta, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(ServidorSMTP)))
                .addContainerGap())
        );

        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        BotaoAnexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotaoAnexo.setText("Anexo");
        BotaoAnexo.setToolTipText("");
        BotaoAnexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAnexoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("E-mail do Participante");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Senha");

        Senha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BotaoEnviar)))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Remetente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NomeRemetente)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Destinatario))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(121, 121, 121)
                        .addComponent(Assunto))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(EnderecoAnexo, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoAnexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(BotaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(NomeRemetente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Remetente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(Assunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnderecoAnexo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoAnexo)
                    .addComponent(BotaoExcluir))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(BotaoEnviar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(804, 677));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

private void DestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinatarioActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_DestinatarioActionPerformed

private void BotaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEnviarActionPerformed
    EmailAnexo();

}//GEN-LAST:event_BotaoEnviarActionPerformed

private void BotaoAnexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAnexoActionPerformed

    JFileChooser file = new JFileChooser();
    file.setMultiSelectionEnabled(true);
    file.setFileSelectionMode(JFileChooser.FILES_ONLY);
    int i = file.showOpenDialog(null);
    if (i == 1) {
        EnderecoAnexo.setText("");
        Anexo = null;
    } else {
        Anexo = file.getSelectedFiles();
        
        String SomaAnexo1 = "";
        String SomaAnexo2 = "";
        for (File enderec : Anexo) {
            EnderecoAnexo.setText(enderec.getPath());
            SomaAnexo1 = EnderecoAnexo.getText();
            SomaAnexo2 = SomaAnexo2 + SomaAnexo1 + ";";
            EnderecoAnexo.setText(SomaAnexo2);

        }
    }


}//GEN-LAST:event_BotaoAnexoActionPerformed

private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
    EnderecoAnexo.setText("");
    Anexo = null;

}//GEN-LAST:event_BotaoExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Email().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Assunto;
    private javax.swing.JButton BotaoAnexo;
    private javax.swing.JButton BotaoEnviar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JTextField Destinatario;
    private javax.swing.JTextField EnderecoAnexo;
    private javax.swing.JTextArea Mensagem;
    private javax.swing.JTextField NomeRemetente;
    private javax.swing.JTextField Porta;
    private javax.swing.JTextField Remetente;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JTextField ServidorSMTP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    public void EmailAnexo() {
        try {

            //usuario e senha do seu gmail
            final String usuario = Remetente.getText();
            final String senha = Senha.getText();

            //config. do gmail
            Properties mailProps = new Properties();
            mailProps.put("mail.transport.protocol", "smtp");
            mailProps.put("mail.smtp.starttls.enable", "true");
            mailProps.put("mail.smtp.host", ServidorSMTP.getText());
            mailProps.put("mail.smtp.auth", "true");
            mailProps.put("mail.smtp.user", usuario);
            mailProps.put("mail.debug", "true");
            mailProps.put("mail.smtp.port", Porta.getText());
            mailProps.put("mail.smtp.socketFactory.port", Porta.getText());
            mailProps.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            mailProps.put("mail.smtp.socketFactory.fallback", "false");

            //eh necessario autenticar
            Session mailSession = Session.getInstance(mailProps, new Authenticator() {

                @Override
                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(usuario, senha);
                }
            });
            mailSession.setDebug(false);

            //config. da mensagem
            Message mailMessage = new MimeMessage(mailSession);

            //remetente
            mailMessage.setFrom(new InternetAddress(Remetente.getText(), NomeRemetente.getText()));

            //destinatario
            mailMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(Destinatario.getText()));

            //mensagem que vai no corpo do email
            MimeBodyPart mbpMensagem = new MimeBodyPart();
            mbpMensagem.setText(Mensagem.getText());

//			partes do email
            Multipart mp = new MimeMultipart();
            mp.addBodyPart(mbpMensagem);
            
            String Endereco_Anexo = "";
            if (Anexo != null) { // se tiver alguma coisa anexada ela inicializar o comando abaixo
                for (File element : Anexo) {

                    Endereco_Anexo = element.getPath();
                    String imagem = Endereco_Anexo;
                    File Arquivo = new File(imagem);
                    //setando o anexo
                    MimeBodyPart mbpAnexo = new MimeBodyPart();
                    mbpAnexo.setDataHandler(new DataHandler(new FileDataSource(Arquivo)));
                    mbpAnexo.setFileName(Arquivo.getName());
                    mp.addBodyPart(mbpAnexo);
                }
            }

            //assunto do email
            mailMessage.setSubject(Assunto.getText());

            //seleciona o conteudo 
            mailMessage.setContent(mp);

            //envia o email
            Transport.send(mailMessage);
            JOptionPane.showMessageDialog(null, "Email Enviado com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro no Envio !\n"+e);
        }
    }


// public void EmailSimples() throws UnsupportedEncodingException {
//
//        Properties props = new Properties();
//        /** Parâmetros de conexão com servidor Gmail */
//        props.put("mail.smtp.host", ServidorSMTP.getText());
//        props.put("mail.smtp.socketFactory.port", Porta.getText());
//        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.port", Porta.getText());
//
//        Session session = Session.getDefaultInstance(props,
//                new javax.mail.Authenticator() {
//
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(Remetente.getText(), Senha.getText());
//                    }
//                });
//
//        /** Ativa Debug para sessão */
//        session.setDebug(true);
//
//        try {
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(Remetente.getText(), NomeRemetente.getText())); //Remetente
//
//            Address[] toUser = InternetAddress //Destinatário(s)
//                    .parse(Destinatario.getText());
//
//            message.setRecipients(Message.RecipientType.TO, toUser);
//            message.setSubject(Assunto.getText());//Assunto
//            message.setText(Mensagem.getText());
//            /**Método para enviar a mensagem criada*/
//            Transport.send(message);
//
//            System.out.println("Feito!!!");
//            JOptionPane.showMessageDialog(null, "Email Enviado com Sucesso");
//
//        } catch (MessagingException e) {
//            JOptionPane.showMessageDialog(null, "Houve um erro no Envio !");
//            throw new RuntimeException(e);
//
//        }
//    }


}