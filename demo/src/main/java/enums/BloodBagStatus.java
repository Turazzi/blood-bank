package enums;

public enum BloodBagStatus {

    IN_ANALYSIS("Em análise laboratorial", false),
    AVAILABLE("Disponível para uso", true),
    RESERVED("Reservada para paciente", false),
    TRANSFUSED("Já utilizada (Baixa no estoque)", false),
    DISCARDED("Descartada (Validade ou Imprópria)", false);

    private final String description;
    private final boolean availableForTransfusion;

    BloodBagStatus(String description, boolean availableForTransfusion) {
        this.description = description;
        this.availableForTransfusion = availableForTransfusion;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAvailableForTransfusion() {
        return availableForTransfusion;
    }

}
