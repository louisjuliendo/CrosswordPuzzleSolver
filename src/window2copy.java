
import java.util.Arrays;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author louisjuliendo
 */
public class window2copy extends javax.swing.JFrame {

    private String[] listOfWords = new String[6];
    private char[][] arr = new char[6][6];
    static private String[][] test = new String[6][6];
    private JTextField fields[];
    
    public void splitWordIntoLetter(){
        for(int i=0;i<6;i++){
            arr[i] = listOfWords[i].toCharArray();
        }
    }
    
    public void insertChar(JTextField jtf){
        splitWordIntoLetter();
        jtf.setText("c");
    }
    
    public window2copy() {
        initComponents();
        window1 w1 = new window1();
        test = w1.getTest();
        
    }
    
    public window2copy(String first, String second, String third, String fourth, String fifth, String sixth){
        initComponents();
        listOfWords[0] = first; listOfWords[1] = second; listOfWords[2] = third;
        listOfWords[3] = fourth; listOfWords[4] = fifth; listOfWords[5] = sixth;
        splitWordIntoLetter();
        // X axis
        X1_Row1.setText(String.valueOf(arr[0][0]));
        X1Y1.setText(String.valueOf(arr[0][1]));
        X1_Row3.setText(String.valueOf(arr[0][2]));
        X1Y2.setText(String.valueOf(arr[0][3]));
        X1_Row5.setText(String.valueOf(arr[0][4]));
        X1Y3.setText(String.valueOf(arr[0][5]));
        X1_Row7.setText(String.valueOf(arr[0][6]));
        
        X2_Row1.setText(String.valueOf(arr[1][0]));
        X2Y1.setText(String.valueOf(arr[1][1]));
        X2_Row3.setText(String.valueOf(arr[1][2]));
        X2Y2.setText(String.valueOf(arr[1][3]));
        X2_Row5.setText(String.valueOf(arr[1][4]));
        X2Y3.setText(String.valueOf(arr[1][5]));
        X2_Row7.setText(String.valueOf(arr[1][6]));
        
        X3_Row1.setText(String.valueOf(arr[2][0]));
        X3Y1.setText(String.valueOf(arr[2][1]));
        X3_Row3.setText(String.valueOf(arr[2][2]));
        X3Y2.setText(String.valueOf(arr[2][3]));
        X3_Row5.setText(String.valueOf(arr[2][4]));
        X3Y3.setText(String.valueOf(arr[2][5]));
        X3_Row7.setText(String.valueOf(arr[2][6]));
        
        // Y axis
        Y1_Row1.setText(String.valueOf(arr[3][0]));
        X1Y1.setText(String.valueOf(arr[3][1]));
        Y1_Row3.setText(String.valueOf(arr[3][2]));
        X2Y1.setText(String.valueOf(arr[3][3]));
        Y1_Row5.setText(String.valueOf(arr[3][4]));
        X3Y1.setText(String.valueOf(arr[3][5]));
        Y1_Row7.setText(String.valueOf(arr[3][6]));
        
        Y2_Row1.setText(String.valueOf(arr[4][0]));
        X1Y2.setText(String.valueOf(arr[4][1]));
        Y2_Row3.setText(String.valueOf(arr[4][2]));
        X2Y2.setText(String.valueOf(arr[4][3]));
        Y2_Row5.setText(String.valueOf(arr[4][4]));
        X3Y2.setText(String.valueOf(arr[4][5]));
        Y2_Row7.setText(String.valueOf(arr[4][6]));
        
        Y3_Row1.setText(String.valueOf(arr[5][0]));
        X1Y3.setText(String.valueOf(arr[5][1]));
        Y3_Row3.setText(String.valueOf(arr[5][2]));
        X2Y3.setText(String.valueOf(arr[5][3]));
        Y3_Row5.setText(String.valueOf(arr[5][4]));
        X3Y3.setText(String.valueOf(arr[5][5]));
        Y3_Row7.setText(String.valueOf(arr[5][6]));

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        X1_Row1 = new javax.swing.JTextField();
        X1_Row3 = new javax.swing.JTextField();
        X1_Row5 = new javax.swing.JTextField();
        X1_Row7 = new javax.swing.JTextField();
        X2_Row1 = new javax.swing.JTextField();
        X2_Row3 = new javax.swing.JTextField();
        X2_Row5 = new javax.swing.JTextField();
        X2_Row7 = new javax.swing.JTextField();
        X3_Row1 = new javax.swing.JTextField();
        X3_Row3 = new javax.swing.JTextField();
        X3_Row5 = new javax.swing.JTextField();
        X3_Row7 = new javax.swing.JTextField();
        Y1_Row7 = new javax.swing.JTextField();
        X2Y1 = new javax.swing.JTextField();
        X3Y1 = new javax.swing.JTextField();
        Y1_Row3 = new javax.swing.JTextField();
        X1Y1 = new javax.swing.JTextField();
        Y1_Row5 = new javax.swing.JTextField();
        Y1_Row1 = new javax.swing.JTextField();
        Y2_Row7 = new javax.swing.JTextField();
        X3Y2 = new javax.swing.JTextField();
        Y2_Row5 = new javax.swing.JTextField();
        X2Y2 = new javax.swing.JTextField();
        Y2_Row3 = new javax.swing.JTextField();
        X1Y2 = new javax.swing.JTextField();
        Y2_Row1 = new javax.swing.JTextField();
        Y3_Row7 = new javax.swing.JTextField();
        X3Y3 = new javax.swing.JTextField();
        Y3_Row5 = new javax.swing.JTextField();
        X2Y3 = new javax.swing.JTextField();
        Y3_Row3 = new javax.swing.JTextField();
        X1Y3 = new javax.swing.JTextField();
        Y3_Row1 = new javax.swing.JTextField();
        jbtExit = new javax.swing.JButton();
        jbtBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        X1_Row1.setEditable(false);
        X1_Row1.setBackground(new java.awt.Color(255, 214, 0));
        X1_Row1.setText(" ");
        getContentPane().add(X1_Row1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 30, 30));

        X1_Row3.setEditable(false);
        X1_Row3.setBackground(new java.awt.Color(255, 214, 0));
        X1_Row3.setText(" ");
        X1_Row3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X1_Row3ActionPerformed(evt);
            }
        });
        getContentPane().add(X1_Row3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 30, 30));

        X1_Row5.setEditable(false);
        X1_Row5.setBackground(new java.awt.Color(255, 214, 0));
        X1_Row5.setText(" ");
        X1_Row5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X1_Row5ActionPerformed(evt);
            }
        });
        getContentPane().add(X1_Row5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 30, 30));

        X1_Row7.setEditable(false);
        X1_Row7.setBackground(new java.awt.Color(255, 214, 0));
        X1_Row7.setText(" ");
        X1_Row7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X1_Row7ActionPerformed(evt);
            }
        });
        getContentPane().add(X1_Row7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 30, 30));

        X2_Row1.setEditable(false);
        X2_Row1.setBackground(new java.awt.Color(255, 214, 0));
        X2_Row1.setText(" ");
        getContentPane().add(X2_Row1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 30, 30));

        X2_Row3.setEditable(false);
        X2_Row3.setBackground(new java.awt.Color(255, 214, 0));
        X2_Row3.setText(" ");
        X2_Row3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X2_Row3ActionPerformed(evt);
            }
        });
        getContentPane().add(X2_Row3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 30, 30));

        X2_Row5.setEditable(false);
        X2_Row5.setBackground(new java.awt.Color(255, 214, 0));
        X2_Row5.setText(" ");
        X2_Row5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X2_Row5ActionPerformed(evt);
            }
        });
        getContentPane().add(X2_Row5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 30, 30));

        X2_Row7.setEditable(false);
        X2_Row7.setBackground(new java.awt.Color(255, 214, 0));
        X2_Row7.setText(" ");
        X2_Row7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X2_Row7ActionPerformed(evt);
            }
        });
        getContentPane().add(X2_Row7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 30, 30));

        X3_Row1.setEditable(false);
        X3_Row1.setBackground(new java.awt.Color(255, 214, 0));
        X3_Row1.setText(" ");
        getContentPane().add(X3_Row1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 30, 30));

        X3_Row3.setEditable(false);
        X3_Row3.setBackground(new java.awt.Color(255, 214, 0));
        X3_Row3.setText(" ");
        X3_Row3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X3_Row3ActionPerformed(evt);
            }
        });
        getContentPane().add(X3_Row3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 30, 30));

        X3_Row5.setEditable(false);
        X3_Row5.setBackground(new java.awt.Color(255, 214, 0));
        X3_Row5.setText(" ");
        X3_Row5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X3_Row5ActionPerformed(evt);
            }
        });
        getContentPane().add(X3_Row5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 30, 30));

        X3_Row7.setEditable(false);
        X3_Row7.setBackground(new java.awt.Color(255, 214, 0));
        X3_Row7.setText(" ");
        X3_Row7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X3_Row7ActionPerformed(evt);
            }
        });
        getContentPane().add(X3_Row7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 30, 30));

        Y1_Row7.setEditable(false);
        Y1_Row7.setBackground(new java.awt.Color(255, 214, 0));
        Y1_Row7.setText(" ");
        Y1_Row7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y1_Row7ActionPerformed(evt);
            }
        });
        getContentPane().add(Y1_Row7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 30, 30));

        X2Y1.setEditable(false);
        X2Y1.setBackground(new java.awt.Color(255, 214, 0));
        X2Y1.setText(" ");
        X2Y1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        X2Y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X2Y1ActionPerformed(evt);
            }
        });
        getContentPane().add(X2Y1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 30, 30));

        X3Y1.setEditable(false);
        X3Y1.setBackground(new java.awt.Color(255, 214, 0));
        X3Y1.setText(" ");
        X3Y1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        X3Y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X3Y1ActionPerformed(evt);
            }
        });
        getContentPane().add(X3Y1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 30, 30));

        Y1_Row3.setEditable(false);
        Y1_Row3.setBackground(new java.awt.Color(255, 214, 0));
        Y1_Row3.setText(" ");
        Y1_Row3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y1_Row3ActionPerformed(evt);
            }
        });
        getContentPane().add(Y1_Row3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 30, 30));

        X1Y1.setEditable(false);
        X1Y1.setBackground(new java.awt.Color(255, 214, 0));
        X1Y1.setText(" ");
        X1Y1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(X1Y1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 30, 30));

        Y1_Row5.setEditable(false);
        Y1_Row5.setBackground(new java.awt.Color(255, 214, 0));
        Y1_Row5.setText(" ");
        getContentPane().add(Y1_Row5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 30, 30));

        Y1_Row1.setEditable(false);
        Y1_Row1.setBackground(new java.awt.Color(255, 214, 0));
        Y1_Row1.setText(" ");
        Y1_Row1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y1_Row1ActionPerformed(evt);
            }
        });
        getContentPane().add(Y1_Row1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 30, 30));

        Y2_Row7.setEditable(false);
        Y2_Row7.setBackground(new java.awt.Color(255, 214, 0));
        Y2_Row7.setText(" ");
        Y2_Row7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y2_Row7ActionPerformed(evt);
            }
        });
        getContentPane().add(Y2_Row7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 30, 30));

        X3Y2.setEditable(false);
        X3Y2.setBackground(new java.awt.Color(255, 214, 0));
        X3Y2.setText(" ");
        X3Y2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        X3Y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X3Y2ActionPerformed(evt);
            }
        });
        getContentPane().add(X3Y2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 30, 30));

        Y2_Row5.setEditable(false);
        Y2_Row5.setBackground(new java.awt.Color(255, 214, 0));
        Y2_Row5.setText(" ");
        getContentPane().add(Y2_Row5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 30, 30));

        X2Y2.setEditable(false);
        X2Y2.setBackground(new java.awt.Color(255, 214, 0));
        X2Y2.setText(" ");
        X2Y2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        X2Y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X2Y2ActionPerformed(evt);
            }
        });
        getContentPane().add(X2Y2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 30, 30));

        Y2_Row3.setEditable(false);
        Y2_Row3.setBackground(new java.awt.Color(255, 214, 0));
        Y2_Row3.setText(" ");
        Y2_Row3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y2_Row3ActionPerformed(evt);
            }
        });
        getContentPane().add(Y2_Row3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 30, 30));

        X1Y2.setEditable(false);
        X1Y2.setBackground(new java.awt.Color(255, 214, 0));
        X1Y2.setText(" ");
        X1Y2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        X1Y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X1Y2ActionPerformed(evt);
            }
        });
        getContentPane().add(X1Y2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 30, 30));

        Y2_Row1.setEditable(false);
        Y2_Row1.setBackground(new java.awt.Color(255, 214, 0));
        Y2_Row1.setText(" ");
        Y2_Row1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y2_Row1ActionPerformed(evt);
            }
        });
        getContentPane().add(Y2_Row1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 30, 30));

        Y3_Row7.setEditable(false);
        Y3_Row7.setBackground(new java.awt.Color(255, 214, 0));
        Y3_Row7.setText(" ");
        Y3_Row7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y3_Row7ActionPerformed(evt);
            }
        });
        getContentPane().add(Y3_Row7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 30, 30));

        X3Y3.setEditable(false);
        X3Y3.setBackground(new java.awt.Color(255, 214, 0));
        X3Y3.setText(" ");
        X3Y3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(X3Y3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 30, 30));

        Y3_Row5.setEditable(false);
        Y3_Row5.setBackground(new java.awt.Color(255, 214, 0));
        Y3_Row5.setText(" ");
        getContentPane().add(Y3_Row5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 30, 30));

        X2Y3.setEditable(false);
        X2Y3.setBackground(new java.awt.Color(255, 214, 0));
        X2Y3.setText(" ");
        X2Y3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(X2Y3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 30, 30));

        Y3_Row3.setEditable(false);
        Y3_Row3.setBackground(new java.awt.Color(255, 214, 0));
        Y3_Row3.setText(" ");
        Y3_Row3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y3_Row3ActionPerformed(evt);
            }
        });
        getContentPane().add(Y3_Row3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 30, 30));

        X1Y3.setEditable(false);
        X1Y3.setBackground(new java.awt.Color(255, 214, 0));
        X1Y3.setText(" ");
        X1Y3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(X1Y3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 30, 30));

        Y3_Row1.setEditable(false);
        Y3_Row1.setBackground(new java.awt.Color(255, 214, 0));
        Y3_Row1.setText(" ");
        Y3_Row1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y3_Row1ActionPerformed(evt);
            }
        });
        getContentPane().add(Y3_Row1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 30, 30));

        jbtExit.setText("Exit");
        jbtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        jbtBack.setText("Back");
        getContentPane().add(jbtBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void X1_Row3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X1_Row3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X1_Row3ActionPerformed

    private void X1_Row5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X1_Row5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X1_Row5ActionPerformed

    private void X1_Row7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X1_Row7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X1_Row7ActionPerformed

    private void X2_Row3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X2_Row3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X2_Row3ActionPerformed

    private void X2_Row5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X2_Row5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X2_Row5ActionPerformed

    private void X2_Row7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X2_Row7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X2_Row7ActionPerformed

    private void X3_Row3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X3_Row3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X3_Row3ActionPerformed

    private void X3_Row5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X3_Row5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X3_Row5ActionPerformed

    private void X3_Row7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X3_Row7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X3_Row7ActionPerformed

    private void Y1_Row7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y1_Row7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Y1_Row7ActionPerformed

    private void X2Y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X2Y1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X2Y1ActionPerformed

    private void X3Y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X3Y1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X3Y1ActionPerformed

    private void Y1_Row3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y1_Row3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Y1_Row3ActionPerformed

    private void Y1_Row1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y1_Row1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Y1_Row1ActionPerformed

    private void Y2_Row7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y2_Row7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Y2_Row7ActionPerformed

    private void X3Y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X3Y2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X3Y2ActionPerformed

    private void X2Y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X2Y2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X2Y2ActionPerformed

    private void Y2_Row3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y2_Row3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Y2_Row3ActionPerformed

    private void X1Y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X1Y2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_X1Y2ActionPerformed

    private void Y2_Row1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y2_Row1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Y2_Row1ActionPerformed

    private void Y3_Row7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y3_Row7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Y3_Row7ActionPerformed

    private void Y3_Row3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y3_Row3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Y3_Row3ActionPerformed

    private void Y3_Row1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y3_Row1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Y3_Row1ActionPerformed

    private void jbtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExitActionPerformed
            System.exit(0);
    }//GEN-LAST:event_jbtExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        window2 w2 = new window2();
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
            java.util.logging.Logger.getLogger(window2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new window2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField X1Y1;
    private javax.swing.JTextField X1Y2;
    private javax.swing.JTextField X1Y3;
    private javax.swing.JTextField X1_Row1;
    private javax.swing.JTextField X1_Row3;
    private javax.swing.JTextField X1_Row5;
    private javax.swing.JTextField X1_Row7;
    private javax.swing.JTextField X2Y1;
    private javax.swing.JTextField X2Y2;
    private javax.swing.JTextField X2Y3;
    private javax.swing.JTextField X2_Row1;
    private javax.swing.JTextField X2_Row3;
    private javax.swing.JTextField X2_Row5;
    private javax.swing.JTextField X2_Row7;
    private javax.swing.JTextField X3Y1;
    private javax.swing.JTextField X3Y2;
    private javax.swing.JTextField X3Y3;
    private javax.swing.JTextField X3_Row1;
    private javax.swing.JTextField X3_Row3;
    private javax.swing.JTextField X3_Row5;
    private javax.swing.JTextField X3_Row7;
    private javax.swing.JTextField Y1_Row1;
    private javax.swing.JTextField Y1_Row3;
    private javax.swing.JTextField Y1_Row5;
    private javax.swing.JTextField Y1_Row7;
    private javax.swing.JTextField Y2_Row1;
    private javax.swing.JTextField Y2_Row3;
    private javax.swing.JTextField Y2_Row5;
    private javax.swing.JTextField Y2_Row7;
    private javax.swing.JTextField Y3_Row1;
    private javax.swing.JTextField Y3_Row3;
    private javax.swing.JTextField Y3_Row5;
    private javax.swing.JTextField Y3_Row7;
    private javax.swing.JButton jbtBack;
    private javax.swing.JButton jbtExit;
    // End of variables declaration//GEN-END:variables
    
    
    public void setValue(JTextField[] jtf, char[][] arr) {
        jtf = new JTextField[]{
            X1_Row1, X1Y1, X1_Row3, X1Y2, X1_Row5, X1Y3, X1_Row7,
            X2_Row1, X2Y1, X2_Row3, X2Y2, X2_Row5, X2Y3, X2_Row7,
            X3_Row1, X3Y1, X3_Row3, X3Y2, X3_Row5, X3Y3, X3_Row7,
            Y1_Row1, X1Y1, Y1_Row3, X2Y1, Y1_Row5, X3Y1, Y1_Row7,
            Y2_Row1, X1Y2, Y2_Row3, X2Y2, Y2_Row5, X3Y2, Y2_Row7,
            Y3_Row1, X1Y3, Y3_Row3, X3Y3, Y3_Row5, X3Y3, Y3_Row7
        };        
        int index = 0;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 7; j++){
                jtf[index].setText(String.valueOf(arr[i][j]));
                index++;
            }
        }
        
        
    }
    

}