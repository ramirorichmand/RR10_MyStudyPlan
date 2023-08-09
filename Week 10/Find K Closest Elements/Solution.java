class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Math.abs(a-x) < Math.abs(b-x) ? 1 : -1); // logic is if you return 1, it will swap (a and b), if you return -1 it will not swap (a and b)
        for(int num : arr) {
            pq.add(num);
            if(pq.size() > k) pq.remove();
        }

        List<Integer> res = new ArrayList<>();
        while(pq.size() > 0) res.add(pq.remove());
        Collections.sort(res);
        return res;
    }
}


        /*
The expression (a, b) -> Math.abs(a - x) < Math.abs(b - x) ? 1 : -1 is a Java lambda expression that represents a Comparator. It compares two values a and b based on their absolute differences with a reference value x.

(a, b): This part represents the input parameters of the lambda expression. In this case, the lambda takes two parameters a and b, which are the values to be compared.

Math.abs(a - x): This calculates the absolute difference between a and the reference value x.

Math.abs(b - x): This calculates the absolute difference between b and the reference value x.

Math.abs(a - x) < Math.abs(b - x) ? 1 : -1: This is a ternary operator that compares the absolute differences and returns 1 if the absolute difference between a and x is less than the absolute difference between b and x, and -1 otherwise.
        */

        /*
When the constructor is used with a custom Comparator, it sorts the elements in the list based on the comparison results returned by the Comparator.

In the context of the lambda expression (a, b) -> Math.abs(a - x) < Math.abs(b - x) ? 1 : -1:

If the expression Math.abs(a - x) < Math.abs(b - x) evaluates to true, then the value 1 is returned by the lambda expression.
If the expression Math.abs(a - x) < Math.abs(b - x) evaluates to false, then the value -1 is returned by the lambda expression.
Now, let's see how the constructor uses these return values:

If the Comparator returns a positive value (e.g., 1):

The the constructor method interprets it as an indication that the first element (a) is greater than the second element (b). So, it arranges the elements in ascending order.
If the Comparator returns a negative value (e.g., -1):

The the constructor method interprets it as an indication that the first element (a) is less than the second element (b). Therefore, it arranges the elements in descending order.
If the Comparator returns 0:

The the constructor method interprets it as an indication that both elements are equal, and their order remains unchanged.
        */