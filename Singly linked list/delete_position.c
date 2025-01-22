#include<stdio.h>
#include<stdlib.h>

struct node{
    int info;
    struct node *link;
};
typedef struct node* N;
int size = 5;
N deletepos(N a,int pos){
    N t;
    if(a == NULL){
        return a;
    }
    if(pos == 1){
        a = a->link;
        return a;
        size--;
    }
     t = a;
    if(pos<1 || pos>size+1){
        printf("Invalid position\n");
        return a;
    }
  
    else
    {
        while(--pos>1){
            t = t->link;
        }
        t->link = t->link->link;
    size--;
    return a;
    }
    
}
int main(){
    
    // N a = NULL;
    // N c = NULL;
    // N b = NULL;
    // N d = NULL;
    
N a = (N)malloc(sizeof(struct node));
a->info = 10;

N b = (N)malloc(sizeof(struct node));
b->info = 10;
a->link = b;

N c = (N)malloc(sizeof(struct node));
c->info = 330;
b->link = c;

N d = (N)malloc(sizeof(struct node));
d->info = 20;
c->link = d;
d->link = NULL;
N f = a;
    while(f!=NULL){
        printf("%d\n",f->info);
        f=f->link;
    }
    a = deletepos(a,2);
    f = a;
    while(f!=NULL){
        printf("%d\n",f->info);
        f=f->link;
    }
}


// #include <stdio.h>
// #include <stdlib.h>

// struct node {
//     int info;
//     struct node *link;
// };

// typedef struct node* N;

// int main() {
//     N a = NULL;
//     N b = NULL;
//     N c = NULL;
//     N d = NULL;

//     a = (N)malloc(sizeof(struct node));
//     a->info = 10;

//     b = (N)malloc(sizeof(struct node));
//     b->info = 20;
//     a->link = b;

//     c = (N)malloc(sizeof(struct node));
//     c->info = 30;
//     b->link = c;

//     d = (N)malloc(sizeof(struct node));
//     d->info = 40;
//     c->link = d;
//     d->link = NULL;

//     N temp = a;
//     while (temp != NULL) {
//         printf("%d\n", temp->info);
//         temp = temp->link;
//     }}

//     // Free allocated memory
//     // temp = a;
//     // while (temp != NULL) {
//     //     N next = temp->link;
//     //     free(temp);
//     //     temp = next;