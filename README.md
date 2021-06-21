# RandomPrograms
Programmer's trance

All Paths from Source to Target Node
Description
Given a directed acyclic graph (DAG) of n nodes labelled from 0 to n - 1, count all possible paths from node 0 to node n - 1, and return the number of paths.



The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e. , there is a directed edge from node i to node graph[i][j]).



Example:

![image](https://user-images.githubusercontent.com/21288776/122802483-06e4d000-d2e3-11eb-8014-dd0ba7758b81.png)




Input:

If graph = [[1,2],[3],[3],[]], the input can be taken as follows:



first line: (number of nodes) 4

second line: (nodes you can visit from first node) 1 2

third line: (nodes you can visit from second node) 3

fourth line: (nodes you can visit from third node) 3

fifth line:( nodes you can visit from fourth node) -1



Note: input -1 implies no node can be visited from the given node.



Output: 2

Explanation: There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
