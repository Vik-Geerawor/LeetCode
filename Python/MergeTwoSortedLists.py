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

        # sorted list, tail of sorted list, trackers for list1 and list2
        sorted_list, tail, tracker1, tracker2 = None, None, None, None

        sorted_list = ListNode(0)
        tail = sorted_list
        tracker1 = list1
        tracker2 = list2

        if tracker1 is None:
            return tracker2

        if tracker2 is None:
            return tracker1

        while tracker1 is not None:
            while tracker2 is not None:
                # print(f"{tracker1.val} - {tracker2.val}")
                # def v(a, b): return a if a <= b else b
                if tracker2.val <= tracker1.val:
                    print(f"\t{tracker2.val} is smaller")
                    tail.next = ListNode(tracker2.val)
                    tail = tail.next
                    if tracker2.next is None:
                        break
                    tracker2 = tracker2.next                # move to next node
                else:
                    break

            print(f"\t{tracker1.val} is smaller")
            tail.next = ListNode(tracker1.val)
            tail = tail.next
            if tracker1.next is None:
                break
            tracker1 = tracker1.next                # move to next node

        sorted_list = sorted_list.next
        return sorted_list


if __name__ == '__main__':

    def generate_listnode(my_list):
        list_nodes = ListNode(0)         # first node - dummy
        tail = list_nodes
        for i in my_list:
            tail.next = ListNode(i)
            tail = tail.next
        list_nodes = list_nodes.next      # drop dummy node
        return list_nodes

    def print_list(r):
        while r is not None:
            print(f"{r.val}", end=' ')
            r = r.next

    list1 = [1]
    list2 = [2]
    list1 = generate_listnode(list1)
    list2 = generate_listnode(list2)

    a = Solution()
    r = a.mergeTwoLists(list1, list2)

    print_list(r)

