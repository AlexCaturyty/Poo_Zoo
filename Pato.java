public  class Pato extends Ave{
    private String corPenas;
  
    public Pato(int id, String nome, int idade, int peso, double envergadura, boolean voa,String corPenas){
      super(id, nome, idade, peso, envergadura, voa);
      this.corPenas = corPenas;
    }
    
    public String getCorPenas() {
      return corPenas;
    }
  
    public void familia() {
      System.out.println("Família: Anatidae");
  }
    
  }
