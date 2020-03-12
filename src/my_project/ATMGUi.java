
package my_project;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ATMGUi extends javax.swing.JFrame {

    /**
     * Creates new form ATMGUi
     */
    public ATMGUi(){
        initComponents();
    }
    public void make_button_on(String s){
        String num=jdis.getText()+s;
        jdis.setText(num);
    }
   
    public void set_vis(){
        jbalance.setEnabled(true);
        jloan1.setEnabled(true);
        jwithdraw.setEnabled(true);
        jdeposit.setEnabled(true);
    }
    public void set_unvis(){
        jbalance.setEnabled(false);
        jloan1.setEnabled(false);
        jwithdraw.setEnabled(false);
        jdeposit.setEnabled(false);
    }
    public void cannot_withdrawl(){
        jTextArea.setText("  your trancection falid");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbalance = new javax.swing.JButton();
        jwithdraw = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jdis = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jloan1 = new javax.swing.JButton();
        jdeposit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jone = new javax.swing.JButton();
        jtwo = new javax.swing.JButton();
        jthree = new javax.swing.JButton();
        jcancel = new javax.swing.JButton();
        jfour = new javax.swing.JButton();
        jfive = new javax.swing.JButton();
        jsix = new javax.swing.JButton();
        jclear = new javax.swing.JButton();
        jseven = new javax.swing.JButton();
        jeight = new javax.swing.JButton();
        jnine = new javax.swing.JButton();
        jenter = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jzero = new javax.swing.JButton();
        jdeposit2 = new javax.swing.JButton();
        jwithdrawl = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextLoan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextYear = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextAmount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabelMon = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jdepositeL = new javax.swing.JLabel();
        jdep = new javax.swing.JTextField();
        jwithdeaw = new javax.swing.JLabel();
        jwit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jloan2 = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        jRec = new javax.swing.JButton();
        jexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        jbalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_project/rsz_arrow.png"))); // NOI18N
        jbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbalanceActionPerformed(evt);
            }
        });
        jPanel1.add(jbalance);

        jwithdraw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_project/rsz_arrow.png"))); // NOI18N
        jwithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jwithdrawActionPerformed(evt);
            }
        });
        jPanel1.add(jwithdraw);

        jPanel2.setBackground(new java.awt.Color(255, 222, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Loan");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Balance");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Deposit");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Withdraw");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addComponent(jdis))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel3.setLayout(new java.awt.GridLayout(2, 1));

        jloan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_project/left.png"))); // NOI18N
        jloan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloan1ActionPerformed(evt);
            }
        });
        jPanel3.add(jloan1);

        jdeposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_project/left.png"))); // NOI18N
        jdeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdepositActionPerformed(evt);
            }
        });
        jPanel3.add(jdeposit);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jPanel4.setLayout(new java.awt.GridLayout(4, 4, 1, 1));

        jone.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jone.setText("1");
        jone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joneActionPerformed(evt);
            }
        });
        jPanel4.add(jone);

        jtwo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtwo.setText("2");
        jtwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtwoActionPerformed(evt);
            }
        });
        jPanel4.add(jtwo);

        jthree.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jthree.setText("3");
        jthree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jthreeActionPerformed(evt);
            }
        });
        jPanel4.add(jthree);

        jcancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcancel.setText("cancel");
        jcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcancelActionPerformed(evt);
            }
        });
        jPanel4.add(jcancel);

        jfour.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jfour.setText("4");
        jfour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfourActionPerformed(evt);
            }
        });
        jPanel4.add(jfour);

        jfive.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jfive.setText("5");
        jfive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfiveActionPerformed(evt);
            }
        });
        jPanel4.add(jfive);

        jsix.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jsix.setText("6");
        jsix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsixActionPerformed(evt);
            }
        });
        jPanel4.add(jsix);

        jclear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jclear.setText("clear");
        jclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jclearActionPerformed(evt);
            }
        });
        jPanel4.add(jclear);

        jseven.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jseven.setText("7");
        jseven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsevenActionPerformed(evt);
            }
        });
        jPanel4.add(jseven);

        jeight.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jeight.setText("8");
        jeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeightActionPerformed(evt);
            }
        });
        jPanel4.add(jeight);

        jnine.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jnine.setText("9");
        jnine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnineActionPerformed(evt);
            }
        });
        jPanel4.add(jnine);

        jenter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jenter.setText("Enter");
        jenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenterActionPerformed(evt);
            }
        });
        jPanel4.add(jenter);
        jPanel4.add(jButton28);

        jzero.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jzero.setText("0");
        jzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jzeroActionPerformed(evt);
            }
        });
        jPanel4.add(jzero);

        jdeposit2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jdeposit2.setText("Deposit");
        jdeposit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeposit2ActionPerformed(evt);
            }
        });
        jPanel4.add(jdeposit2);

        jwithdrawl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jwithdrawl.setText("Withdrawal");
        jwithdrawl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jwithdrawlActionPerformed(evt);
            }
        });
        jPanel4.add(jwithdrawl);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel6.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel6.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Interest rate :");

        jTextLoan.setMaximumSize(new java.awt.Dimension(4, 2));
        jTextLoan.setMinimumSize(new java.awt.Dimension(4, 2));
        jTextLoan.setPreferredSize(new java.awt.Dimension(4, 2));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Number of Years :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Amount of Loan :");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Monthly payment :");

        jTextAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAmountActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Total payment :");

        jLabelMon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMon.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jdepositeL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jdepositeL.setText("Deposit :");

        jwithdeaw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jwithdeaw.setText("Withdrawal :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(jTextLoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jdepositeL, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jdep)
                                .addComponent(jLabelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jwithdeaw, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jwit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(jTextYear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(141, 141, 141))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jdepositeL, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jwithdeaw, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jwit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTextArea.setColumns(20);
        jTextArea.setFont(new java.awt.Font("Courier New", 1, 15)); // NOI18N
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        jloan2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jloan2.setText("Calculate_Loan");
        jloan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloan2ActionPerformed(evt);
            }
        });

        jreset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jreset.setText("Reset");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });

        jRec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jRec.setText("Receipt");
        jRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRecActionPerformed(evt);
            }
        });

        jexit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jexit.setText("Exit");
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jloan2)
                        .addGap(18, 18, 18)
                        .addComponent(jreset)
                        .addGap(18, 18, 18)
                        .addComponent(jRec, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jexit))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jloan2)
                    .addComponent(jreset)
                    .addComponent(jRec)
                    .addComponent(jexit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 319, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void joneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joneActionPerformed
        make_button_on("1");    
    }//GEN-LAST:event_joneActionPerformed

    private void jtwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtwoActionPerformed
        // TODO add your handling code here:
        make_button_on("2");
    }//GEN-LAST:event_jtwoActionPerformed

    private void jthreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jthreeActionPerformed
        // TODO add your handling code here:
        make_button_on("3");
    }//GEN-LAST:event_jthreeActionPerformed

    private void jfourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfourActionPerformed
        // TODO add your handling code here:
        make_button_on("4");
    }//GEN-LAST:event_jfourActionPerformed

    private void jfiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfiveActionPerformed
        // TODO add your handling code here:
        make_button_on("5");
    }//GEN-LAST:event_jfiveActionPerformed

    private void jsixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsixActionPerformed
        // TODO add your handling code here:
        make_button_on("6");
    }//GEN-LAST:event_jsixActionPerformed

    private void jsevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsevenActionPerformed
        // TODO add your handling code here:
        make_button_on("7");
    }//GEN-LAST:event_jsevenActionPerformed

    private void jeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeightActionPerformed
        // TODO add your handling code here:
        make_button_on("8");
    }//GEN-LAST:event_jeightActionPerformed

    private void jnineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnineActionPerformed
        // TODO add your handling code here:
        make_button_on("9");
    }//GEN-LAST:event_jnineActionPerformed

    private void jzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jzeroActionPerformed
        // TODO add your handling code here:
        make_button_on("0");
    }//GEN-LAST:event_jzeroActionPerformed

    private void jclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jclearActionPerformed
        // TODO add your handling code here:
        jdis.setText("");
        jTextArea.setText("");
        jdep.setText("");
        jwit.setText("");
    }//GEN-LAST:event_jclearActionPerformed

    private void jloan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloan1ActionPerformed
        // TODO add your handling code here:
        jTextAmount.setEnabled(true);
        jTextYear.setEnabled(true);
        jloan2.setEnabled(true);
        jTextLoan.setEnabled(true);
        jRec.setEnabled(true);
        jreset.setEnabled(true);
        jexit.setEnabled(true);
        jTextLoan.setEnabled(true);      
    }//GEN-LAST:event_jloan1ActionPerformed

    private void jTextAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAmountActionPerformed

    private void jloan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloan2ActionPerformed
        // TODO add your handling code here:
        double Interest_rate=Double.parseDouble(jTextLoan.getText());
        double mon_Interest_rate=Interest_rate /1200;
        int num_of_years=Integer.parseInt(jTextYear.getText());
        double amount_loan =Double.parseDouble(jTextAmount.getText());
        double mon_payment=amount_loan*mon_Interest_rate/(1-1/Math.pow(1+mon_Interest_rate,num_of_years*12));
        String monthly_payment="";
        monthly_payment=Double.toString(mon_payment);
        monthly_payment=String.format("$%.2f", mon_payment);
        jLabelMon.setText(monthly_payment);
        double total_payment=mon_payment*num_of_years*12;
        String total=String.format("$%.2f",total_payment);
        jLabelTotal.setText(total);  
    }//GEN-LAST:event_jloan2ActionPerformed

    private void jRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRecActionPerformed
        // TODO add your handling code here:
        jTextArea.setText("");
        String interest_rate=String.format(jTextLoan.getText());
        String num_of_years=String.format(jTextYear.getText());
        String amount_loan=String.format(jTextAmount.getText());
        String mon_pay=String.format(jLabelMon.getText());
        String total=String.format(jLabelTotal.getText());
        Calendar timer= Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat time=new SimpleDateFormat("HH:mm:ss");
        time.format(timer.getTime());
        SimpleDateFormat date=new SimpleDateFormat("dd:MM:yy");
        date.format(timer.getTime());
        jTextArea.append("\tLoan Management System\n"+
                "\n===================================\t"+
                "\n Interest rate:\t\t\t"+interest_rate+
                "\n payment years:\t\t\t"+num_of_years+
                "\n Amount of Loan:\t\t"+amount_loan+
                "\n Monthly payment:\t\t"+mon_pay+
                "\n Total payment:\t\t\t"+total+
                
                "\n====================================\t"+
                "\n Date:\t"+date.format(timer.getTime())+
                "\n Time :\t"+time.format(timer.getTime())+
                "\n\n\t\t  Thank you\n");       
    }//GEN-LAST:event_jRecActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jloan2.setEnabled(false);
        jRec.setEnabled(false);
        jreset.setEnabled(false);
        jexit.setEnabled(false);
        jbalance.setEnabled(false);
        jloan1.setEnabled(false);
        jwithdraw.setEnabled(false);
        jdeposit.setEnabled(false);
        jTextAmount.setEnabled(false);
        jTextYear.setEnabled(false);
        jloan2.setEnabled(false);
        jTextLoan.setEnabled(false);
        jdep.setEnabled(false);
        jwit.setEnabled(false);
        jTextArea.setEnabled(false);
        jwithdrawl.setEnabled(false);
        jdeposit2.setEnabled(false);
        
    }//GEN-LAST:event_formWindowActivated
int c=0;
    private void jenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenterActionPerformed

        try {
            jTextArea.setText("");
            jTextArea.setEnabled(true);
           if(my_project.My_project.db.Login(jdis.getText()))
           {set_vis();}
           else{
               jTextArea.setText("\t\t\tInvalid");
               c++;
               jTextArea.setText(" Becareful you Enter a wrong password \n   for "+c+" time from"+" 3 times ");
               if(c==3){
                {System.exit(0);
        
                    }}
           }
       } catch (SQLException ex) {System.out.println("error in catch in enter button");}       
    }//GEN-LAST:event_jenterActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
        // TODO add your handling code here:
        jTextArea.setText("");
        jTextLoan.setText("");
        jTextAmount.setText("");
        jTextYear.setText("");
        jLabelMon.setText("");
        jLabelTotal.setText("");
    }//GEN-LAST:event_jresetActionPerformed
    private JFrame frame;
    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
        frame =new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "really want to exit","Loan management System",JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_NO_OPTION){System.exit(0);}
    }//GEN-LAST:event_jexitActionPerformed

    private void jcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcancelActionPerformed
        // TODO add your handling code here:
        frame =new JFrame("Exit");
        jdis.setText("");
        jTextArea.setText("");
        if (JOptionPane.showConfirmDialog(frame, "really want to exit","ATM management System",JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_NO_OPTION){System.exit(0);}
        
    }//GEN-LAST:event_jcancelActionPerformed

    private void jbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbalanceActionPerformed
       ResultSet res;
       try {
           res = my_project.My_project.db.select_data(jdis.getText());
           while(res.next()){
                jTextArea.setText(" username :"+res.getString("username")+"\n\n"+" Acount Type :"+res.getString("account_name")
                +"\n\n"+" Balance :"+res.getString("amount_of_money"));
            }
       } catch (SQLException ex) {
           System.out.println("error while connecting database");
       }
       
    }//GEN-LAST:event_jbalanceActionPerformed

    private void jdepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdepositActionPerformed
        // TODO add your handling code here:
        jdep.setEnabled(true);
        jdeposit2.setEnabled(true);
    }//GEN-LAST:event_jdepositActionPerformed

    private void jdeposit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeposit2ActionPerformed
       try {
           // TODO add your handling code here:
           my_project.My_project.db.Update_to_deposit(jdis.getText(),jdep.getText());
       } catch (SQLException ex) {
           System.out.println("error in update");
       }
    }//GEN-LAST:event_jdeposit2ActionPerformed

    private void jwithdrawlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jwithdrawlActionPerformed
        try {
            // TODO add your handling code here:
            my_project.My_project.db.Update_to_withdrawl(jdis.getText(),jwit.getText());
        } catch (SQLException ex) {
            System.out.println("error thougth update withdarwl");
        }
    }//GEN-LAST:event_jwithdrawlActionPerformed

    private void jwithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jwithdrawActionPerformed
        jwit.setEnabled(true);
        jwithdrawl.setEnabled(true);
    }//GEN-LAST:event_jwithdrawActionPerformed

    public void show(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ATMGUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMGUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMGUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMGUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMGUi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton28;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMon;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jRec;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextAmount;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextLoan;
    private javax.swing.JTextField jTextYear;
    private javax.swing.JButton jbalance;
    private javax.swing.JButton jcancel;
    private javax.swing.JButton jclear;
    private javax.swing.JTextField jdep;
    private javax.swing.JButton jdeposit;
    private javax.swing.JButton jdeposit2;
    private javax.swing.JLabel jdepositeL;
    private javax.swing.JPasswordField jdis;
    private javax.swing.JButton jeight;
    private javax.swing.JButton jenter;
    private javax.swing.JButton jexit;
    private javax.swing.JButton jfive;
    private javax.swing.JButton jfour;
    private javax.swing.JButton jloan1;
    private javax.swing.JButton jloan2;
    private javax.swing.JButton jnine;
    private javax.swing.JButton jone;
    private javax.swing.JButton jreset;
    private javax.swing.JButton jseven;
    private javax.swing.JButton jsix;
    private javax.swing.JButton jthree;
    private javax.swing.JButton jtwo;
    private javax.swing.JTextField jwit;
    private javax.swing.JLabel jwithdeaw;
    private javax.swing.JButton jwithdraw;
    private javax.swing.JButton jwithdrawl;
    private javax.swing.JButton jzero;
    // End of variables declaration//GEN-END:variables
}
