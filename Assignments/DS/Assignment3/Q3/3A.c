void rem_odd(struct Node** head)
{
    struct Node* curr = *head;
    struct Node* l_even;

    // iterate until the first even element, or the end
    while (curr != NULL && curr->data % 2 != 0)
    {
        curr = curr->next;
    }

    // the new head is the first even element, or the end
    *head = curr;

    // if no more elements, we're done here
    if (curr == NULL) {
        return;
    }

    // the last even element is the current element, naturally
    l_even = curr;

    // we know the current element is even, and not null, so moving on
    curr = curr->next;

    // iterate until the end
    while (curr != NULL)
    {
        // is the current element even?
        if (curr->data % 2 == 0) {

            // -> yes, it's even, so the last even element should point to it
            l_even->next = curr;

            // ... and this is the new last-even-element now
            l_even = curr;
        }
        curr = curr->next;
    }

    // last even might still point to an odd valued element, so NULL it out
    l_even->next = NULL;
}
