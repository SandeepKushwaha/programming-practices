package relevel.full_stack;

// task 2 : find minimum core of sequence of jobs
/*

Minimum Cores
-------------
Question Name: Minimum Cores

Problem Statement
-----------------
Antonio recently got a job as a Multi-core processor architect at Qualcomm. In this job, he is given a sequence of tasks(in form of their starting and ending time) and Antonio is required to find the minimum number of cores the CPU shall have to process all these tasks.

Different tasks can be processed simultaneously in different cores of the CPU, but one core of the CPU can only process one task at a time. Also if a task has been assigned to a core, it cannot be preempted(i.e. Stop processing) until the task has completed. After the task assigned to a core is completed, some other task can be assigned to it.

Recently Antonio has got a huge pool of N tasks and is required to find the minimum number of cores the CPU shall have to process all these tasks. As the number of tasks is very large, it's not possible to do it manually and he asked his coder friend(you) for help.

Given the starting and ending time of all the N tasks, print the minimum number of CPU cores required to process all these N tasks.

Input Format
============
First line contains a single integer denoting N.
Next N lines contain two space separated integers denoting the starting and ending time of the tasks.
Output Format
=============
Print the minimum number of CPU cores required to process all these N tasks.
Constraints
===========
1<=N<=105
1<=starting time of a process < ending time of a process <= 109


Sample Input 1
--------------
4
1 2
1 3
2 3
4 5

Sample Output 1
---------------
2

Explanation of Sample 1
-----------------------
Let's consider the CPU has two cores, core1, and core2. We can assign the tasks as below to complete all 4 tasks using 2 cores.
Time 0 : None of the tasks have started.
Time 1 : Tasks 1 and 2 have arrived. Assign task 1 to core1 and task 2 to core2.
Time 2 : Task 1 is completed and core1 is free now. Task 3 has also arrived and we assign it to core1.
Time 3 : Task 2 and 3 are completed and both the cores are free now.
Time 4 : Task 4 has arrived and is assigned to core1.
Time 5 : Task 4 has been completed.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_MinimumCore {

    static int MAXIMUM = 100001;

    static int minCores(int[][] tasks, int n) {
        int [] p = new int[MAXIMUM];

        for (int i = 0; i < n; i++) {
            p[tasks[i][0]]++;
            p[tasks[i][1] + 1]--;
        }

        int ans = p[0];

        for (int i = 1; i < MAXIMUM; i++) {
            p[i] += p[i-1];
            ans = Math.max(ans, p[i]);
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {

        // TODO This code is not completed yet.
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        int[][] tasks = new int[t][2]; // where 2 indicate start and end time

        for (int i = 0; i < t; i++) {
            String[] input_s = read.readLine().trim().split(" ");
            int[] input_t = new int[2];
            for (int j = 0; j < input_t.length; j++) {
                input_t[j] = Integer.parseInt(input_s[j]);
            }

            tasks[i] = input_t;
        }

        System.out.println(minCores(tasks, t));

    }
}

