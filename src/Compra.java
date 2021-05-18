
import javax.swing.JOptionPane;

//@author Rai Mota RGM: 23327774

public class Compra {
    private String nomeComprador;
    private String nomeProduto;
    private double valorProduto;     

    public Compra(String nomeComprador, String nomeProduto, double valorProduto) {
        this.setNomeComprador(nomeComprador);
        this.setNomeProduto(nomeProduto);
        this.setValorProduto(valorProduto);
    }    

    @Override
    public String toString() {
        return "Comprador: " + nomeComprador + ", Produto: " + nomeProduto + ", Preço: R$ " + String.format("%.2f", valorProduto);
    }

    private String getNomeComprador() {
        return nomeComprador;
    }

    private void setNomeComprador(String nomeComprador) {
        char capitalize[] = nomeComprador.toCharArray();        
        for(int i = 0; i < capitalize.length; i++){
            if(Character.isSpaceChar(capitalize[i])){
                capitalize[i + 1] = Character.toUpperCase(capitalize[i+1]);
            }
            capitalize[0] = Character.toUpperCase(capitalize[0]);
        }
        nomeComprador = String.valueOf(capitalize);
        this.nomeComprador = nomeComprador;
    }

    private String getNomeProduto() {
        return nomeProduto;
    }

    private void setNomeProduto(String nomeProduto) {
        char capitalize[] = nomeProduto.toCharArray();        
        for(int i = 0; i < capitalize.length; i++){
            if(Character.isSpaceChar(capitalize[i])){
                capitalize[i + 1] = Character.toUpperCase(capitalize[i+1]);
            }
            capitalize[0] = Character.toUpperCase(capitalize[0]);
        }
        nomeProduto = String.valueOf(capitalize);
        this.nomeProduto = nomeProduto;
    }

    private double getValorProduto() {
        return valorProduto;
    }

    private void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }
}
