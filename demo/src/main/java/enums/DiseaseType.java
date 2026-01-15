package enums;

public enum DiseaseType {

    NONE(false),

    // --- PERMANENTLY DISQUALIFIED (Immediate block) ---
    HIV_AIDS(true),
    HEPATITIS_C(true),
    GENERAL_CANCER(true), // For cancers not listed in exceptions below
    RHEUMATOID_ARTHRITIS(true),
    LUPUS(true),
    FIBROMYALGIA(true),
    MULTIPLE_SCLEROSIS(true),
    GUILLAIN_BARRE_SYNDROME(true),
    PURPURA(true),
    ANTIPHOSPHOLIPID_SYNDROME(true),
    SJOGREN_SYNDROME(true),
    CROHNS_DISEASE(true),
    ANKYLOSING_SPONDYLITIS(true),
    HYPERTHYROIDISM(true),
    EXTRAPULMONARY_TUBERCULOSIS(true),
    CHRONIC_ALCOHOLISM(true),
    SCHIZOPHRENIA(true),
    INJECTABLE_DRUGS_USE(true),

    // --- REQUIRES ANALYSIS  ---
    HEPATITIS_A(false),           // Allowed if cured
    HEPATITIS_B(false),           // Allowed if negative viral load
    BASAL_CELL_CARCINOMA(false),  // Skin cancer: Allowed if treated only with surgery
    CERVICAL_CANCER(false),       // Allowed if treated only with surgery
    HASHIMOTOS_THYROIDITIS(false),// Allowed if stable
    GRAVES_DISEASE(false),        // Allowed if stable
    PSORIASIS(false),             // Allowed if topical medication only
    VITILIGO(false),              // Allowed without medication
    EPILEPSY(false),              // Allowed if > 3 years seizure-free without meds
    TREATED_STD(false),           // Herpes, HPV, Syphilis, Chlamydia (Allowed if treated)
    DIABETES(false),              // Blocked if insulin-dependent
    ASTHMA(false),                // Allowed if inhaler only
    HYPOTHYROIDISM(false),        // Allowed
    PULMONARY_TUBERCULOSIS(false),// Allowed after 5 years of treatment
    MARIJUANA_USE(false),         // Allowed
    COCAINE_USE(false),           // Blocked for 12 months
    CRACK_USE(false),             // Blocked for 12 months
    DEPRESSION(false);            // Allowed

    private final boolean permanentlyDisqualified;

    DiseaseType(boolean permanentlyDisqualified) {
        this.permanentlyDisqualified = permanentlyDisqualified;
    }

    public boolean isPermanentlyDisqualified() {
        return permanentlyDisqualified;
    }
}
