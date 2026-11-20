package T1_StringArgs;

// For Taking Commmand Line Arguemwnt Run Code As Configuration And Select Arguements And Give Input
public class T1_Sum {
	public static void main(String[] args) {
        int sum = 0;
        int arr[] = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
            sum = sum + arr[i];
        }
        System.out.println("Array Elements:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nSum = " + sum);
    }
}


	
