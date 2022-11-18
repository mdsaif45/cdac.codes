
// 15. Create class Number with only one private instance variable as a double primitive type. To include the following methods 
// (include respective constructors) isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ),isPrime(), isAmstrong() 
// the above methods return boolean primitive type. getFactorial(), getSqrt(), getSqr(), sumDigits(), getReverse() 
// the above methods return double primitive type. void listFactor(), void dispBinary().
class Number{
    private double num;
    //default constructor
    public Number(){num=0;}
    // isZero Function
    public boolean isZero(double num){
        if(num == 0) return true;
        else         return false;
    }
    // isPositive fuction
    public boolean isPositive(double num){
        if(num > 0) return true;
        else        return false;
    }
    // isNegative function 
    public boolean isNegative(double num){
        if(num < 0) return true;
        else        return false;
    }
    // isOdd fuction
    public boolean isOdd(double num){
        if(num%2 != 0) return true;
        else         return false;
    }
    // isEven function
    public boolean isEven(double num){
        if(num%2 == 0) return true;
        else        return false;
    }
    // isPrime fuction
    public boolean isPrime(double num){
        int c = 0;
        for(int i=1; i<num; i++){
            if(num%i == 0) c++;
        }
        if(c == 1) return true;
        else       return false;
    }
    // isAmstrong function
    public boolean isAmstrong(double num){
        double temp = num, arm=0, p=0;
        //count number of digits in input number
        while(num>0){
            p++; num/=10;
        }
        //caculate armstrong number from input number
        num = temp;
        while(num>0){
            arm += Math.pow(num%10, p);
            num/=10; 
        }
        if(temp == arm) return true;
        else         return false;
    }
    // Factorial Function
    public double getFactorial(double num){
        if(num==1)
            return 1;
        else
            return num * getFactorial(num-1);
    }
    // find square root 
    public double getSqrt(double num){
        return Math.sqrt(num);
    }
    //find square value
    public double getSqr(double num){
        return Math.pow(num, 2);
    }
    // find sum of digits
    public double sumDigits(int num){
        double sum=0;
        while(num>0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    } 
    // find reverse of number
    public double getReverse(int num){
        int rev=0, tens=1, temp=num;
        while(temp>0){   temp /= 10; tens *= 10;}
        while(num>0){
            tens /=10;
            rev += ((num%10) * tens);
            num /= 10; 
        }
        return rev; 
    }
    // show factors 
    public void listFactor(int num){
        while(num%2 == 0){
            System.out.print(2+" ");
            num /= 2;
        }
        for(int i=3; i < Math.sqrt(num); ){
            if(num%i == 0){
                System.out.print(i+" ");
                num /= i;
            }
            else    i+=2;
        }
        if(num>2)
            System.out.println(num);
    }
    // display binary value
    public void dispBinary(int num){
        int binary[] = new int[40];

        for(int i=0; num>0; i++, num/=2){
            binary[i] = num%2;
            System.out.print(binary[i] + " ");
        }
        
    }
}
public class Q15_Number {
    public static void main(String[] args) {
        Number num = new Number();

        System.out.println(num.isZero(0));
        System.out.println(num.isPositive(4));
        System.out.println(num.isNegative(-4));
        System.out.println(num.isEven(4));
        System.out.println(num.isOdd(5));
        System.out.println(num.isPrime(5));
        System.out.println(num.isAmstrong(123));
        System.out.println(num.getFactorial(4));
        System.out.println(num.getSqrt(16));
        System.out.println(num.getSqr(4));       
        System.out.println(num.sumDigits(123));
        System.out.println(num.getReverse(123));

        num.listFactor(315);
        num.dispBinary(45);
    }
}
