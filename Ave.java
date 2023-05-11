public abstract class Ave extends Animal{
    double envergadura;
    boolean voa;
   
   public Ave(int id, String nome, int idade, int peso,  double envergadura, boolean voa){
     super(id, nome, idade, peso);
     this.envergadura = envergadura;
     this.voa = voa;
   }
 
   public double getEnvergadura(){
   return envergadura;
 }
 public void setEnvergadura(double envergadura ){
   this.envergadura = envergadura;
 }
 
     public boolean getVoa() {
         return voa;
     }
 
     public void setVoa(boolean voa) {
         this.voa = voa;
 
     }
   
 
   
   
 }
