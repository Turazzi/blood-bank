package enums;

public enum HealthSituation {

    ELIGIBLE("Apto para doação", true),
    TEMPORARILY_INELIGIBLE("Temporariamente inapto (aguardando prazo)", false),
    PERMANENTLY_INELIGIBLE("Permanentemente inapto", false),
    UNDER_REVIEW("Cadastro em análise médica", false);

    private final String description;
    private final boolean canDonate;

    HealthSituation(String description, boolean canDonate) {
        this.description = description;
        this.canDonate = canDonate;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCanDonate() {
        return canDonate;
    }
}
