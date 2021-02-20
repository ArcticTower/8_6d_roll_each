public class Main {

    public static void main(String[] args){
        int n_cubes = 8;
        long N = 100;
        long good =0;
        if(args.length>0){
            N = Long.parseLong(args[0]);
        }



        Cube[] cubes = new Cube[n_cubes];
        for (int i =0;i<n_cubes;i++){
            cubes[i] = new Cube(6);
            cubes[i].roll();
        }
        for (long i =0;i<N;i++){

            if(
                       contains(1, cubes)
                    && contains(2, cubes)
                    && contains(3, cubes)
                    && contains(4, cubes)
                    && contains(5, cubes)
                    && contains(6, cubes)
            ){
                good++;
            }

        for(Cube cube: cubes){
            cube.roll();
        }


        }

        double chance = (double) good/ (double) N;
        System.out.println("Iterations: "+ N+"\nGood: "+good+"\nChance: "+String.format("%.10f", chance));
        System.exit(0);


    }

    private static boolean contains(int number, Cube[] cubes) {
        for (Cube cube: cubes){
            if(cube.getValue() == number){
                return true;
            }
        }
        return false;
    }

}
