/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopday.pkg01.contest;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProbG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println(solve(a));
        }

        sc.close();
    }

    static long solve(int[] a) {
        return (long) a.length * (a.length - 1) / 2;
    }
}
