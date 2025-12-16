package TwoDarray;
import java.util.*;
class TicTac
{
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        TicTac game = new TicTac();
        game.main();
    }
    void main()
    {
        char a[][]=new char[3][3];int t=0;
        int x,y;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=' ';
            }
        }
        for(int i=1;i<6;i++)
        {
            if(t==0)
            {
               System.out.println("PLAYER 1 ENTER COORDINATES:");
               x=sc.nextInt();
               y=sc.nextInt();
               if(a[x][y]!=' ')
               {
                   System.out.println("WRONG ENTRY. GAME OVER.");
                   System.exit(0);
               }
               a[x][y]='X';
               for(int k=0;k<3;k++)
               {
                  for(int j=0;j<3;j++)
                  {
                     System.out.print(a[k][j]+"   ");
                  }
                  System.out.println();
               }
               for(int j=0;j<3;j++)
               {
                  if(a[j][0]=='X' && a[j][0]==a[j][1] && a[j][0]==a[j][2])
                  {
                     t=1;
                     System.out.println("PLAYER 1 WINS");
                     break;
                  }
                  else if(a[0][j]=='X' && a[0][j]==a[1][j] && a[0][j]==a[2][j])
                  {
                     t=1;
                     System.out.println("PLAYER 1 WINS");
                     break;
                  }
                  else if(a[0][0]=='X' && a[0][0]==a[1][1] && a[0][0]==a[2][2])
                  {
                     t=1;
                     System.out.println("PLAYER 1 WINS");
                     break;
                  }
                  else if(a[0][2]=='X' && a[0][2]==a[1][1] && a[0][2]==a[2][0])
                  {
                     t=1;
                     System.out.println("PLAYER 1 WINS");
                     break;
                  }
               }
            }
            if(i==5)
            {
                break;
            }
            if(t==0)
            {
               System.out.println("PLAYER 2 ENTER COORDINATES:");
               x=sc.nextInt();
               y=sc.nextInt();
                if(a[x][y]!=' ')
               {
                   System.out.println("WRONG ENTRY. GAME OVER.");
                   System.exit(0);
               }
               a[x][y]='O';
               for(int k=0;k<3;k++)
               {
                  for(int j=0;j<3;j++)
                  {
                     System.out.print(a[k][j]+"   ");
                  }
                  System.out.println();
               }
               for(int j=0;j<3;j++)
               {
                  if(a[j][0]=='O' && a[j][0]==a[j][1] && a[j][0]==a[j][2])
                  {
                     t=1;
                     System.out.println("PLAYER 2 WINS");
                     break;
                  }
                  else if(a[0][j]=='O' && a[0][j]==a[1][j] && a[0][j]==a[2][j])
                  {
                     t=1;
                     System.out.println("PLAYER 2 WINS");
                     break;
                  }
                  else if(a[0][0]=='O' && a[0][0]==a[1][1] && a[0][0]==a[2][2])
                  {
                     t=1;
                     System.out.println("PLAYER 2 WINS");
                     break;
                  }
                  else if(a[0][2]=='O' && a[0][2]==a[1][1] && a[0][2]==a[2][0])
                  {
                     t=1;
                     System.out.println("PLAYER 2 WINS");
                     break;
                  }
               }
            }
        }
        if(t==0)
        System.out.println("THE GAME IS A TIE");
    }
}