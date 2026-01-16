package enums;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public enum LastVaccine {
    INFLUENZA(2),
    HEPATITIS_B(2),
    COVID_CORONAVAC(2),
    COVID_OTHERS(7),
    YELLOW_FEVER(30),
    MEASLES(30),
    RUBELLA(30),
    MUMPS(30),
    DENGUE(30);

    private long daysIneligibleForDonation;

    LastVaccine(long daysIneligibleForDonation) {
        this.daysIneligibleForDonation = daysIneligibleForDonation;
    }

    public boolean isEligibleToDonate(LocalDate lastVaccine) {
        if(lastVaccine == null) {
            return true;
        }

        return ChronoUnit.DAYS.between(lastVaccine, LocalDate.now()) > this.daysIneligibleForDonation;

    }

    public long getDaysIneligibleForDonation() {
        return daysIneligibleForDonation;
    }
}
