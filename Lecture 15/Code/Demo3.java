// Use of String[] args
// 1. String[] args is used to pass command line arguments to the main method. 
// 2. It is an array of strings that contains the arguments passed from the command line when the program is executed. 
// 3. Each argument is separated by a space, and the first argument is stored at index 0 of the array. 
// 4. This allows us to provide input to our program without hardcoding it, making our program more flexible and reusable.

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Number of arguments are " + args.length);

        for(int i=0; i<args.length; i++) {
            System.out.println("Argument " + i + " = " + args[i]);
        }

        //java Demo5 input.txt output.txt
        //java Demo5 
    }
}
