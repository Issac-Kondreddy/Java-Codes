public class statements {
    public static void main(String[] args) {
        //if statement
        int age = 5;
        if (age>=75){
            System.out.println("You are old!!!");
        }
        else if(age>=28){
            System.out.println("You are major!!!");
        }
        else if(age<=13){
            System.out.println("Hey Kiddo!!!");
        }
        else{
            System.out.println("You are a minor");
        }
        //switch statement
        String day = "Sunday";
        switch(day) {
            case "Sunday":
                System.out.println("It is SUnday");
                break;
            case "Monday":
                System.out.println("It is MOnday!!");
                break;
            case "Tueday":
                System.out.println("It is Tuesday");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday!!");
                break;
            default:
                System.out.println("That is not a day");

        }

    }
}
