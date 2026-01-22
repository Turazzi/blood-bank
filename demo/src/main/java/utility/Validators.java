package utility;

public class Validators {

    public static boolean isCpf(String cpfToValidate) {

        if(cpfToValidate == null || cpfToValidate.isEmpty()) {
            return false;
        }

        String cpf = cpfToValidate.replace(".", "").replace("-", "");

        if(cpf.length() != 11 ||
                cpf.chars().allMatch( c -> c == cpf.charAt(0))) {
            return false;
        }

        if(!sumAndMultiplyDigits(cpf, 9, 10, 9)) {
            return false;
        }

        //second digit
        return sumAndMultiplyDigits(cpf, 10, 11, 10);

    }

    private static boolean sumAndMultiplyDigits(String cpf, int limitant, int multiplier, int digitPosition) {
        int sum = 0;
        int rest;
        int digitToValidate = Character.getNumericValue(cpf.charAt(digitPosition));

        for(int i = 0; i < limitant; i++) {
            sum = sum + (Character.getNumericValue(cpf.charAt(i)) * (multiplier - i));
        }

        rest = 11 - (sum % 11);
        return (rest >= 10 && digitToValidate == 0) || digitToValidate == rest;
    }

}
