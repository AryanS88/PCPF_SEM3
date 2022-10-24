class table extends Thread{
    public void run (){
        int i;
        int n=116;
        for (i = 1; i <= 10; i++) {
            System.out.print(i + " * " + n );
            System.out.println( " = " + n * i);

            if(i==10)
                stop();
            try{Thread.sleep(600);}catch(Exception e){};

        }
    }
}
class alphabet extends Thread{

    public void run(){
        char j;
        for (j= 'a'; j <= 'z'; j++) {
            System.out.println(j);

        }
        try {Thread.sleep(300);} catch(Exception e) {};
    }
}


class concurrency {

    public static void main(String args[]){
        table obj=new table();
        alphabet obj2=new alphabet();

        obj.start();
        obj2.start();

    }
}
