package academy.mindswap;

public class Main {

    public static void main(String[] args) {
/*
	// write your code here
        String[] arrayStrings = {"Hello", "World", "!"};

        String[] arrayStringsEmpty = new String[3]; //{null,null,null}
        //String[] arrayStringsEmpty2 ={null,null,null};

        arrayStringsEmpty[0] = "Amarelo";
        //{"Amarelo", null, null}

        arrayStringsEmpty[2] = "Vermelho";
        //{"Amarelo", null, "Vermelho"}


        String color = arrayStringsEmpty[0].toLowerCase();  //"Amarelo".toLowerCase()
        //System.out.println(color);
        //System.out.println("Amarelo".toLowerCase());


        String color1 = arrayStringsEmpty[1]; //null.toString()
        //System.out.println(color1);

        for(int i = 0 ; i < arrayStringsEmpty.length; i++){
            System.out.println(arrayStringsEmpty[i]);
        }




        int[] arrayInts = {1,2,3};
        int[] arrayInts1 = new int[3]; //{0,0,0}

        arrayInts1[arrayInts1.length-1] = 10;
        //{0,0,10}
     //   System.out.println(arrayInts1[arrayInts1.length-1]);


        boolean[] arrayBooleans = new boolean[3]; //{false,false,false}
        boolean[] arrayBooleans1 = {true,false,true};

        System.out.println("cheguei aqui");

        Pig mafarrico = new Pig(2,200);

        System.out.println(mafarrico.getAge());
        System.out.println(mafarrico.getWeight());



        Pig pepper = new Pig(5,400);

        Pig[] arrayPigs = new Pig[3]; //{null,null,null}
        arrayPigs[0] = mafarrico; //{mafarrico,null,null}
        arrayPigs[0] = pepper;// {mafarrico,pepper,null}

        System.out.println(mafarrico);
        System.out.println(arrayPigs[0]);

        */
        int[] array =  {};
       // System.out.println(array.length); //0


        int[][] matrix = {{1},{2,3},{4,5,6}};

      /*  System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(matrix[1].length);
        System.out.println(matrix[1][1]);
*/
        //matrix[0][0][;
        //matrix[1][0];
        //matrix[1][1];
        //matrix[2][0];
        //matrix[2][1];
        //matrix[2][2];

        /*
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }

        }


        int[][][] matrix1 = {{{1}},{{2},{3}},{{4},{5},{6}}};


        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                for (int k = 0; k < matrix1[i][j].length; k++) {
                    System.out.println(matrix1[i][j][k]);
                }
            }
        }*/


       // Pig[][] doublePig = new Pig[3][2];
        Pig[][] doublePig = {{new Pig(1,100), new Pig(2,200)},{new Pig(3,300), new Pig(4,400)},{new Pig(5,500), new Pig(6,600)}};

        for (int i = 0; i < doublePig.length; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < doublePig[i].length; j++) {
                System.out.println("j: " + j);
                System.out.println("Pig's age: " + doublePig[i][j].getAge() + " and weight: " + doublePig[i][j].getWeight());
            }

        }
    }
}
