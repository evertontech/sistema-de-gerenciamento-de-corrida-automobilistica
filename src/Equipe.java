import java.util.List;

public class Equipe {
    private EquipeEnum nome;
    private List<Piloto> listaDePilotos;
    private List<Tecnico> listaDeTecnicos;
    private List<Carro> listaDeCarros;

    public Equipe(EquipeEnum nome) {
        this.setNome(nome);
    }

    public void setNome(EquipeEnum nome) {
        this.nome = nome;
    }

    public EquipeEnum getNome() {
        return this.nome;
    }

    public List<Piloto> getListaDePilotos() {
        return this.listaDePilotos;
    }

    public List<Tecnico> getListaDeTecnicos() {
        return this.listaDeTecnicos;
    }

    public List<Carro> getListaDeCarros() {
        return this.listaDeCarros;
    }

    public void adicionarPiloto(Piloto pilotoParaAdicionar) {
        boolean numeroJaExisteNaEquipe = false;

        for (Piloto p : listaDePilotos) {
            if (pilotoParaAdicionar.getNumero().equals(p.getNumero())) {
                numeroJaExisteNaEquipe = true;
                break;
            }
        }

        if (numeroJaExisteNaEquipe) {
            System.out.println("O número do piloto já existe na equipe.");
        } else {
            listaDePilotos.add(pilotoParaAdicionar);
        }
    }

    public void adicionarTecnico(Tecnico tecnicoParaAdicionar) {
        listaDeTecnicos.add(tecnicoParaAdicionar);
    }

    public void adicionarCarro(Carro carroParaAdicionar) {
        listaDeCarros.add(carroParaAdicionar);
    }

    public double calcularPontuacaoTotal() {
        double somaPontuacaoDaEquipe = 0.00;

        for (Piloto piloto : listaDePilotos) {
            somaPontuacaoDaEquipe += piloto.getPontuacao();
        }

        return somaPontuacaoDaEquipe;
    }

    public String toString() {
        return this.nome + " " + this.listaDePilotos + " " + this.listaDeCarros + " " + this.listaDeTecnicos;
    }
}
