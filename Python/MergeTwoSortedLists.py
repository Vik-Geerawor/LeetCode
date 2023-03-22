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

    def mergeTwoLists(self, list1, list2):
        def get_list(r):
            ls = []
            while r is not None:
                ls.append(r.val)
                r = r.next
            return ls

        def generate_listnode(my_list):
            list_nodes = ListNode(0)  # first node - dummy
            tail = list_nodes
            for i in my_list:
                tail.next = ListNode(i)
                tail = tail.next
            list_nodes = list_nodes.next  # drop dummy node
            return list_nodes

        l1 = get_list(list1)
        l2 = get_list(list2)

        l = l1 + l2
        l = sorted(l)
        print(l)
        l = generate_listnode(l)

        return l


if __name__ == '__main__':

    def generate_listnode(my_list):
        list_nodes = ListNode(0)  # first node - dummy
        tail = list_nodes
        for i in my_list:
            tail.next = ListNode(i)
            tail = tail.next
        list_nodes = list_nodes.next  # drop dummy node
        return list_nodes

    def print_list(r):
        while r is not None:
            print(f"{r.val}", end=' ')
            r = r.next
        print()

    list1 = [2]
    list2 = [1]
    list1 = generate_listnode(list1)
    list2 = generate_listnode(list2)

    a = Solution()
    r = a.mergeTwoLists(list1, list2)

    print_list(r)
