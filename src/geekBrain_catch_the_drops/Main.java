package geekBrain_catch_the_drops;

import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args)
    {
	// write your code here

        printArray(extraMakeArray(5, 6));
        System.out.println();
        printArray(extraMakeArray(4, 4));
        System.out.println();
        printArray(extraMakeArray(8, 6));
        System.out.println();
        printArray(extraMakeArray(7, 9));
    }

    static int[][] makeArray(int a)
    {
        int[][] mass = new int[4][a];
        int var = (2*a + 4) -2;
        for(int i = 0; i < mass.length; i++)
        {
            for(int j = 0; j < mass[i].length; j++)
            {
                if (i == 0)
                {
                    mass[i][j] = j + 1;
                }
                else if (j == 0)
                {
                    mass[i][j] = var + mass.length - i - 1;
                }
                else if (j == mass[i].length - 1)
                {
                    mass[i][j] = mass[i].length + i;
                }
                else if((i + 1) <= mass.length/2)
                {
                    mass[i][j] = var + mass.length - i - 1 +j;
                }
                else
                {
                    if(i == mass.length - 1)
                    {
                        mass[i][j] = var + mass.length - i - 1 -j;
                    }
                    else
                    {

 //  Слишком много букв. Можно было проще, но я так планировал сделать универсальный код для любого прямоугольника.
                        mass[i][j] = (mass.length - 1 - 2 * (mass.length - i - 1) + mass[i].length - 2) * 2 + var +
                                mass.length - i - 1 -j;
                    }
                }
            }
        }
        return mass;
    }

    static void printArray(int[] @NotNull [] mass)
    {
        for(int i = 0; i < mass.length; i++)
        {
            for(int j = 0; j < mass[i].length; j++)
            {
                if(mass[i][j] < 10)
                {
                    System.out.print(" " + mass[i][j] + " ");
                }
                else
                {
                    System.out.print(mass[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
    }

    static int[][] extraMakeArray(int y, int x)
    {
        boolean check;
        int count;
        if(y % 2 != 0)
        {
            count = y / 2;
            check = true;
        }
        else
            {
                count = y / 2 -1;
                check = false;
            }
        int[][] mass = new int[y][x];
        int var = 1;

        for(int i = 0; i <= count; i++)
        {
            for(int j = 0 + i; j < mass[i].length - i; j++ )
            {
                mass[i][j] = var++;
            }
            if(check && i == count)
            {
                break;
            }
            for(int j = i + 1; j < mass.length - 1 - i; j++)
            {
                mass[j][mass[i].length - 1 - i] = var++;
            }
            for(int j = mass[mass.length - 1 - i].length - i - 1; j >= i; j--)
            {
                mass[mass.length - 1 - i][j] = var++;
            }
            for( int j = mass.length - 2 - i; j > i; j--)
            {
                mass[j][i] = var++;
            }
        }

     return mass;
    }
}
