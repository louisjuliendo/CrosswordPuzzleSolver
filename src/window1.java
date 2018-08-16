
import java.awt.event.*;
import java.io.*;
import org.jpl7.*;
import java.util.*;
import javax.swing.*;

public class window1 extends javax.swing.JFrame {
    
    static String[][] test = null;
    static List<String> list = new ArrayList<String>();
    HashSet<String> dict = new HashSet<String>();

    public window1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radButtonGroup = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jtfFirstWord = new javax.swing.JTextField();
        jtfSecondWord = new javax.swing.JTextField();
        jtfThirdWord = new javax.swing.JTextField();
        jtfFourthWord = new javax.swing.JTextField();
        jtfFifthWord = new javax.swing.JTextField();
        jtfSixthWord = new javax.swing.JTextField();
        jlblFirst = new javax.swing.JLabel();
        jlblSecond = new javax.swing.JLabel();
        jlblThird = new javax.swing.JLabel();
        jlblFourth = new javax.swing.JLabel();
        jlblFifth = new javax.swing.JLabel();
        jlblSixth = new javax.swing.JLabel();
        btnSolution = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Window 1");
        setResizable(false);

        jtfFirstWord.setToolTipText("");
        jtfFirstWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFirstWordActionPerformed(evt);
            }
        });
        jtfFirstWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfFirstWordKeyTyped(evt);
            }
        });

        jtfSecondWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfSecondWordKeyTyped(evt);
            }
        });

        jtfThirdWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfThirdWordKeyTyped(evt);
            }
        });

        jtfFourthWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfFourthWordKeyTyped(evt);
            }
        });

        jtfFifthWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfFifthWordKeyTyped(evt);
            }
        });

        jtfSixthWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfSixthWordKeyTyped(evt);
            }
        });

        jlblFirst.setText("1st word:");

        jlblSecond.setText("2nd word:");

        jlblThird.setText("3rd word:");

        jlblFourth.setText("4th word:");

        jlblFifth.setText("5th word:");

        jlblSixth.setText("6th word:");

        btnSolution.setText("Show Solutions");
        btnSolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolutionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jlblFirst)
                        .addGap(18, 18, 18)
                        .addComponent(jtfFirstWord, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jlblSecond)
                        .addGap(18, 18, 18)
                        .addComponent(jtfSecondWord, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jlblThird)
                        .addGap(18, 18, 18)
                        .addComponent(jtfThirdWord, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jlblFourth)
                        .addGap(18, 18, 18)
                        .addComponent(jtfFourthWord, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jlblFifth)
                        .addGap(18, 18, 18)
                        .addComponent(jtfFifthWord, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jlblSixth)
                        .addGap(18, 18, 18)
                        .addComponent(jtfSixthWord, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnSolution, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlblFirst))
                    .addComponent(jtfFirstWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jlblSecond))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtfSecondWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jlblThird))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtfThirdWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jlblFourth))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtfFourthWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlblFifth))
                    .addComponent(jtfFifthWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlblSixth))
                    .addComponent(jtfSixthWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSolution, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolutionActionPerformed
        PrintWriter out = null;
        StringBuilder sb = new StringBuilder();
        String first = jtfFirstWord.getText().toUpperCase();
        String second = jtfSecondWord.getText().toUpperCase();
        String third = jtfThirdWord.getText().toUpperCase();
        String fourth = jtfFourthWord.getText().toUpperCase();
        String fifth = jtfFifthWord.getText().toUpperCase();
        String sixth = jtfSixthWord.getText().toUpperCase();

        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        list.add(fifth);
        list.add(sixth);

        if(first.equals("") || second == "" || third == "" || fourth == "" || fifth == "" || sixth == ""){
            JOptionPane.showMessageDialog(null, "Textfields can't be empty!","Warning", JOptionPane.YES_OPTION);
        }
            
        
        BufferedReader reader = null;
        String line = null;
        try {
            //Add dictionary to hashset
            FileReader file = new FileReader("C:/Users/louisjuliendo/Documents/NetBeansProjects/Prolog/dictionary.txt");
            reader = new BufferedReader(file);
            while ((line = reader.readLine()) != null) {
                dict.add(line);
            }
            //Check if dictionary contains words
            if (checkDictionary(dict, list) == true) {
                try {
                    out = new PrintWriter(new BufferedWriter(new FileWriter(""
                            + "C:/Program Files/swipl/bin/crossword3.pl")));
                    listToLowercase(list);
                    for (int j = 0; j < 6; j++) {
                        sb.append("words([" + list.get(j).toString().replaceAll(""
                                + "\\B", ",") + "]," + list.get(j).toString() + ").\n");
                    }
                    out.println(sb);
                    out.println("solver(A,B,C,D,E,F):- words([_,X1Y1,_,X1Y2,_,X1Y3,_],A), words([_,X2Y1,_,X2Y2,_,X2Y3,_],B), words([_,X3Y1,_,X3Y2,_,X3Y3,_],C), words([_,X1Y1,_,X2Y1,_,X3Y1,_],D), words([_,X1Y2,_,X2Y2,_,X3Y2,_],E), words([_,X1Y3,_,X2Y3,_,X3Y3,_],F).");
                } catch (IOException e) {
                    System.err.println(e);
                } finally {
                    if (out != null) {
                        out.close();
                    }
                }
                String t1 = "consult('C:/Program Files/swipl/bin/crossword3.pl')";  //consult file that contains KB
                Query q1 = new Query(t1); //add query
                System.out.println(t1 + " is " + (q1.hasSolution() ? "successful" : "failed"));

                String t2 = "solver(A,B,C,D,E,F)";
                Query q2 = new Query(t2);

                Map<String, Term>[] s2 = q2.allSolutions();
                System.out.println("all solutions:");
                String allSolutions = Arrays.toString(s2);
                System.out.println(allSolutions);

                String x = allSolutions.replaceAll("[\\[\\]\\{\\}\\sABCDEF=]", "");
                String[] listOfWords = x.split(",");
                System.out.println(listOfWords.length);

                // check how many solutions
                int howManySolutions = 0;
                for (int i = 0; i < allSolutions.length(); i++) {
                    if (allSolutions.charAt(i) == '{') {
                        howManySolutions++;
                    }
                }

                // insert 1d array into 2d array
                test = new String[howManySolutions][6];
                int count = 0;
                if (howManySolutions > 1) {
                    for (int i = 0; i < howManySolutions; i++) {
                        for (int j = 0; j < 6; j++) {
                            test[i][j] = listOfWords[count];
                            count++;
                        }
                    }
                    System.out.println(Arrays.deepToString(test));
                }
                new window2(test).setVisible(true);
                this.dispose();
            } else {
                list.clear();
                JOptionPane.showMessageDialog(null, "The words aren't exist in dictionary!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSolutionActionPerformed

    private void jtfFirstWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFirstWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFirstWordActionPerformed

    private void jtfFirstWordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFirstWordKeyTyped
        char c = evt.getKeyChar();
        if (jtfFirstWord.getText().length() > 6 || !(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER) {
            jtfSecondWord.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtfFirstWordKeyTyped

    private void jtfSecondWordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSecondWordKeyTyped
        char c = evt.getKeyChar();
        if (jtfSecondWord.getText().length() > 6 || !(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER) {
            jtfThirdWord.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtfSecondWordKeyTyped

    private void jtfThirdWordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfThirdWordKeyTyped
        char c = evt.getKeyChar();
        if (jtfThirdWord.getText().length() > 6 || !(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER) {
            jtfFourthWord.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtfThirdWordKeyTyped

    private void jtfFourthWordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFourthWordKeyTyped
        char c = evt.getKeyChar();
        if (jtfFourthWord.getText().length() > 6 || !(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER) {
            jtfFifthWord.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtfFourthWordKeyTyped

    private void jtfFifthWordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFifthWordKeyTyped
        char c = evt.getKeyChar();
        if (jtfFifthWord.getText().length() > 6 || !(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER) {
            jtfSixthWord.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtfFifthWordKeyTyped

    private void jtfSixthWordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSixthWordKeyTyped
        char c = evt.getKeyChar();
        if (jtfSixthWord.getText().length() > 6 || !(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER) {
            btnSolution.doClick();
        }
    }//GEN-LAST:event_jtfSixthWordKeyTyped

    public static void main(String argv[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                window1 w1 = new window1();
                w1.setLocationRelativeTo(null);
                w1.setVisible(true);
            }
        });
    }

    public static boolean checkDictionary(HashSet<String> set, List<String> set2) {
        if (set.containsAll(set2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void listToLowercase(List<String> listElem) {
        ListIterator<String> iterator = listElem.listIterator();
        while (iterator.hasNext()) {
            iterator.set(iterator.next().toLowerCase());
        }
    }

    public String[][] getTest() {
        return test;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSolution;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jlblFifth;
    private javax.swing.JLabel jlblFirst;
    private javax.swing.JLabel jlblFourth;
    private javax.swing.JLabel jlblSecond;
    private javax.swing.JLabel jlblSixth;
    private javax.swing.JLabel jlblThird;
    private javax.swing.JTextField jtfFifthWord;
    private javax.swing.JTextField jtfFirstWord;
    private javax.swing.JTextField jtfFourthWord;
    private javax.swing.JTextField jtfSecondWord;
    private javax.swing.JTextField jtfSixthWord;
    private javax.swing.JTextField jtfThirdWord;
    private javax.swing.ButtonGroup radButtonGroup;
    // End of variables declaration//GEN-END:variables

}
