/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.Timer;

public class LoginFrame extends javax.swing.JFrame {
    
    Connection Conn,Conn1=null;
    ResultSet rs,rs1=null;
    PreparedStatement Pst=null;
    PreparedStatement Pst1=null;
     PreparedStatement Pst2=null;
    public  int i,temp=0,mark=0,v,counterflag1=0,counterflag2=0,counterflag3=0;
    String[] question1=new String[25];
    String[] option1=new String[25];
    String[] option2=new String[25];
    String[] option3=new String[25];
    String[] option4=new String[25];
    String[] answer=new String[25];
    String selectedans[]=new String[25]; 
    String sql1,sql2,sql3,sql4,option,takenusername,takenname,takenmobile,user,tempnull="null";
    String sql[]=new String[25];
    public static int m=15,s=60;
    public Timer t;

    
    public LoginFrame() {
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);   
        
        initComponents();
        
        Conn=JavaConnect.ConnecrDb();
        
        this.setTitle("QUIZZLERS LOGIN");
        this.setLocationRelativeTo(null);
        t=new Timer(1000,new timer());
    }
    
      public class timer implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            String sec;
          
            
            if(s>0 )
            {
                s--;
                 sec=(s<10?"0":"")+s;
                secs.setText(""+sec);
                if(s==59)
                {
                      m--;
                      String min=(m<10?"0":"")+m;
                    mins.setText(""+min);
                }
            }
            else
                if(s==0 && m==0)
                {
                    t.stop();
                   m=15;s=60; 
                   checkanswer();
                
                }
                else
                {
                    s--;
                    sec=(s<10?"0":"")+s;
                    secs.setText(""+sec);
                    s=59;
                    sec=(s<10?"0":"")+s;
                    secs.setText(""+sec);
                if(m>0)
                {
                    m--;
                   
                    if(m==4)
                    {
                        //time_panel.setBackground(Color.YELLOW);
                        mins.setForeground(Color.yellow);
                        secs.setForeground(Color.yellow);
                        div.setForeground(Color.yellow);
                    }
                    else if(m==1)
                    {
                        //time_panel.setBackground(Color.red);
                        mins.setForeground(Color.red);
                        secs.setForeground(Color.red);
                        div.setForeground(Color.red);
                    }
                    
                    String min=(m<10?"0":"")+m;
                    mins.setText(""+min);
                }
                
            }
            
        }

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuestionFrame = new javax.swing.JFrame();
        time_panel = new javax.swing.JPanel();
        secs = new javax.swing.JLabel();
        mins = new javax.swing.JLabel();
        div = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        optiona = new javax.swing.JRadioButton();
        optionb = new javax.swing.JRadioButton();
        optionc = new javax.swing.JRadioButton();
        optiond = new javax.swing.JRadioButton();
        j1 = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        j7 = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        j8 = new javax.swing.JButton();
        j9 = new javax.swing.JButton();
        j10 = new javax.swing.JButton();
        j11 = new javax.swing.JButton();
        j16 = new javax.swing.JButton();
        j19 = new javax.swing.JButton();
        j20 = new javax.swing.JButton();
        j12 = new javax.swing.JButton();
        j13 = new javax.swing.JButton();
        j14 = new javax.swing.JButton();
        j15 = new javax.swing.JButton();
        j17 = new javax.swing.JButton();
        j18 = new javax.swing.JButton();
        submit_button = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        next_button = new javax.swing.JButton();
        status_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ques = new javax.swing.JTextArea();
        resetbutton = new javax.swing.JButton();
        RulesFrame = new javax.swing.JFrame();
        rules_panel = new javax.swing.JPanel();
        rule1 = new javax.swing.JLabel();
        rule2 = new javax.swing.JLabel();
        rule3 = new javax.swing.JLabel();
        rule4 = new javax.swing.JLabel();
        rule5 = new javax.swing.JLabel();
        Rules_ok_button = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        ResultFrame = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        lastusername1 = new javax.swing.JTextField();
        lastsubmit = new javax.swing.JButton();
        lastattempted = new javax.swing.JTextField();
        lastskipped = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lastmarks1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        login_panel = new javax.swing.JPanel();
        txt_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_login = new javax.swing.JButton();
        reset_button = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bq = new javax.swing.JLabel();

        QuestionFrame.setBackground(new java.awt.Color(255, 255, 255));
        QuestionFrame.setMinimumSize(new java.awt.Dimension(1370, 770));

        time_panel.setBackground(new java.awt.Color(102, 102, 102));

        secs.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        secs.setForeground(new java.awt.Color(255, 255, 255));

        mins.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mins.setForeground(new java.awt.Color(255, 255, 255));

        div.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        div.setForeground(new java.awt.Color(204, 204, 204));
        div.setText(":");

        javax.swing.GroupLayout time_panelLayout = new javax.swing.GroupLayout(time_panel);
        time_panel.setLayout(time_panelLayout);
        time_panelLayout.setHorizontalGroup(
            time_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, time_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mins, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secs, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        time_panelLayout.setVerticalGroup(
            time_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(secs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Questions:");

        optiona.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(optiona);
        optiona.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        optiona.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                optionaStateChanged(evt);
            }
        });
        optiona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionaActionPerformed(evt);
            }
        });

        optionb.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(optionb);
        optionb.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        optionb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionbActionPerformed(evt);
            }
        });

        optionc.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(optionc);
        optionc.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        optionc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optioncActionPerformed(evt);
            }
        });

        optiond.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(optiond);
        optiond.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        optiond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optiondActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optiona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optionb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optionc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optiond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(optiona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(optionb)
                .addGap(29, 29, 29)
                .addComponent(optionc, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(optiond)
                .addGap(15, 15, 15))
        );

        j1.setBackground(new java.awt.Color(255, 255, 255));
        j1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j1.setText("1");
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });

        j2.setBackground(new java.awt.Color(255, 255, 255));
        j2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j2.setText("2");
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });

        j3.setBackground(new java.awt.Color(255, 255, 255));
        j3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j3.setText("3");
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });

        j4.setBackground(new java.awt.Color(255, 255, 255));
        j4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j4.setText("4");
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });

        j6.setBackground(new java.awt.Color(255, 255, 255));
        j6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j6.setText("6");
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });

        j7.setBackground(new java.awt.Color(255, 255, 255));
        j7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j7.setText("7");
        j7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7ActionPerformed(evt);
            }
        });

        j5.setBackground(new java.awt.Color(255, 255, 255));
        j5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j5.setText("5");
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });

        j8.setBackground(new java.awt.Color(255, 255, 255));
        j8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j8.setText("8");
        j8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8ActionPerformed(evt);
            }
        });

        j9.setBackground(new java.awt.Color(255, 255, 255));
        j9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j9.setText("9");
        j9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9ActionPerformed(evt);
            }
        });

        j10.setBackground(new java.awt.Color(255, 255, 255));
        j10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j10.setText("10");
        j10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j10ActionPerformed(evt);
            }
        });

        j11.setBackground(new java.awt.Color(255, 255, 255));
        j11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j11.setText("11");
        j11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j11ActionPerformed(evt);
            }
        });

        j16.setBackground(new java.awt.Color(255, 255, 255));
        j16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j16.setText("16");
        j16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j16ActionPerformed(evt);
            }
        });

        j19.setBackground(new java.awt.Color(255, 255, 255));
        j19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j19.setText("19");
        j19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j19ActionPerformed(evt);
            }
        });

        j20.setBackground(new java.awt.Color(255, 255, 255));
        j20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j20.setText("20");
        j20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j20ActionPerformed(evt);
            }
        });

        j12.setBackground(new java.awt.Color(255, 255, 255));
        j12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j12.setText("12");
        j12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j12ActionPerformed(evt);
            }
        });

        j13.setBackground(new java.awt.Color(255, 255, 255));
        j13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j13.setText("13");
        j13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j13ActionPerformed(evt);
            }
        });

        j14.setBackground(new java.awt.Color(255, 255, 255));
        j14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j14.setText("14");
        j14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j14ActionPerformed(evt);
            }
        });

        j15.setBackground(new java.awt.Color(255, 255, 255));
        j15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j15.setText("15");
        j15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j15ActionPerformed(evt);
            }
        });

        j17.setBackground(new java.awt.Color(255, 255, 255));
        j17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j17.setText("17");
        j17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j17ActionPerformed(evt);
            }
        });

        j18.setBackground(new java.awt.Color(255, 255, 255));
        j18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        j18.setText("18");
        j18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j18ActionPerformed(evt);
            }
        });

        submit_button.setBackground(new java.awt.Color(255, 255, 255));
        submit_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submit_button.setForeground(new java.awt.Color(0, 102, 102));
        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        prev.setBackground(new java.awt.Color(255, 255, 255));
        prev.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        prev.setForeground(new java.awt.Color(0, 102, 102));
        prev.setText("Prev");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        next_button.setBackground(new java.awt.Color(255, 255, 255));
        next_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        next_button.setForeground(new java.awt.Color(0, 102, 102));
        next_button.setText("Next");
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });

        status_label.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        ques.setEditable(false);
        ques.setBackground(new java.awt.Color(204, 204, 204));
        ques.setColumns(15);
        ques.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        ques.setRows(5);
        ques.setTabSize(5);
        ques.setToolTipText("questions");
        ques.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Button.background")));
        ques.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        ques.setFocusable(false);
        ques.setMargin(new java.awt.Insets(5, 4, 2, 2));
        jScrollPane1.setViewportView(ques);

        resetbutton.setBackground(new java.awt.Color(255, 255, 255));
        resetbutton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        resetbutton.setForeground(new java.awt.Color(0, 102, 102));
        resetbutton.setText("Reset");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout QuestionFrameLayout = new javax.swing.GroupLayout(QuestionFrame.getContentPane());
        QuestionFrame.getContentPane().setLayout(QuestionFrameLayout);
        QuestionFrameLayout.setHorizontalGroup(
            QuestionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuestionFrameLayout.createSequentialGroup()
                .addGroup(QuestionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(QuestionFrameLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(QuestionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(QuestionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(QuestionFrameLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(time_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuestionFrameLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(QuestionFrameLayout.createSequentialGroup()
                        .addGap(0, 75, Short.MAX_VALUE)
                        .addGroup(QuestionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(status_label, javax.swing.GroupLayout.PREFERRED_SIZE, 1013, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(QuestionFrameLayout.createSequentialGroup()
                                .addGroup(QuestionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(QuestionFrameLayout.createSequentialGroup()
                                        .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(next_button, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(QuestionFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(j1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(j3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(j4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j10)
                                .addGap(14, 14, 14)
                                .addComponent(j11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j18)
                                .addGap(10, 10, 10)
                                .addComponent(j19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(j20)))))
                .addGap(92, 92, 92))
        );
        QuestionFrameLayout.setVerticalGroup(
            QuestionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestionFrameLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(QuestionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(status_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(QuestionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuestionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(next_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(QuestionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        RulesFrame.setMinimumSize(new java.awt.Dimension(1370, 750));
        RulesFrame.setSize(new java.awt.Dimension(0, 0));

        rules_panel.setBackground(new java.awt.Color(255, 255, 255));
        rules_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true), "RULES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 36), new java.awt.Color(0, 102, 102))); // NOI18N
        rules_panel.setMaximumSize(new java.awt.Dimension(1400, 700));
        rules_panel.setMinimumSize(new java.awt.Dimension(1400, 700));
        rules_panel.setPreferredSize(new java.awt.Dimension(1400, 700));

        rule1.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        rule1.setForeground(new java.awt.Color(51, 0, 51));
        rule1.setText("•\tTotal time for Quiz is 15 minutes.");

        rule2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        rule2.setForeground(new java.awt.Color(51, 0, 51));
        rule2.setText("•\tQuiz contains total of 20 Multiple Choice Questions each question has 2 marks.");

        rule3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        rule3.setForeground(new java.awt.Color(51, 0, 51));
        rule3.setText("•\tThere will be half negative marking for every wrong answer.(1 mark will be deducted).");

        rule4.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        rule4.setForeground(new java.awt.Color(51, 0, 51));
        rule4.setText("•\tAny Computing Devices are not allowed for the Quiz.");

        rule5.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        rule5.setForeground(new java.awt.Color(51, 0, 51));
        rule5.setText("•\tRefreshing of the session page and minimizing of the Web App is not allowed.");

        javax.swing.GroupLayout rules_panelLayout = new javax.swing.GroupLayout(rules_panel);
        rules_panel.setLayout(rules_panelLayout);
        rules_panelLayout.setHorizontalGroup(
            rules_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rules_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(rules_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rule5, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rules_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rule4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rule3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rule1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(rules_panelLayout.createSequentialGroup()
                            .addComponent(rule2, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 55, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rules_panelLayout.setVerticalGroup(
            rules_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rules_panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(rule1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(rule2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(rule3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(rule4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(rule5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Rules_ok_button.setBackground(new java.awt.Color(255, 255, 255));
        Rules_ok_button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Rules_ok_button.setForeground(new java.awt.Color(0, 102, 102));
        Rules_ok_button.setText("Agree");
        Rules_ok_button.setMaximumSize(new java.awt.Dimension(1400, 700));
        Rules_ok_button.setMinimumSize(new java.awt.Dimension(1400, 700));
        Rules_ok_button.setPreferredSize(new java.awt.Dimension(1400, 700));
        Rules_ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rules_ok_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RulesFrameLayout = new javax.swing.GroupLayout(RulesFrame.getContentPane());
        RulesFrame.getContentPane().setLayout(RulesFrameLayout);
        RulesFrameLayout.setHorizontalGroup(
            RulesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RulesFrameLayout.createSequentialGroup()
                .addGroup(RulesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RulesFrameLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(rules_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RulesFrameLayout.createSequentialGroup()
                        .addGap(619, 619, 619)
                        .addComponent(Rules_ok_button, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2746, Short.MAX_VALUE))
        );
        RulesFrameLayout.setVerticalGroup(
            RulesFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RulesFrameLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(rules_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Rules_ok_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1958, Short.MAX_VALUE))
        );

        ResultFrame.setLocation(new java.awt.Point(320, 130));
        ResultFrame.setMinimumSize(new java.awt.Dimension(700, 500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lastusername1.setEditable(false);
        lastusername1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lastusername1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastusername1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        lastusername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastusername1ActionPerformed(evt);
            }
        });

        lastsubmit.setBackground(new java.awt.Color(255, 255, 255));
        lastsubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lastsubmit.setForeground(new java.awt.Color(0, 102, 102));
        lastsubmit.setText("Exit");
        lastsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastsubmitActionPerformed(evt);
            }
        });

        lastattempted.setEditable(false);
        lastattempted.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lastattempted.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastattempted.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        lastattempted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastattemptedActionPerformed(evt);
            }
        });

        lastskipped.setEditable(false);
        lastskipped.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lastskipped.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastskipped.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        lastskipped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastskippedActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Total Marks");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Skipped Question");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Name");

        lastmarks1.setEditable(false);
        lastmarks1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lastmarks1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastmarks1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        lastmarks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastmarks1ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Attempted Question");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lastsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastmarks1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastusername1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastattempted, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastskipped, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastusername1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastmarks1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastattempted, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastskipped, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(lastsubmit)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Score:");

        javax.swing.GroupLayout ResultFrameLayout = new javax.swing.GroupLayout(ResultFrame.getContentPane());
        ResultFrame.getContentPane().setLayout(ResultFrameLayout);
        ResultFrameLayout.setHorizontalGroup(
            ResultFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultFrameLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(ResultFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );
        ResultFrameLayout.setVerticalGroup(
            ResultFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultFrameLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jLabel10.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("AISSMS College Of Engineering, Pune");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setMinimumSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        login_panel.setBackground(new java.awt.Color(0, 153, 153));
        login_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 5, true));
        login_panel.setForeground(new java.awt.Color(0, 51, 51));

        txt_password.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        txt_password.setName(""); // NOI18N
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("    Password:");

        txt_username.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("    Username:");

        txt_login.setBackground(new java.awt.Color(255, 255, 255));
        txt_login.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txt_login.setForeground(new java.awt.Color(0, 102, 102));
        txt_login.setText("Login");
        txt_login.setBorder(null);
        txt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_loginActionPerformed(evt);
            }
        });

        reset_button.setBackground(new java.awt.Color(255, 255, 255));
        reset_button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        reset_button.setForeground(new java.awt.Color(0, 102, 102));
        reset_button.setText("Reset");
        reset_button.setBorder(null);
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        mob.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mob.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mob.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 1, true));
        mob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobActionPerformed(evt);
            }
        });
        mob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 153));
        jLabel8.setText("    Name:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 153));
        jLabel9.setText("    Mobile No:");

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(login_panelLayout.createSequentialGroup()
                        .addComponent(reset_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(txt_password, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mob, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(45, 45, 45))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mob, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        getContentPane().add(login_panel);
        login_panel.setBounds(430, 220, 560, 400);

        jLabel11.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 255, 153));
        jLabel11.setText("Welcome To Quizzlers");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(490, 130, 550, 50);

        jLabel12.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("AISSMS College Of Engineering, Pune");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(190, 40, 980, 80);

        bq.setBackground(new java.awt.Color(51, 153, 255));
        bq.setForeground(new java.awt.Color(255, 255, 255));
        bq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/r1fMFxw.jpg"))); // NOI18N
        getContentPane().add(bq);
        bq.setBounds(0, 0, 1370, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_loginActionPerformed
         
        try
        {
            String sql="Select * from login_info where user_name=? and password=? ";
                Pst=Conn.prepareStatement(sql);
                
                Pst.setString(1,txt_username.getText());
                Pst.setString(2,txt_password.getText());
              
               rs=Pst.executeQuery();
            
                if(rs.next() && rs.getInt("status")==0)
                {
                        
                        
                    
                    takenusername=txt_username.getText();
                    String sql1= "update login_info set status =1 where user_name ='"+ takenusername+"' ";
                    Pst1=Conn.prepareStatement(sql1);
                    Pst1.executeUpdate();
                    
                    takenname=name.getText();
                    String sql2= "update login_info set name = '"+takenname+"' where user_name ='"+ takenusername+"' ";
                    Pst1=Conn.prepareStatement(sql2);
                    Pst1.executeUpdate();
                    
                    takenmobile=mob.getText();
                    String sql3= "update login_info set mobile_no = '"+takenmobile+"' where user_name ='"+ takenusername+"' ";
                    Pst1=Conn.prepareStatement(sql3);
                    Pst1.executeUpdate();
                    
                    setVisible(false);
                    RulesFrame.setVisible(true);
                    RulesFrame.setTitle("RULES");
                    RulesFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
               }  
               else
               {
                   
                   try
                   {
                       if(rs.getInt("status")==1)
                       {
                           JOptionPane.showMessageDialog(null,"Already Given The Exam");
                       }
                   }
                   catch(Exception e)
                   {
                        JOptionPane.showMessageDialog(null,"Username and Password is Incorrect");
                   }
               }
                   
        }
        catch(Exception e)
        {
                JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_txt_loginActionPerformed
    
    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
     
    /*    
        
     if(evt.getKeyCode()==KeyEvent.VK_ENTER)
     {
         String sql="Select * from login_info where user_name=? and password=? ";
        
        try
        {
                Pst=Conn.prepareStatement(sql);
                
                Pst.setString(1,txt_username.getText());
                Pst.setString(2,txt_password.getText());
        
               
                rs=Pst.executeQuery();
                
               if(rs.next() && rs.getInt("status")==0)
               {
                    takenusername=txt_username.getText();
                    String sql1= "update login_info set status = '1' where user_name ='"+ takenusername+"' ";
                    Pst1=Conn.prepareStatement(sql1);
                    Pst1.executeUpdate();
                
                    takenname=name.getText();
                    String sql2= "update login_info set name = '"+takenname+"' where user_name ='"+ takenusername+"' ";
                    Pst1=Conn.prepareStatement(sql2);
                    Pst1.executeUpdate();
                    
                    takenmobile=mob.getText();
                    String sql3= "update login_info set mobile_no = '"+takenmobile+"' where user_name ='"+ takenusername+"' ";
                    Pst1=Conn.prepareStatement(sql3);
                    Pst1.executeUpdate();
                    
                    setVisible(false);
                    RulesFrame.setVisible(true);
                    RulesFrame.setTitle("RULES");
                    RulesFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
           
                }  
               else
               {
                   try
                   {
                       if(rs.getInt("status")==1)
                       {
                           JOptionPane.showMessageDialog(null,"Already Given The Exam");
                       }
                   }
                   catch(Exception e)
                   {
                        JOptionPane.showMessageDialog(null,"Username and Password is Incorrect");
                   }
               }
                
        }
        catch(Exception e)
        {
                JOptionPane.showMessageDialog(null,e);
        }
    }
        */
    }//GEN-LAST:event_txt_passwordKeyPressed
       
    public  void getdata(String sql1,int srno)
        {
        try
                    {
                          
                           
                          
                         Pst=Conn.prepareStatement(sql1);                       
                         rs=Pst.executeQuery();
                      
                         while(rs.next()){
         
                              
                              question1[srno]= rs.getString("ques");
                              option1[srno] = rs.getString("option1");
                              option2[srno] = rs.getString("option2");
                              option3[srno] = rs.getString("option3");
                              option4[srno] = rs.getString("option4");
                              answer[srno]=rs.getString("answer");
                   
                      }
                        
                      
                    }
                    catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,e);
                    }
        }
    
    void setdata(String q,String a, String b,String c,String d,int srno)
    {
                 
                            ques.setText(srno+".  "+q);
                            optiona.setText(a);
                            optionb.setText(b);
                            optionc.setText(c);
                            optiond.setText(d);
                         

    }
    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
             txt_password.setText("");
             txt_username.setText("");
             name.setText("");
             mob.setText("");
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void Rules_ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rules_ok_buttonActionPerformed
                    
                    QuestionFrame.setVisible(true);
                    RulesFrame.setVisible(false);
                    QuestionFrame.setTitle("MCQ QUIZ APPLICATION");
                    
                    mins.setText("15");
                    secs.setText("00");
                    m=15;
                    s=60;
                    
                    //time_panel.setBackground(Color.GREEN);
                    mins.setForeground(Color.green);
                    secs.setForeground(Color.green);
                    div.setForeground(Color.green);
                    
                    t.start();
                    
                    for(v=0;v<20;v++)
                    {
                        selectedans[v]="null";
                    }
                   for(i=0;i<20;i++)
                    {
                         if(i<=6)
                         sql[i]="Select ques,option1,option2,option3,option4,answer from easy_question order by rand() limit 1";
                         
                         if(i>=7&&i<=13)
                             sql[i]="Select ques,option1,option2,option3,option4,answer from medium_question order by rand() limit 1";
                         
                         if(i>=14&&i<=19)
                             sql[i]="Select ques,option1,option2,option3,option4,answer from hard_question order by rand() limit 1";
                    }
                   for(int j=0;j<20;j++)
                   {
                       getdata(sql[j],j);
                   }
                 
                   getstate(0);
                   clean();
                   setdata(question1[0],option1[0],option2[0],option3[0],option4[0],1);
                 
                 
                                    
                    
    }//GEN-LAST:event_Rules_ok_buttonActionPerformed

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed

           try
           {
               int p=JOptionPane.showConfirmDialog(null, "ARE YOU SURE WANT TO SUBMIT", "Confirmation",JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
           t.stop();
           checkanswer();
            
           
           
        } 
           }
           catch(Exception e)
           {
               JOptionPane.showMessageDialog(null,e);
           }
       
        
        
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void j18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j18ActionPerformed
        clean();
        // setdata(sql[18],18);// TODO add your handling code here:
        setdata(question1[17],option1[17],option2[17],option3[17],option4[17],18);
        temp=17;
        getstate(17);
    }//GEN-LAST:event_j18ActionPerformed

    private void j17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j17ActionPerformed
        clean();
        //setdata(sql[17],17);// TODO add your handling code here:
        setdata(question1[16],option1[16],option2[16],option3[16],option4[16],17);
        temp=16;
          getstate(16);
    }//GEN-LAST:event_j17ActionPerformed

    private void j15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j15ActionPerformed
        clean();
        //setdata(sql[15],15);// TODO add your handling code here:
        setdata(question1[14],option1[14],option2[14],option3[14],option4[14],15);
        temp=14;
          getstate(14);
    }//GEN-LAST:event_j15ActionPerformed

    private void j14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j14ActionPerformed
        clean();
        //setdata(sql[14],14);// TODO add your handling code here:
        setdata(question1[13],option1[13],option2[13],option3[13],option4[13],14);
        temp=13;
          getstate(13);
    }//GEN-LAST:event_j14ActionPerformed

    private void j13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j13ActionPerformed
        clean();
        //etdata(sql[13],13);// TODO add your handling code here:
        setdata(question1[12],option1[12],option2[12],option3[12],option4[12],13);
        temp=12;
          getstate(12);
    }//GEN-LAST:event_j13ActionPerformed

    private void j12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j12ActionPerformed
        clean();
        //setdata(sql[12],12);// TODO add your handling code here:
        setdata(question1[11],option1[11],option2[11],option3[11],option4[11],12);
        temp=11;
          getstate(11);
    }//GEN-LAST:event_j12ActionPerformed

    private void j20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j20ActionPerformed
        clean();
        setdata(question1[19],option1[19],option2[19],option3[19],option4[19],20);
        temp=19;
         getstate(19);
    }//GEN-LAST:event_j20ActionPerformed

    private void j19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j19ActionPerformed
        clean();
        //setdata(sql[19],19);// TODO add your handling code here:
        setdata(question1[18],option1[18],option2[18],option3[18],option4[18],19);
        temp=18;
          getstate(18);
    }//GEN-LAST:event_j19ActionPerformed

    private void j16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j16ActionPerformed
        clean();
        //setdata(sql[16],16);// TODO add your handling code here:
        setdata(question1[15],option1[15],option2[15],option3[15],option4[15],16);
        temp=15;
          getstate(15);
    }//GEN-LAST:event_j16ActionPerformed

    private void j11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j11ActionPerformed
        clean();
        //setdata(sql[11],11);// TODO add your handling code here:
        setdata(question1[10],option1[10],option2[10],option3[10],option4[10],11);
        temp=10;
          getstate(10);
    }//GEN-LAST:event_j11ActionPerformed

    private void j10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j10ActionPerformed
        clean();
        //setdata(sql[10],10);// TODO add your handling code here:
        setdata(question1[9],option1[9],option2[9],option3[9],option4[9],10);
        temp=9;
          getstate(9);
    }//GEN-LAST:event_j10ActionPerformed

    private void j9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9ActionPerformed
        clean();
        //setdata(sql[9],9);// TODO add your handling code here:
        setdata(question1[8],option1[8],option2[8],option3[8],option4[8],9);
        temp=8;
          getstate(8);
    }//GEN-LAST:event_j9ActionPerformed

    private void j8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8ActionPerformed
        clean();
        //setdata(sql[8],8);// TODO add your handling code here:
        setdata(question1[7],option1[7],option2[7],option3[7],option4[7],8);
        temp=7;
          getstate(7);
    }//GEN-LAST:event_j8ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
        clean();
        //setdata(sql[5],5);// TODO add your handling code here:
        setdata(question1[4],option1[4],option2[4],option3[4],option4[4],5);
        temp=4;
          getstate(4);
    }//GEN-LAST:event_j5ActionPerformed

    private void j7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7ActionPerformed
        clean();
        //setdata(sql[7],7);// TODO add your handling code here:
        setdata(question1[6],option1[6],option2[6],option3[6],option4[6],7);
        temp=6;
          getstate(6);
    }//GEN-LAST:event_j7ActionPerformed

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
        clean();
        //setdata(sql[6],6);// TODO add your handling code here:
        setdata(question1[5],option1[5],option2[5],option3[5],option4[5],6);
        temp=5;
          getstate(5);
    }//GEN-LAST:event_j6ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
        clean();
        setdata(question1[3],option1[3],option2[3],option3[3],option4[3],4);
        temp=3;
          getstate(3);

    }//GEN-LAST:event_j4ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
        clean();

        setdata(question1[2],option1[2],option2[2],option3[2],option4[2],3);
        temp=2;
          getstate(2);
    }//GEN-LAST:event_j3ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed

        clean();
        setdata(question1[1],option1[1],option2[1],option3[1],option4[1],2);
        temp=1;
          getstate(1);
    }//GEN-LAST:event_j2ActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
        clean();
        setdata(question1[0],option1[0],option2[0],option3[0],option4[0],1);
        temp=0;
          getstate(0);

    }//GEN-LAST:event_j1ActionPerformed

    public void getstate(int s)
    {
        if(selectedans[s].equals(tempnull))
        {
            optiona.setSelected(false);
                optionb.setSelected(false);
                    optionb.setSelected(false);   
                    optiond.setSelected(false);
                    status_label.setText("*****************");
        }
        else if(selectedans[s].equals(option1[s]))
        {
            optiona.setSelected(true);
            status_label.setText("You Selected: "+selectedans[s]);
        }
        else if(selectedans[s].equals(option2[s]))
        {
            optionb.setSelected(true);
            status_label.setText("You Selected: "+selectedans[s]);
        }
        else if(selectedans[s].equals(option3[s]))
        {
            optionc.setSelected(true);
            status_label.setText("You Selected: "+selectedans[s]);
        }
        else if(selectedans[s].equals(option4[s]))
        {
            optiond.setSelected(true);
            status_label.setText("You Selected: "+selectedans[s]);
        }
        
    }
    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_buttonActionPerformed
        clean();
        if(temp==19)
        {
              getstate(19);
        }
        else
        {
            temp++;
            setdata(question1[temp],option1[temp],option2[temp],option3[temp],option4[temp],temp+1);
            getstate(temp);
        }
    }//GEN-LAST:event_next_buttonActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
       clean();
        if(temp<=0)
        {
            getstate(0);
        }
        if(temp>=1)
        {
            temp--;
            setdata(question1[temp],option1[temp],option2[temp],option3[temp],option4[temp],temp+1);
            getstate(temp);
        }
    }//GEN-LAST:event_prevActionPerformed

    private void optiondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optiondActionPerformed

       option=optiond.getText();
       selectedans[temp]=option;
       getstate(temp);
       
    }//GEN-LAST:event_optiondActionPerformed

    private void optioncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optioncActionPerformed

        option=optionc.getText();
       selectedans[temp]=option;
       getstate(temp);
       
    }//GEN-LAST:event_optioncActionPerformed

    private void optionbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionbActionPerformed

        option=optionb.getText();
       selectedans[temp]=option;
       getstate(temp);
       
    }//GEN-LAST:event_optionbActionPerformed

    private void optionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionaActionPerformed

        option=optiona.getText();
       selectedans[temp]=option;
       getstate(temp);
      
    }//GEN-LAST:event_optionaActionPerformed

    private void optionaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_optionaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_optionaStateChanged

    private void lastmarks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastmarks1ActionPerformed
       
        
    }//GEN-LAST:event_lastmarks1ActionPerformed

    private void lastattemptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastattemptedActionPerformed
        
        
    }//GEN-LAST:event_lastattemptedActionPerformed

    private void lastskippedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastskippedActionPerformed
        
        
    }//GEN-LAST:event_lastskippedActionPerformed

    private void lastusername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastusername1ActionPerformed
        
        
    }//GEN-LAST:event_lastusername1ActionPerformed

    private void lastsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastsubmitActionPerformed
      setDefaultCloseOperation(ResultFrame.EXIT_ON_CLOSE);
        ResultFrame.setVisible(false);
        JOptionPane.showMessageDialog(null,"Thank You");
        txt_password.setText("");
        txt_username.setText("");
        name.setText("");
        mob.setText("");
         setVisible(true);
         mark=temp=0;
         counterflag1=counterflag2=counterflag3=0;
         for(int j=0;j<=20;j++)
         {
             question1[j]=option1[j]=option2[j]=option3[j]=option4[j]=selectedans[j]="null";
         }
    }//GEN-LAST:event_lastsubmitActionPerformed

    private void mobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobActionPerformed

    private void mobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobKeyTyped
        String txt=mob.getText();
        
        int len=txt.length();
        if(len<10)
        {
            char caracter = evt.getKeyChar();
                if(((caracter < '0') || (caracter > '9')) && (caracter != '\b'))
                {
                    evt.consume();
                }
        }
        else
        {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Enter a valid Mobile Number.");
        }
    }//GEN-LAST:event_mobKeyTyped

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
        // TODO add your handling code here:
        selectedans[temp]=tempnull;
        getstate(temp);
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_resetbuttonActionPerformed

   public void checkanswer()
    {  
        try
        {
            for(int k=0;k<20;k++)
            {
                if(selectedans[k].equals(tempnull))
                {
                    counterflag1++;
                }
                else if(selectedans[k].equals(answer[k]))
                {
                    mark=mark+2;
                }
                else 
                    mark--;
                
                if(mark<=0)
                {
                    mark=0;
                }
            }
            counterflag3=20-counterflag1;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        try
        {
            String sqlupdate="Update login_info set marks='"+mark+"' where user_name='"+takenusername+"'";
            
            Pst=Conn.prepareStatement(sqlupdate);
            Pst.executeUpdate();
            QuestionFrame.setVisible(false);
            QuestionFrame.dispose();
            ResultFrame.setTitle("User Result");
            ResultFrame.setVisible(true);
            ResultFrame.setResizable(false);
            lastusername1.setText(takenname);
            lastmarks1.setText(Integer.toString(mark));
            lastattempted.setText(Integer.toString(counterflag3));
            lastskipped.setText(Integer.toString(counterflag1));
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      
          
    public void clean() {
    buttonGroup1.clearSelection();
    
}
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame QuestionFrame;
    private javax.swing.JFrame ResultFrame;
    private javax.swing.JFrame RulesFrame;
    private javax.swing.JButton Rules_ok_button;
    private javax.swing.JLabel bq;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel div;
    private javax.swing.JButton j1;
    private javax.swing.JButton j10;
    private javax.swing.JButton j11;
    private javax.swing.JButton j12;
    private javax.swing.JButton j13;
    private javax.swing.JButton j14;
    private javax.swing.JButton j15;
    private javax.swing.JButton j16;
    private javax.swing.JButton j17;
    private javax.swing.JButton j18;
    private javax.swing.JButton j19;
    private javax.swing.JButton j2;
    private javax.swing.JButton j20;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JButton j7;
    private javax.swing.JButton j8;
    private javax.swing.JButton j9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastattempted;
    private javax.swing.JTextField lastmarks1;
    private javax.swing.JTextField lastskipped;
    private javax.swing.JButton lastsubmit;
    private javax.swing.JTextField lastusername1;
    private javax.swing.JPanel login_panel;
    private javax.swing.JLabel mins;
    private javax.swing.JTextField mob;
    private javax.swing.JTextField name;
    private javax.swing.JButton next_button;
    private javax.swing.JRadioButton optiona;
    private javax.swing.JRadioButton optionb;
    private javax.swing.JRadioButton optionc;
    private javax.swing.JRadioButton optiond;
    private javax.swing.JButton prev;
    private javax.swing.JTextArea ques;
    private javax.swing.JButton reset_button;
    private javax.swing.JButton resetbutton;
    private javax.swing.JLabel rule1;
    private javax.swing.JLabel rule2;
    private javax.swing.JLabel rule3;
    private javax.swing.JLabel rule4;
    private javax.swing.JLabel rule5;
    private javax.swing.JPanel rules_panel;
    private javax.swing.JLabel secs;
    private javax.swing.JLabel status_label;
    private javax.swing.JButton submit_button;
    private javax.swing.JPanel time_panel;
    private javax.swing.JButton txt_login;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
