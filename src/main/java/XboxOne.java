/*
** created by: jorge.lessa
*/
public class XboxOne implements IPlataforma{

    private String modelo;
    private String capacidadeArmazenamento;

    public XboxOne(String modelo, String capacidadeArmazenamento) {
        this.modelo = modelo;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    @Override
    public String aceitar(IVisitor visitor) {
        return visitor.exibirXboxOne(this);
    }
}
