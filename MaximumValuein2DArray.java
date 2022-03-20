package basicProgramms;

public class MaximumValuein2DArray {

	public static void main(String[] args) {
		int array[][]= {
				{4,2},
				{5,1}
		};
		int max=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				for (int k = 0; k < array.length; k++) {
					for (int l = 0; l < array.length; l++) {
						if(array[i][j]>array[k][l]) {
							max=array[i][j];
							array[i][j]=array[k][l];
							array[k][l]=max;
						}
					}
				}
			}
		}
		for (int i = 0; i < array.length; ) {
			for (int j = 0; j < array.length; ) {
				System.out.println("Maximum value is "+array[i][j]);
				break;
			}
			break;
		}

	}

}
