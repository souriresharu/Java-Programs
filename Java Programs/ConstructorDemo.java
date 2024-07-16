class ConstructDemo {
    int n1,n2;
    ConstructDemo(){

    }
    ConstructDemo(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
    }
    public void showValues(){
        System.out.println("n1 is" + n1+ "n2 is" + n2);
    }
    public static void main(String[] args){
        ConstructDemo cdemo=new ConstructDemo(10,20);
        cdemo.showValues();
        }
    }
