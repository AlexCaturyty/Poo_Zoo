
public abstract class Animal {
  private int id;
  private String nome;
  private int idade; 
  private double peso;
  private String alimento;
  
  Mamifero mamifero;
  Ave ave;
  ;
  
  public Animal(int id, String nome, int idade, double peso ){
    this.id = id;
    this. nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.alimento = "";
    
  }

  public int getIdade() {
    return idade;
}

  public int getId() {
    return id;
}

  public String getNome() {
    return nome;
}

  public double getPeso() {
    return peso;
}

  public void setid(int id) {
      this.id = id;
  }

  public void setnome(String nome) {
      this.nome = nome;
  }

  public void setidade(int idade) {
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

  public abstract void familia();
  
}
