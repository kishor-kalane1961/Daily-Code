class Prog4{
    public static void main(String[] args){
        for (int time = 0; time<=24;time++){
            if(time<=6){
                System.out.println("Sleeping");
            }
            else if(time<=10){
                    System.out.println("Getting Ready");
            }
            else if(time<=18){
                    System.out.println("Working");
            }
            else if(time<=19){
                    System.out.println("Me time");
            }
            else if(time<=22){
                    System.out.println("Go to bed");
            }
            else{
                    System.out.println("About to sleep");
            }
        }
    }
}
