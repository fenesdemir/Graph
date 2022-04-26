
# Problem definition
In this modified Traveling Salesman Problem, the purpose is to start from the city where a seller is located, after visiting each city only once, finding the shortest way back to the city. Since this problem cannot be solved in polynomial time, it falls into the NP (nonpolynomial problem) class.

**Purpose**

Solve a problem by understanding data structures, data models, using the graph structure and using algorithm logic.

**Problem** 

A new cargo company, headquartered in Kocaeli, aims to deliver their orders to their destinations in the shortest way possible. They apply to you for this purpose.

# Requirements

- The starting and ending point of all shipments should be Kocaeli.

- It should be possible to deliver to a maximum of 10 cities at a time.

- When going from one city to another city, one should move through neighboring cities.

- It is possible to  pass through a city more than once.

- Program should give the optimum result to go to places.

- The alternative shortest paths found in the search should be printed in order, starting with the least costly.

- The shortest 5 solutions found should be plotted on a visual map. The best path between them should be prominently highlighted with a different color.

- The distances between neighboring provinces must be compatible with the distances in given chart.

- The license plate codes, city and neighbor lists etc. should all be in accordance with the given documents.

- Since the traveling salesman problem is basically an NP-hard problem, a solution may not be found in the ideal time with classical methods. For this reason, different heuristic approaches may need to be used. In the evaluation of the project, the application must be carried out in a reasonable time (max.40 seconds).


# Ease of Use 

- When you run the program, you will see a map and 10 textfields and buttons.
- Each button adds the value in the textfield next to it to the arraylist.
- When you enter an invalid license plate, the program will give an error.
- For ease of tracking, each field can be used only once, otherwise an error will be given.
- There is no order of the buttons. Since Arraylist is used, the plate will be added according to your insertion order.
- You can add a maximum of 10 plates.
- When you think you have added enough plates, you can print the shortest path to the output file with the PRINT button and have it drawn on the map.
- If you want to do a new operation after printing, it will be enough to press the CLEAN button.
