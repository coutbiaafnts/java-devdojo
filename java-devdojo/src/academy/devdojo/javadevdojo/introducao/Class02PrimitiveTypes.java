package academy.devdojo.javadevdojo.introducao;

public class Class02PrimitiveTypes {
    public static void main(String[] args) {

        // int, double, float, char, byte, short, long e boolean
        int userAgeInt = (int) 10000000000L; // casting: vai cortar os bits para o long caber no int
        long bigNumber = 199992L;
        double userWageDouble = 2000.90D;
        float userWageFloat = 2550.50F;
        byte userAgeByte = 127;
        short userAgeShort = 22;
        boolean isTrue = true;
        boolean isFalse = false;
        char userSex = 'F';
        char numberChar = 87; //w

        System.out.println("Idade em int: " + userAgeInt);
        System.out.println("Uma número grande: " + bigNumber);
        System.out.println("Salário em double: " + userWageDouble);
        System.out.println("Salário em float: " + userWageFloat);
        System.out.println("Idade em byte: " + userAgeByte);
        System.out.println("Idade em short: " + userAgeShort);
        System.out.println("É verdadeiro? " + isTrue);
        System.out.println("É falso? " + isFalse);
        System.out.println("Sexo do usuário: " + userSex);
        System.out.println("Caractere por número: " + numberChar);
    }
}
