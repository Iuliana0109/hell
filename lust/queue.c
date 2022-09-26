#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
void add(int);
void del();
void show();
void save_into_file();
void input_from_file();
void sort();
void reverse();
bool search(int);

struct Queue
{
   struct Queue *next;
   int element;
};


struct Queue *first;
struct Queue *last;
char file[500];

int main(){
   struct Queue *q;
   int ch, element, val;
   char title[500];
   do{
      printf("\n1. Add an element into the queue");
      printf("\n2. Delete an element");
      printf("\n3. Show the queue");
      printf("\n4. Input the queue from a file");
      printf("\n5. Save thequeue into a file");
      printf("\n6. Search");
      printf("\n7. Sort the queue");
      printf("\n8. Reverse the queue");
      printf("\n9. Exit");
      printf("\nEnter your choice: ");
      scanf("%d",&ch);  
   
      switch (ch)
      {
      case 1: 
         printf("\nElement to include: ");
         scanf("%d", &element);
         add(element);   
         break;

      case 2:
         del();
         break;
         
      case 3:
         show();
         break;
         
      case 4:
         printf("\nFile name: ");
         scanf("%s",title); 
         input_from_file(title);  
         break;   
         
      case 5:
         if (strlen(file)!=0)
         {
            save_into_file(file);
            printf("\nChanges Saved\n");
         }
         else
         {
         printf("\nFile name: ");
         scanf("%s",title); 
         save_into_file(title);
         }  
         break;
         
      case 6:
         printf("\nValue you're looking for: ");
         scanf("%d", &val);
         search(val);
         if (search(val)==true)
         {
            printf("\nValue found\n");
         }
         else
         {
            printf("\nValue not found\n");
         }
         break;
         
      case 7:
         sort(q);
         printf("\nThe sorted queue:\n");
         show();
         printf("\n");
         break;
         
      case 8:
         reverse();
         printf("\nThe reversed queue:\n");
         show();
         printf("\n");
         break;  
         
      case 9:
         return 0;   
      default:
         printf("Try again");
         break;
      }
   } while (ch!=9);
   return 1;
}

void add(int element)
{
   struct Queue *temp;
   temp = malloc(sizeof(struct Queue));
   if(temp==NULL)
   {
      printf("\nCan't allocate memory");
      return;
   }
   temp->element=element;//the value is entered in the list
   temp->next=NULL;
   if(last==NULL)
   {
      first=temp;
      last=temp;
   }
   else
   {
      last->next=temp;
      last=last->next;//rear is incremented
   }
}

void del()
{
   struct Queue *temp;
   temp=first;
   if(first==NULL)
   {
      printf("\nThere are no elements in the queue\n");
      return;
   }
   else
   {
      first=first->next;
      free(temp);
   }
}

void show()
{
   struct Queue *q;
   q=first;
         while (q!=NULL)
         {
            printf("%d ",q->element);
            q=q->next;
         }
}

void input_from_file(char title[])
{
   FILE *f = fopen(title, "r");
   int c;
   if (f == NULL)
   {
      printf("File is empty!\n");
      return;
   }
   first=NULL;
   last=NULL;
    while (!feof(f))
    {
        fscanf(f ,"%d ", &c);
        add(c);
    }
   printf("\n");
   fclose(f);
   strcpy(file, title);
}

void save_into_file(char title[])
{
   struct Queue *q;
   q=first;
   FILE *f = fopen(title, "w");
   if (f == NULL)
   {
      printf("Error creating file!\n");
   }
   while (q!=NULL)
   {
      fprintf(f,"%d ",q->element);
      q=q->next;
   }
   fclose(f);
}

bool search(int val){
   struct Queue *curr;
   curr=first;
   while (curr!=NULL)
   {
      if (curr->element==val)
      {
         return true;
      }
      curr=curr->next;
   }
   return false;
};

int count(){
   struct Queue *q;
   q = first;
   int co = 0;
   while (q!=NULL)
   {
      co++;
      q=q->next;
   }
   return co;
}


void sort()
{
    struct Queue** q;
    int i, j, swapped;
    int countQ = count(first);
    for (i = 0; i <= countQ; i++) {
 
        q = &first;
        swapped = 0;
 
        for (j = 0; j < countQ - i - 1; j++) {
 
            struct Queue* p1 = *q;
            struct Queue* p2 = p1->next;
 
            if (p1->element > p2->element) {

                  struct Queue* tmp = p2->next;
                  p2->next = p1;
                  p1->next = tmp;
                  *q = p2;

                swapped = 1;
            }
 
            q = &(*q)->next;
        }

        if (swapped == 0)
            break;
    }
}

void reverse(){
   struct Queue* current;
   struct Queue* nxt;
   struct Queue* prev = NULL;
   struct Queue* temp;
   current = first;
   while (current!=NULL)
   {
      temp=current->next;
      current->next=prev;
      prev=current;
      current=temp;
   }
   first=prev;
   
}
