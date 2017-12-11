import java.util.ArrayList;
import java.util.Scanner;

class Groups {
   private int n;
   private int i;
   private int p;
   private int s;




   private ArrayList<String>   Pros = new ArrayList<String>();
   private ArrayList<String>   Amateurs = new ArrayList<String>();
   private ArrayList<String> GroupA = new ArrayList<String>();
   private ArrayList<String> GroupB = new ArrayList<String>();


  Scanner scanner = new Scanner(System.in);
  Scanner scanner1 = new Scanner(System.in);


  public void  SetSizeA()
  {

      System.out.println("Please select the size of  the pro group: ");
      int N=scanner.nextInt();
      if(N%2==0)
      {
          n=N;
          p=n-1;
          s=(p/2)-1;
      }
      else {
          System.out.println("The size must be even: ");
          SetSizeA();
      }


  }
  public  void  SetSizeB()
  {

          System.out.println("Please select the size of  amateur group: ");
          int I = scanner.nextInt();
          i = I;
       if (i==n)
       {

       }
       else {
           System.out.println("The size of both groups must be equal");
           SetSizeB();
       }


  }


    public void AddInGroupA() {
       while (n>0)
       {


            String UserInput ;
            System.out.println("Please enter the names of the pro contestants : ");
            UserInput = scanner1.nextLine();
            Pros.add(UserInput);
            n=n-1;
       }
    }

    public  void AddInGroupB()
    {
        while (i>0) {
            String UserInput1 ;
            System.out.println("Please enter the names of the amateur contestants: ");
            UserInput1 = scanner1.nextLine();
            Amateurs.add(UserInput1);
            i = i -1 ;
        }
    }
  public void Draw()
    {

        int GroupsOfTwo = p;

        while (GroupsOfTwo>=0)
        {

             int rand=(int) (Math.random()*(p));
             int rand1=(int) (Math.random()*(p));

            System.out.println("Draw results: "+Pros.get(rand) +" " + "and" + " " + Amateurs.get(rand1));


       int a =0;
            if (GroupsOfTwo%2==0)
            {
                GroupA.add(Pros.get(rand) +" " + "and" + " " + Amateurs.get(rand1));




            }
            else
                {
                    GroupB.add(Pros.get(rand) +" " + "and" + " " + Amateurs.get(rand1));

            }
            a=a+1;
            GroupsOfTwo = GroupsOfTwo -1;
            p=p-1;

            Pros.remove(rand);
            Amateurs.remove(rand1);



        }






    }
    public void ShowGroups(){
        int size = GroupA.size();
        int size1 =GroupB.size();
        size1=size1-1;
        size= size -1;
        int r=0;
        int t =0;
        System.out.print("Group A: ");
        while (size>=0)
        {

            System.out.print( GroupA.get(r) +" ,");
            r=r+1;
            size= size-1;

        }
        System.out.print("Group B: ");
        while (size1>=0)
        {
            System.out.print(GroupB.get(t)+" ,");
           t=t+1;
            size1=size1-1;
        }
    }



}
