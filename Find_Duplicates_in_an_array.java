
public class Find_Duplicates_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
        int arr[] = {101, 20, 30, 30, 60, 10};
        for (int i = 0; i < arr.length + 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate " + arr[i] + " found at the index " +i);
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("Duplicates not found");
        }
    }
}
	

