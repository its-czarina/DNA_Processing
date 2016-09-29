
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author localuser
 */
public class AnsLab1_201340347 extends javax.swing.JFrame {

    /**
     * Creates new form AnsLab1_201340347
     */
    
    HashMap<String, String> table = new HashMap();
    HashMap<String, String> translated = new HashMap();
    Result1 r1;
    Result2 r2;
    Result3 r3;
    
    
    public AnsLab1_201340347() {
        setTable();
        initComponents();
    }
    
    
    public void removeText(){
        this.sequence_txt.setText("");
    }
    
    public void setTable(){
        //U, C, A, G
        table.put("TTT", "Phenylalanine");
        table.put("TTC", "Phenylalanine");
        table.put("TTA", "Leucine");
        table.put("TTG", "Leucine");
        table.put("CTT", "Leucine");
        table.put("CTC", "Leucine");
        table.put("CTA", "Leucine");
        table.put("CTG", "Leucine");
        table.put("ATT", "Isoleucine");
        table.put("ATC", "Isoleucine");
        table.put("ATA", "Isoleucine");
        table.put("ATG", "Methionine");
        table.put("GTT", "Valine");
        table.put("GTC", "Valine");
        table.put("GTA", "Valine");
        table.put("GTG", "Valine");        
        
        // ----- COLUMN 2 START ------ //
        
        table.put("TCT", "Serine");
        table.put("TCC", "Serine");
        table.put("TCA", "Serine");
        table.put("TCG", "Serine"); 
        table.put("CCT", "Proline");
        table.put("CCC", "Proline");
        table.put("CCA", "Proline");
        table.put("CCG", "Proline");
        table.put("ACT", "Threonine");
        table.put("ACC", "Threonine");
        table.put("ACA", "Threonine");
        table.put("ACG", "Threonine");
        table.put("GCT", "Alanine");
        table.put("GCC", "Alanine");
        table.put("GCA", "Alanine");
        table.put("GCG", "Alanine");     
        
        // --- COLUMN 3 START ---- //
        
        table.put("TAT", "Tyrosine");
        table.put("TAC", "Tyrosine");
        table.put("TAA", "STOP CODON");
        table.put("TAG", "STOP CODON"); 
        table.put("CAT", "Histidine");
        table.put("CAC", "Histidine");
        table.put("CAA", "Glutamine");
        table.put("CAG", "Glutamine");
        table.put("AAT", "Asparagine");
        table.put("AAC", "Asparagine");
        table.put("AAA", "Lysine");
        table.put("AAG", "Lysine");
        table.put("GAT", "Aspartic Acid");
        table.put("GAC", "Aspartic Acid");
        table.put("GAA", "Glutamic Acid");
        table.put("GAG", "Glutamic Acid");   
        
        // --- COLUMN 4 START ----
        
        table.put("TGT", "Cysteine");
        table.put("TGC", "Cysteine");
        table.put("TGA", "STOP CODON");
        table.put("TGG", "Tryptophan"); 
        table.put("CGT", "Arginine");
        table.put("CGC", "Arginine");
        table.put("CGA", "Arginine");
        table.put("CGG", "Arginine");
        table.put("AGT", "Serine");
        table.put("AGC", "Serine");
        table.put("AGA", "Arginine");
        table.put("AGG", "Arginine");
        table.put("GGT", "Glycine");
        table.put("GGC", "Glycine");
        table.put("GGA", "Glycine");
        table.put("GGG", "Glycine");   
        
        // Retrieve Codename
        
        translated.put("Alanine", "A");
        translated.put("Cysteine", "C");
        translated.put("Aspartic Acid", "D");
        translated.put("Glutamic Acid", "E");
        translated.put("Phenylalanine", "F");
        translated.put("Glycine", "G");
        translated.put("Histidine", "H");
        translated.put("Isoleucine", "I");
        translated.put("Lysine", "K");
        translated.put("Leucine", "L");
        translated.put("Methionine", "M");
        translated.put("Asparagine", "N");
        translated.put("Proline", "P");
        translated.put("Glutamine", "Q");
        translated.put("Arginine", "R");
        translated.put("Serine", "S");
        translated.put("Threonine", "T");
        translated.put("Valine", "V");
        translated.put("Tryptophan", "W");
        translated.put("Tyrosine", "Y");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sequence_txt = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        analyze = new javax.swing.JButton();
        Upload = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(sequence_txt);

        jLabel1.setText("Paste DNA Sequence Here:");

        analyze.setText("Translate to Protein Sequences");
        analyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeActionPerformed(evt);
            }
        });

        Upload.setText("Upload");
        Upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadActionPerformed(evt);
            }
        });

        jLabel2.setText("OR");

        jButton1.setText("Create Frequency & Percentage Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Trend of Nucleotide Occurrences");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Upload)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(analyze, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Upload)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(analyze)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeActionPerformed
        // TODO add your handling code here:
        String seq = sequence_txt.getText();
        String[] seq_arr = seq.split("\n");
        String translated_seq = "";
        for (String s: seq_arr){
            translated_seq += s + "\n";
            for (int i = 0; i < s.length()-2; i+=3){
                System.out.println(s.substring(i, i+3).toUpperCase());
                String aminoacid = table.get(s.substring(i, i+3).toUpperCase());
                System.out.println(aminoacid);
                System.out.println(translated.get(aminoacid));
                translated_seq += translated.get(aminoacid);
            }
            translated_seq += "\n";
        }
        
        r1 = new Result1(translated_seq, this);
        
    }//GEN-LAST:event_analyzeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s = this.sequence_txt.getText();
        s = s.toUpperCase();
        int[] nucleotide = new int[4];
        int size = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'A'){
                nucleotide[0] += 1;
                size++;
            }
            if (s.charAt(i) == 'C'){
                nucleotide[1] += 1;
                size++;
            }
            if (s.charAt(i) == 'G'){
                nucleotide[2] += 1;
                size++;
            }
            if (s.charAt(i) == 'T'){
                nucleotide[3] += 1;
                size++;
            }
        }
        
        float[] percentage = new float[4];
        System.out.println("size" + size);
        for (int i = 0; i < percentage.length; i++){
            percentage[i] = (nucleotide[i]/Float.valueOf(size))*100;
        }
        
        r2 = new Result2(nucleotide, percentage, this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String[] str = this.sequence_txt.getText().split("\n");
        System.out.println("HERE");
        r3 = new Result3(str);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        File f = new File("");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("FASTA file", "fasta");
        chooser.setFileFilter(filter);
        chooser.setCurrentDirectory(new File("Documents"));
        int returnVal = chooser.showOpenDialog(this.getParent());
        if(returnVal == JFileChooser.APPROVE_OPTION) {
           System.out.println("You chose to open this file: " +
                chooser.getSelectedFile().getName());
           f = chooser.getSelectedFile();
       }
        try {
            Scanner scan = new Scanner(f);
            String s = "";
            while (scan.hasNext()){
                s += scan.nextLine() + "\n";
            }
            this.sequence_txt.setText(s);
        } catch (FileNotFoundException e) {
            Logger.getLogger(AnsLab1_201340347.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UploadActionPerformed

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
            java.util.logging.Logger.getLogger(AnsLab1_201340347.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnsLab1_201340347.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnsLab1_201340347.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnsLab1_201340347.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        AnsLab1_201340347 app = new AnsLab1_201340347();
        app.setTable();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnsLab1_201340347().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Upload;
    private javax.swing.JButton analyze;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane sequence_txt;
    // End of variables declaration//GEN-END:variables
}
