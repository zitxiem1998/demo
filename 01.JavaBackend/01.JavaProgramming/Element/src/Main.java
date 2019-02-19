public class Main {

    public boolean Element(int i)
    {
        if(i<2) return false;
        for(int j=2;j<(i-1);j++)
            if(i%j==0) return false;
        return true;
    }
    public void Display()
    {
        for(int n=2;n<=100;n++)
        {
            if(Element(n))
                System.out.print(n+" ");

        }
    }
    public static void main(String[] args) {
        Main main=new Main();
        main.Display();
    }
}
