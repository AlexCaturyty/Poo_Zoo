public class Leao extends Mamifero{

    private int vacinas;
  
    public Leao(int id, String nome, String idade, int peso, String qtdDePelos, int vacinas){
      super(id, nome, idade, peso, qtdDePelos);
      this.vacinas = vacinas;
    }
    
    public void setvacinas(int vacinas){
      this.vacinas = vacinas;
    }
    
    public int getVacinas() {
      return vacinas;
  }
   
    public void familia(){
         System.out.println("Família: Felidae");
    }
  
     
      public void alimento() {
          System.out.println(getNome() + " se alimentou de carne");
          setAlimento("carne");
      }
  }
