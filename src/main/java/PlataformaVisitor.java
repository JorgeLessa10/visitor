/*
** created by: jorge.lessa
*/
public class PlataformaVisitor implements IVisitor {

    public String exibir(IPlataforma plataforma)
    {
        return plataforma.aceitar(this);
    }

    @Override
    public String exibirComputador(Computador computador) {
        return "Computador{" +
                "placaMae='" + computador.getPlacaMae() + '\'' +
                ", memoriaRam='" + computador.getMemoriaRam() + '\'' +
                ", processador='" + computador.getProcessador() + '\'' +
                ", armazenamento='" + computador.getArmazenamento() + '\'' +
                ", fonte='" + computador.getFonte() + '\'' +
                ", placaDeVideo='" + computador.getPlacaDeVideo() + '\'' +
                '}';    }

    @Override
    public String exibirPs4(Ps4 ps4) {
        return "Ps4{" +
                "modelo='" + ps4.getModelo() + '\'' +
                ", capacidadeArmazenamento=" + ps4.getCapacidadeArmazenamento() +
                '}';    }

    @Override
    public String exibirXboxOne(XboxOne xboxOne) {
        return "XboxOne{" +
                "modelo='" + xboxOne.getModelo() + '\'' +
                ", capacidadeArmazenamento=" + xboxOne.getCapacidadeArmazenamento() +
                '}';    }
}
