public class MultidimensionalArray {
public static void main(String[] args) {
    int sqrs[][][]={
        { 
        {1,1},
        {2,4},
        {3,9},
        {4,16},
        {5,25},
        {6,36},
        {7,49},
        {8,64},
        {9,81},
        {10,100}
        },
        {
        {1,1},
        {2,4},
        {3,9},
        {4,16},
        {5,25},
        {6,36},
        {7,49},
        {8,64},
        {9,81},
        {10,100}
        }
    };
    int i,j,k;
    for(i=0;i<10;i++){
        for(j=0;j<10;j++){
            for(k=0;k<2;k++){
            System.out.print(sqrs[i][j][k]+ "  ");
            }
        System.out.println();

    }
    System.out.println();
}
    }

    }

    

