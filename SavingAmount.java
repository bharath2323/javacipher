import java.util.Scanner;
public class SavingAmount
{
    int saving;
    void setter(int saving)
    {
        this.saving=saving;
    }
    int getter()
    {
        return saving;
    }
    void increment()
    {
        saving=saving+1000;
    }
    void decrement()
    {
        saving=saving-100;
    }
    void checkSavings()
    {
        if(saving>=1000)
        {
            System.out.println("Congratulations! You have saved a good amount");
        }
        if(saving<1000 && saving>=0)
        {
            System.out.println("Insufficient saving!");
        }
        if(saving<0)
        {
            System.out.println("You are in debt");
        }
    }
	public static void main(String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
	    int mySavings=sc.nextInt();
	    SavingAmount obj= new SavingAmount();
	    obj.setter(mySavings);
	    obj.decrement();
	    obj.increment();
            obj.checkSavings();
            System.out.println("Your current savings are Rs "+obj.getter());
	}
}