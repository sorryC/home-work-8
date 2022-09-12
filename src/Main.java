public class Main {
    public static void main(String[] args) {
       // Lesson 1
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        //String fullName = middleName + " " + firstName + " " + lastName;

        //System.out.println("ФИО сотрудника - " + fullName);

        //Lesson 2
        //String fullName = "Ivanov Ivan Ivanovich";

        //String upperFullName = fullName.toUpperCase();
        //System.out.println("Данные сотрудника ФИО для заполнения отчета - " + upperFullName);

        //Lesson 3
        String fullName = "Иванов Семён Семёнович";
        System.out.println("Данные сотрудника ФИО для заполнения отчета - " + fullName.replace('ё','e'));







    }
}