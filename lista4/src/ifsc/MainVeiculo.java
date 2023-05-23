import java.util.ArrayList;

public class MainVeiculo {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        Veiculo v1 = new Veiculo();
        v1.setNome("Fusion");
        v1.setAno(2018);
        v1.setNumeroRodas(4);
        v1.setFabricante("Ford");
        v1.setCor("Preto");
        veiculos.add(v1);

        Veiculo v2 = new Veiculo();
        v2.setNome("Civic");
        v2.setAno(2019);
        v2.setNumeroRodas(4);
        v2.setFabricante("Honda");
        v2.setCor("Preto");
        veiculos.add(v2);

        Veiculo v3 = new Veiculo();
        v3.setNome("Cruze");
        v3.setAno(2022);
        v3.setNumeroRodas(4);
        v3.setFabricante("chevrolet");
        v3.setCor("Prata");
        veiculos.add(v3);

        for (Veiculo veiculo : veiculos) {
        	System.out.println("Nome: " + veiculo.getNome());
        	System.out.println("Ano: " + veiculo.getAno());
            System.out.println("Número de rodas: " + veiculo.getNumeroRodas());
            System.out.println("Fabricante: " + veiculo.getFabricante());
            System.out.println("Cor: " + veiculo.getCor());
        }
    }
}
