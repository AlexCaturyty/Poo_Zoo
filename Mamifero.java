public abstract class Mamifero extends Animal {
  protected int qtdDePelos;

  public Mamifero(int id, String nome, int idade, double peso, int qtdDePelos) {
      super(id, nome, idade, peso);
      this.qtdDePelos = qtdDePelos;
  }

  public void setQtdDePelos(int qtdDePelos) {
      this.qtdDePelos = qtdDePelos;
  }

  public int getQtdDePelos() {
      return qtdDePelos;
  }

  public abstract void alimento();
}
