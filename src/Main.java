public class Main {
    public static void main(String[] args) {
        // task 1.
        String firstName = "ivanov";
        String middleName = "ivan";
        String lastName = "ivanovich";
        String fullName = "ivanov ivan ivanovich";
        String iii = "ФИО сотрудника -  " + firstName + ' ' +  middleName + ' ' + lastName;
        System.out.println(iii);

        System.out.println();
        //task 2.
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);

        System.out.println();
        //task 3.
        String russFullName = "Иванов Семён Семёнович";
        russFullName = russFullName.replace("ё","е");
        System.out.println(russFullName);

    }
}