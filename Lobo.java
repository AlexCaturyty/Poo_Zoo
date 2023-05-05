public class Lobo extends Mamifero{
    private boolean ehAlpha;
  
    public Lobo(int id, String nome, String idade, int peso, int pelos,boolean ehAlpha, String qtdDePelos) {
      super( id, nome, idade, peso, qtdDePelos);
        this.ehAlpha = ehAlpha;
    }

    public boolean getEhAlpha() {
        return ehAlpha;
    }

    
   
    public void familiaBiologica() {
        System.out.println("Família: Canidae");
    }

    
    public void alimento() {
        System.out.println(getNome() + " se alimentou de carne e frutas");
        setAlimento("carne e frutas");
    }
}

