public class RegraAutenticacao implements Autenticacao {

    private int senha;
    private int senhaServidor = 1234;

     public void setSenha(int senha) {
        this.senha = senha;
    }
    
     public boolean Autentica (int senha){
         if (this.senha == senhaServidor){
             return true;
         }else{
             return false;
         }
     }
}