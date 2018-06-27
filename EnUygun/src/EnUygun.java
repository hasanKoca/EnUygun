import java.util.Scanner;

public class EnUygun {
    public static void main (String [] args) {
        System.out.println("Welcome to program!\n");
        int x = 1;
        while(x==1){
            System.out.println("1) Testing Triangle\n2) Factorial Triangle\n0)Exit");
            System.out.println("Enter the number of question you want to test!");
            int control = 1;
            while (control == 1) {

                Scanner input = new Scanner(System.in);
                int questionNumber = input.nextInt();

                if(questionNumber == 0 || questionNumber == 1 || questionNumber == 2 ){
                control = 0;
                }
                else {
                    control = 1;
                    System.out.println("You entered invalid input!Please enter '1' '2' or '0' ");
                }

                if(questionNumber == 0){
                    x = 0;
                }
                else if( questionNumber == 1 ){
                    Question1();
                }
                else{
                    Question2();
                }
            }
        }

    }
    public static void Question1(){

        System.out.println("Enter the x coordinate of first point!");
        Scanner input1 = new Scanner(System.in);
        int Ax = input1.nextInt();

        System.out.println("Enter the y coordinate of first point!");
        int Ay = input1.nextInt();

        System.out.println("Enter the x coordinate of second point!");
        int Bx = input1.nextInt();

        System.out.println("Enter the y coordinate of second point!");
        int By = input1.nextInt();

        System.out.println("Enter the x coordinate of third point!");
        int Cx = input1.nextInt();

        System.out.println("Enter the y coordinate of third point!");
        int Cy = input1.nextInt();

        System.out.println("Enter the x coordinate of test point!");
        int Tx = input1.nextInt();

        System.out.println("Enter the y coordinate of test point!");
        int Ty = input1.nextInt();

        double areaABC = (Math.abs((Bx*Ay+Cx*By+Ax*Cy)-(Ax*By+Bx*Cy+Cx*Ay)))/2;
        double areaABx = (Math.abs((Bx*Ay+Tx*By+Ax*Ty)-(Ax*By+Bx*Ty+Tx*Ay)))/2;
        double areaACx = (Math.abs((Cx*Ay+Ax*Ty+Tx*Cy)-(Ax*Cy+Cx*Ty+Tx*Ay)))/2;
        double areaBCx = (Math.abs((Bx*Ty+Cx*By+Tx*Cy)-(Tx*By+Bx*Cy+Cx*Ty)))/2;

        double s = (areaABC);
        double d = (areaABx + areaACx + areaBCx);

        if(s == d){
            System.out.println("The point is inside the triangle!");
        }
        else {
            System.out.println("The point is outside the triangle");
        }

    }

    public static void Question2(){
        
        int rowNumber;
        do{
        System.out.println("Enter a number!");
        Scanner input2 = new Scanner(System.in);
        rowNumber = input2.nextInt();
        }
        while(rowNumber <=0);
        
        int number = 1;
        for(int i =0; i<rowNumber; i++){
            for(int k=0; k<=i; k++){
                System.out.print(number+"!");
                number++;
                int FactResult = FactorialCalculation(k);
            }
            System.out.println();
        }
        number = 1;
    }

    public static int FactorialCalculation(int f){

        if (f == 0 || f == 1){
            return 1;
        }
        else return f * FactorialCalculation(f-1);
    }
}
