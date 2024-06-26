public class MyNumber {
    private int number;
    public MyNumber(int number){
        this.number=number;
    }
    public boolean isPrime(){
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0)
                count+=1;
        }
        if(count==2)
        return true;
        else
        return false;
    }
    public int isSum(){
        int sum=0;
        int count=0;
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    count+=j;
                    if(count==2)
                        sum+=i;

            }

        }
        return sum;
    }

}
