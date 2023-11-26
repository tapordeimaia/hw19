public class Numbers {
    int number;
    int count = 0;
    public Numbers(int number){
        this.number = number;
    }
    public void divideBy(int divider) {
        if (divider==0){
            throw new IllegalArgumentException("Nu se poate imparti cu 0");
        }
    }
    public int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws Exception{
        if (inferiorLimit>superiorLimit){
            throw new InvalidAgeException("Nu este asa limita");
        }
        for (int i=inferiorLimit; i<=superiorLimit; i++){
            if(i%7==0){
                count = count+1;
            }
        }
        return count;
    }
}
