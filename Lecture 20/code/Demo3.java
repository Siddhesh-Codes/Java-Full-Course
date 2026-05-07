// BufferedReader

import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws IOException {
       // InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();

        System.out.println(name);
    }
}

/*
1. Siddhesh -> i/p
2. OS Buffer (65, 100, 105, 116, 121, 97)
3. System.in (InputStream) receives bytes
4. InputStreamReader --> stream of bytes into stream of characters
    ('S', 'i', 'd', 'd', 'h', 'e', 's', 'h')
5. BufferedReader --> readLine --> Siddhesh --> name
6. Siddhesh -> o/p
*/
