public class Gerente extends Funcionario  {

    public Gerente (){
        
    }
    private RegraAutenticacao ra = new RegraAutenticacao();

    public void  setSenha(int senha){
        this.ra.setSenha(senha);
    }
    public boolean autentica(int senha){
        return this.ra.Autentica(senha);
    }

    public double bonificacao(){
        return super.salario;
    }
 
}