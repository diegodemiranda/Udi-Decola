package utilities;

public class CpfChecker {
    //Checa se o CPF tem dígitos, se são onze e se não são todos iguais

    public boolean checker(String cpf) {
        if (cpf == null || !cpf.matches("\\d{11}") || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }
   //Um array de pesos é definido para cada dígito do CPF.
        int[] weights = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += Integer.parseInt(cpf.substring(i, i + 1)) * weights[i + 1];
        }
   //Checagem dos dígitos verificadores do CPF
        int verifyingDigit1 = 11 - sum % 11;
        verifyingDigit1 = verifyingDigit1 > 9 ? 0 : verifyingDigit1;

        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Integer.parseInt(cpf.substring(i, i + 1)) * weights[i];
        }

        int verifyingDigit2 = 11 - sum % 11;
        verifyingDigit2 = verifyingDigit2 > 9 ? 0 : verifyingDigit2;

        return verifyingDigit1 == Integer.parseInt(cpf.substring(9, 10)) &&
                verifyingDigit2 == Integer.parseInt(cpf.substring(10, 11));
    }
}
