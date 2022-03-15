public class Administrador extends  Funcionario implements Autenticacao {

    private int senha;


    public void setSenha(int senha) {
       this.senha = senha;
   }
   

    @Override
    public boolean Autentica (int senha){
        if (this.senha == senha){
            return true;
        }else{
            return false;
        }
    }

   public double bonificacao(){
       return super.salario;
   }
}