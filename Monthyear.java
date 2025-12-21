import java.util.*;
class Monthyear
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Month : ");
        int mm=sc.nextInt();
        System.out.print("Year : ");
        int yy=sc.nextInt();
        int fdy=((yy-1)*365+(yy-1)/4)%7;
        String word[]={"","JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
        int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int fdom=fdy;
        if((yy%4==0&&yy%100!=0)||yy%400==0)
        month[2]=29;
        for(int i=1;i<mm;i++)
        {
            fdom=fdom+month[i];
        }
        fdom=fdom%7;
        int id=0;
        String m[][]=new String [6][7];
        m[0][0]="SUN";m[0][1]="MON";m[0][2]="TUE";m[0][3]="WED";m[0][4]="THU";m[0][5]="FRI";m[0][6]="SAT";
        outer:for(int i=1;i<6;i++)
        {
            int j;
            if(i==1)
            j=fdom;
            else
            j=0;
            for(;j<7;j++)
            {
                id++;
                m[i][j]=""+id;
                if(id==month[mm])
                break;
            }
        }
        int c1=0;
        while(++id<=month[mm])
        {
            m[1][c1++]=""+id;
        }
        System.out.println("\t\t"+word[mm]+" "+yy);
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(m[i][j]==null)
                System.out.print("\t");
                else
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
    }
}