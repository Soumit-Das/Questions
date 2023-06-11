package com.Dsa_Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
 * Question
 * Given a N*M matrix traverse it with rows starting from bottom to top
 * 
 */


public class Traverse_a_2D_Array {

	static class FastReader {
		
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader(){
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next(){
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble(){
            return Double.parseDouble(next());
        }
 
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
 
    public static void main(String[] args){

        FastReader sc = new FastReader();
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[][] arr = new int[N][M];
        
        for(int i = 0;i<N;i++){
            for(int j = 0;j<M;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0;i<M;i++){
            for(int j = N-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
            }
        }

    }
	
}
