# Types of Sorting Algorithms

There are numerous sorting algorithms, each with unique characteristics and best use cases. Broadly, sorting algorithms
can be grouped into the following categories based on their approach and complexity:

## 1. Comparison-Based Sorting Algorithms

These algorithms sort data by comparing elements. They have a time complexity lower bound of `O(n log n)` for the
average case.

* Bubble Sort: Repeatedly swaps adjacent elements if they are in the wrong order.
* Selection Sort: Selects the minimum or maximum element and places it in the correct position.
* Insertion Sort: Builds the sorted array one element at a time, inserting elements in their correct positions.
* Merge Sort: Uses divide-and-conquer to split and merge sorted subarrays.
* Quick Sort: Selects a pivot, partitions the list, and recursively sorts the partitions.
* Heap Sort: Builds a heap from the data, then extracts the max/min elements to sort.
* Shell Sort: An optimized version of insertion sort that allows elements to move faster by using gaps.
* Tim Sort: Hybrid of merge sort and insertion sort, used in Java and Python sorting libraries.
* Tree Sort: Uses a binary search tree to insert elements, then performs an in-order traversal to sort them.

## 2. Non-Comparison-Based Sorting Algorithms

These algorithms don’t compare elements directly and can achieve linear time complexity under certain conditions.

* Counting Sort: Counts occurrences of each value and places elements based on cumulative counts. Works well when the
  range of input values is small.
* Radix Sort: Sorts numbers by individual digits, using counting sort as a subroutine.
* Bucket Sort: Distributes elements into buckets, sorts each bucket, and then concatenates them. Works well for uniform
  data distributions.
* Pigeonhole Sort: Similar to counting sort, but works specifically when elements fall within a small range.
* Flash Sort: Uses both distribution and partitioning techniques. Effective with uniformly distributed data.

## 3. Hybrid Sorting Algorithms

These algorithms combine multiple sorting techniques to improve performance. Examples include:

* Tim Sort: Combines merge sort and insertion sort, optimized for real-world data, and is the default in Python and
  Java.
* Intro Sort: Begins with quicksort but switches to heap sort if the recursion depth exceeds a certain level, avoiding
  worst-case behavior.
* Block Sort: A merge sort variant that works well with block-based data access patterns.

## 4. Parallel and Distributed Sorting Algorithms

These are used to handle large datasets by splitting the work across multiple processors or machines.

* Bitonic Sort: A parallel sorting algorithm for specialized hardware, especially useful in GPUs.
* Odd-Even Sort: A parallel version of bubble sort, useful for networked systems.
* Sample Sort: A divide-and-conquer parallel algorithm optimized for distributed systems.

## Summary Table

| Algorithm Type           | Examples                                   | Typical Time Complexity |
|--------------------------|--------------------------------------------|-------------------------|
| Comparison-Based         | Bubble, Selection, Insertion, Merge, Quick | O(nlogn)                | 
| Non-Comparison-Based     | Counting, Radix, Bucket, Pigeonhole        | O(n)                    |
| Hybrid                   | Tim, Intro, Block                          | O(nlogn)                |
| Parallel and Distributed | Bitonic, Odd-Even, Sample                  | Varies                  |

Each of these algorithms offers diverse approaches to sorting, suited to specific types of data and constraints.