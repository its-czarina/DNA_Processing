
import java.util.HashMap;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author localuser
 */
public class DNA {
    
    HashMap<String, String> table = new HashMap();
    
    public static void main(String[] args) {
        
        DNA dna = new DNA();
        dna.setTable();
        
        
        
        
    }
    
    public void setTable(){
        //U, C, A, G
        table.put("UUU", "Phenylalanine");
        table.put("UUC", "Phenylalanine");
        table.put("UUA", "Leucine");
        table.put("UUG", "Leucine");
        table.put("CUU", "Leucine");
        table.put("CUC", "Leucine");
        table.put("CUA", "Leucine");
        table.put("CUG", "Leucine");
        table.put("AUU", "Isoleucine");
        table.put("AUC", "Isoleucine");
        table.put("AUA", "Isoleucine");
        table.put("AUG", "Methionine");
        table.put("GUU", "Valine");
        table.put("GUC", "Valine");
        table.put("GUA", "Valine");
        table.put("GUG", "Valine");        
        
        // ----- COLUMN 2 START ------ //
        
        table.put("UCU", "Serine");
        table.put("UCC", "Serine");
        table.put("UCA", "Serine");
        table.put("UCG", "Serine"); 
        table.put("CCU", "Proline");
        table.put("CCC", "Proline");
        table.put("CCA", "Proline");
        table.put("CCG", "Proline");
        table.put("ACU", "Threonine");
        table.put("ACC", "Threonine");
        table.put("ACA", "Threonine");
        table.put("ACG", "Threonine");
        table.put("GCU", "Alanine");
        table.put("GCC", "Alanine");
        table.put("GCA", "Alanine");
        table.put("GCG", "Alanine");     
        
        // --- COLUMN 3 START ---- //
        
        table.put("UAU", "Tyrosine");
        table.put("UAC", "Tyrosine");
        table.put("UAA", "STOP CODON");
        table.put("UAG", "STOP CODON"); 
        table.put("CAU", "Histidine");
        table.put("CAC", "Histidine");
        table.put("CAA", "Glutamine");
        table.put("CAG", "Glutamine");
        table.put("AAU", "Asparagine");
        table.put("AAC", "Asparagine");
        table.put("AAA", "Lysine");
        table.put("AAG", "Lysine");
        table.put("GAU", "Aspartic Acid");
        table.put("GAC", "Aspartic Acid");
        table.put("GAA", "Gultamic Acid");
        table.put("GAG", "Gultamic Acid");   
        
        // --- COLUMN 4 START ----
        
        table.put("UGU", "Cysteine");
        table.put("UGC", "Cysteine");
        table.put("UGA", "STOP CODON");
        table.put("UGG", "Tryptophan"); 
        table.put("CGU", "Arginine");
        table.put("CGC", "Arginine");
        table.put("CGA", "Arginine");
        table.put("CGG", "Arginine");
        table.put("AGU", "Serine");
        table.put("AGC", "Serine");
        table.put("AGA", "Arginine");
        table.put("AGG", "Arginine");
        table.put("GGU", "Glycine");
        table.put("GGC", "Glycine");
        table.put("GGA", "Glycine");
        table.put("GGG", "Glycine");   
        
    }
    
}


