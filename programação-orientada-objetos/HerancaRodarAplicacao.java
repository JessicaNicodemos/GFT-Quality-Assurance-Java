public class HerancaRodarAplicacao{

    public static void main(String[] args) {
        
        HerancaFuncionario funcionario = new HerancaFuncionario();

        //UpCast
        HerancaFuncionario gerente = new HerancaFuncionario();
        HerancaFuncionario vendedor = new HerancaFuncionario();

        //Downcast - evitar
        //HerancaGerente gerente_ = new HerancaFuncionario(); - errado
       // HerancaVendedor vendedor_ = (HerancaVendedor) new HerancaFuncionario(); - nem tudo que está em vendedor está em funcionario
    }
    
}
