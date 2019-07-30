package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan() {
        String numbers = "";
        for (int i = 1; i <= 15; i ++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                numbers += "WuTang Forever";
            }
            else if (i % 3 == 0){
                numbers += "Wu\n";
            }
            else if (i % 5 == 0){
                numbers += "Tang\n" ;
            }
            else {
                numbers += i + "\n";
            }

        }
        return numbers;
    }
}