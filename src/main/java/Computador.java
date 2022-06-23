/*
** created by: jorge.lessa
*/
public class Computador implements IPlataforma{

    private String placaMae;
    private String memoriaRam;
    private String processador;
    private String armazenamento;
    private String fonte;
    private String placaDeVideo;

    public Computador(String placaMae, String memoriaRam, String processador, String armazenamento, String fonte) {
        this.placaMae = placaMae;
        this.memoriaRam = memoriaRam;
        this.processador = processador;
        this.armazenamento = armazenamento;
        this.fonte = fonte;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getPlacaDeVideo() {
        return (placaDeVideo != null && !placaDeVideo.isEmpty()) ? placaDeVideo : "Sem placa de vídeo";
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    @Override
    public String aceitar(IVisitor visitor) {
        return visitor.exibirComputador(this);
    }
}
