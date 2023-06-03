Firstly, you should clear with this (Invert = Mirror Image),

Then,In mirror image our left and right got swapped with each other.

Now same we have to do with tree. It also have left and right hand.
Left hand = Left Node, Right hand = Right Node

Every time you have to swapped their child for every node
So, for swapping you need to store one thing in temp variable isn't it?


Demo of Code:

LeftSide = Root Left Part      # temp = a
Root.left = Solve(Root.Right)  # a = b
Root.right = LeftSide          # b = temp
return Root

Time complexity:
O(N)
Space complexity:
O(1)