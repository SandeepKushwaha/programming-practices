package gfg.school;

//{ Driver Code Starts
//Initial Template for Java


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveSpacesFromString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s;
            s = br.readLine();

            RemoveSpacesFromStringSolution ob = new RemoveSpacesFromStringSolution();

            System.out.println(ob.modify(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class RemoveSpacesFromStringSolution {
    String modify(String S) {
//        return S.replaceAll(" ", "");
        return S.replaceAll("\\s", "");
    }
}

