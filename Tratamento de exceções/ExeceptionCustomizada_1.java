import java.io.IOException;

public class ExeceptionCustomizada_1 {

    public static void main(String[] args) {
        String nomeDoArquivo = JOpionPane.showInputDiaLog("Nome do arquivo a ser exibido");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");

    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo){

        try{
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWrite(new OutputStreamWriter(System.out));
            do{
                bw.wirte(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        }catch (ImpossivelAberturaDeArquivoException e){
            JOptionPane.showMessageDiaLog(null, "O arquivo" + nomeDoArquivo + "Nçao foi encontrado no diretorio" + diretorio + e.getMessage());
                e.printStackTrace();
            }catch (IOException ex){
            JOptionPane.showMessageDiaLog(null, "Ocorreu um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static  BufferedReader lerArquivo(String nomeDoArquivo){
        File file = new File(nomeDoArquivo);
        return new BufferedReader(new FileReader(nomeDoArquivo));
    }
}

class ImpossivelAberturaDeArquivoException extends Exception{

    private String nomeDoArquivo;
    private String diretorio;
    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo" + nomeDoArquivo + "Nçao foi encontrado no diretorio" + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;

        
    }
    @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException [nomeDoArquivo=" + nomeDoArquivo + ", diretorio=" + diretorio
                + "]";
    }

    

}