import java.util.Scanner;

public abstract class Animal {
  private int id;
  private String nome;
  private String idade; 
  private int peso;
  private String alimento;
  ;
  
  public Animal(int id, String nome, String idade, int peso ){
    this.id = id;
    this. nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.alimento = "";
  }

  public String getIdade() {
    return idade;
}

  public int getId() {
    return id;
}

  public String getNome() {
    return nome;
}

  public int getPeso() {
    return peso;
}

  public void setid(int id) {
      this.id = id;
  }

  public void setnome(String nome) {
      this.nome = nome;
  }

  public void setidade(String idade) {
      this.idade = idade;
  }

  public void setpeso(int peso) {
      this.peso = peso;
  }

  public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
  public void crescer(){
    this.idade += 1;
  }

  public void comer(){
    this.peso += 1;
  }
  
  public void atividadeFisica(){
    this.peso -= 2;
  }

  
}
