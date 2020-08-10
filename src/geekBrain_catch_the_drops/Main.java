package geekBrain_catch_the_drops;

import org.jetbrains.annotations.NotNull;

public class Main {

    // Извините за закомментированность. Но я планировал написать для любого условия. Но сейчас времени не хватает.
    // Вернусь к этому чуточку позже. Здесь только для 4-строчного прямоугольника.
    public static void main(String[] args)
    {
	// write your code here


        // 4-ре строки. Количество столбцов задаётся.
        printArray(makeArray(9));



//        printArray(extraMakeArray(6, 6));
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

//    static int[][] extraMakeArray(int y, int x)
//    {
////        int count = (y - 4)/2 + 1;
//        int[][] mass = new int[y][x];
//        int var = (2*x + y) -2;
//        int count = 0;
//        for(int i = 0; i < mass.length; i++)
//        {
//        while (count <= (y - 4)/2 + 1)
//        {
//
//        }
//            for(int j = 0; j < mass[i].length; j++)
//            {
//                if (i == 0)
//                {
//                    mass[i][j] = j + 1;
//                }
//                else if(i == mass.length - 1)
//                {
//                    mass[i][j] = var + mass.length - i - 1 -j;
//                }
////                else if (j == 0)
////                {
////                    mass[i][j] = var + mass.length - i - 1;
////                }
////                else if (j == mass[i].length - 1)
////                {
////                    mass[i][j] = mass[i].length + i;
////                }
//                else if((i + 1) <= mass.length/2)
//                {
//                    mass[i][j] = var + mass.length - i - 1 +j;
//                }
//                else
//                {
////                    if(i == mass.length - 1)
////                    {
////                        mass[i][j] = var + mass.length - i - 1 -j;
////                    }
////                    else
////                    {
//                        mass[i][j] = ((mass.length - 1 - 2 * (mass.length - i - 1) + mass[i].length - 2) * 2 -j) + var +
//                                mass.length - i - 1;
////                    }
//                }
//            }
//        }
//     return mass;
//    }
}
