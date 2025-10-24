package sample;

public class program {
    public static void main(String[] args) {
        
    
    int maths = 90;
    int science = 95;
    int english = 97;
    double total = maths + science + english ;
    double avg = total / 3.0 ;
    if (maths < 35 || science < 35 || english < 35)
    {
        System.out.println("failed due to low score in at least one subject");
    }
    else if(avg >= 90 && avg <= 100)
    {
        System.out.println("grade is A+");
        System.out.println("excellent performance");
    }
    else if(avg >= 75 && avg <= 89)
    {
        System.out.println("grade is A");
        System.out.println("excellent performance");

    }
    else if(avg >= 60 && avg <= 74)
    {
        System.out.println("grade is B");
        System.out.println("keep improving");
    }
    else if(avg >= 40 && avg <= 59)
    {
        System.out.println("grade is C");
        System.out.println("keep improving");
    }
    else if(avg >= 0 && avg <= 40)
    {
        System.out.println("Fail");
        System.out.println("please work harder next time");
    }
    
    else
    {
       System.out.println("invalid marks");
 
    }
   

    }
}

    
    
    




