Number System:-
1.Check if a Number is Prime:
Problem: Write a function to check if a given number is prime.
Input: Number: 29
Output: True
Explanation: 29 is a prime number.
2.Pythagorean Triplets:
Problem: Generate all Pythagorean triplets with values smaller than a given limit.
Input: limit = 20
Output:
3 4 5
8 6 10
5 12 13
15 8 17
12 16 20
Explanation: The triplets satisfy the condition a² + b² = c², where a, b, and c are integers.
3.Problem Statement:–
Raj wants to know the maximum marks scored by him in each semester. The mark should be between
0 to 100; if it goes beyond the range display “You have entered invalid mark.”
Sample Input 1:
Enter no of semester: 3
Enter no of subjects in 1 semester: 3
Enter no of subjects in 2 semester: 4
Enter no of subjects in 3 semester: 2
Marks obtained in semester 1: 50 60 70
Marks obtained in semester 2: 90 98 76 67
Marks obtained in semester 3: 89 76
Sample Output 1:
Maximum mark in 1 semester: 70
Maximum mark in 2 semester: 98
Maximum mark in 3 semester: 89
4.Problem Statement –
Write a function to solve the following equation a³ + a²b + 2a²b + 2ab² + ab² + b³.
Write a program to accept three values in order of a, b and c and get the result of the above equation.
5.Problem Statement
A function is there which tells how many dealerships there are and the total number of cars in each
dealership.
Your job is to calculate how many tyres would be there in each dealership.
Input:
3
4 2
4 0
1 2
Output:
20
16
8
There are total 3 dealerships
dealerships1 contains 4 cars and 2 bikes
dealerships2 contains 4 cars and 0 bikes
dealerships3 contains 1 cars and 2 bikes
Total number of tyres in dealerships1 is (4 × 4) + (2 × 2) = 20
Total number of tyres in dealerships2 is (4 × 4) + (0 × 2) = 16
Total number of tyres in dealerships3 is (1 × 4) + (2 × 2) = 8
6. Problem Statement
Mayuri buys “N” no of products from a shop. The shop offers a different percentage of discount on
each item. She wants to know the item that has the minimum discount offer, so that she can avoid
buying that and save money.
[Input Format: The first input refers to the no of items; the second input is the item name, price and
discount percentage separated by comma (,) ] Assume the minimum discount offer is in the form of
Integer.
Note: There can be more than one product with a minimum discount.
Sample Input 1:
4
mobile,10000,20
shoe,5000,10
watch,6000,15
laptop,35000,5
Sample Output 1:
shoe
Explanation: The discount on the mobile is 2000, the discount on the shoe is 500, the discount on the
watch is 900 and the discount on the laptop is 1750. So the discount on the shoe is the minimum.
7.Problem Statement –
Bela teaches her daughter to find the factors of a given number. When she provides a number to her
daughter, she should tell the factors of that number. Help her to do this, by writing a program. Write a
class FindFactor.java and write the main method in it.
Note:
If the input provided is negative, ignore the sign and provide the output. If the input is zero the output
should be “No Factors”.
Sample Input:-
54
Sample Output:-
1,2,3,6,9,18,27,54
Array-Based
8.Matrix Rotation by 90 Degrees:
Rotate a 2D matrix by 90 degrees clockwise.
Input: Matrix: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Output:Matrix:[[7, 4, 1], [8, 5, 2], [9, 6, 3]]
Explanation: The matrix is rotated 90 degrees clockwise.
9.Binary Search:
Implement a binary search algorithm to find a target value in a sorted array.
Input: Array: [1, 2, 3, 4, 5, 6, 7, 8, 9], Target: 4
Output: 3
Explanation: The function returns the index of the target value in the array.
10. Problem Statement –
You’re given an array of integers, print the number of times each integer has occurred in the array.
Example:
Input:
10
1 2 3 3 4 1 4 5 1 2
Output:
1 occurs 3 times
2 occurs 2 times
3 occurs 2 times
4 occurs 2 times
5 occurs 1 times
11. Problem Statement –
Write the code to traverse a matrix in a spiral format.
Sample Input:
5 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20
Output:
1 2 3 4 8 12 16 20 19 18 17 13 9 5 6 7 11 15 12 14 10
12. Largest and Smallest inArray
Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event
that either of them doesn’t exist.
Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second
smallest is 2
Example 2:
Input: [1]
Output: Second Smallest : -1
Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest and smallest element present
in the array. There is no second largest or second smallest element present.
13. Merge Intervals:
Problem: Given a collection of intervals, merge all overlapping intervals.
Input: Intervals: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Intervals [1,3] and [2,6] overlap, so they are merged into [1,6]. The others remain
unchanged.
14. Matrix Identity Check:
Problem: Write a program to check if two given matrices are identical.
Input:
Matrix A: [[1,1,1,1], [2,2,2,2], [3,3,3,3], [4,4,4,4]]
Matrix B: [[1,1,1,1], [2,2,2,2], [3,3,3,3], [4,4,4,4]]
Output:
Matrices are identical
15. Reverse anArray
You are given an array. The task is to reverse the array and print it.
Examples:
Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position,
the second element occupies the fourth position and so on.
Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position,
the second element occupies the fourth position and so on.
16. KthLargest Element in anArray
Given an integer array nums and an integer k, return the k
th largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
Can you solve it without sorting?
Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
17. Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the
range that is missing from the array.
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation:n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing
number in the range since it does not appear in nums.
Example 2:
Input: nums = [0,1]
Output: 2
Explanation:n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing
number in the range since it does not appear in nums.
Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation:n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing
number in the range since it does not appear in nums.
18. Find Duplicate Number
Problem Statement: Given an array of N + 1 size, where each element is between 1 and N. Assuming
there is only one duplicate number, your task is to find the duplicate number.
Examples:
Example 1:
Input: arr=[1,3,4,2,2]
Output: 2
Explanation: Since 2 is the duplicate number the answer will be 2.
Example 2:
Input: [3,1,3,4,2]
Output:3
Explanation: Since 3 is the duplicate number the answer will be 3.
19. Merge Two Sorted Arrays:-You are given two integer arrays nums1 and nums2, sorted in nondecreasing order, and two integers m and n, representing the number of elements in nums1 and nums2
respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array
nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the
elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has
a length of n.
Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge
result can fit in nums1.
20. Rotate Array:-
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
21. Maximum Product Subarray:-
Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.
Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
Find the subarray with maximum product.
22. Count pairs with given sum:-
Given an array arr[] of n integers and a target value, find the number of pairs of integers in the array
whose sum is equal to target.
Examples:
Example:-1
Input: arr[] = [1, 5, 7, -1, 5], target = 6
Output: 3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).
Example:-2
Input: arr[] = [1, 1, 1, 1], target = 2
Output: 6
Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1) and (1, 1).
Example:-3
Input: arr[] = [10, 12, 10, 15, -1], target = 125
Output: 0
Explanation: There is no pair with sum = target
23. Move Zeros to End
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the
non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0]
24. Majority Element
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the
majority element always exists in the array.
Example 1:
Input: nums = [3,2,3]
Output: 3
Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
25.Intersection of Two Arrays
Intersection of Two Arrays
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the
result must be unique and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
String-Based
26. Problem Statement –
You have to write a function that accepts a string whose length is “len”, the string has some “#” in it;
you have to move all the hashes to the front of the string and return the whole string back and print it.
Example:
Input:
Move#Hash#to#Front
Output:
MoveHashtoFront
27. Problem Statement –
Shraddha Kapoor’s professor suggested that she study hard and prepare well for the lesson on
seasons. If her professor says month, then she has to tell the name of the season corresponding to that
month. So write the program to get the solution to the above task?
 March to May – Spring Season
 June to August – Summer Season
 September to November – Autumn Season
 December to February – Winter Season
Note: The entered month should be in the range of 1 to 12. If the user enters a month less than 1 or
greater than 12 then the message “Invalid Month Entered” should get displayed.
Sample Input 1:
Enter month: 6
Sample Output 1:
Season: Summer
28. Counting Valleys:
Problem: Given a sequence of up and down steps during a hike, determine the number of valleys
traversed.
Input:
8
UDDDUDUU
Output:
1
Explanation: A valley is a sequence of consecutive steps below sea level. The example describes a
single valley.
29. Problem Statement –
Capgemini in its online written test have a coding question, wherein the students are given a string
with multiple characters that are repeated consecutively. You’re supposed to reduce the size of this
string using mathematical logic given as in the example below:
Input:
aabbbbeeeeffggg
Output:
a2b4e4f2g3
30. Reverse a String:-
You are given a string s, and your task is to reverse the string.
Examples:
Input:s = "GLA"
Output: "ALG"
Input: s = "for"
Output: "rof"
Input: s = "a"
Output: "a"
Input: "Capgemini"
Output: "inimegpaC"
31. Check Valid Anagram:-
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
Input: s="listen", t= "silent"
Output: true.
32. First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. If it does not exist,
return -1.
Example 1:
Input:s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.
Example 2:
Input:s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1
33. Find the First Non-Repeated Character in a String:
Problem: Given a string, find the first character that does not repeat.
Input: String: "swiss"
Output: w
Explanation: 'w' is the first character that does not repeat in the string.
34. Palindrome String:-
Given a string s, the task is to check if it is palindrome or not.
Example:
Input: s = "abba"
Output: true
Input: s = "abc"
Output: flase
Input: "madam"
Output: true
35. Longest Palindromic Substring
Longest Palindromic Substring
Given a string s, return the longest palindromic substring in s.
Example 1:
Input:s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:
Input:s = "cbbd"
Output: "bb"
36. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
Example 1:
Input:strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input:strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
37. String Rotation Check:-
Given two strings s and goal, return true if and only if s can become goal after some number of shifts
on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.
Example 1:
Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:
Input: s = "abcde", goal = "abced"
Output: false
38. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without duplicate characters.
Example 1:
Input:s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:
Input:s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input:s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Linked List
39. Reverse a Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list.
Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:
Input: head = [1,2]
Output: [2,1]
Example 3:
Input: head = []
Output: []
40. Detect Loop in Linked List
Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by
continuously following the next pointer. Internally, pos is used to denote the index of the node that
tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.
Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:
Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:
Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.
41. Find Middle Node
Middle of the Linked List
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
42. Merge Two Sorted Linked Lists
Merge Two Sorted Lists
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the
first two lists.
Return the head of the merged linked list.
Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:
Input: list1 = [], list2 = []
Output: []
Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
