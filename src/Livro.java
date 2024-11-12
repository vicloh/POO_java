
import java.util.UUID;

public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;
    
    //Construtor
    public Livro(String titulo, String autor){
        this.titulo= titulo;
        this.autor= autor;
        this.isbn= UUID.randomUUID().toString();
        this.disponivel= true;
    }

    //Metodos que permitem acessar as informações do livro.
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo= titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor= autor;
    }
    public String getIsbn(){
        return isbn;
    }
    public boolean isDisponivel(){ 
        return disponivel;
    }
    public void emprestarLivro()
    {
        if(disponivel)
        {
            disponivel = false;
            System.out.println("Empréstimo realizado com sucesso do livro: " +titulo);
        }
        else
        {
            System.out.println("O livro "+titulo+" está em empréstimo.");
        }
    }
    public void devolverLivro()
    {
        if(disponivel==true){
            System.out.println("Não houve emprestimo do livro. ");
        }
        if(disponivel==false){
            disponivel = true;
            System.out.println("Devolução realizada com sucesso do livro: "+titulo);
        }       
    }
}
