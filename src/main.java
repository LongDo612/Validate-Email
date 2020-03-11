public class main {
    public static void main(String[] args) {
        String[] validEmail = {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
        String[] invalidEmail = {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

        ValidateEmail validateEmail = new ValidateEmail();
        for (String i: validEmail) {
            System.out.println("Email "+ i + "is: " +validateEmail.validateEmail(i));
        }

        for (String i: invalidEmail) {
            System.out.println("Email "+ i + "is: " +validateEmail.validateEmail(i));
        }
    }
}
