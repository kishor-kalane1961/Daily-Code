class Prog9{
        public static void main(String[] args){
                int x=10;

                if(x>10){
                        System.out.println("1st if");
                }
                else if(x==10){
                        if(x==15){
                                System.out.println("Inside else if");
                        }
                        else
                        System.out.println("inside else if else");
                }
                else
                        System.out.println("inside else");
                        System.out.println("In main");
        }
}