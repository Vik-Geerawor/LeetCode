# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    """
    You are given the heads of two sorted linked lists list1 and list2.

    Merge the two lists in a one sorted list. The list should be made by
    splicing together the nodes of the first two lists.

    Return: the head of the merged linked list.
    """
    def mergeTwoLists(self, list1: [ListNode],
                      list2: [ListNode]) -> [ListNode]:
        return sorted(list1 + list2)


if __name__ == '__main__':
    a = Solution()

    list1 = []
    list2 = []

    l1 = ListNode(1)
    l1.next = ListNode(2)
    l1.next.next = ListNode(4)

    l2 = ListNode(1)
    l2.next = ListNode(3)
    l2.next.next = ListNode(4)


