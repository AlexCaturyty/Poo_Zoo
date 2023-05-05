public class Aguia extends Ave{

    private boolean gerouFilhos;
  
    public Aguia(int id, String nome, String idade, int peso, boolean voa,Boolean gerouFilhos, double envergadura){
      super(id, nome, idade, peso, envergadura, voa );
      this.gerouFilhos = gerouFilhos;
    }
    
    private Boolean getGerouFilhos(){
      return gerouFilhos;
    }
  
    
      public boolean ehVoador() {
          return true;
      }
  }
