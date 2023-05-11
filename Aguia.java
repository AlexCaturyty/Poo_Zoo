public class Aguia extends Ave{

    private boolean gerouFilhos;
  
    public Aguia(int id, String nome, int idade, int peso, boolean voa, double envergadura, Boolean gerouFilhos){
      super(id, nome, idade, peso, envergadura, voa );
        this.gerouFilhos = gerouFilhos;
    }
    
    
    public void setGerouFilhos(boolean gerouFilhos) {
        this.gerouFilhos = gerouFilhos;
    }

    public boolean getGerouFilhos() {
      return gerouFilhos;
  }
  
    

      public boolean ehVoador() {
          return true;
      }

      public void familia() {
        System.out.println("Família: Accipitridae");
    }
  }
