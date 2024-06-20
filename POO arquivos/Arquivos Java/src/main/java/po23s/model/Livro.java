/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package po23s.model;
import java.util.List;

/**
 *
 * @author gui
 */

public class Livro {
    private String titulo;
    private List<String> autores;
    private String editora;
    private double valor;
    private boolean disponivelPDF;
    private String descricao;
    
    public Livro(String titulo, List<String> autores, String editora, double valor, boolean disponivelPDF, String descricao){
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.valor = valor;
        this.disponivelPDF = disponivelPDF;
        this.descricao = descricao;
    }
    
    public Livro(){
        
    }
    
    //get
    public String getTitulo() {
        return titulo;
    }


    public List<String> getAutores() {
        return autores;
    }


    public String getEditora() {
        return editora;
    }


    public double getValor() {
        return valor;
    }

    public boolean isDisponivelPDF() {
        return disponivelPDF;
    }
    
    public String getDescricao(){
        return descricao;
    }
    

    
    
    //set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutores(List<String> autores) {
        this.autores = autores;
    }
    
    public void setEditora(String editora) {
        this.editora = editora;
    }
     
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void setDisponivelPDF(boolean disponivelPDF) {
        this.disponivelPDF = disponivelPDF;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
