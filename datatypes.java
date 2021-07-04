import java.util.*;

public class datatypes {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();

        double tax = 0.0;
        double exemption=0.0;
        if(age<60)
            exemption=250000;
        else if(age>=60 && age<80)
            exemption=300000;
        else
            exemption=500000;

        // Write your logic here
        if(income>=250000 && income<500000)
        {
            income=income-exemption;
            tax=0.1*income;
        }
        else if (income>=500000 && income<1000000)
        {
            tax=0.1*(500000-exemption);
            income=income-500000;
            tax=tax+(0.2*income);
        }
        else if(income>=1000000)
        {
            tax=0.1*(500000-exemption);
            income=income-500000;
            tax=tax+(0.3*income);
        }
        System.out.print(tax);
        scan.close();
    }
}
