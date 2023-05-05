public abstract class Mamifero extends Animal{
    protected String qtdDePelos;
  
    public Mamifero(int id, String nome, String idade, int peso,String qtdDePelos){
      super(id, nome, idade, peso);
      this.qtdDePelos = qtdDePelos;
    }
  
   public void setQtdDePelos(String qtdDePelos){
     this.qtdDePelos = qtdDePelos;
   }
  
  public String getQtdDePelos(){
    return qtdDePelos;
  }
  
    
  public abstract void alimento();
    
  }

