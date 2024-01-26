public class multi_arrays {
    public static void main(String[] args) {
        //2D arrays - array of arrays
        String[][] cars = new String[3][3];
        cars[0][0] = "Mustang";
        cars[0][1] = "Nissan";
        cars[0][2] ="Camry";
        cars[1][0] = "Chevi";
        cars[1][1] = "ferrari";
        cars[1][2] ="BMW";
        cars[2][0] = "Lambo";
        cars[2][1] = "Tesla";
        cars[2][2] ="Kia";
        for (int i=0;i<cars.length;i++){
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
    }
}
