package enums;

public enum RequestedBloodComponent {

    RED_BLOOD_CELL_CONCENTRATE("Concentrado de Hemácias"),
    PLATELET_CONCENTRATE("Concentrado de Plaquetas"),
    FRESH_FROZEN_PLASMA("Plasma Fresco Congelado"),
    CRYOPRECIPITATE("Crioprecipitado");

    private final String description;

    RequestedBloodComponent(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
