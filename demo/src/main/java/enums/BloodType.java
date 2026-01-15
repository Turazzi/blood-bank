package enums;

import java.util.Set;

public enum BloodType {
    A_POSITIVE("A+"),
    A_NEGATIVE("A-"),
    B_POSITIVE("B+"),
    B_NEGATIVE("B-"),
    AB_POSITIVE("AB+"),
    AB_NEGATIVE("AB-"),
    O_POSITIVE("O+"),
    O_NEGATIVE("O-");

    private final String acronym;

    BloodType(String acronym) {
        this.acronym = acronym;
    }

    public boolean canReceiveFrom(BloodType donor) {

        switch (this) {
            case A_POSITIVE -> {
                return Set.of(A_POSITIVE, A_NEGATIVE, O_POSITIVE, O_NEGATIVE).contains(donor);
            }
            case A_NEGATIVE -> {
                return Set.of(A_NEGATIVE, O_NEGATIVE).contains(donor);
            }
            case B_POSITIVE -> {
                return Set.of(B_POSITIVE, B_NEGATIVE, O_POSITIVE, O_NEGATIVE).contains(donor);
            }
            case B_NEGATIVE -> {
                return Set.of(B_NEGATIVE, O_NEGATIVE).contains(donor);
            }
             case AB_POSITIVE -> {
                return Set.of(A_POSITIVE, A_NEGATIVE, B_POSITIVE, B_NEGATIVE, O_POSITIVE, O_NEGATIVE, AB_POSITIVE, AB_NEGATIVE).contains(donor);
             }
             case AB_NEGATIVE -> {
                return Set.of(A_NEGATIVE, B_NEGATIVE, O_NEGATIVE, AB_NEGATIVE).contains(donor);
             }
             case O_POSITIVE -> {
                return Set.of(O_POSITIVE, O_NEGATIVE).contains(donor);
             }
             case O_NEGATIVE -> {
                return donor.equals(O_NEGATIVE);
             }
            default -> {
                return false;
            }

        }

    }

    public String getAcronym() {
        return acronym;
    }
}
